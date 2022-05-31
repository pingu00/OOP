public class StudentDB {
    enum FindGPAParam {LOWER_THAN, HIGHER_THAN }

    int index;
    Student[] db;
    
    public StudentDB (){
        index = 0;
        db = new Student[3];
    }

    
    void add(Student student){
        db[index++] = student;
    }
    void add(String name, int number, double gpa){
        Student student = new Student(name, number, gpa);
        db[index++] = student;
    }
    
     Student findBy(String name){
        for (int i =0; i<3 ; i++){
            if (name.equals(db[i].getName())) {
                return db[i];
            }
        }
        return null;
    }
    Student findBy(int number){
        for (int i =0; i<3 ; i++){
            if (number == db[i].getNumber()) {
                return db[i];
            }
        }
        return null;
    }
    Student findBy(double gpa){
        for (int i =0; i<3 ; i++){
            if (gpa == db[i].getGpa()) {
                return db[i];
            }
        }
        return null;
    }
    Student findBy(FindGPAParam param, double gpa){
        if (param == FindGPAParam.LOWER_THAN) {
            for (int i =0; i<3 ; i++){
                if (gpa > db[i].getGpa()) {
                    return db[i];
                }
            }
        }
        else if (param== FindGPAParam.HIGHER_THAN) {
            for (int i = 0; i < 3; i++) {
                if (gpa < db[i].getGpa()) {
                    return db[i];
                }
            }
        }
        return null;
    }
}
