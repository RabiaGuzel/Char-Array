
package öde3;
import java.util.Random;
public class ÖDE3 {
    public static char [] diziolustur(){
        char dizi[]=new char[100];
        for(int i=0;i<100;i++){
            Random rnd = new Random();
            char c = (char) ('a' + rnd.nextInt(26));
            dizi[i]=c;
        }
        return dizi;}
    public static void diziGoster(char [] dizi){
        diziolustur();
        for (int i=0;i<100;i++){
            System.out.println(" "+dizi[i]);
       
        }
    }
    public static void main(String[] args) {
      diziGoster(diziolustur());

    }}

 