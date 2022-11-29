package lambdapractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("portakal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");
        System.out.println(ilkhrfBykGrsKck(list));
        System.out.println("\n*****************++*+");
        System.out.println(ecIleBaslayanList(list));
        System.out.println("\n*****************++*+");
        System.out.println(basYildizEkle(list));
        System.out.println("\n*****************++*+");
        basYildizEkle2(list);
        System.out.println("\n*****************++*+");
        eileYeniList(list);
        System.out.println("\n*****************++*+");
        System.out.println(eOlanList(list));
        System.out.println("\n*****************++*+");
        lLeriSil(list);
        System.out.println("\n*****************++*+");
        ikcihareGöreSiralaIlk5ElChEnbypr(list);
        System.out.println("\n*****************++*+");

    }//S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
    public static List<String> ilkhrfBykGrsKck(List<String> l){
       return l.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).collect(Collectors.toList());
    }

// S2: ilk harfi e ve ya c olanlari listeleyelim
    public static List<String> ecIleBaslayanList(List<String>liste){
       return liste.stream().filter(t->t.toLowerCase().startsWith("e")|| t.toLowerCase().startsWith("c")).collect(Collectors.toList());
    }//S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static List<String> basYildizEkle(List<String>liste){
        return liste.stream().map(t->"*"+t+"*").collect(Collectors.toList());
    }public static void basYildizEkle2(List<String>liste){
        liste.stream().map(t->"*"+t+"*").forEach(Utils::yazString);
    }//S4 : icinde e olanlardan yeni bir list olusturunuz
    public static void eileYeniList(List<String>liste){
        liste.stream().filter(t->t.toLowerCase().contains("e")).forEach(Utils::yazString);
    }public static List<String> eOlanList(List<String>liste){
        return
                liste.stream().
                        filter(t->t.toLowerCase().
                                contains("e")).collect(Collectors.toList());
    }//S5: tum 'l' leri silelim yazdiralim
    public static void lLeriSil(List<String>list){
        list.stream().map(t->t.replaceAll("l","")).forEach(Utils::yazString);
        list.removeIf(t->t.equalsIgnoreCase("l"));
    }//S6: List elemanarını 2.harfe gore sıralayıp
//ilk 5 elemandan char sayısı en buyuk elemanı print
    public static void ikcihareGöreSiralaIlk5ElChEnbypr(List<String>liste){
        System.out.println(liste.stream().
                sorted(Comparator.comparing(t -> t.charAt(1))).
                limit(5).
                sorted(Comparator.comparing(String::length).
                        reversed()).
                findFirst());
    }
}
