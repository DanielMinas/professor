public class Professor {
	
	private Integer id;
	private String nome;
	private double turmas;

	
	public Professor() {}
	
	public Professor(Integer id, String nome, double turmas) {
		this.id = id;
		this.nome = nome;
		this.turmas = turmas;
s
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTumas() {
		return turmas;
	}

	public void setTurmas(double turmas) {
		this.turmas = turmas;
	}
	
	@Override
	public String toString() {
		return "Professor: [id=" + id + ", nome=" + nome + ", turmas=" + turmas +  "]";
	}
}