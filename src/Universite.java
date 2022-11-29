public class Universite {


    private String univercity;
    private String bölüm;
    private int ogrsayisi;
    private int notOrt;
// parametresiz constructor
    public Universite() {
    }

    public Universite(String univercity, String bölüm, int ogrsayisi, int notOrt) {
        this.univercity = univercity;
        this.bölüm = bölüm;
        this.ogrsayisi = ogrsayisi;
        this.notOrt = notOrt;
    }
//getter setter
    public String getUnivercity() {
        return univercity;
    }

    public void setUnivercity(String univercity) {
        this.univercity = univercity;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public int getOgrsayisi() {
        return ogrsayisi;
    }

    public void setOgrsayisi(int ogrsayisi) {
        this.ogrsayisi = ogrsayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "univercity='" + univercity + '\'' +
                ", bölüm='" + bölüm + '\'' +
                ", ogrsayisi=" + ogrsayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
