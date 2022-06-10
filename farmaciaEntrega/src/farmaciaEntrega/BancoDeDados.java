package farmaciaEntrega;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//IMPORTAÇÕES

public class BancoDeDados {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/farmcia";
		String usuario = "root";
		String senha = "12345";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		// System.out.println("tlvz deu certo");
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {

			return false;
		}

	}
	
	public void listarMercadoria() {
		try {
			String query = "SELECT * FROM mercadoria ORDER BY id ";
			this.resultSet = this.statement.executeQuery(query);
			
			while (this.resultSet.next()) {
				System.out.println("Id : " + this.resultSet.getString("id") + "	medicamento: "
						+ this.resultSet.getString("nome_medicamento")
				// "Id : "+ this.resultSet.getString("id")+
				// " Laboratorio: "+ this.resultSet.getString("nome_laboratorio")+
				// " Data Vencimento: "+ this.resultSet.getString("dt_vencimento")+
				// " medicamento: "+ this.resultSet.getString("nome_medicamento")+
				// " estoque: "+ this.resultSet.getString("qnt_estoque")
				);
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}

	public void inserirMercadoria(String A, String B, int C) {
		try {

			String query = "INSERT INTO mercadoria(nome_laboratorio,dt_vencimento,nome_medicamento,qnt_estoque) values ('"
					+ A + "','2022-05-12','" + B + "','" + C + "');";
			System.out.println(query);

			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO INSERIR " + e.getMessage());
		}
	}

	public void editarMercadoria(String A, String B, int C, int ID) {
		try {

			String query = "update mercadoria SET nome_laboratorio = '" + A
					+ "',dt_vencimento = '2022-05-12',nome_medicamento= '" + B + "',qnt_estoque = '" + C
					+ "'where id ='" + ID + "';";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO editar  " + e.getMessage());
		}
	}

	/*
	 * public void subMercadoria() { try { int c ;
	 * 
	 * String query = "update mercadoria SET qnt_estoque = '" +C+ "' WHERE ;";
	 * System.out.println(query); this.statement.executeUpdate(query); } catch
	 * (Exception e) { System.out.println("ERRO NO editar  " + e.getMessage()); } }
	 */
	
	public void apagarMercadoria(int ID) {
		try {

			String query = "DELETE FROM mercadoria WHERE id ='" + ID + "' ;";
			System.out.println(query);
			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO apagar " + e.getMessage());
		}
	}


	public void detalhar (int ID) {
		try {
			String query = "SELECT * FROM mercadoria where id ='"+ID+"'; ";
			this.resultSet = this.statement.executeQuery(query);
			while (this.resultSet.next()) {
				System.out.println(
				"Id : "+ this.resultSet.getString("id")+ 
				 " Laboratorio: "+ this.resultSet.getString("nome_laboratorio")+
				 " Data Vencimento: "+ this.resultSet.getString("dt_vencimento")+
		    	 " medicamento: "+ this.resultSet.getString("nome_medicamento")+
				 " estoque: "+ this.resultSet.getString("qnt_estoque")
				);
			}

		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
}
