
class studet {
 private int bsa;
 private int hra;
 private int da;
 private int ta;
 private int ma;
 private int pf;
 private int gs;
 private int tax;
 private boolean isvalid(int x) {
 if (x <= 0) {
 return false;
 }
 return true;
 }
 studet(int bs, String name) {
 if (!isvalid(bs)) {
 System.out.println("invalid data");
 return;
 }
 this.bsa = bs;
 this.hra = (int) (bs * 0.5);
 this.da = (int) (bs * 0.15);
 this.ta = (int) (bs * 0.2);
 this.ma = (int) (bs * 0.2);
 this.pf = (int) (bs * 0.05);
 this.gs = (int) (bs + this.hra + this.da + this.ta + this.ma);
 this.tax = (int) (bs * 0.5);
 }
 public void print() {
 System.out.println("basic salary : " + bsa);
 System.out.println("House Rent Allowance : " + hra);
 System.out.println("Dearness Allowance d : " + da);
 System.out.println("Travelling Allowance : " + ta);
 System.out.println("Medical Allowance : " + ma);
 System.out.println("5% of the BS (Employee : " + pf);
 System.out.println("GS : " + gs);
 System.out.println("tax : " + tax);
 }
}
class slip {
 public static void main(String[] args) {
 studet mahima;
 System.out.println();
 System.out.println("Mahima salary ");
 mahima = new studet(10000, "Mahima");
 mahima.print();
 studet rohan; 
 System.out.println("Rohan salary ");
 rohan = new studet(20000, "n");
 rohan.print();
 }
}