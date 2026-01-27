import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the pattern: ");
        String p = s.nextLine();
        System.out.println("Enter the lower limit: ");
        int i = s.nextInt();
        System.out.println("Enter the upper limit: ");
        int j = s.nextInt();
        // int m = 999;
        // String x = String.valueOf(m);
        // System.out.println("String : " + x);
        Recogniser r = new Recogniser(i,j,p);
        r.displayValues();
        r.finder();
        s.close();
    }
}
class Recogniser{
    int i,j;
    String p;
    public Recogniser(int i,int j,String p) {
        this.i = i;
        this.j = j;
        this.p = p;
    }
    public void displayValues(){
        System.out.println("The lower limit is: " + i + "\nThe upper limit is: " + j + "\nThe pattern is: " + p);
    }
    public void finder(){
        int z;
        String d;
        for(;i<=j;i++){
            z=i;
            d = String.valueOf(z);
            if(d.contains(p)){
                System.out.println("Found number : " + z);
            }
        }
    }
}
