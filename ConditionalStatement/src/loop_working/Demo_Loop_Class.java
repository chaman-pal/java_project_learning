package loop_working;

public class Demo_Loop_Class {

    public static void main (String[] args){

        //for(initialization; condition; increment/decrement){
        //statement or code to be executed
        //}

        for(int i=0; i<10; i++){

            System.out.println("hello:"+i);
        }
        //for(initialization; condition; increment/decrement){
        //statement or code to be executed
        //}

        for(int i=0; i<=10; i++){

            System.out.println("hello:"+i);
        }
        //for(initialization; condition; decrement){
        //statement or code to be executed
        //}

        for(int i=15; i>=0; i--){
            System.out.println(" decrement inside loop hello..:" +i);
        }
    }
}
