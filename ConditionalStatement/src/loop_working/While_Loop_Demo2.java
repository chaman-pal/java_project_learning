package loop_working;

public class While_Loop_Demo2 {
    public static void main (String[] args){

        //SYNTAX while ( condition){code; increment/decrement}
        int i=0;
        while(i<=30) {
            System.out.println(" increment : this is while loop..."+i);
            i++;//i=i+1;
        }
        // Decrement

        i=50;
        while(i>=25){
            System.out.println("Decrement : this is while loop second..."+i);
            i--;//i=i-1;
        }
    }
}
