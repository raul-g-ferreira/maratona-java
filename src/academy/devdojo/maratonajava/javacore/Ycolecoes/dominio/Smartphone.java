package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
    O método .equals() deve ser:
         Reflexivo
         Simétrico
         Transitivo
         Consistente = x.equals(x) sempre retorna true se x for diferente de null
         Para x diferente de null x.equals(null) sempre retornará false
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;// se obj é null
        if (this == obj) return true;// se for o msm objeto
        if (this.getClass() != obj.getClass()) return false; // se os objetos forem de classes diferentes
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    public String getSeialNumber() {
        return serialNumber;
    }

    public void setSeialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
