package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String seialNumber;
    private String marca;

    public Smartphone(String seialNumber, String marca) {
        this.seialNumber = seialNumber;
        this.marca = marca;
    }

    public String getSeialNumber() {
        return seialNumber;
    }

    public void setSeialNumber(String seialNumber) {
        this.seialNumber = seialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
