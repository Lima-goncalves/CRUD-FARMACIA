package farmaciaEntrega;

import java.util.Scanner;

public class telaCliente {
	
		private int id_endereco;
		private int id_cliente;
		private String nome;
		private String telefone; 
		private int idade; 
		private int cpf; 
		
		
		private int cep ;
		private String estado ;
		private String cidade ;
		private String bairro ;
		
		
		
		
		
		
		
		public void adicionarEndereco() {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("====================================================================");
			System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
			System.out.println("====================================================================");
			System.out.println("ENDERECO                                         ");
			System.out.println("CEP:                                                                ");
			setCep(entrada.nextInt()); 
			System.out.println("estado:                                                              ");
			setEstado(entrada.next());
			System.out.println("cidade:                                                              ");
			setCidade(entrada.next());
			System.out.println("barrio:                                                              ");
			setBairro(entrada.next());
			
			
		}
		
		
		public void adicionarCliente() {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("====================================================================");
			System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
			System.out.println("====================================================================");
			System.out.println("INSERIR CLIENTE                                         ");
			System.out.println("Nome:                                                               ");
			setNome(entrada.next());
			System.out.println("telefone:                                                           ");
			setTelefone(entrada.next());
			System.out.println("idade:                                                              ");
			setIdade(entrada.nextInt());
			System.out.println("cpf:                                                                ");
			setCpf(entrada.nextInt());
			id_cliente++;
			
			
		}
		
		public int menu() {
			System.out.println("===================================================================");
			System.out.println("	            SUPER SISFARMA PREMIUM 2022                        ");
			System.out.println("===================================================================");
			System.out.println("                     Escolha uma opção:                            ");
			System.out.println("               1-cliente                                           ");
			System.out.println("               2-mercadoria                                        ");
			System.out.println("===================================================================");

			Scanner sc = new Scanner(System.in);

			int escolha = sc.nextInt();

			return escolha;
		}
		
		
		public void apagarCliente () {
			Scanner entrada = new Scanner(System.in);
			
			
			System.out.println("====================================================================");
			System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
			System.out.println("====================================================================");
			System.out.println("APAGAR cleinte                                                      ");
			System.out.println("Id do cliente:                                                      ");
			setId_cliente(entrada.nextInt());
			System.out.println("CEP:                                                                ");
			setCep(entrada.nextInt());
			

		}
		
		public void listagemCliente() {

			System.out.println("====================================================================");
			System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
			System.out.println("====================================================================");
			System.out.println("LISTAGEM dos clientes                                               ");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public int getId_endereco() {
			return id_endereco;
		}
		public void setId_endereco(int id_endereco) {
			this.id_endereco = id_endereco;
		}
		public int getId_cliente() {
			return id_cliente;
		}
		public void setId_cliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getCpf() {
			return cpf;
		}
		public void setCpf(int cpf) {
			this.cpf = cpf;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		
		
		
	
	
	
	
	
	
	
	
}
