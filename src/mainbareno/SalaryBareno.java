
package mainbareno;

import java.util.Scanner;

public class SalaryBareno {
    
    public void getSalary(){
        
    Scanner sc = new Scanner(System.in); 
    SalariesBareno[] sb = new SalariesBareno[100];
    int nums = 0;
    String choice;
    int x = 0;


        double deduction = 0;
        double rate = 0;
        int id;
        String name;
        int em;
        double hour;
        
                  
        do{

        System.out.println("--------------------------");
        System.out.println("WELCOME TO SALARY APP");
        System.out.println("--------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. EDIT");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("--------------------------");
        
        System.out.print("Enter Option: ");
        int option = sc.nextInt();
        
        while(option > 5){
        System.out.print("Invalid Selection, Try Again: ");
        option = sc.nextInt();
        }

          switch(option){
              
              case 1:
        System.out.println("Enter No. of Employees: ");
        em = sc.nextInt();

        for ( x = 0; x < em; x++){
            System.out.println("---------Employe Details-------");
            
            System.out.println("ID: ");
            id = sc.nextInt();
            System.out.println("Name: ");
            name = sc.next();
            System.out.println("Rate(Hour): ");
            rate = sc.nextDouble();
            System.out.print("Hours worked: ");
            hour = sc.nextInt();
            System.out.print("Total deduction: ");
            deduction = sc.nextInt();
            
            sb[x] = new SalariesBareno();
            sb[x].addSalary(id, name, rate, hour,deduction);
            
            
          }
           break;
           
              case 2:
               
                  sb[x].viewInfo();
           break;
              case 3:
                  System.out.println("Enter ID. of Employee: ");
                  id = sc.nextInt();
                 
                  for(int i = 0; i < nums; i++){
                      if(sb[x].id == id){
                          System.out.println("New Rate: ");
                          double rates = sc.nextDouble();
                          System.out.println("New Hour: ");
                          hour = sc.nextDouble();
                          System.out.println("New Deduction: ");
                          double deduc = sc.nextDouble();
                          sb[x].editInfo(id, rate, hour, deduction);
                          break;
                          
                      }
                  }
                  break;
                  
       }
            System.out.println("Want to Continue (yes or no): ");
            choice = sc.next();
        } while(choice.equals("y") || choice.equals("y"));

    }
}


       
       
    
    

    


