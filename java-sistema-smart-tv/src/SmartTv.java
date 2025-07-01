import java.util.Scanner;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para:\n" + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para:\n" + volume);
    }

    public void passarCanal() {
        canal++;
        System.out.println("Passando o canal...\nCanal Atual:\n" + canal);
    }

    public void voltarCanal() {
        canal--;
        System.out.println("Voltando o canal...\nCanal Atual:\n");
    }

    public int escolherCanal() {
        int novoCanal = 0;
        Scanner canalScanner = new Scanner(System.in);
        System.out.println("Escolha o novo canal:\n");
        novoCanal = canalScanner.nextInt();
        canal = novoCanal;
        System.out.println("Escolheu o canal:\n" + canal);
        return canal;
    }
}
