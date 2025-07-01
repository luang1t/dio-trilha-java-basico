public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println("A TV esta ligada?\n" + smartTv.ligada);
        System.out.println("Canal atual:\n" + smartTv.canal);
        System.out.println("Qual o volume da TV?:\n" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status:\nA TV esta ligada?\n" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status:\nA TV esta ligada?\n" + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo volume depois de aumentar o volume:\n" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume depois de diminuir o volume:\n" + smartTv.volume);

        smartTv.passarCanal();
        smartTv.escolherCanal();
        System.out.println("Canal atual:\n" + smartTv.canal);
        smartTv.passarCanal();
        System.out.println("Canal atual:\n" + smartTv.canal);
    }
}
