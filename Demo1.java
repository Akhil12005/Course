class Computer
{
    public void playMusic()
    {
        System.out.println("Music Playing..");
    }
    public String getMeAPen(int cost)
    {
       if(cost>=10)
        return "Pen";
        else
        return "Nothing";
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Computer obj = new Computer(); //Object Creation
        obj.playMusic();
        String str = obj.getMeAPen(9);
        System.out.println(str);
    }
}
