package com.oliviaandjolie; 

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

    //creating array and variables to use for drawing
        static int nums[] = {10, 90, 3};
        static boolean isFinished = false;

    //inheritance
        public FinalFinch(String device){
            super(device);
        }

    /** 
     * Draws the house
     * Parameter(s): None
     * Return: void
    */
        public void drawHouse(){
            //variables for most common values using values from the array
            int speed = nums[0];
            int rightAngle = nums[1];
            int shortDistance = nums[2];

            //draws house base
            for(int i = 0; i < 4; i++){
                setMove("F", 9, speed);
                setTurn("R", rightAngle, speed);
            }

            //draws house door
            setTurn("R", rightAngle, speed);
            setMove("F", shortDistance, speed);
            setTurn("L", rightAngle, speed);
            setMove("F", shortDistance, speed);
            setTurn("R", rightAngle, speed);
            setMove("F", shortDistance, speed);
            setTurn("R", rightAngle, speed);
            setMove("F", shortDistance, speed);
            setTurn("L", rightAngle, speed);
            setMove("F", shortDistance, speed);
            setTurn("L", rightAngle, speed);
            setMove("F", 9, speed);

            //roof
            setTurn("L", 45, speed);
            setMove("F", 6, speed);
            setTurn("L", 85, speed);
            setMove("F", 6, speed); 

            //chimney
            setTurn("R", 180, speed);
            setMove("F", 1.5, speed);
            setTurn("L", 45, speed);
            setMove("F", shortDistance, speed);
            setTurn("R", rightAngle, speed);
            setMove("F", 2, speed);
            setTurn("R", rightAngle, speed);
            setMove("F", 1.5, speed);
            
            //setting boolean to true in order to change beak color
            isFinished = true;

            //conditional that changes the peak color
             if(isFinished == true){
                 setBeak(0, 100, 100);
                 pause(5);    
             }
             stopAll();
        }
}