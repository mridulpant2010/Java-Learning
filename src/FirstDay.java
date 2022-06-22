public class FirstDay {
    public static int a=0;
    int c;
    int b;
    public FirstDay(int a, int b){
        this.c=a;
        this.b=b;

    }
    public static void main(String[] args) {
        System.out.println("hello world");
        FirstDay firstDay = new FirstDay(10,20);
        System.out.println("value of a is"+firstDay.c);
        System.out.println("value of static variable a is "+FirstDay.a);
    }
}
