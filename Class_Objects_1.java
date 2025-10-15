public class classObj {
    public static void main (String[]args){
        Student s1 = new Student();  // ==DEFAULT CLASS==
        Student s2 = new Student(21, "king", 66.5); // ==ARGUMENT PASSED==
        Student s3 = s1; // ==COPIED CLASS FROM 'S1'==
//      ==DEFAULT ARUGEMENTS== 
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.mark); 
//      ==ARUGEMENTS PASSED VALUES==
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println(s2.mark);
//      ==COPY CLASS==
        System.out.println(s3.name);
        System.out.println(s3.mark);

    }
}
class Student{
    int rno;
    String name;
    double mark;
    Student(){  // ==DEFAULT==
        rno = 25;
        name = "Nandy";
        mark = 93.3;
    }
    Student(int rno, String name, double mark){ // ==ARUGEMENT PASSED==
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }
    Student (Student obj){  // ==COPY CLASS AND IT'S OBJECTS
        this.rno = obj.rno;
        this.name = obj.name;
        this.mark = obj.mark;
    }
}
