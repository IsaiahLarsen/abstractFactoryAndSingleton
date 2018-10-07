package program4;

public class HighResWidget implements CreateWid {
    private volatile static HighResWidget uniqueInstance;
    private HighResWidget(){ }

    /**
     * high res widget print statement
     * no params
     */
    public void print(){
        System.out.println("I am drawing a High Res Widget");
    }

    /**
    * insure only one instance of the class
    * no params
    */
    public static HighResWidget getInstance(){
        if(uniqueInstance == null){
            synchronized (HighResWidget.class){
                if(uniqueInstance == null){
                    uniqueInstance = new HighResWidget();
                }
            }
        }
        return uniqueInstance;
    }
}
