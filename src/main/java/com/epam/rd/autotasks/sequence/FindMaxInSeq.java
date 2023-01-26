package com.epam.rd.autotasks.sequence;
import java.util.Scanner;
import java.util.*;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> val=new ArrayList<>();
        while(true){
            int a=sc.nextInt();
            if(a!=0){
                val.add(a);
            }
            else{
                break;
            }
        }
        if(val.size()==1){
            return val.get(0);
        }
        else{
            int maximum=val.get(0);
            for(int i=1;i<val.size();i++){
                if(val.get(i)>maximum){
                    maximum=val.get(i);
                }
            }
            return maximum;
        }

        
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
