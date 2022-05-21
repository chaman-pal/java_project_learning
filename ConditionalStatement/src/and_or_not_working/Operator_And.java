package and_or_not_working;

public class Operator_And {

    public static void main (String[] args) {

        //if (condition1 & condition2) true & true =true

        int roll_number = 1;
        int persentage = 60;
        if (roll_number == 1 & persentage > 50) {

            System.out.println("true&true=true student roll_number is 1 & student have 60% marks");
        } else {
            System.out.println("true&true=true student roll_number is 1 & student have 50% marks");
        }

        //if (true & false = false)
        int student_roll_number = 2;
        int student_percentage = 57;
        if (student_roll_number == 2 & student_percentage > 60)

        {
            System.out.println("true & false = false student_roll_number is 3 $ student_percentage is less_then 50");
        }
else
    {
    System.out.println("true & false = false student_roll_number is 2 & student_percentage is more-then 50");
        }
   //false & true = false

        student_roll_number=2;
        student_percentage=57;
         if(student_roll_number==3 & student_percentage>35){

             System.out.println("student 3 have 57% marks");
         }
        else{
            System.out.println("stufent 3have not 57% marks");
         }
        //false&false=false

        student_roll_number=2;
        student_percentage=57;

        if(student_roll_number==5 & student_percentage==60){

            System.out.println("student 5 have 60% marks");
        }
        else{
            System.out.println("student 5 have not 60% marks");
        }
    }

}
