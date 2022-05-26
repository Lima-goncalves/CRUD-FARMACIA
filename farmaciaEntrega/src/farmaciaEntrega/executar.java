package farmaciaEntrega;

import java.util.Scanner;

public class executar {

	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();

		if (bancoDeDados.estaConectado()) {
			//bancoDeDados.listarContato();
			System.out.println("BANCO DE DADOS CONECTADO");
		} else {
			System.out.println("BANCO DE DADOS NULL");
		}

		telas tl = new telas();
		Scanner ler = new Scanner(System.in);
		
		boolean val = false;

		while (val == false) {
			int opc = tl.inicial();
			
			switch (opc) {
			case 1:
				System.out.println("LISTAR.");
				tl.listagem();
				bancoDeDados.listarMercadoria();
				break;
			case 2:
				System.out.println("DETALHE MEDICAMENTO ");
				tl.detalhe();
				bancoDeDados.detalhar(tl.id);
				break;
			case 3:
				System.out.println("EDITAR ID");
				tl.editar();
				bancoDeDados.editarMercadoria(tl.laboratorio,tl.nomeMedicamento,tl.stq,tl.id);
				break;
			case 4:
				System.out.println("INSERIR MEDICAMENTO");
				tl.inserir();
				bancoDeDados.conectar();
				bancoDeDados.inserirMercadoria(tl.laboratorio,tl.nomeMedicamento,tl.stq);
				//System.out.println("O número escolhido foi: 4.");
				//tl.inserir();
				break;
			case 5:
				System.out.println("EXCLUIR MEDICAMENTO");
				tl.apagar();
				bancoDeDados.apagarMercadoria(tl.id);
				
				break;
			case 6:
				System.out.println("SAIR");
				break;
			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
			}

		}
	}
}
