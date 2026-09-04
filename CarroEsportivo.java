public class CarroEsportivo extends Carro {
    private boolean modoesportivo;

    public CarroEsportivo(String marca, String cor, int ano) {
        super(marca, cor, ano);
        this.modoesportivo = false;
    }
    public void ativarmodoesportivo() {
        this.modoesportivo = true;
        for (int i = 0; i < 10; i++) {
            this.acelerar(); // 10x (+10) = +100 no total
        }
    }

    @Override
    public String toString() {
        return "CarroEsportivo{" +
                "marca='" + getmarca() + '\'' +
                ", cor='" + getcor() + '\'' +
                ", ano=" + getano() +
                ", velocidade=" + getvelocidade() +
                ", modoEsportivo=" + modoesportivo +
                '}';
    }
}