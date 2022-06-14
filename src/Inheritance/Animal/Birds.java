package Inheritance.Animal;

import Inheritance.parent.Animal;

public class Birds extends Animal {
   
    private String features;
    private boolean canFly;


public Birds(){
    super();
    features = "Feathers";
    canFly = true;
}


public Birds(float height, float weight, String animalType, String bloodType, String features, boolean canFly) {
    super(height, weight, animalType, bloodType);
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
@Override
public String showInfo(){
    return "Birds[ Height = " + getHeight() + ", Weight = " + getWeight() + ", AnimalType = " + getAnimalType() + ", BloodType = " + getBloodType() + ", Features = " + getFeatures() + ", can fly = " + isCanFly() +"]";
}
}

