public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligado);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume: " + smartTv.volume);

    }
}
