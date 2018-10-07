package program4;

public class HighResDoc implements CreateDoc {
    private volatile static HighResDoc uniqueInstance;
    private HighResDoc(){ }

    /**
     * get instance of high res doc
     * @return new high res doc or if one exist already return that
     */
    public static HighResDoc getInstance(){
        if(uniqueInstance == null){
            synchronized (HighResWidget.class){
                if(uniqueInstance == null){
                    uniqueInstance = new HighResDoc();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     *Prints statment for High res Document
     *  No params
     */
    public void print(){
        System.out.println("I am Printing a High res Document");
    }
}
