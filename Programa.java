class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.titular = "Mike";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo Atual: " + minhaConta.saldo);
    }
}