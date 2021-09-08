import java.lang.*;
interface Iphone{
    String  x="Iphone!";
    public abstract void Phone();
    public abstract void Camera();
}
interface Samsung7{
    String y = "Samsung 7";
    public abstract void Phone1();
    public abstract void Calls();
}
class phoneStore implements Iphone,Samsung7{
    public void Phone(){
        System.out.println(x);
    }
    public void Camera(){
        System.out.println("Good pixel!");
        System.out.println();
    }
    public void Phone1(){
        System.out.println(y);
    }
    public void Calls(){
        System.out.println("it can depend on your sim!");
    }
}
class emplements{
    public static  void main(String[] args){
        phoneStore obj = new phoneStore();
        obj.Phone();
        obj.Camera();
        obj.Phone1();
        obj.Calls();
    }
}

