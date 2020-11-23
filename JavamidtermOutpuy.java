package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavamidtermOutpuy {
   
    static ArrayList<String> name = new ArrayList<>();
     static Scanner cs = new Scanner(System.in);
    static ArrayList<Integer> age = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        int option = 0;
        diri:
         while(true) {
            System.out.println("Options: \n1. Add entry \n2. Remove entry \n3. View all entry \n4. Update entry \n0. exit");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    addEntry();
                    break;
                case 2:
                    removeEntry();
                    break;
                case 3:
                    viewAllEntry();
                    break;
                case 4:
                    UpdateEntry();
                    break;
                case 0:
                    break diri;
                default:
                    System.out.println("invalid");
                    break;
        
        }
    }
}   
    static void addEntry() {
        System.out.print("Enter name: ");
        name.add(cs.nextLine());
        System.out.print("Enter age: ");
        age.add(sc.nextInt());
    }
    static void removeEntry(){
        String input;
        System.out.println("enter name to delete: ");
       input = cs.nextLine();
       if(name.contains(input))
       {
           name.remove(input);
           System.out.println(input+" has been deleted!");
       } else {
           System.out.println("no "+input+" in the list! ");
       }
        
    } 
    static void viewAllEntry(){
    System.out.println("\n view all entry");
    for(int i=0;i<name.size();i++){
      System.out.println(name.get(i)+" is "+age.get(i));
    }
   
    }
       
    
    static void UpdateEntry(){
       
        System.out.print("Enter new name: ");
        String value = cs.nextLine();
        name.set(1,value);
       System.out.print("Enter age: ");
        int index = sc.nextInt();
        age.add(1, index);
        
    }
        
    
}

