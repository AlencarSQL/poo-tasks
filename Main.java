public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.nome= "Marmita";
        p1.preco= 24;
        p1.estoque= 10;

        p1.aplicarDesconto();
        p1.reduzirEstoque();

        System.out.println(p1.nome +"- R$" + p1.preco+" estoque- "+ p1.estoque);
    }
}