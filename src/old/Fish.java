package old;
public class Fish extends Animal{
    
    private boolean liveInWater;
    private boolean hasGills;

public Fish(){
    liveInWater = true;
    hasGills = true;
}

public Fish(boolean liveInWater, boolean hasGills){
    super();
    this.liveInWater = liveInWater;
    this.hasGills = hasGills;
    
}

public boolean isLiveInWater() {
    return liveInWater;
}

public void setLiveInWater(boolean liveInWater) {
    this.liveInWater = liveInWater;
}

public boolean isHasGills() {
    return hasGills;
}

public void setHasGills(boolean hasGills) {
    this.hasGills = hasGills;
}



}
