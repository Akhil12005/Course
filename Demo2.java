class Calculator{
    int a;
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }
     public int add(int n1, int n2)
    {
        return n1+n2;
    }
        public double add(double n1, int n2)
    {
        return n1+n2;
    }
}

public class Demo2 {
    public static void main(String[] args) {
    
        Calculator obj = new Calculator();
        int result=obj.add(3,4);

       // Method Overloading
       System.out.println(result);
    }
}
