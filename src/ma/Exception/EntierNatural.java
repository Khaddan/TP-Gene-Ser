package ma.Exception;

public class EntierNatural {
    private int val;

    public int getVal() {
        return val;
    }
    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new  NombreNegatifException("valide");
        this.val = val;
    }

    public EntierNatural(int val) throws NombreNegatifException  {
        if (val<0) throw new  NombreNegatifException("valeur negatif");
        this.val = val;
    }

    public void decrementer()  throws NombreNegatifException{
        if(val<=0) throw new NombreNegatifException("Attention decrementation");
        val--;
    }


}
