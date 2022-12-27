import java.lang.StackWalker.Option;
import java.util.Scanner;


public class LibraryManagement {
    public static void main(String[] args) {
      int number;
      String r;
       do{
      System.out.println("                               LibraryManagmente");
        System.out.println("press 1 to search Book");
        System.out.println("press 2 to issue Book");
        System.out.println("press 3 to return Book");
        System.out.println("press 4 to exit");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any number");
       number= obj.nextInt();
        switch(number){
         case 1:
         Library aa=new Library(); 
         aa.search();
         break;
         case 2:
         Library ab=new Library();
         ab.issue();
         case 3:
         Library ac=new Library();
         ac.retun();
         case 4:
         Library ad=new Library();
         ad.exit();
         break;
         default:
		 //continue;
         System.out.println("Invalid Number");
        }
        System.out.println("you want to select next option Y/N");
        r=obj.nextLine();
    }
    while(r=="y"||r=="Y");
     if(r=="n"||r=="N"){
      Library z=new Library();
      z.exit();
    }
   }
}
class Library{
   int TB,RD,SD;
   String a,Name,Title;  

     public void search(){
           for(int i=0;i<=5;i++){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book Titel ");
        Title=sc.nextLine();
           }
       
     }  
     
     void issue(){

        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Student Name");
        a=scr.nextLine();
        System.out.println("Enter total number of books issued");
         TB=scr.nextInt();
         scr.nextLine();
         if (TB>5){
            System.out.println("You can not issue more then 5 books");
         }
         System.out.println("After 15 Days of issuedate fine will be imposed");
          //  RD=scr.nextInt();
     }


         void retun(){

           System.out.println("Enter Student Name ");
           Scanner src=new Scanner(System.in);
           String Name= src.nextLine();
          if (a==Name){
            System.out.println("          Details");
            System.out.println("Book name::"+  Title);
            System.out.println("Number of books"+  TB);
          }else{
            System.out.println("Student name not Found");
          }
            System.out.println("In how many days did u retun Books");
            SD=src.nextInt();
            if(SD>15){
               System.out.println("100 rupees fine will have to be paid");
            }
          
         }

         void exit(){
            System.exit(0);
         }
}