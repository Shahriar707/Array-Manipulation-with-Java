package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
       
       int [] arr = {1,1,1,2,1};
       int s = arr.length; 
       
       int [] a = new int [(s+1)/2];
       int [] b = new int [s-a.length];
       int [] c = new int [(s-1)/2];
       int [] d = new int [s-c.length];
       
       for (int i=0; i<s; i++){
           if (i<=a.length-1){
               a[i]=arr[i];
           }
           else{
               b[i-a.length]=arr[i];
           }
       }
       
       for (int i=0; i<s; i++){
           if (i<=c.length-1){
               c[i]=arr[i];
           }
           else{
               d[i-c.length]=arr[i];
           }
       }
       
       int sum1=0;
       int sum2=0; 
       int sum3=0;
       int sum4=0;
       
       for (int i=0; i<a.length; i++){
           sum1 = sum1 + a[i];
       }
       
       for (int i=0; i<b.length; i++){
           sum2 = sum2 + b[i];
       }
       
       for (int i=0; i<c.length; i++){
           sum3 = sum3 + c[i];
       }
       
       for (int i=0; i<d.length; i++){
           sum4 = sum4 + d[i];
       }
       
       
       if (sum1==sum2){
           System.out.println("True");
       }
       else if (sum3==sum4){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       } 
       
    }  
}
