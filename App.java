package Actividad13;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        List Nlista = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String a;
        
        for(int i = 0; i < 6; i++){
            
            System.out.print("Nombre de producto " + (i+1) +": ");
            a = scan.next();
            
            Nlista.add(a);
        }
        
        System.out.println("");
        Collections.sort(Nlista);
        
        for(Object thisList : Nlista){
            
            System.out.println(thisList);
        }
        
        
      
    }
}
