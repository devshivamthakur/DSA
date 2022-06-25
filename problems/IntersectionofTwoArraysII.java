package problems;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.BranchElement;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int arr[]={4,9,5};
        int arr2[]={9,4,9,8,4};
        int ans[]=intersect(arr, arr2);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
        
    }
    static int[] intersect(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();
        int minarray[]=arr1.length>arr2.length?arr2:arr1;
        int maxarray[]=arr1.length>arr2.length?arr1:arr2;
        int i=0;
        while(i<minarray.length){

            for(int j=0;j<maxarray.length;j++){
                if(maxarray[j]>0&&maxarray[j]==minarray[i]){
                    list.add(maxarray[j]);
                    maxarray[j]=-1;
                    break;

                }
            }
            i++;

        }
        int ans[]=new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }

        return ans;
    }
    
}
