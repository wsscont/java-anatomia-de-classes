public class Usuario {
    public static void main(String[] argv) {
        /* System.out.println("Hello World, Java"); */

        Televisor televisor = new Televisor();

        System.out.println("Ligando o televisor");
        televisor.ligarTelevisor();
        System.out.println("Sintonizando o canal");
        televisor.sintonizandoCanal(10);
        System.out.println("Aumentando o volume");
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        System.out.println("Diminuindo o volume do televisor");
        televisor.diminuirVolume();
        televisor.diminuirVolume();
        System.out.println("Desligar televisor!");
        televisor.desligarTelevisor();
        System.out.println("Fim!");
    }
}
