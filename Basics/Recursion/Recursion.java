public class Recursion {
    //print name for n times
    static void printName(int i, int n){
        if (i>n){
            
            return;
        }
        System.out.print("raj");
        printName(i+1, n);

    }

    //print linearly from 1 to n
    static void printN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printN(i+1, n);
    }
    
    // print 1 to n using backtrcking
    static void printN2(int i, int n){
        if (i<1){
            return;
        }
        printN2(i-1, n);
        System.out.println(i);
    }
    
    //print n to 1
    static void printN1(int i, int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        printN1(i-1, n);

    }
    
    //print n to 1 using backtracking
    static void printN3(int i, int n){
        if (i<1){
            return;
        }
        System.out.println(i);
        printN3(i-1, n);
        
    }

    static int Count(int n){
        int count=0;
        int lastdigit=0;
        while (n>0){
            lastdigit= n%10;
            count+=1;
            n= n/10;
        }
        return count;
    }
    

    public static void main(String[] args) {
        //printName(1,3);
        //printN(1,5 );
        printN3(3, 3);
        System.out.println();
        printN2(3, 3);
        //Count(5574);
    }

    
}
