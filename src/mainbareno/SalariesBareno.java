
package mainbareno;

public class SalariesBareno {
    int id;
    String name;
    double rate;
    double hour;
    double deduction;
    double gross;
    double netpay;
    
    public void addSalary(int id, String name, double rate, double hour,double deduction){
        
       this.id = id;
       this.name = name;
       this.rate = rate;
       this.hour = hour;
       this.deduction = deduction;
       this.gross = this.rate * this.hour;
       this.netpay = this.gross - this.deduction;
    }
    public void viewInfo(){
        
         this.gross = this.rate * this.hour;
         this.netpay = this.gross - this.deduction;
         System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",id,name,rate,hour,gross,deduction,netpay);
        
    }
    public void editInfo(int id,double rate,double hour,double deduction){
        
        if (this.id == id){
            this.rate = rate;
            this.deduction = deduction;
            this.hour = hour;
            
            
        }
        
    }
    
}
