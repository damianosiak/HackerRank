//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
        Map<String,Integer> lista = new HashMap<String,Integer>();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			lista.put(in.nextLine(),in.nextInt());
			in.nextLine();
		}
		while(in.hasNext())
		{
            String s=in.nextLine();//
            if(lista.containsKey(s)){
                System.out.println(s+"="+lista.get(s));
            }else{
                System.out.println("Not found");
            }
			
		}
	}
}



