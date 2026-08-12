public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.nome= "Marmita";
        p1.preco= 24;
        p1.estoque= 10;

        p1.aplicarDesconto();
        p1.reduzirEstoque();

        System.out.println(p1.nome +"- R$" + p1.preco+" estoque- "+ p1.estoque);

        Carro c1= new Carro();
        c1.modelo = "Impala";
        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.velocidade+"km/h");
        String msg1= c1.desligar();
        System.out.println(msg1);

        c1.freiar();
        c1.freiar();
        String msg2= c1.desligar();
        System.out.println(msg2);

    }
}