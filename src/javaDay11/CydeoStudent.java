package javaDay11;

public class CydeoStudent {


    public String name;
    public int age;
    public int id;
    public int grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName="Cydeo";
    public static String programmingLaguage="Java";

    public CydeoStudent(String name, int age,
                        int id, int grade,
                        int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }


    public void study(){
        System.out.println(name+" is studying.");
    }
    public void attendClass(){
        System.out.println(name+" is attending the live class.");
    }

    public void printSchoolName(){
        System.out.println("schoolName: "+schoolName);
    }
    public void printProgLanguage(){
        System.out.println("programmingLanguage: "+programmingLaguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }





}
