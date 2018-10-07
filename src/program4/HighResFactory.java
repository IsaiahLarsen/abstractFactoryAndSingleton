package program4;

public class HighResFactory implements CreateFactory {
    private CreateDoc hrd;
    private CreateWid hrw;
    private volatile static HighResFactory uniqueInstance;

    /**
     * constuctor
     *
     * create high res doc and widget on initial instanciation
     *
     */
    private HighResFactory(){
        createDoc();
        createWid();
    }

    /**
     * get instance of high res factory
     * @return high resolution factory
     */
    public static HighResFactory getInstance(){
        if(uniqueInstance == null){
            synchronized (HighResWidget.class){
                if(uniqueInstance == null){
                    uniqueInstance = new HighResFactory();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * Calls print on both high resolution objects
     * no params
     */
    public void print(){
        hrd.print();
        hrw.print();
        //print newline for reading ease
        System.out.println();
    }

    /**
     * gets instance of high res document
     * no params
     * @return high resolution document
     */
    public CreateDoc createDoc(){
        hrd = HighResDoc.getInstance();
        return hrd;
    }

    /**
     * gets instance of high res widget
     * no params
     * @return high res widget
     */
    public CreateWid createWid(){
        hrw = HighResWidget.getInstance();
        return hrw;
    }
}
