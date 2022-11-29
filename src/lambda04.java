import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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
    }

}
