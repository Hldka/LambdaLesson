import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> menu=new ArrayList<>(Arrays.asList("trileçe","havucDilim","güvec","kokorec",
                "küşleme","arabAşı","waffle","künefe","güvec"));
        alfByktekrsz(menu);
        System.out.println("\n*****************");
        elChrSayTers(menu);
        System.out.println("\n*****************");
        chrSayisiBykSirali(menu);
        System.out.println("\n*****************");
        harfsayisi7denAzKontrol(menu);
        System.out.println("\n*****************");
        wIleBaslayanElKontrol(menu);
        System.out.println("\n*****************");
        xIleBirElVarMi(menu);
        System.out.println("\n*****************");
        chrSayenYazdir(menu);
        System.out.println("\n*****************");
        ilkElHrcSonHrfSiraliPrint(menu);
        System.out.println("\n*****************");

    }// Task -1 : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfByktekrsz(List<String> yemek){
        yemek.stream().//akisbasladi
                distinct().// tekrar engelendi
                map(String::toUpperCase).// büyük harf
                sorted().// dogal siraaldi alfabetik
                forEach(t-> System.out.print(t+" "));
    }// Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void elChrSayTers(List<String> yemek){
        yemek.stream().
                map(String::length).//akisa alindi
                sorted(Comparator.reverseOrder()).//akisi güncelledim kelime uzunligu olarak
                distinct().// tekrarsiz
                forEach(Lambda01::yazdir);// yazdir
    }// Task-3 : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void chrSayisiBykSirali(List<String> ikram){
        ikram.stream().//akis saglandi
                sorted(Comparator.comparing(String::length)).//String ifadeleri karakter sayisina göre k->b ye göre siraladim
                forEach(t-> System.out.print(t+" "));//print
    }// ******************************************************************************************
// *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //*******************************************************************************************

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    // Task-4 : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfsayisi7denAzKontrol(List<String> ikram){
        System.out.println(ikram.
                stream().
                allMatch(t -> t.length() <= 7) ? "List elemanlri 7 ve daha az harften olusuyor" : " List elemanlari  7 harfden büyük");
    }// Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBaslayanElKontrol(List<String> ikram){
        System.out.println(ikram.stream().
                noneMatch(t -> t.startsWith("w")) ? "W ile yemek ismi mi olur" : "w ile yemek icat ettik");
    }// Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBirElVarMi(List<String> ikram){
        System.out.println(ikram.stream().noneMatch(t -> t.endsWith("x")) ? "X ile biten yemek yok" : " x ile biten en az bir yemek var");
    }// Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void chrSayenYazdir(List<String> ikram){
      Stream<String> sonIsim= ikram.stream().//akis saglandi
                sorted(Comparator.comparing(t -> t.toString().length()).//karakter sayisina göre terden siralandi
                        reversed()).limit(1);// limit kullanilarak sadece ilk eleman cagrildi
        //limit() metodunun dönen degeri Stream<String> yapidadir
        System.out.println(Arrays.toString(sonIsim.toArray()));
        //sonisim.toArray()--> Stream olan akis Array'e cevrildi
        //Arrays.toString(sonIsim.toArray())--> Arrayi String yapiya ceviriyor



    }// Task-8 : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void ilkElHrcSonHrfSiraliPrint(List<String> ikram){
        ikram.stream().//akisa alindi
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//son harfine göre alfabetik siralandi
                skip(1).// akisda ilk eleman haric tutuldu
                forEach(t-> System.out.print(t+" "));// ekrana print edildi
    }
}
