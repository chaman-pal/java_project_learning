package variables;

public class Revision_Class {

    public static void main (String[] args){
         String brand="realme";
         int ram=8;
         double price=4500.5;

         if(brand=="realme" & ram==8 & price==4500.5){

             System.out.println("realme mobile in just 4500.5 rs with 8gb ram");
         }
         else{
             System.out.println("oppo mobile in just 4500.2 rs with 8gb ram");
         }
          brand="nokia";
          ram=6;
         if(brand=="samsung"  & ram==6){

             System.out.println("samsung mobile is given 6 gb ram");
         }
         else{
             System.out.println("nokia smartphone is given 6 gb ram");
         }

         brand="realme";
         ram=5;
         if(brand=="realme" & ram==6){
             System.out.println("the phone is good");
         }
         else{
             System.out.println("the phone is not good");
         }
    }
}
