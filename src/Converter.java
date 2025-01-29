public class Converter {
    public static void main(String[] args) {
        // Convert the string strFloat into a float.
        String strFloat = "374.25";
        float from_strFloat = Float.parseFloat(strFloat);
        System.out.println("Converted strFloat to float: " + from_strFloat);
        
        // Convert the string strInt into an integer.
        String strInt = "1250";
        int from_strInt = Integer.parseInt(strInt);
        System.out.println("Converted strInt to int: " + from_strInt);
        
        // Convert the float floatNum into an integer.
        float floatNum = 56.715f;
        int from_floatNum = (int) floatNum;
        System.out.println("Converted floatNum to int: " + from_floatNum);
        
        // Convert the integer intNum into a float.
        int intNum = 1500;
        float from_intNum = (float) intNum;
        System.out.println("Converted intNum to float: " + from_intNum);
        
        // Convert the double doubleNum into a string.
        double doubleNum = 3.14159265;
        String from_doubleNum = Double.toString(doubleNum);
        System.out.println("Converted doubleNum to string: " + from_doubleNum);
    }
}