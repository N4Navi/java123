package unit3;
import unit1.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        System.out.println("Enter number of products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }

        Collections.sort(products);
        Iterator itr=products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
