public class Televisor {
    private boolean ligado;
    private int volume;
    private int canal;

    public Televisor(){
        this.ligado = false;
        this.volume = 5;
        this.canal = 4;
    }

    public void ligarTelevisor(){
        this.ligado = true;
        System.out.println("Televisor está ligado!");
    }

    public void desligarTelevisor(){
        this.ligado = false;
        System.out.println("Televisor está desligado!");
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Volume: " + volume);
    }
    
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Volume: " + volume);
    }

    public void sintonizandoCanal(int canalASintonizar){
        this.canal = canalASintonizar;
        System.out.println("O televisor está no canal " + canal);
    }
}
