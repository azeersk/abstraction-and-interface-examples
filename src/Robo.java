abstract class Robo {
    String a = "normal method!";
    void NMethod(){
        System.out.println(a);
    }
    abstract void AbMethod();
}
class Sana extends Robo{
    @Override
    void AbMethod(){
        System.out.println("abstract method!");
    }
}
class chitti{
    public static void main(String[] args){
        Sana obj = new Sana();
        obj.NMethod();
        obj.AbMethod();
    }
}
