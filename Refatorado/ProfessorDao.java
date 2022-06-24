import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ProfessorDAO {
	
	private static final Logger logger = Logger.getLogger(ProfessorDAO.class);

	public void salva(Professor professor) throws SQLException{
		
		ConnectionDAO connectionDAO = new ConnectionDAO("root", "Daniel@231");
		connectionDAO.setDbms("mysql");
		connectionDAO.setServerName("localhost");
		connectionDAO.setPortNumber("8080");
		connectionDAO.setDbName("mock");
	   
		try (Connection connection = connectionDAO.createConnection();
			 Statement stmt = connection.createStatement();) {
			
			String sql = "insert into professor (id, nome, turmas) values (" + professor.getId() + "," +
					professor.getNome() + "," + professor.getTumas() + ")";
			int rs = stmt.executeUpdate(sql);
			
			if (rs == 1){
				logger.info("Professor inserido com sucesso.");
			}
		} catch (SQLException e) {
			logger.error("Nenhum professor inserido." + e);
		}
	}
}