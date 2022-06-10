package farmaciaEntrega;

import java.util.Scanner;

public class telas extends BancoDeDados {
	String nomeMedicamento;
	String data = "2022-05-12";
	String laboratorio;
	int stq;
	int id;
	
	
	public int inicial() {
		System.out.println("===================================================================");
		System.out.println("	            SUPER SISFARMA PREMIUM 2022                        ");
		System.out.println("===================================================================");
		System.out.println("                     Escolha uma opção:                            ");
		System.out.println("               1-Listar                                            ");
		System.out.println("               2-Detalhes de medicamento                           ");
		System.out.println("               3-Editar                                            ");
		System.out.println("               4-Inserir medicamento                               ");
		System.out.println("               5-Apagar  medicamento                               ");
		System.out.println("               6-Adicionar Cliente                                 ");
		System.out.println("               7-Listar cliente                                    ");
		System.out.println("               8-Apagar  Cliente                                   ");
		System.out.println("               9-FORNECEDOR                                        ");
		System.out.println("               10-LISTAR FORNECEDOR                                ");
		System.out.println("               11-SAIR                                             ");
		System.out.println("               12-LISTAR FORNECEDOR                                ");
		System.out.println("               13-SAIR                                             ");
		System.out.println("===================================================================");

		Scanner sc = new Scanner(System.in);

		int escolha = sc.nextInt();

		return escolha;
	}

	public void listagem() {

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("LISTAGEM DE MEDICAMENTOS                                            ");

	}

	public void inserir() {

		nomeMedicamento = null;
		data = "2022-05-12";
		laboratorio = null;
		stq = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("INSERIR UM NOVO MEDICAMENTO                                         ");
		System.out.println("Nome do laboratorio:                                                ");
		this.laboratorio = ler.next();
		System.out.println("Nome do medicamento:                                                ");
		this.nomeMedicamento = ler.next();
		System.out.println("quantidade de medicamento:                                          ");
		this.stq = ler.nextInt();
		

	}

	public void editar() {

		nomeMedicamento = null;
		data = "2022-05-12";
		laboratorio = null;
		stq = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("EDITAR MEDICAMENTO                                                  ");
		System.out.println("Id do produto:                                                      ");
		this.id = ler.nextInt();
		System.out.println("Nome do laboratorio:                                                ");
		this.laboratorio = ler.next();
		System.out.println("Nome do medicamento:                                                ");
		this.nomeMedicamento = ler.next();
		System.out.println("quantidade de medicamento:                                          ");
		this.stq = ler.nextInt();

	}

	public void apagar() {

		
		id = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("APAGAR MEDICAMENTO                                                  ");
		System.out.println("Id do produto:                                                      ");
		this.id = ler.nextInt();
		

	}
public void detalhe() {

		
		id = 0;
		Scanner ler = new Scanner(System.in);

		System.out.println("====================================================================");
		System.out.println("                   SUPER SISFARMA PREMIUM 2022                      ");
		System.out.println("====================================================================");
		System.out.println("PESQUISA DETALHADA POR ID                                           ");
		System.out.println("Id do produto:                                                      ");
		this.id = ler.nextInt();
		

	}


}
