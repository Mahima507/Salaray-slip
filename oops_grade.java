
import java.util.Scanner;
class student {
Scanner scanner = new Scanner(System.in);
private int a;
private int b;
private int c;
private int g;
private String p;
private boolean isvalid(int x) {
if (x < 0 || x > 100) {
return false;
}
return true;
}
student() {
System.out.println("subject 1");
int i = scanner.nextInt();
this.a = i;
if (!isvalid(i)) {
System.out.println("invalid data");
return;
}
System.out.println("subject 2");
i = scanner.nextInt();
this.b = i;
if (!isvalid(i)) {
System.out.println("invalid data");
return;
}
System.out.println("subject 3");
i = scanner.nextInt();
this.c = i;
if (!isvalid(i)) {
System.out.println("invalid data");
return;
}
this.g = this.a + this.b + this.c;
this.g /= 3;
grade(this.g);
}
private void grade(int marks) {
if (marks >= 90 && marks <= 100) {
System.out.println(" is grade A");
this.p = "A";
} else if (marks < 90 && marks >= 70) {
System.out.println(" is grade B");
this.p = "B";
} else if (marks < 70 && marks >= 60) {
System.out.println(" is grade C");
this.p = "C";
} else if (marks < 60 && marks >= 50) {
System.out.println(" is grade D");
this.p = "D";
} else if (marks < 50 && marks > 0) {
System.out.println(" is grade f");
this.p = "F";
} else if (marks > 100 && marks < 0) {
System.out.println("wrong input");
} else {
}
}
public void print() {
System.out.println("subject1 : " + a);
System.out.println("subject 2 : " + b);
System.out.println("subject 3 : " + c);
System.out.println("Percentage : " + g);
System.out.println("grade : " + p);
}
}
public class oops_grade {
public static void main(String[] args) {
student mahima;
System.out.println("Mahima salary ");
mahima = new student();
mahima.print();
student kush;
kush = new student();
kush.print();
}
}