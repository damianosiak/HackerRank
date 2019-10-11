import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows=scan.nextInt();
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            int numRowElements=scan.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>(numRowElements);
            for(int j=0;j<numRowElements;j++){
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        /*
        System.out.println(lists);
        System.out.println(lists.get(2));
        System.out.println(lists.get(2).size());
        System.out.println(lists.get(2).get(1));
        */

        int numQueries=scan.nextInt();
        for(int i=0;i<numQueries;i++){
            int numR=scan.nextInt();
            int numV=scan.nextInt();
            if(lists.get(numR-1).size()>numV-1){
                System.out.println(lists.get(numR-1).get(numV-1));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}

