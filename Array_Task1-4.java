package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        
    int [] source = {10,20,30,40,50,60};
    shiftLeft(source, 3); 
    
    int [] source2 = {10,20,30,40,50,60};
    rotateLeft(source2, 3); 
     
    int [] source3 = {10,20,30,40,50,0,0};
    remove(source3, 5, 2); 
    
    int [] source4 = {10,2,30,2,50,2,2,0,0};
    removeAll(source4, 7, 2); 
    }
    
    public static void shiftLeft (int[]s, int k){
        for (int i=0; i<k; i++){
            s[i]=s[i+k];
        }
        for (int i=(s.length)-1; i>=k; i--){
            s[i]=0;            
        }
        for (int i=0; i<=s.length-1; i++){
            if (i==0){
                System.out.print("["+s[i]+",");
            }
            else if (i==s.length-1){
                System.out.print(s[i]+"]");
            }
            else{
                System.out.print(s[i]+",");
            }
        }
        System.out.println();
    }
    
    public static void rotateLeft (int[]s, int k){
        
        int[]copy = new int [s.length]; 
        for (int i=0; i<k; i++){
            copy[i]=s[i];
            
        }
        
        for (int i=0; i<k; i++){
            s[i]=s[i+k];
        }
       
        int index=0; 
        
        for (int i=k; i<s.length; i++){
            s[i]=copy[index];
            index = index + 1;
        }
        
        for (int i=0; i<=s.length-1; i++){
            if (i==0){
                System.out.print("["+s[i]+",");
            }
            else if (i==s.length-1){
                System.out.print(s[i]+"]");
            }
            else{
                System.out.print(s[i]+",");
            }
        }
        System.out.println();
    }
    
    public static void remove(int [] s, int size, int idx){
        
        for (int i=idx; i<size; i++){
            s[idx]=s[idx+1];
            idx=idx+1;
        }
        
        for (int i=0; i<=s.length-1; i++){
            if (i==0){
                System.out.print("["+s[i]+",");
            }
            else if (i==s.length-1){
                System.out.print(s[i]+"]");
            }
            else{
                System.out.print(s[i]+",");
            }
        }
        System.out.println();
    }
    
    public static void removeAll (int[]s, int size, int element){
        
        for (int i=0; i<size; i++){
            if (s[i]==element){
                s[i]=0;
            }
        }
                 
        for (int i=0; i<size; i++){
            if (s[i]==0){
                s[i]=s[i+1];
                s[i+1]=0;
            }
        }
        
        int[]temp = new int [s.length];
        int index=0;
        for (int i=0; i<=s.length-1; i++){
            if (s[i]!=0){
                temp[index]=s[i];
                s[i]=0;
                index = index + 1;
            }
        }
        
        int dest=0;
        for (int i=0; i<=s.length-1; i++){
            s[i]=temp[dest];
            dest = dest + 1;
            
        }
        
        for (int i=0; i<=s.length-1; i++){
            if (i==0){
                System.out.print("["+s[i]+",");
            }
            else if (i==s.length-1){
                System.out.print(s[i]+"]");
            }
            else{
                System.out.print(s[i]+",");
            }
        }
    }
}


