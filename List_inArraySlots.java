/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        typeOfElements = new int[INITIAL_CAPACITY];
        intElements = new int[INITIAL_CAPACITY];
        doubleElements = new double[INITIAL_CAPACITY];
        stringElements = new String[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }

    public Element get( int index ) {
        Element element = new Element(typeOfElements[index],
                                      intElements[index],
                                      doubleElements[index],
                                      stringElements[index]);
        return element;
    }
        
     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */
    public String toString() {
	String result = "[";
    for( int index = 0; index < filledElements; index++)
        result += get(index) + ",";
	return result + "]";
    }


    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( int type   // same meaning as in typeOfElements
                      , int    intValue
                      , double doubleValue
                      , String stringValue
                      ) {
        if (filledElements == typeOfElements.length) {
            expand();
        }
        typeOfElements[filledElements] = type;
        intElements[filledElements] = intValue;
        doubleElements[filledElements] = doubleValue;
        stringElements[filledElements] = stringValue;
        filledElements++;
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
    private void expand() {
        System.out.println( "expand... (for debugging)");
            /* S.O.P. rules for debugging:
            Working methods should be silent. But during
            development, the programmer must verify that
            this method is called when that is appropriate.
            So test using the println(), then comment it out.
            */
        int[] biggerType = new int[ typeOfElements.length * 2];
        int[] biggerInt = new int[ intElements.length * 2];
        double[] biggerDouble = new double[ doubleElements.length * 2];
        String[] biggerString = new String[ stringElements.length * 2];

	for( int index = 0; index < filledElements; index++){
		biggerType[index] = typeOfElements[index];
		biggerInt[index] = intElements[index];
		biggerDouble[index] = doubleElements[index];
		biggerString[index] = stringElements[index];
	}

        typeOfElements = biggerType;
        intElements = biggerInt;
        doubleElements = biggerDouble;
        stringElements = biggerString;
    }
}
