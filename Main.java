public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Ford", "Azul", 2022);
        Carro carro2 = new Carro("Ferrari", "Vermelha", 2019);

        System.out.println(carro1.getmarca() + " é seminovo? " + carro1.eseminovo());
        System.out.println(carro2.getmarca() + " é seminovo? " + carro2.eseminovo());

        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.pintar("Preto");
        System.out.println("Carro1 depois de acelerar 2x, frear 1x e pintar: cor="
                + carro1.getcor() + ", velocidade=" + carro1.getvelocidade());


        CarroEsportivo ferrari = new CarroEsportivo("Ferrari", "Vermelha", 2023);
        System.out.println("Antes: " + ferrari);

        ferrari.ativarmodoesportivo();
        System.out.println("Depois: " + ferrari);
    }
}