package com.oliviaandjolie;

public class TesterFinch {
    public static void main(String[] args){
        FinalFinch sonion = new FinalFinch("A");
        
        int speed = 10;

//draws house base
        for(int i = 0; i < 4; i++){
            sonion.setMove("F", 9, speed);
            sonion.setTurn("R", 90, speed);
        }

        sonion.setTurn("R", 90, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("L", 90, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("R", 90, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("R", 90, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("L", 90, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("L", 90, speed);
        sonion.setMove("F", 9, speed);

        //roof
        sonion.setTurn("L", 45, speed);
        sonion.setMove("F", 6, speed);
        sonion.setTurn("L", 85, speed);
        sonion.setMove("F", 6, speed); 

        //chimney
        sonion.setTurn("R", 180, speed);
        sonion.setMove("F", 1.5, speed);
        sonion.setTurn("L", 45, speed);
        sonion.setMove("F", 3, speed);
        sonion.setTurn("R", 90, speed);
        sonion.setMove("F", 2, speed);
        sonion.setTurn("R", 90, speed);
        sonion.setMove("F", 1.5, speed);






    }


}