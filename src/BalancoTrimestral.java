
public class BalancoTrimestral {
    public static void main (String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastoMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastoMarco;
        System.out.println(gastosTrimestre);

        int mediamensal = gastosTrimestre / 3;
        System.out.println("Valor da media mensal = " + mediamensal);
    }
}

/* if (condicaoBooleana){
        codigo;
        }
*/
