package class_and_object.parameterized_constructor;

public class English_Medium_Student {
        //Data Member or properties

        String name;
        String course;
        String clg;
        String address;
        int section;

        //parameterized constructor
        public English_Medium_Student(String name, String course, String clg, String address, int section) {
                this.name = name;
                this.course = course;
                this.clg = clg;
                this.address = address;
                this.section = section;
        }

        public static void main(String[] args) {
                //classname object name= new classname (value of properties)
                English_Medium_Student obj = new English_Medium_Student("radhe", "java", "ip clg", "bulandshahr", 2);

                System.out.println("printing obect:" + "name:" + obj.name + "/course:" + obj.course + "/clg:" + obj.clg + "/address:" + obj.address + "/section:" + obj.section);

                English_Medium_Student obj2 = new English_Medium_Student("rahul", "data_science", "mic", "agra", 1);

                System.out.println("printing object:" + "name>" + obj.name + "/course>"+obj2.course + "/clg>" + obj2.clg + "/address>" + obj2.address + "/section>" + obj2.section);

        }

}