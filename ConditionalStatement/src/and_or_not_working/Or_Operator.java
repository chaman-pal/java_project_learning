package and_or_not_working;

public class Or_Operator {

    public static void main (String[] args){

        //SYNTAX ( condition1 || condition2)

        //true || true = true
        String brand="nokia";
        int price= 45000;
        if(brand=="nokia"||price==45000){

            System.out.println("nokia is a good brand");
        }
else{
    System.out.println("nokia is not a good brand");
        }
   //true || false = true

        brand="nokia";
        price=25000;

        if(brand=="nokia" || price>55000){

            System.out.println("nokia mobile are starting  25000rupess");
        }

   else{
       System.out.println("nokia mobile are starting 45000 rupess");
        }
//false || true = true

        brand="samsung";
   price=45000;

   if(brand=="samsung" || price==45000){
       System.out.println("samsung mobile average price is 45000");
   }
   else{
       System.out.println("samsung mobile average price is not 45000");
   }
   //false || false = false

        brand= "oppo";
   price=55000;

   if(brand=="samsung"|| price==25000){
       System.out.println("oppo phone is good");
   }

else{System.out.println("oppo phone is not good");}



    }


}
