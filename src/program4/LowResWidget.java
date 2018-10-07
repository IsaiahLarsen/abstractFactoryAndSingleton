package program4;

public class LowResWidget implements CreateWid {
    private volatile static LowResWidget uniqueInstance;
    private LowResWidget(){}

    /**
     * print statement for low res widget
     * no params
     */
    public void print(){
        System.out.println("I am drawing a Low res Widget");
    }

    /**
     * insure only one instance of the class
     * @return Low res widget
     */
    public static LowResWidget getInstance(){
        if(uniqueInstance == null){
            synchronized (HighResWidget.class){
                if(uniqueInstance == null){
                    uniqueInstance = new LowResWidget();
                }
            }
        }
        return uniqueInstance;
    }
}
