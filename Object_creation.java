class employee {
    private int empno;
    private String ename;
    private float basic;
    private float hra;
    private float da;
    private float netpay;
    
    public employee() {
        this.empno = 0;
        this.ename = null;
        this.basic = 0.0f;
        this.hra = 0.0f;
        this.da = 0.0f;
        this.netpay = 0.0f;
    }
    
    public float calculate() {
        return basic + hra + da;
    }
    
    public void havedata(int empno, String ename, float basic, float hra, float da) {
        this.empno = empno;
        this.ename = ename;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.netpay = calculate();
    }
    
    public void dispdata() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

public class Object_creation {
    public static void main(String[] args) {
        employee emp = new employee();
        
        emp.havedata(101, "Akshir", 300000, 5000, 2000);
        
        emp.dispdata();
    }
}