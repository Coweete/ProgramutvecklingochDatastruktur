package laboration1;

/**
 * Created by jonatan on 2016-03-15.
 */
public class Laboration1 {

    public void print(int min, int max){
        if(min <= max){
            System.out.print(min + " ");
            print(min +1, max);
        }
    }

    public void everySecondRevers(String txt, int pos){
        if(pos >= 0 && pos<txt.length()){
            System.out.print(txt.charAt(pos));
            everySecondRevers(txt,pos-2);
        }
    }

    public void reverse(int min,int max){
        if(max>min){
            System.out.print(max + " ");
            reverse(min,max-1);
        }
    }

    public void print(String txt, int pos){
        if (pos>=0 && pos <txt.length()){
            System.out.print(txt.charAt(pos));
            print(txt,pos);
        }
    }

    public long factorial(long n){
        if(n<=1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public boolean member(int nbr,int[] array, int pos){
        if(pos < 0 || pos >= array.length){
            return false;
        }else if(nbr == array[pos]){
            return true;
        }else{
            return member(nbr,array,pos+1);
        }
    }

    public int sum(int min, int max){
        if(min>max){
            return 0;
        }else {
            return min + sum(min+1,max);
        }
    }


    public String reverse( String str ) {
        if(str.length()==0)
            return "";
        else
            return reverse(str.substring(1)) + str.charAt(0);
    }

    public void everySecond(String txt,int startPos,int endPos){
        if(startPos>=0 && startPos<txt.length() && startPos <= endPos){
            System.out.print(txt.charAt(startPos));
            everySecond(txt,startPos+1,endPos);
        }
    }
    public void printString(String txt,int pos, int n){
       if(pos>=0 && pos<txt.length()){
           System.out.print(txt.charAt(pos));
           printString(txt,pos+n,n);
       }
    }
    public int digits(String str){
        if(str.length() == 0){
            return 0;
        }else if(str.charAt(0) >= '0' && str.charAt(0)<='9')
            return 1+digits(str.substring(1));
        else
            return digits(str.substring(1));
    }
    public int digits(int nbr){
        if(nbr == 0){
            return 0;
        }else{
            return 1 + digits(nbr / 10);
        }
    }
    public long fib(int n){
        if(n == 1 || n == 2)
            return 0;
        else
            return fib(n-1) + fib(n-2);
    }
    public static void main (String [] args){
        Laboration1 la = new Laboration1();
        la.print(10,15);
        System.out.println("");
        la.print(15,10);
        System.out.println("");
        la.print(-3,4);
        System.out.println("");
        la.everySecondRevers("Student",6);
        System.out.println("");
        la.everySecondRevers("Lärare", 3);
        System.out.println("");
        la.everySecondRevers("Förälder",17);
        System.out.println("");
        System.out.println(la.factorial(3));
        System.out.println("");
        System.out.println(la.factorial(-3));
        System.out.println("");
        System.out.println(la.factorial(6));
        int[] arr = {23,-45,-20,10,8};
        System.out.println("");
        System.out.println(la.member(17,arr,0));
        System.out.println("");
        System.out.println(la.member(23,arr,0));
        System.out.println("");
        System.out.println(la.sum(4,8));
        System.out.println("");
        System.out.println(la.sum(5,2));
        System.out.println("");
        System.out.println(la.sum(-2,1));
        System.out.println("");
        System.out.println(la.reverse("Student"));
        System.out.println("");
        la.everySecond("Student", 0,6);
        System.out.println("");
        la.everySecond("Student",3,5);
        System.out.println("");
        la.everySecond("Huber",2,10);
        System.out.println("");
        la.printString("Student", 0,2);
        System.out.println("");
        la.printString("Student",3,-5);
        System.out.println("");
        la.printString("Du",0,2);
        System.out.println("");
        System.out.print(la.digits("Student"));
        System.out.print(la.digits("RDS 435"));
        System.out.print(la.digits("Pw TT54W41"));

        long starttid = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            la.fib(30);
        }
        long stopptid = System.currentTimeMillis();
        System.out.println(stopptid - starttid);
    }
}
