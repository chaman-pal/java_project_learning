package and_or_not_working;

public class Not_Operator {

    public static void main (String[] args){

        int age=19;
        if(age<16){

            System.out.println("eligible for voting");
        }
        else{
            System.out.println("eligible for not voting");
        }
        age=19;
        if(!(age<16)){

            System.out.println("eligible for voting");
        }
        else{
            System.out.println("eligible for not voting");
        }
    }
}
