public class Main {

    public static void main(String[] args) {
        Cliente hebert = new Cliente();
        hebert.setNome("Hebert");

        Conta cc = new ContaCorrente(hebert);
        Conta poupanca = new ContaPoupanca(hebert);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
