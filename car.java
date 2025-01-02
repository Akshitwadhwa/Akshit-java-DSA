public class car {
    String companyname;
    String modelName;
    int kms;
    String color;

    car(String compName , String modName , int KMS , String col){
        companyname = compName;
        modelName = modName;
        kms = KMS;
        color = col;
    }

    void paint(String newcolor) {
        color = newcolor;

    }

    public static void main(String[] args) {
        car c = new car("AUDI", "RSQ8", 2000, "jetblack");
        System.out.println(c.color);
        c.paint("WHITE");
        System.out.println(c.color);
        }
    }
    

        
    
