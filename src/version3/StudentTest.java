package version3;

public class StudentTest {
    public static void addStudent(Student[] students,Student student){
        //添加操作 所有方法都是围绕添加进行的
        if (exist(students,student.getId())){
            //id
            System.out.println("id已存在添加失败");
            return;
        }
        int pos=arrayHavePosition(students);
        if (pos==0){
            System.out.println("位置满了，请使用addStudentInFull()方法");
            return;
        }
        students[students.length-pos]=student;
        System.out.println("添加完成");
        for (int i = 0; i <=students.length-pos; i++) {
            System.out.println(students[i].toString());
        }
    }
    public static boolean deleteStudentFromId(Student[] students,int id){
        boolean index=false;
        for (int i = 0; i < students.length-arrayHavePosition(students); i++) {
            if (students[i].getId()==id){
                for (int j = i; j < students.length-arrayHavePosition(students)-i-1 ; j++) {
                    students[j]=students[j+1];
                    if (j==(students.length-arrayHavePosition(students)-(i+2))){
                        System.out.println("test");
                        students[j+1]=null;
                    }
                    index=true;
                }

            }
        }return index;
    }
    public static int searchById(Student[] students,int id){
        int position=-1;
        for (int i = 0; i < students.length-arrayHavePosition(students); i++) {
            if (students[i].getId()==id){
                position=i;
                return position;
            }
        }return position;
    }
    public static Student[] addStudentInFull(Student[] students,Student student){
        if (exist(students,student.getId())){
            //id
            System.out.println("id已存在添加失败");
            return students;
        }
        int pos=arrayHavePosition(students);
        if (pos!=0){
            System.out.println("原数组还有"+pos+"位置，添加失败");
            System.out.println("请使用addStudent()方法");
            return students;
        }
        Student[] toll=new Student[students.length+1];
        for (int i = 0; i < students.length; i++) {
            toll[i]=students[i];
        }
        addStudent(toll,student);
        return toll;
    }
    public static int arrayHavePosition(Student[] students){
        //判断数组中是否还有多余位置
        int pos= students.length;
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null){
                return pos;
            }else {
                pos--;
            }
        }return pos;
    }
    public static boolean exist(Student[] students, int id) {
        //判断id是否存在于数组中
        for (int i = 0; i < students.length-arrayHavePosition(students); i++) {
            if (students[i].getId() == id) {
                return true;
            }
        }return false;
    }
    private static void extracted(Student[] students) {
        for (int i = 0; i < students.length-arrayHavePosition(students); i++) {
            System.out.println(students[i].toString());
        }
    }

        public static void main (String[]args){
            Student[] students = new Student[3];
            Student st1 = new Student(1, "test1", 1);
            Student st2 = new Student(2, "test2", 2);
            Student st3 = new Student(3, "test3", 3);
            Student st4 = new Student(4, "test4", 4);
            Student st5 = new Student(5, "test5", 5);

            students[0] = st1;
            students[1] = st2;
            students[2] = st3;

            addStudent(students,st3);
            students=addStudentInFull(students,st4);
            System.out.println("——————————————————————————————");

            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].toString());
            }
            System.out.println(arrayHavePosition(students));

            System.out.println("——————————————————————————————");


            if (deleteStudentFromId(students,1)){
                System.out.println("删除成功");
            }
            extracted(students);
            System.out.println(arrayHavePosition(students));
            addStudent(students,st1);

            System.out.println("——————————————————————————————");


            int index=searchById(students,3);
            if (index!=-1){
                students[index].setAge(students[index].getAge()+1);
                System.out.println("增加成功");
            }else {
                System.out.println("id不存在");
            }
            extracted(students);
        }
    }

