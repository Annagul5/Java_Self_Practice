package javaDay11;

public class CydeoStudentClients {
    public static void main(String[] args) {
    CydeoStudent cydeoStudent = new CydeoStudent("Anna",19,12,
            1,12,2);
      cydeoStudent.study();
      cydeoStudent.attendClass();
      cydeoStudent.printSchoolName();
      cydeoStudent.printProgLanguage();
        System.out.println(cydeoStudent);

    }
}
