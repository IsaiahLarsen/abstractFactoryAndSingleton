package program4;

public class Provider {
    public static CreateFactory getFactory(String type){
        switch (type){
            default:
                return null;
            case "low":
                return new LowResFactory();
            case "high":
                return HighResFactory.getInstance();
        }
    }
}
