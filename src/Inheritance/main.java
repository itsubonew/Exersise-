package Inheritance;

import Inheritance.Animal.Birds;
import Inheritance.Animal.Crocodile;
import Inheritance.Animal.Eagle;
import Inheritance.Animal.Eel;
import Inheritance.Animal.Fish;
import Inheritance.Animal.Reptile;
import Inheritance.parent.Animal;

public class main {

    public static void main(String[] args) {

        Birds bir = new Birds(5.0f, 0.3f, "Bird", "Yellow", "Feathers", true);
        Fish fi = new Fish(0.5f, 0.1f, "Fish", "Orange", true, true);
        Reptile rep = new Reptile(5.0f, 200f, "Dinosaurs", "Green", "Dry Skin", "Backbone", "Soft-shelled eggs");
        
        Eagle eag = new Eagle(0.2f, 3.0f,"Birds","Red","Feathers",true );
        //(float height, float weight, String animalType, String bloodType, String features, boolean canFly)
        Eel ee = new Eel(0.5f, 2.0f, "Fish","Brown",true,true,"Release electric charge");
        //(float height, float weight, String animalType, String bloodType, boolean liveInWater, boolean hasGills, String speciality)
        Crocodile croc = new Crocodile(2.0f, 3.0f, "Dinosaurs","Green","Dry-Skin","Backbone","Hard-shelled eggs");
        //float height, float weight, String animalType, String bloodType, String skinType, String bone,
        //String eggType)
        
        System.out.println(bir.showInfo());
        System.out.println(fi.showInfo());
        System.out.println(rep.showInfo());
        System.out.println(eag.showInfo());
        System.out.println(ee.showInfo());
        System.out.println(croc.showInfo());

    }
}

