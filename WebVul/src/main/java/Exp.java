public class Exp {
    public Exp(){
        try {
            java.lang.Runtime.getRuntime().exec("open -a Calculator.app");
        } catch (Exception e) { }

    }
}
