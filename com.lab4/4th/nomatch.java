
import java.util.Scanner;

public class nomatch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String s = sc.nextLine();
        str x = new str(s);
        x.checkPerfectString();
        sc.close();
    }
}
class str{
    String s;
    public str(String s) {
        this.s = s;
    }
    public void checkPerfectString(){
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
            }
            if(c>1) { 
                System.out.println("Not a perfect string since \"" + s.charAt(i) + "\" is repeated");
                return;
            }
        }
        System.out.println("A perfect String has just been found : " + s);
    }
}