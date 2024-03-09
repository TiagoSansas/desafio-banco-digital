
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton, "Conta Corrente");
		Conta poupanca = new ContaPoupanca(venilton, "Conta Poupança");
		banco.getContas().add(cc);
		banco.getContas().add(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		System.out.println("------- Listar todos Clientes");
		banco.listarTodosCliente();
		cc.setTipoConta("Conta Poupança");

		System.out.println("------- Listar todos Clientes Alterando cc para Poupança");
		banco.listarTodosCliente();

	}

}
