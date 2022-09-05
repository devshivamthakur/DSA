package problems;

import java.util.ArrayList;

/**
 * UsermainCode
 */
public class UsermainCode {

    public static void main(String[] args) {
        int input1=10;
        int input2=3;
        // int arr[][3]={1,1,2,3,3,3};
        System.out.println(toffees(input1, input2));

        
    }

    public static int[] toffees(int input1,int input2){
        int[] arr = new int[input2];
        int j = 0;
        // while(input1>0){
             
        //     for(int i =0;i<input2;i++){
        //         j++;
        //         if(input1<=0){
        //             break;
        //         }
        //         else{
        //             if(j<input1){
        //                 arr[i] = arr[i]+j;
        //             }
        //             else{
        //                 arr[i] = arr[i]+input1;
        //             }
        //             input1 = input1-j;
        //         }
                 
        //     }
        // }
        // for(int i:arr){
        //     System.out.println(i);
        // }
        

        while(input1>0){
            for(int i=0;i<input2;i++){
                j++;
                if(input1<=0){
                    break;
                }else{
                    System.out.println(j<input1);
                    if(j<input1){
                        arr[i]=arr[i]+j;
                    }else{
                        arr[i]=arr[i]+input1;
                    }

                    input1=input1-j;
                }

            }
        }
        
 for(int i:arr){
            System.out.println(i);
        }
        return arr;
        
        



    }
}