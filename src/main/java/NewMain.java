
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int niv;
        int n1;
        int i=15;
        char car;
        int ascii,ascii1;
        boolean test=false;
        	Scanner sc = new Scanner(System.in);
		
                System.out.println("--------Bienvenue au jeu du mystere-----------");
		System.out.println("--------Veuillez choisir le niveau-----------");
		System.out.println("--------1: Niveau Facile-----------");
                System.out.println("--------2: Niveau Moyen-----------");
                System.out.println("--------3: Niveau Difficile-----------");
                System.out.println("--------0: Quitter-----------");
                niv=sc.nextInt();
                
                switch(niv) {
                    case 0:

                        System.out.println("Quitter");
                      
                     ;
                     case 1:
                         System.out.println("Niveau Facile : Le mystere est un nombre entre 0 et 100 "
                             );
                         Random r = new Random();
                         int Low = 0;
                         int High = 100;
                         int Result = r.nextInt(High-Low) + Low;
                        // System.out.println("resultat  "+Result);
                         while(i!=0){
                         do{
                        
                        System.out.println("Donner le mistere entre 0 et 100");
                        n1=sc.nextInt();
                        i--;
                        }while(n1>100||n1<0);
                         if(n1==Result)
                         {
                             System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
                             
                             i=0;
                             
                         }
                         else if(n1>Result)
                         {
                         System.out.println("c'est moins, il vous reste " +i+" tentatives");
                         
                         }
                         else if(n1<Result)
                         {
                             System.out.println("c'est plus, il vous reste " +i+" tentatives");
                            
                         }
                         
                         
                         
                         }
                         break;
                     
                      case 2:
                         
                        System.out.println("Niveau Moyen : Le mystere est un nombre entre 0 et 10000");
                        
                          
                           Random r1 = new Random();
                         int L = 0;
                         int H = 10000;
                         int Res = r1.nextInt(H-L) + L;
                        // System.out.println("resultat  "+Result);
                         while(i!=0){
                         do{
                        
                        System.out.println("Donner le mistere entre 0 et 10000");
                        n1=sc.nextInt();
                        i--;
                        }while(n1>10000||n1<0);
                         if(n1==Res)
                         {
                             System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
                             
                             i=0;
                             
                         }
                         else if(n1>Res)
                         {
                         System.out.println("c'est moins, il vous reste " +i+" tentatives");
                         
                         }
                         else if(n1<Res)
                         {
                             System.out.println("c'est plus, il vous reste " +i+" tentatives");
                             
                         }
                         
                         
                         }
                      break;
                      case 3:
                          
                        System.out.println("Niveau Difficile : Le mystere est un nombre entre 10 et 100");
                        
                         Random r2 = new Random();
                         int low = 10;
                         int high = 100;
                         int Result2 = r2.nextInt(high-low) + low;
                         System.out.println("nb  "+Result2);
                        Random rand = new Random();
                        char c =(char)(rand.nextInt(26) + 97);
                        System.out.println("caractere aleatoire est "+c);
                        ascii1 = (int) c;
                        
                         while(i!=0){
                         do{
                        
                        System.out.println(" Donner le mistere entre 10 et 100");
                        n1=sc.nextInt();
                        i--;
                        }while(n1>100||n1<10);
                         
                         
                          do{
                         System.out.println(" Donner le caractere mystere entre a et z");
                          car = sc.next().charAt(0);
                          ascii = (int) car;
                         }while(ascii<97||ascii>122);
                          
                          
                         
                         if((n1==Result2)&&(ascii==ascii1))
                         {
                             System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
                             
                             i=0;
                             
                         }
                         
                         
                         
                         else if(n1>Result2)
                         {
                         System.out.println("c'est moins, ");
                         
                         if(ascii<ascii1)
                         {
                             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
                         }
                         else if(ascii>ascii1)
                         {
                             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
                         }
                         else if((n1==Result2))
                         {
                             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
                         } else if((ascii==ascii1))
                         {
                             System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
                         }
                         
                         
                         
                         }
                         else if(n1<Result2)
                         {
                             System.out.println("c'est plus");
                            if(ascii<ascii1)
                         {
                             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
                         }
                         else if(ascii>ascii1)
                         {
                             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
                         }
                        else if((n1==Result2))
                         {
                             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
                         } else if((ascii==ascii1))
                         {
                             System.out.println("Le caractere est correct, il vous restes " +i+" tentatives");
                         }
                         }
                         
                         
                         
                         else if(n1==Result2){
                             System.out.println("Le nombre est correct, il vous restes " +i+" tentatives");
                             if(ascii<ascii1)
                         {
                             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
                         }
                         else if(ascii>ascii1)
                         {
                             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
                         }else if((ascii==ascii1))
                             {
                             System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
                         }
                         }
                         
                         
                         
                         
                         
                         
                        else if(ascii==ascii1){
                             System.out.println("Le caractere correct, il vous restes " +i+" tentatives");
                             if(ascii<ascii1)
                         {
                             System.out.println("Le caractere est apres, il vous restes  " +i+" tentatives");
                         }
                         else if(ascii>ascii1)
                         {
                             System.out.println("Le caractere est avant, il vous restes  " +i+" tentatives");
                         }else if((n1==Result2))
                             {
                             System.out.println("Bravo!Vous avez gagner au bout de " +i+" tentatives");
                         }
                         }                         
                         
                         
                         
                                             
                         }
                          
                     break;
                      default:
                }

   
 
 
    }
    
}
