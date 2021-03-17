package elementos;

import java.util.Scanner;
import java.util.ArrayList;

public class ex02 {
    
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       ArrayList<Integer> valor = new ArrayList<>();
       ArrayList<Integer> par = new ArrayList<>();
       ArrayList<Integer> impar = new ArrayList<>();
        
      int n=0;
      int i=0;
      int num=0;



        
         for( i=0; i <= 20; ++i){
        valor.add(i);
        

            
       if (valor.get(i) % 2== 0 && valor.get(i) != 0){
            par.add(i);}

       else{impar.add(i);}

      

        }
        System.out.println("Tamanho do Array: "+ valor.size());
        System.out.println("Num Pares "+ par);
        System.out.println("Num Impares "+ impar);
          
         
       
    
    }
}




