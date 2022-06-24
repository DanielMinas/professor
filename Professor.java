public class Professor {
	
	private Integer id;
	private String nome;
	private Double turmas;
	private Connection connection;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTurmas() {
		return turmas;
	}

	public void setTurmas(Double turmas) {
		this.turmas = turmas;
	}

	
	
	public void salva() throws SQLException{
		
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/professor?useSSL=false", "root", "Daniel@231"); 
		Statement stmt = this.connection.createStatement();
		String sql = "insert into professor (id, nome, turmas) values (" + this.id + "," +
				this.nome + "," + this.turmas + ")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("Professor inserido com sucesso.");
		}else if (rs == 0){
			System.out.println("Nenhum professor inserido.");
		}
	}
}