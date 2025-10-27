import java.util.*; //automatically vansih as vs remove it but gives error in scanner line bcos of not importing it so first write scan line then write import line 
class array{  // for run in terminal 'ctrl+s' -> 'javac array.java' -> 'java array'  
    public static void main(String args[]){
        int []a= new int[5];
        a[0]=5; // same upto 5 size
        int b[]= new int[]{2,3};
        int c []={2,321,1,23,4};
        System.out.println("array at 0 position " + b[0]);
        System.out.println("array of{2,321,1,23,4}");
        for(int i=0; i<c.length; i++) System.out.println("at index " +i+ " = " +c[i]);
        
        // taking input by user
        Scanner sc=new Scanner (System.in);
        System.out.print("enter total size for array = ");
        int n=sc.nextInt(); // takes value for n
        int d[]=new int[n];
        System.out.println("enter "+n+" input for array =");
        for(int i=0;i<n;i++) d[i]=sc.nextInt();
        System.out.print("array of size "+n+ " = ");
        for(int i:d) System.out.print(i+ " ");
    }
}
