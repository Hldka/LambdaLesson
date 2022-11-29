package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class deneme {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,8};
        List<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,5,6));
karesinal(arr);
        System.out.println("********");
        System.out.println(square56(nums));

    }public static void karesinal(int[] arr){
        int [] neuarr= Arrays.stream(arr).filter(t -> t != 5 || t != 6).map(t -> t * t + 10).toArray();
        System.out.println(Arrays.toString(neuarr));
        Arrays.stream(arr).sorted().forEach(t-> System.out.print(t+" "));
    }public static List<Integer> square56(List<Integer> nums) {
nums.replaceAll(t->t*t+10);
nums.removeIf(t->t%10==5||t%10==6);
return nums;

    }

}
