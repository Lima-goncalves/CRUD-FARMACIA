package farmaciaEntrega;

import java.util.Scanner;

public class executar {

	public static void main(String[] args) {

		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();

		if (bancoDeDados.estaConectado()) { // bancoDeDados.listarContato();
			System.out.println("BANCO DE DADOS CONECTADO");
		} else {
			System.out.println("BANCO DE DADOS NULL");
		}

		telas tl = new telas();
		Scanner ler = new Scanner(System.in);
		telaCliente tc = new telaCliente();
		Cliente cli = new Cliente();
		TelasFornecedor tf = new TelasFornecedor();
		bancoFornecedor bf = new bancoFornecedor();
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
				bancoDeDados.editarMercadoria(tl.laboratorio, tl.nomeMedicamento, tl.stq, tl.id);
				break;
			case 4:
				System.out.println("INSERIR MEDICAMENTO");
				tl.inserir();
				bancoDeDados.conectar();
				bancoDeDados.inserirMercadoria(tl.laboratorio, tl.nomeMedicamento, tl.stq);
				// System.out.println("O número escolhido foi: 4.");
				// tl.inserir();
				break;
			case 5:
				System.out.println("EXCLUIR MEDICAMENTO");
				tl.apagar();
				bancoDeDados.apagarMercadoria(tl.id);

				break;
			case 6:
				System.out.println("ADICIONAR CLIENTES");

				cli.conectar();

				tc.adicionarCliente();
				tc.adicionarEndereco();

				cli.endereco(tc.getCep(), tc.getEstado(), tc.getCidade(), tc.getBairro());
				cli.clinte(tc.getNome(), tc.getTelefone(), tc.getIdade(), tc.getCpf(), tc.getCep());

				break;
			case 7:
				System.out.println("LISTAR CLIENTES");
				cli.conectar();
				tc.listagemCliente();
				cli.listarCliente();
				break;
			case 8:
				System.out.println("apagar CLIENTE");
				cli.conectar();
				tc.apagarCliente();
				cli.apagarCliente(tc.getId_cliente(),tc.getCep());
				break;
	
			case 9:
				System.out.println("FORNECEDOR");
				bf.conectar();
				tf.adicionarfornecedor();
				tf.adicionarEndereco();
				
				
				bf.enderecofornecedor(tf.getCep(), tf.getEstado(),tf.getCidade(), tf.getBairro());
				bf.fornecedor(tf.getNomeFornecedor(),tf.getNumero(), tf.getGmail(),tf.getLab(),tf.getId());
				break;
			case 10:
				System.out.println("listar fornecedor ");
				bf.conectar();
				tf.listagemfornedor();
				bf.listarFonecedor();
				break;
			case 11:
				System.out.println("pedido");
				
			case 12:
				System.out.println("listar pedidos ");
				val = true;
				break;
			default:
				System.out.println("O número escolhido é inválido! Digite um número entre 1 a 4.");
			}

		}
	}
}
