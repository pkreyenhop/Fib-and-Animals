package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dog extends Animals {
    
    private String colour;

    public Dog(int age){
        super(age);
        this.colour = "gold";
    }

    public String getDogColour(){
        return colour;
    }

    @Override
    public boolean isBaby() {
        
        if(this.animalAge < 2){
            return true;
        }
        return false;
    }
    

}
