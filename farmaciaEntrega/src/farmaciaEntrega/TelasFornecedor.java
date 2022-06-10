package farmaciaEntrega;

import java.util.Scanner;

public class TelasFornecedor {
	private String nomeFornecedor;
	private String numero;
	private String Gmail;
	
	private int cep ;
	private String estado ;
	private String cidade ;
	private String bairro ; 
	private int id;
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getGmail() {
		return Gmail;
	}
	public void setGmail(String gmail) {
		Gmail = gmail;
	}
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
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
	private String lab;
	

	
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
	public void adicionarfornecedor() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("INSERIR CLIENTE                                         ");
		System.out.println("Nome:                                                               ");
		setNomeFornecedor(entrada.next());
		System.out.println("cep:                                                               ");
		setId(entrada.nextInt());
		System.out.println("conato:                                                               ");
		setNumero(entrada.next());
		System.out.println("gmail:                                                               ");
		setGmail(entrada.next());
		System.out.println("laboratorio:                                                               ");
		setLab(entrada.next());
	
}
	
	public void listagemfornedor() {

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("LISTAGEM dos fornecedores:                                             ");

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
