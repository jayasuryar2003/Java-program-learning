package com.coding.java_learning.nataraj.day5;

//Most asked java programming interview questions => Find the missing number from the array
//
//input:{101,102,103,104,106,107,108,109}
//
//output=>105
//input:{1001,1002,1003,1004,1006,1007,1008,1009}
//
//output=>105
//input:{1,3,4,5,6,7}
//
//output=>2
public class Missingnumberfromthearray {
    public static void main(String[] args) {
        int[] array = {101,102,103,104,106,107,108,109};    //input array

        /***********Find the SERIES of values ************/
        String str=String.valueOf(array[0]);        //101->"101"
        int seriesPlace=str.length();               //3          //1->1 series ,2
        String firstseries=String.valueOf(str.charAt(0));       ////101->1 if 201->
        String zero="";                             //strore the series zeros

        int init=0;                                 //used for initia vi
        if(seriesPlace>1)                           //only allowed mor
        {
            for(int i=1;i<seriesPlace;i++)
            {
                zero+="0";                          //"00"
            }
            init=Integer.valueOf(firstseries+zero);   //"1"+"00"=>"100"
        }
        /*************************************************/

        int fullNumberArray=0;                      //store th
        for(int i=init+1;i<=(init+array.length+1);i++) //init=>10
        {                                           // 101+10
            fullNumberArray+=i;
        }

        int missingArray=0;
        for(int j=0;j<array.length;j++)
        {                                           // 101+
            missingArray+=array[j];
        }

        int missingNumber = fullNumberArray-missingArray;
        System.out.println(missingNumber);
    }

}
