package ma.Exception;

public class Application {
    public static void main(String[] args) {
        try{
            EntierNatural entierNatural=new EntierNatural(1200);
            entierNatural.decrementer();
            //entierNatural.setVal(1000);
            System.out.println(entierNatural.getVal());
        }catch (NombreNegatifException e){
                 System.out.println(e.getMessage());

        }


    }
}
