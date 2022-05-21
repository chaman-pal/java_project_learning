package methods_or_fuction;

public class Employee {

    //SYNTAX: access_specifier return_type method_name (parameter) {}
    //work, eat, sleep, entertainment


    public void work(){

        System.out.println("This is work method....");
    }
    public void eat() {

        System.out.println("This is eat method....");
    }
    public void sleep(){

        System.out.println("This is sleep method....");
    }
    public void entertainment(){

        System.out.println("This is entertainment method....");
    }

    public static void main(String[] args){

        //SYNTAX: how to call_method

        Employee obj=new Employee();

        obj.work();

        obj.eat();

        obj.sleep();

        obj.entertainment();





    }


}
