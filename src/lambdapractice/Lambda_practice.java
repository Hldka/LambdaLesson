package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_practice {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        hepsiniYaz(list);
        System.out.println("\n**********************");
        negatifYaz(list);
        System.out.println("\n**********************");
        ciftYaz(list);
        System.out.println("\n**********************");
        pozVeCift(list);
        System.out.println("\n**********************");
        pozveyaCift(list);
        System.out.println("\n**********************");
        elemanlarinkarelerinin(list);
        System.out.println("\n**********************");
        ciftElemanKüp(list);
        System.out.println("\n**********************");
        elemanlarTekrarsizKarelerini(list);
        System.out.println("\n**********************");
        elemanlariKuciktenBuyuge(list);
        System.out.println("\n**********************");
        elTersiSirala(list);
        System.out.println("\n**********************");
        System.out.println(pozKup5List(list));
        System.out.println("\n**********************");
        System.out.println(pozKareSon5DegilList(list));
        System.out.println("\n**********************");
        listElTop(list);
        System.out.println("\n**********************");
        System.out.println(elToplamReference(list));
        System.out.println("\n**********************");
        System.out.println(elToplamReferenceInt(list));
        System.out.println("\n**********************");
        pozitfElTopla(list);

        // s1: listi aralrinda bosluk birakarak yazdiriniz
    } public static void hepsiniYaz(List<Integer> l){
        l.stream().forEach(t-> System.out.print(t+" "));
    } //S2: sadece negatif olanlari yazdir
    public static void negatifYaz(List<Integer>l) {

        l.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
    }// s3: cift olanlardan yeni bir list olustur
    public static void ciftYaz(List<Integer> l){
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }//S4:pozitif ve çift olanları yazdırın

    public static void pozVeCift(List<Integer>l){

        l.stream().filter(t->t%2==0 && t>0).forEach(t-> System.out.print(t+" "));
    }//S5:pozitif veya çift olanları yazdırın
    public static void pozveyaCift(List<Integer> l){
        l.stream().filter(t-> t%2==0 || t>0).forEach(t-> System.out.print(t+" "));
    }// S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım
public static void elemanlarinkarelerinin(List<Integer>l){
    l.stream().map(t->t*t).forEach(t-> System.out.print(t+" "));}
    //S7: Listin cift elemanlarının kuplerini  aynı satırda bır bosluklu yazdıralım
    public static void ciftElemanKüp(List<Integer> l){
        l.stream().filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }//S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
    public static void elemanlarTekrarsizKarelerini(List<Integer> l){
        l.stream().distinct().map(t->t*t).forEach(t-> System.out.print(t+" "));
    }//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

//S9: listin elemanlarini kucukten buyuge siralayalim
    public static void elemanlariKuciktenBuyuge(List<Integer> l){
        l.stream().sorted().forEach(t-> System.out.print(t+" "));
    }//S10: listin elemanlarini buyukten kucuge siralayalim
    public static void elTersiSirala(List<Integer>l){
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    } // S11: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> pozKup5List(List<Integer>l){
        return l.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).collect(Collectors.toList());
    }//S12: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

public static List<Integer> pozKareSon5DegilList(List<Integer>l){
      return   l.stream().filter(t->t>0).map(t->t*t).filter(t->t%10!=10).collect(Collectors.toList());
}// S13 :list elemanlarini toplamini bulalim
    public static void listElTop(List<Integer>l){
        System.out.println(l.stream().reduce(0, (a, b) -> a + b));
    }
    public static int elToplamReference(List<Integer>l){
        int i=l.stream().reduce(0,Math::addExact);
        return i;
    }

    public static int elToplamReferenceInt(List<Integer>l){
        int i=l.stream().reduce(0,Integer::sum);
        return i;
    }//S14 : Listin pozitif elemanları toplamını bulalım
    public static void pozitfElTopla(List<Integer>l){
        System.out.println(l.stream().filter(t -> t > 0).reduce(0, (a, b) -> a + b));
    }

}
