import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> sayi= new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));
        ciftKarePrint(sayi);
        System.out.println("\n******************");
          tekKüp(sayi);
        System.out.println("\n******************");
        ciftKarekök(sayi);
        System.out.println("\n******************");
        maxElBul(sayi);
        System.out.println("\n******************");
        structuredMaxElBul(sayi);
        System.out.println("\n******************");
        ciftElKareMax(sayi);
        System.out.println("\n******************");
        tumElTopla(sayi);
        System.out.println("\n******************");
        ciftCarp(sayi);
        System.out.println("\n******************");
        minBul(sayi);
        System.out.println("\n******************");
        besdenBüyükTekSayi(sayi);
        System.out.println("\n******************");
        ciftElKareTop(sayi);
    }
    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer> sayi){
        sayi.stream().
                filter(Lambda01::ciftBul).//akisdaki cift sayilari filtreleedim
              map(t->t*t).// 16 4 36
                forEach(Lambda01::yazdir);
    }
// Task2 : Functional Programming ile listin tek elemanlarinin  kuplerinin bir
// fazlasini ayni satirda aralarina bosluk birakarak print ediniz
    public static void tekKüp(List<Integer> sayi){
        sayi.stream().
                filter(t->t%2!=0).
                map(t->(t*t*t)+1).
                forEach(Lambda01::yazdir);
        //sayi.stream().filter(Lambda02::tek).map(t->(t*t*t)+1).forEach(Lambda01::yazdir);
    }public static boolean tek(int a){
       return a%2!=0;
    }
// Task-3 : Functional Programming ile listin cift elemanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftKarekök(List<Integer> sayi){
        sayi.stream().
                filter(Lambda01::ciftBul).
                map(Math::sqrt).forEach(t-> System.out.print(t+" "));
    }
    // Task-4 : list'in en buyuk elemanini yazdiriniz
    public static void maxElBul(List<Integer> sayi){
        Optional<Integer> maxSayi=
        sayi.stream().reduce(Math::max);// eger benim resultim tek bir deger ise o zaman reduce terminal op kullanilir.
        System.out.println(maxSayi);
    }
    //structured yapi ile cözelim
    public static void structuredMaxElBul(List<Integer> sayi){
        int max=Integer.MIN_VALUE;
        System.out.println("max = " + max);//max soutv
        for (int i=0;i>sayi.size();i++){
            if (sayi.get(i)>max)max=sayi.get(i);
        }
        System.out.println("en büyük sayi "+max);
    }// Task-5 : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftElKareMax(List<Integer>sayi){
        System.out.println(sayi.stream().
                filter(Lambda01::ciftBul).
                map(t -> t * t).
                reduce(Integer::max));// Math::max'a göre daha hizli calisir
// Task-6: List'teki tum elemanlarin toplamini yazdiriniz.Lambda Expression...
    }public static void tumElTopla(List<Integer>sayi){
        System.out.println(sayi.stream().reduce(0, (t, u) -> t + u));
        /*
* a ilk degerini her zaman atanan degerden (ilk parametre) alır,
    bu örnekte 0 oluyor
* b degerini her zamana  stream()'dan akısdan alır
* a ilk degerinden sonraki her değeri action(işlem)'dan alır

*/

    }// Task-7 : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer>sayi){
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact));//method refrance
        System.out.println(sayi.stream().filter(Lambda01::ciftBul).reduce(1,(a,b)->(a*b)));//lambda expression
        // Task-8 : List'teki elemanlardan en kucugunu  print ediniz.
    }public static void minBul(List<Integer>sayi){
        System.out.println(sayi.stream().reduce(Integer::min));
        //2.yol
        System.out.println(sayi.stream().reduce(Lambda02::byMiracMin));
    }public static int byMiracMin(int a,int b){
        return a<b ?a:b;
    }// Task-9 : List'teki 5'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void besdenBüyükTekSayi(List<Integer>sayi){
        System.out.println(sayi.stream().filter(t -> t > 5 && t % 2 != 0).reduce(Math::min));
    }// Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftElKareTop(List<Integer>sayi){
        sayi.stream().//akis baslattik
                filter(Lambda01::ciftBul).//akis icindeki cift sayilari aldik
        map(t->t*t).//karelerini aldik
                sorted().// kücükten büyüge siraladik
                forEach(Lambda01::yazdir);// yazdirdik
    }
}
