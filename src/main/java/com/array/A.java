package com.array;

public class A {

    public static void main(String args[]) {
        Student[] students = new Student[60];
        // first index will be 0
        // last index will be 59


        int[] arr = new int[10];
        float[] flArr = {10.0f,5.0f,2.5f};

        for(int i=0; i < students.length; i++){
            System.out.println(students[i]+ ""+ i);
        }
    }
}

/*
    Arrays:
        In java, all arrays are dynamically allocated.
        Arrays are contiguous memory (all indexes will be assigned next to each other)
        size of array is going to be declared at the time of declaration of an array
        Arrays are bound to declared size that means we can not change the size later

        Index of array starts with 0(zero)

        While traversing the arrays if we by mistake trying to access the index which is out of
        boundary for declared size of array then it will throw ArrayIndexOutOfBoundException.

    int arr = new arr[20];

2 Dimensional Array:

        int [] [] array;

        int [rows] [columns]

        example:
            int [5][3] arrayOfInt;

            0   1   2
          0 a   b   c
          1 d   e   f
          2 g   h   i
          3 j   k   l
          4 m   n   o

          int [2] [3] ;

           0 1 2
         0 a b c
         1 d e f


// addition of two matrix

         arr1[5][2] ;
         arr2[5][2] ;
         result[5][2];

         for(int i=0; i<2; i++) // rows
         {
            for(int j=0; j<3; j++)// columns{
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
         }
1
22
333
4444
55555

    for(int i=1; i<=5; i++){  // rows
       for(int j=1; j<=i; j++){ // columns
         System.out.print(i);
       }
       System.out.println();
    }


 */
