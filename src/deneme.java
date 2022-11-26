import java.util.ArrayList;
import java.util.List;

public class deneme {

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(98);
        l.add(131);
        printel(l);


    }public static void printel(List<Integer> l){
        l.stream().forEach((t)-> System.out.print(+ t+" "));
    }
}
