public class Produto {
    String nome;
    double preco;
    int estoque;

     void aplicarDesconto(){
         preco= preco-10;
    }
    void reduzirEstoque(){
         estoque= estoque - 1;
    }
}
