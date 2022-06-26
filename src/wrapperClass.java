public class wrapperClass {



    public static void main(String[] args) {
        int a=10;
        short b=20;
        float f = (float) 1.31;

        //autoboxing for integer
        Integer intObj = Integer.valueOf(a);
        Integer second = 10; //another example for autoboxing.

        System.out.println("value of a"+a);
        //System.out.println(a instanceof int?"yes":"no");
        // a is primitive and not of an object from a class, this instanceof doesn't works for it.
        System.out.println(intObj instanceof Integer?"yes":"no");
        System.out.println("integer object is "+ intObj);

        //unboxing from an object to primitive type.
        int d=intObj;

        System.out.println("value of d is: "+d);

        //valueOf(String s)
        //Integer ir = Integer.valueOf("two");
        Boolean boolObject = Boolean.valueOf("true");
        Double dr  = Double.valueOf("45.3");

        Character cp = Character.valueOf('c');
        System.out.println("character value is "+cp);

        System.out.println( ","+ boolObject+"," + dr);
        //valueOf(String s,int radix)

        Integer ip = Integer.valueOf("10011",2);
        System.out.println("converting binary into decimal"+ ip);

        //valueOf(primitive p)
        Double dw  = Double.valueOf(31.21);
        System.out.println("value of dw "+dw);

        //test xyz value methods
        System.out.println(intObj.intValue()+":"+intObj.doubleValue()+":"+intObj.longValue());
        System.out.println(intObj.byteValue()+":"+intObj.floatValue());
        System.out.println();


        //parse ...(String s) (from objective to primitive type: unboxing)
        int i = Integer.parseInt("31");
        double dq= Double.parseDouble("5.31");
        boolean bo = Boolean.parseBoolean("false");

        //toString

        String s = intObj.toString();
        System.out.println("testing to String method "+ s);

        //toString (primitive)
        String s2= Integer.toString(54);
        String s3= cp.toString();
    }
}
