package com.squaredesign.task;

public class FindSquare {
    //проверить равняеться ли а !=0
    // если да то уравнение не решается, если нет то дальше решаем
//Вычислить корни квадратного уравнения ах2+ bх + с = 0
// с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).
    public float findDiskramimant(float a, float b, float c){
        float resultOfDiskriminant = 0;
        float resultOfSqrtDiskriminant = 0;
        float korenOne =0;
        float korenTwo =0;
        if(a!=0){
            resultOfDiskriminant = (float) (Math.pow(b,2)-4 * a * c);
//            resultOfSqrtDiskriminant = (float) Math.sqrt(resultOfSqrtDiskriminant);
            if(resultOfSqrtDiskriminant > 0){
                korenOne = (float) (((-1*(Math.pow(b,2))) - (resultOfSqrtDiskriminant)) / (2 * a));
                korenTwo= (float) (((-1*(Math.pow(b,2))) + (resultOfSqrtDiskriminant)) / (2 * a));
            } else if(resultOfSqrtDiskriminant == 0){
                korenOne = ((-1) * b)/(2 * a);
            }
            else{
                System.out.println("Дискриминант равень 0, корней нет!!!");
            }

        }
        return resultOfSqrtDiskriminant;


    }

//    public float findKorenOne(float resultOfSqrtDiskriminant){
//        if()
//    }
}
