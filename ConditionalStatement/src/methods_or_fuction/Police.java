package methods_or_fuction;

public class Police {

    //SYNTAX: access_specifier return_type method_name(parameter){}
    //security, safety, hard_work, brave

    public void security(){
        System.out.println("This is security method...");
    }
    public void safety(){
        System.out.println("This is safety method....");
    }
    public void hard_work(){
        System.out.println("This is hard_work method....");
    }
    public void brave(){
        System.out.println("This is brave method...");
    }
    public static <police> void main(String[] args){

        // SYNTAX:how to cell_method

        Police obj=new Police();

           obj.security();

           obj.safety();

           obj.hard_work();

           obj.brave();

    }

}
