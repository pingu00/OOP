public class TestStudentDB {
    public static void main(String[] args){
        StudentDB DB = new StudentDB();
        Student student = new Student("김지우", 201911111, 4.01);
        DB.add(student);
        DB.add("이민준",201922222,3.85);
        DB.add("박서윤",201933333,3.90);

        System.out.println(DB.findBy("김지우").toString());
        System.out.println(DB.findBy(201922222).toString());
        System.out.println(DB.findBy(3.90).toString());
        System.out.println(DB.findBy(StudentDB.FindGPAParam.LOWER_THAN,3.95).toString());
        System.out.println(DB.findBy(StudentDB.FindGPAParam.HIGHER_THAN,3.95).toString());
    }

}
