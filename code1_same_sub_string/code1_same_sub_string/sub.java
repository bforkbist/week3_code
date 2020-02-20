package code1_same_sub_string;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


class Sub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1, s2;
        s1 = in.next() + in.nextLine();
        s2 = in.next() + in.nextLine();
        sub(s1, s2);
        in.close();
    }

    private static void sub(String s1, String s2) {
        String[] r1=s1.split(" ");
        String[] r2=s2.split(" ");
        ArrayList<String> y1=new ArrayList<>();
        ArrayList<String> y2=new ArrayList<>();
        ArrayList<String> y3=new ArrayList<>();
        Vector<Integer> j = new Vector<>();
        for(int i=0;i<r1.length;i++){
            y1.add(r1[i]);
        }
        for(int i=0;i<r2.length;i++){
            y2.add(r2[i]);
        }
        if (y1.size()>=y2.size()){
            for(int i=0;i<y1.size();i++){
                if(y2.contains(y1.get(i))){
                    y3.add(y1.get(i));
                    y2.remove(y1.get(i));
                    j.add(i);
                }
            }
            for(String i :y3){
                System.out.print(i+",");
            }
            System.out.println("");
            for(int i:j){
                if(y1.get(i)==y2.get(i))
                    System.out.print(y1.get(i)+",");
            }
        }else{
            
            for(int i=0;i<y2.size();i++){
                if(y2.contains(y1.get(i))){
                    y3.add(y1.get(i));
                    y1.remove(y2.get(i));
                }
            }
            for(String i :y3){
                System.out.print(i+",");
            }
            System.out.println("");
            for(int i:j){
                if(y1.get(i)==y2.get(i))
                    System.out.print(y2.get(i)+",");
            }

        }
            
    }
}