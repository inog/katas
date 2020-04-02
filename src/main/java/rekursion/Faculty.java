package rekursion;

public class Faculty {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative: "+n+"!="+ calcFacutltyIterartiv(n));
        System.out.println("Recursive: "+n+"!="+ calcFacultyRecursiv(n));

    }

    private static long calcFacutltyIterartiv(int n) {
        System.out.println("iterative calculation");
        long fac = 1;
        for(int i = 1; i<=n; i++){
            System.out.print(fac+"*"+i+"=");
            fac *= i;
           System.out.println(fac);
        }
        return fac;
    }
    private static long calcFacultyRecursiv(int n){
        System.out.println("call with n="+n);
        if(n>=1){
            return n*calcFacultyRecursiv(n-1);
        }
        return 1;
    }
}
