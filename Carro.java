public class Carro {

    private String marca;
    private String cor;
    private int ano;
    private double velocidade;

    public Carro(String marca, String cor, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }
    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
        this.ano = 0;
        this.velocidade = 0;
    }
    public void acelerar() {
        this.velocidade += 10;
    }
    public void frear() {
        this.velocidade -= 10;
        if (this.velocidade < 0) this.velocidade = 0;
    }
    public void pintar(String novaCor) {
        this.cor = novaCor;
    }
    public boolean eseminovo() {
        return this.ano > 2020;
    }
    public String getmarca() { return marca; }
    public String getcor() { return cor; }
    public int getano() { return ano; }
    public double getvelocidade() { return velocidade; }
}
