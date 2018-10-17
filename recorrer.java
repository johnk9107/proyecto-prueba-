package german;
import java.util.*;
public class recorrer
{

    public static void main(String[] args) 
    {
       Scanner in = new Scanner(System.in);
       int n;
       System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ");
       n = in.nextInt();
       int [][] matriz = new int [n][n];
       int f,c,h,d,d1;
       for (f=0 ; f<n; f++)
       {
           for (c=0 ; c<n; c++)
           {
               System.out.println("INGRESE UN NUMERO");
               h = in.nextInt();
               matriz [f][c] = h;
              
           }
            
       }
        for (f=0; f<n; f+=2)
        {
            for (c=0; c<n; c+=2)
            {
                System.out.print(" | "+ matriz [f] [c]);
                
            }
            System.out.println(" | ");
        }
        
            for(f=0;f<1;f++) {
            for(c=0;c<matriz[f].length;c++) 
            {
                System.out.print(matriz[f][c]+" ");
            }
            
           
            System.out.println();
        }
          
        }
    }
          
        
    
            
         
 
    



