
public class CmdLine {
    public static void main(String[] args){

        System.out.println(args[0]);
        System.out.println(args[1]);

        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);

        System.out.println(a+b);
    }
    
}
