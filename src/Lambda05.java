import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {

        System.out.println(topla(5));
        System.out.println(tolaCincx(5));
        System.out.println(ciftSay(5));
        System.out.println(ilkxpytfcfttopl(5));
        System.out.println(toplaIlkxCift(4));
        System.out.println(toplaIlkxTek(3));
        ikiNinxKuvetini(5);
        System.out.println();
        ilkxKuvvetiniYazdran(3,2);
        System.out.println();
        System.out.println(birsayininfak(5));
    }//TASK 01 --> Structured Programming ve
    // Functional Programming ile 1'den x'e kadar (x dahil)
    // tamsayilari toplayan bir program create ediniz.
    //structured

    public static int topla(int x){
        int toplam=0;
        for (int i=0;i<=x;i++){
            toplam=toplam+i;

        } return toplam;
    }
    public static int tolaCincx(int x){
        //list<Integer>x
       return IntStream.//int degerde bir akis saglar
               range(1,x+1).// range(a,b)--> a // range(a,b) --> a dan b'ye kadar ( b dahil değil) int değerler akısa alınd
               sum();
    }//TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int ciftSay(int x){
       return IntStream.range(1,x+1).filter(t->t%2==0).sum();
    }//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int ilkxpytfcfttopl(int x){
       return IntStream.range(1,x*2).filter(t->t%2==0).limit(2).sum();
    }
public static int toplaIlkxCift(int x){
        return IntStream.iterate(2,t->t+2).// 2den sonsuza kadar elemanlari 2 artirarak akisa alir
    limit(x).sum();
}//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkxTek(int x){
        return IntStream.iterate(1,t->t+2).// 2den sonsuza kadar elemanlari 2 artirarak akisa alir
                limit(x).sum();}
    //TASK 05 --> 2'nin ilk pozitif x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikiNinxKuvetini (int x){
         IntStream.iterate(2, t->2*t).limit(x).forEach(t-> System.out.print(t+" "));
    }//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ilkxKuvvetiniYazdran(int istenenSayi ,int x){
        IntStream.iterate(istenenSayi,t->t*istenenSayi).
                limit(x).
                forEach(t-> System.out.print(t+" "));
    }//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int birsayininfak(int x){

       return IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
    }
}
