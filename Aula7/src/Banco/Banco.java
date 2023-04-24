package Banco;
public class Banco {
	public float saldo;
	public float saque;
	public float deposito;
	public Banco(float saldo, float saque, float deposito) {
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
	}
	Banco(){
		saldo = 100;
		saque = 0;
		deposito = 0;
	}
	public float getsaldo() {
		return saldo;
	}
	public void setsaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaque() {
		return saque;
	}
	public void setSaque(float saque) {
		this.saque = saque;
	}
	public float getDeposito() {
		return deposito;
	}
	public void setDeposito(float deposito) {
		this.deposito = deposito;
	}
	
	
	
	boolean saque(float valor) {
		if(valor>=saldo) {
			saque = saque + valor;
			System.out.println("Você sacou: "+saque);
			return true;
		}
		else {
			System.out.println("Saldo insuficiente");
			return false;
		}
		
	}
	
	boolean deposito(float deposito) {
		saldo = saldo+deposito;
		return true;
	}
	
	
	
	
	
}