public class Element {
    
    public int eType;
    public int eInt;
    public double eDouble;
    public String eString;
    
    public Element(int type, int intValue, double doubleValue, String stringValue){
        eType = type;
        eInt = intValue;
        eDouble = doubleValue;
        eString = stringValue;
    }
    
    public String toString(){
        String result = "";
		if (eType == 0) {
			result += eInt;
	    }
		else if (eType == 1) {
			result += eDouble;
        }
        else 
            result += eString;
        return result;
    }
}