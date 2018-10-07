package program4;

public class LowResFactory implements CreateFactory{
    private LowResDoc lrd;
    private LowResWidget lrw;

    /**
     * create document and widget on inital instaniation
     */
    public LowResFactory(){
        createDoc();
        createWid();
    }

    public CreateDoc createDoc(){
        lrd = LowResDoc.getInstance();
        return lrd;
    }
   public CreateWid createWid(){
        lrw = LowResWidget.getInstance();
        return lrw;
   }

    /**
     * call print methods on both document and widget
     */
   public void print(){
       lrd.print();
       lrw.print();
       //Print new line for reading ease
       System.out.println();
   }
}
