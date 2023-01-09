public class App {
    public static void main(String[] args) throws Exception {
        int numero = 8;
        int i = 1;
        System.out.println("Tabela de multiplicação do " + numero);
        while (i < 11) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
            i++;
        }
    }
}
