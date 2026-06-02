package com.oliviaandjolie; 

import com.birdbrain.Finch;

public class FinalFinch extends Finch{

        //array for most common values   
        static int nums[] = {10, 90, 3};
    //boolean to check if program finished
        static boolean isFinished = false;

    public FinalFinch(String device){
        super(device);
    }

    public void drawHouse(){
            //variables for most common values
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
            
            // isFinished = true;

            // if(isFinished == true){
            //     setBeak(0, 100, 100);
            // }
        }
}