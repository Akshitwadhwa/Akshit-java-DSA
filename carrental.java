public class carrental {
    String cartype;
    String carld;

    carrental(String cartype,  String carld) {
        cartype = cartype;
        carld = carld;
        
    }
   public String getCar (){
    return "car Id:" + carld + " , car type: " + cartype;
    }

    public static void main(String[] args) {
     carrental a  = new carrental("HR45AB4525", "Fortuner") ;
        System.out.println(a.carrental);
    }
}
   
