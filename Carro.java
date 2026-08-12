public class Carro {
    String modelo;
    int velocidade;
    boolean ligado;

    void acelerar(){
        velocidade =velocidade + 10;
    }
    void freiar(){
      velocidade= velocidade - 10;
      if(velocidade<0){
          velocidade = 0;
      }
    }
    void ligar(){
        ligado =true;
    }
    String desligar(){
        if (velocidade == 0)
        {
            ligado = false;
            return "Carro Desligado";
        }else{
            return "Carro Ligado";
        }

    }
}
