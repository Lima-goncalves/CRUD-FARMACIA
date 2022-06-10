package farmaciaEntrega;

import java.sql.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//IMPORTAÇÕES

public class bancoFornecedor {

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
	
	public void fornecedor (String N, String T, String G,String L, int CEP) {
		try {

			String query = "INSERT INTO fornecedor (nome_fornecedor,numero,Gmail,laboratorio,id_endereco) values ('" + N + "','" + T + "','"
					+ G + "','" + L + "','" + CEP + "');";
			System.out.println(query);

			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO cliente " + e.getMessage());
		}

	}

	public void enderecofornecedor (int CEP, String ESTADO, String CIDADE, String BAIRRO) {
		try {

			String query = "INSERT INTO endereco (id_endereco,cep,estado,cidade,bairro) values ('" + CEP + "','" + CEP
					+ "','" + ESTADO + "','" + CIDADE + "','" + BAIRRO + "');";
			System.out.println(query);

			this.statement.executeUpdate(query);
		} catch (Exception e) {
			System.out.println("ERRO NO endereco " + e.getMessage());
		}
	}
	
	public void listarFonecedor(){
		try {
			String query = "SELECT id_fornecedor, nome_fornecedor, numero, Gmail, laboratorio,  cep, estado, cidade, bairro FROM fornecedor f\r\n"
					+ "JOIN endereco e \r\n"
					+ "ON e.id_endereco = f.id_endereco;\r\n"
					+ "\r\n";
			this.resultSet = this.statement.executeQuery(query);
			while (this.resultSet.next()) {
				System.out.println("Id : " + this.resultSet.getString("id_fornecedor") + "	fornecedor: "
						+ this.resultSet.getString("nome_fornecedor") + "	TELEFONE: "
								+ this.resultSet.getString("numero")+ "	gmai: "
								+ this.resultSet.getString("Gmail")+ "	laboratorio: "
										+ this.resultSet.getString("laboratorio")+ "	cep: "
												+ this.resultSet.getString("cep")+ "	estado: "
														+ this.resultSet.getString("estado")+ "	cidade: "
																+ this.resultSet.getString("cidade")+ "	bairro: "
																		+ this.resultSet.getString("bairro"));
				
		
			}
	
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
	
	
	
	
	
}
