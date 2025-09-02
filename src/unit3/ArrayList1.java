package unit3;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        System.out.println(al);
        for(int all:al){
            System.out.println(all);
        }
    }
}
