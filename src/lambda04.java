import java.util.*;
import java.util.stream.Collectors;

public class lambda04 {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
    public static void main(String[] args) {
        Universite u01=new Universite("Bogazici","matematik",571,93);
        Universite u02=new Universite("Itü","matematik",600,81);
        Universite u03=new Universite("Istanbul","hukuk",1400,71);
        Universite u04=new Universite("marmara","bilg muh",1080,77);
        Universite u05=new Universite("odtü","gemi muh",333,74);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println(notOrt74BykUnv(unv));
        System.out.println(matBolumVarMi(unv));
        UnvSayiSirala(unv);
        mathBölüm(unv);
        System.out.println(ogrSayi550BykMaxNotOrt(unv));
        System.out.println(ogrSay1050Az(unv));
    }
    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt74BykUnv(List<Universite> unv){
      return   unv.stream().allMatch(t->t.getNotOrt()>74);
    }//task 02-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean matBolumVarMi(List<Universite> unv){
        return unv.stream().anyMatch(t->t.getBölüm().equalsIgnoreCase("matematik"));
    }//task 03-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static void UnvSayiSirala(List<Universite> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing(Universite::getOgrsayisi).reversed()).collect(Collectors.toList()));
    }//task 04-->"matematik" bolumlerinin sayisini  print ediniz.
    public static void mathBölüm(List<Universite> unv){
        System.out.println(unv.stream().filter(t -> t.getBölüm().equalsIgnoreCase("matematik")).count());
    }//task 04-->"matematik" bolumlerinin sayisini  print ediniz.
    public static int matBolumSayisi(List<Universite> unv){
        return (int) unv.
                stream(). //akış sağladım
                        filter(t->t.getBölüm().contains("mat")). // matematik bölümü olan ünv. seçtim
                        count(); // seçilen unv. sayısını aldım
    }//task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    public static OptionalInt ogrSayi550BykMaxNotOrt(List<Universite>unv){
      return   unv.stream().filter(t->t.getOgrsayisi()>550).mapToInt(t->t.getNotOrt()).max();
    }//task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt ogrSay1050Az(List<Universite>unv){
        return unv.stream().filter(t->t.getOgrsayisi()<1050).mapToInt(t->t.getNotOrt()).min();
    }

}
