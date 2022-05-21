package loop_working;

public class Demo_Loop_Class2 {
    public static void main (String[] args){

        //for(initialization; condition; increment/decrement){
        //statement or code to  be executed
        //}
        int number=5;
        for(int i=1; i<=10; i++){
            int result= number * i;
            System.out.println("Table of five is :" + number + "*" + i +"=" + result);
        }


            //for(initialization; condition; increment/decrement){
        //statement or code to  be executed
        //}
        int Number=19;
        for( int i=1;i<=10; i++){
            int result=Number * i;
            System.out.println("Table of nineteen is :" + Number + "*" +i +"=" + result);
        }

        //for(initialization; condition; increment/decrement){
        //statement or code to  be executed
        //}
        int odd_number=15;
      for(int i=1; i<=10; i++){
          int result=odd_number * i;
          System.out.println("Table of fifteen is : " +odd_number+"*"+i+"="+result);
      }

    }
}
