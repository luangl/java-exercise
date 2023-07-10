public class HelloWorld {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando no amebiente de DEV");
        } else if (ambiente.equalsIgnoreCase("Teste")) {
            System.out.print("Executando no amebiente de Teste");
        } else {
            System.out.print("Oi " + ambiente);
        }
    }

}