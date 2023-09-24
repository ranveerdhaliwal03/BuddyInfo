
/*
 DELIVERABLE 1
    .idea
    src
    lab1.iml

DELIVERABLE 2
    java.base
    java.compiler
    java.sql


DELIVERABLE 3
C:\Users\ranve\.jdks\openjdk-19.0.1\bin\java.exe "-javaagent:C:\Users\ranve\IntelliJ IDEA Community Edition 2022.3.1\lib\idea_rt.jar=62683:C:\Users\ranve\IntelliJ IDEA Community Edition 2022.3.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\ranve\SYSC 3110\Lab1\out\production\Lab1" BuddyInfo
Hello World!

Process finished with exit code 0


DEV 4
C:\Users\ranve\SYSC 3110\Lab1\out\production\Lab1\BuddyInfo
C:\Users\ranve\SYSC 3110\Lab1\src\BuddyInfo

 */
public class BuddyInfo {
    private String name;
    private String address;
    private String phone_no;

    public BuddyInfo(String name,String address,String phone_no) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
    }

    public BuddyInfo(){
        this("none", "none", "none");
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        BuddyInfo b1 = new BuddyInfo("Homer","123 main st", "613-555-2828");

        System.out.println("hello "+ b1.name);
    }
}
