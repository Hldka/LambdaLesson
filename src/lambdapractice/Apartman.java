package lambdapractice;

public class Apartman {
   private String cephe;
   private int katsayisi;
   private int kira;
//parametresizconstructor
    public Apartman() {
    }
//bol parametreli constructor

    public Apartman(String cephe, int katsayisi, int kira) {
        this.cephe = cephe;
        this.katsayisi = katsayisi;
        this.kira = kira;
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatsayisi() {
        return katsayisi;
    }

    public void setKatsayisi(int katsayisi) {
        this.katsayisi = katsayisi;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katsayisi=" + katsayisi +
                ", kira=" + kira +
                '}';
    }
}
