package program4;

public class LowResDoc implements CreateDoc {
    private  volatile static LowResDoc uniqueInstance;
    private LowResDoc(){ }

    /**
     * Insure only one instance of the class exist
     * @return current or new Low res document
     */
    public static LowResDoc getInstance(){
        if(uniqueInstance == null){
            synchronized (HighResWidget.class){
                if(uniqueInstance == null){
                    uniqueInstance = new LowResDoc();
                }
            }
        }
        return uniqueInstance;
    }
    /**
     * print statement for low res document
     * no params
     */
    public void print(){
        System.out.println("I am print a Low res Document");
    }
}
