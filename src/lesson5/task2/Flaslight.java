package lesson5.task2;

public class Flaslight {
    boolean light;

    boolean turnOn(){
        return true;
    }

    boolean turnOff(){
        return false;
    }

    String hasLight(boolean light){
        if(light==turnOn()){
            return "Işıq yanır";
        }else if(light==turnOff()){
            return  "Işıq yanmır";
        }else {
            return "Error";
        }
    }
}
