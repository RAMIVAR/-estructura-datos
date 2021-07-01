//fibonacci
import java.util.Scanner;

public class fibonacci {

    public static void main (String [] args){

        Scanner Leer = new Scanner (System.in);
        int Limite; 
        int primero = 0, segundo = 1, media;

System.out.print("ingresa limite: ");
Limite =Leer.nextInt();


for (int i=0; primero<=Limite; i++){
  
    media=primero;
    primero=segundo;
    segundo = (media + segundo);

System.out.println(media);
//System.out.println(primero);
//System.out.println(segundo);



}

}


}