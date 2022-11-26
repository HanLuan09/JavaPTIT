import java.util.*;
public class BienSoDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            s=s.substring(5,8)+s.substring(9,s.length());
            if(check1(s)||check2(s)||check3(s)) System.out.println("YES");
            else System.out.println("NO");
        }    
    }
    public static boolean check1(String s){
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)>=s.charAt(i)) return false;
        }
        return true;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='8' && s.charAt(i)!='6') return false;
        }
        return true;
    }
    public static boolean check3(String s){
        int n= s.length();
        if(s.charAt(n-2)!=s.charAt(n-1)) return false;
        for(int i=1;i<n-2;i++){
            if(s.charAt(i-1)!=s.charAt(i)) return false;
        }
        return true;
    }
}
