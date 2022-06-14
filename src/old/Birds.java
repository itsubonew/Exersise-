package old;
public class Birds extends Animal{

    private String features;
    private boolean canFly;

    public Birds(){
        features = "Feathers";
        canFly = true;
    }

    public Birds(String features, boolean canFly){
this.features = features;
this.canFly = canFly;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    
}
