package code1_same_sub_string;

import java.util.*;
public class Pair{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1;
        s1 = in.next();
        pair(s1);
        in.close();
    }

    private static void pair(String s1) {
        String[] r1=s1.split(",");
        HashMap<String, Integer> h1= new HashMap<>();
        for(String i : r1){
            if(h1.containsKey(i)){
                int j = h1.get(i)+1;
                h1.put(i, j);
            }else{
                h1.put(i, 1);
            }
        }
        int u=0;
        System.out.println(h1);
        for(String i: h1.keySet()){
            if(h1.get(i)>1)
                u++;
            if (h1.get(i)%2==0){
                int y=h1.get(i)/2;
                for(int k=0;k<y;k++){
                    System.out.print("("+i+","+i+")");
                    h1.put(i,h1.get(i)-2);
                }
            }else{
                while(h1.get(i)>1){
                    System.out.print("("+i+","+i+")");
                    h1.put(i,h1.get(i)-2);
                }
            }
        }
        System.out.print("\n"+u+"\n[");
        int o=0;
        for(String i: h1.keySet()){
            if(h1.get(i)==1){
                o++;
                System.out.print(i+",");
            }
        }
        System.out.println("]"+"\n"+o);
    }
}