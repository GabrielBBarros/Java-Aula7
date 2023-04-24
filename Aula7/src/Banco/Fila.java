package Banco;
public class Fila extends Thread{
    int numClientes = 5;
    int tempo = 1;
    Cliente cliente;
    public Banco banco;

    public Fila(Banco banco) {
        this.banco = banco;
    }

    public void adicionarCliente(Cliente cliente) {
        numClientes++;
    }

    public void removerCliente(Cliente cliente) {
        numClientes--;
    }

    @Override
    public void run() {
        try {
            while(numClientes >= 0) {
                System.out.println("Atendendo cliente "+ numClientes);
                Thread.sleep(tempo * 1000);
                removerCliente(cliente);
            }
        } catch(InterruptedException ex) {
            System.out.println("Erro!");
        }
    }
}
