package Banco;
import Banco.Cliente;
import Banco.Fila;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco(1000,0,0);
		Fila fila1 = new Fila(banco); 
		Fila fila2 = new Fila(banco);

		Cliente cliente1 = new Cliente(1);
		Cliente cliente2 = new Cliente(2);
		Cliente cliente3 = new Cliente(3);

		fila1.adicionarCliente(cliente1);
		fila1.adicionarCliente(cliente2);
		fila2.adicionarCliente(cliente3);

		
		fila1.start();
		fila2.start();
		
		try {
			fila1.join();
			banco.deposito(45);
			fila2.join();
			banco.saque(8);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Saldo final: " + banco.getsaldo());
	}
}