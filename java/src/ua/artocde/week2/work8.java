package ua.artocde.week2;

import ua.artocde.method.ArrayUtils;

//Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
public class work8 {
    public static void main(String[] args) {


        int[] nums = new int[10];
        int pairedValuesNums1 = 0;

        int [] nums2 = new int [10];
        int pairedValuesNums2 = 0;


        for (int i = 0; i < nums.length; i++) {
            nums[i] = ArrayUtils.generateRandomNumberBetween(25, 75);
            pairedValuesNums1+= nums[i] % 2 == 0 ? 1 :0;
            }

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = ArrayUtils.generateRandomNumberBetween(25,75);
            pairedValuesNums2 += nums2 [i] % 2 == 0 ? 1 : 0;

        }
        ArrayUtils.printArr(nums);
        System.out.println(pairedValuesNums1);
        ArrayUtils.printArr(nums2);
        System.out.println(pairedValuesNums2);

     if(pairedValuesNums1 > pairedValuesNums2){
         System.out.println(pairedValuesNums1 + " Araay nums more paired values");
     }else {
         System.out.println(pairedValuesNums2 + " Array nums2 more paired values");
     }

    }


    }

