public class circle {
    int radius;

    public circle() {
        radius = 0;
    }

    public int getradius(){
        return radius;

    }

    public void setradius (int r) {
        radius = r;

    }
    public double getArea() {
        return 3.14 * radius * radius ; 

    }
    public static void main(String[] args) {
        circle a = new circle();

        a.setradius(8);
        System.out.println("radius:" + a.getradius());
        System.out.println("area:" + a.getArea());
    }


    
}
