package samperio;
import java.util.Scanner;
public class programa4 {
   public static void main(String[] args) {
    Scanner Leer=new Scanner(System.in);
    int L;
    int [] num =new int[10];
    for(L=0;L<=9;L++)
    {
      System.out.print("Ingresa un valor:");
      num[L]=Leer.nextInt();
    }
    for(L=0;L<=9;L++)
    {
       System.out.print("visualiza:"+num[L]); 
    }
    }
    }
 
