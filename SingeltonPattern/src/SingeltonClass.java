public class SingeltonClass {
    private static SingeltonClass singeltonObject;
    private SingeltonClass(){};
    public static SingeltonClass getInstance(){
        if (singeltonObject == null){
            singeltonObject = new SingeltonClass();
            return singeltonObject;
        }else {
            return singeltonObject;
        }
    }
}
