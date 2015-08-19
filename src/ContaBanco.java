
public class Conta {
    public static void main (String[] args){
    Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Josi";
        minhaConta.saldo = 1000.0;
        System.out.println("Saldo atual"  + minhaConta.saldo);
    }
    int numero;
    String dono;
    double saldo;
    double limite;

}
