public class Element {
    
    public int eType;
    public int eInt;
    public double eDouble;
    public String eString;
        
    public static final int INTEGER = 0;
    public static final int DOUBLE = 1;
    public static final int STRING = 2;
    
    public Element(int type, int intValue, double doubleValue, String stringValue){
        eType = type;
        eInt = intValue;
        eDouble = doubleValue;
        eString = stringValue;
    }
    
    public String toString(){
        String result = "";
		if (eType == INTEGER) {
			result += eInt;
	    }
		else if (eType == DOUBLE) {
			result += eDouble;
        }
        else 
            result += eString;
        return result;
    }
}