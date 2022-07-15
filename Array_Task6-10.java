package javaapplication4;

import java.util.*; 

public class JavaApplication4 {
    
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        arr_series(4);
        System.out.println();
        
       // task - 7
       int arr[]= {1,1,2,2,1,1,1,2,2,2,2,3,3,3,3,3,3,3,3,3,1,1,1,1,1};
        int ans=0;
	int i=0;
	while (i<arr.length-1){
            int count=0;
	    for (int j=i;j<arr.length;j++){
                if (arr[i]==arr[j] ){
                    count++;
                }
                else{
		    break;
                }
            }
	    if (count > ans){
		ans=count;
            }
            i+=count;
        }
	System.out.println(ans);
        
        // task - 8 
        
        int arr1[]= {3,4,6,3,4,7,4,6,8,6,6};
        repetition(arr);
        
        // task - 9 
        int[]circular={20,10,0,0,0,10,20,30};
        palindrome(circular,5,5);
        
        // task - 10 
        
        int[]circular_1={40,50,0,0,0,10,20,30};
        int[]circular_2={10,20,5,0,0,0,0,0,5,40,15,25};
        intersection (circular_1,circular_2,5,8,5,7);
    }   
    
    // task - 6
    
    public static int[]arr_series(int n){
        
        int[]arr=new int [n*n];
        
        for (int i=n*n-1;i>=0;i-=n){
            int k=0;
            for (int j=0;j<=((i+1)/n)-1;j++){
                arr[i-k]=j+1;
                k++;
            }
        }
        
        System.out.print("{");
        for (int x:arr){
            System.out.print(x);
            System.out.print(" ");
        }
        
        System.out.print("}");
        
        return arr;
    }
    
    // task - 8 
    public static int[]repetition(int[]n){
            
	int brr[]=new int [n.length-1];
        boolean[] drr= new boolean[n.length];
	int sum=0;
	int i=0;
        while (i<n.length-1){
		
            int count=0;
            for (int j=i+1;j<n.length;j++){
		if (n[i]==n[j] & drr[j]==false ){
                    count++;
                    drr[j]=true;
		}
	    }
            if (count !=0){
		sum++;
            }	
            brr[i]=count;
            i++;
	}
	int crr[] = new int[sum];
        int j=0;
        for (int k =0; k< brr.length;k++){
            if (brr[k]!=0 ){
                crr[j]=brr[k];
                j++;
            }
	}
	for ( int x=0; x<crr.length-1;x++){
            for(int y=x+1; y<crr.length;y++){
		if (crr[x]==crr[y]){
                    System.out.println("True");
                    System.exit(0);
		}
            }
	}
	System.out.println("False");
	
        return n;
    }
    
    // task - 9 
    public static int [] palindrome (int[]circ,int start,int size){
        
       int[]temp=new int [size]; 
       int index=0;
       for (int i=start; i<circ.length; i=(i+1)%circ.length){
           temp[index]=circ[i];
           index = index + 1;
               
           if (index==5){
               break; 
           }
       }

       
       int n = temp.length;
       boolean flag = true;  
       for (int i=0; i<n/2; i++){
           if (temp[i]!=temp[n-1-i]){
               flag = false;
               break;
           } 
       }
       
       if (flag==true){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       return temp;
    }
    
    // task - 10 
    
    public static int [] intersection (int[]circ_1,int[]circ_2,int start_1,int start_2,int size_1,int size_2){
        
       int[]temp_1=new int [size_1];
       int index_1=0;
       for (int i=start_1; i<circ_1.length; i=(i+1)%circ_1.length){
           temp_1[index_1]=circ_1[i];
           index_1 = index_1 + 1;
               
           if (index_1==size_1){
               break; 
           }
       }


       int[]temp_2=new int [size_2];
       int index_2=0;
       for (int i=start_2; i<circ_2.length; i=(i+1)%circ_2.length){
           temp_2[index_2]=circ_2[i];
           index_2 = index_2 + 1;
               
           if (index_2==size_2){
               break; 
           }
       }
       
       for (int i=0; i<=temp_1.length-1;i++){
           for (int j=0; j<=temp_2.length-1; j++){
               if (temp_1[i]==temp_2[j]){
                   if (i==0){
                       System.out.print("["+temp_1[i]);
                   }
                   
                   else if (i==temp_2.length-1){
                       System.out.print(temp_2[i]);
                   }
                   else{
                       System.out.print(","+temp_1[i]);
                   }
               }
               
           }
       }
       System.out.print("]");

       return temp_1;
       
    }
}