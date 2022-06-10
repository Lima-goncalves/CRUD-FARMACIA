package farmaciaEntrega;

import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//IMPORTAÇÕES

public class Cliente {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private int id;

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
		System.out.println("tlvz deu certo");
	}

	public boolean estaConectado() {
		if (this.connection != null) {
			return true;
		} else {

			return false;
		}

	}

	public void clinte(String N, String T, int I, int C, int CEP) {
		try {

			String query = "INSERT INTO cliente (nome,telefone,idade,cpf,id_endereco) values ('" + N + "','" + T + "','"
					+ I + "','" + C + "','" + CEP + "');";
			System.out.println(query);

			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO cliente " + e.getMessage());
		}

	}

	public void endereco(int CEP, String ESTADO, String CIDADE, String BAIRRO) {
		try {

			String query = "INSERT INTO endereco (id_endereco,cep,estado,cidade,bairro) values ('" + CEP + "','" + CEP
					+ "','" + ESTADO + "','" + CIDADE + "','" + BAIRRO + "');";
			System.out.println(query);

			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO endereco " + e.getMessage());
		}
	}

	public void apagarCliente(int ID, int IdEndereco) {
		try {

			String query = "DELETE FROM cliente WHERE id ='" + ID + "' ;";
			System.out.println(query);
			this.statement.executeUpdate(query);
			String query2 = "DELETE FROM endereco WHERE id ='" + IdEndereco + "' ;";
			System.out.println(query2);
			this.statement.executeUpdate(query2);
		} catch (Exception e) {
			System.out.println("ERRO NO apagar " + e.getMessage());
		}
	}

			
			public void listarCliente(){
				try {
					String query = "SELECT * FROM cliente ORDER BY id_cliente";
					this.resultSet = this.statement.executeQuery(query);
					while (this.resultSet.next()) {
						System.out.println("Id : " + this.resultSet.getString("id_cliente") + "	CLIENTE: "
								+ this.resultSet.getString("nome") + "	TELEFONE: "
										+ this.resultSet.getString("telefone"));
						
						// "Id : "+ this.resultSet.getString("id")+
						// " Laboratorio: "+ this.resultSet.getString("nome_laboratorio")+
						// " Data Vencimento: "+ this.resultSet.getString("dt_vencimento")+
						// " medicamento: "+ this.resultSet.getString("nome_medicamento")+
						// " estoque: "+ this.resultSet.getString("qnt_estoque")
						
					}
			
				} catch (Exception e) {
					System.out.println("ERRO: " + e.getMessage());
				}
			}
}
/*
 * }
 * public void ultimoIdEndereco () { try {
 * 
 * String query = "SELECT max(id_endereco) FROM endereco;";
 * System.out.println(query);
 * 
 * this.resultSet=this.statement.executeQuery(query);
 * id=this.resultSet.getInt("id_endereco");
 * 
 * } catch (Exception e) { System.out.println("ERRO NO endereco " +
 * e.getMessage()); } }
 */