public class staticExample {
    //create 2 methods one public and another static.

    static void call(){
        System.out.println("returns nothing but the static answer");
    }

    public void call_public(){
        System.out.println("requires an object to ");
    }

    private void dal(){
        System.out.println("what is this");
    }

    public static void main(String[] args) {
        staticExample st = new staticExample();
        st.call();
        st.call_public();
        st.dal();
    }

}
