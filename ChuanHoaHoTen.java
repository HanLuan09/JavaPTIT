import java.util.*;
public class ChuanHoaHoTen {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t= Integer.parseInt(in.nextLine());
        in.nextLine();
        while(t-->0){
            int n= Integer.parseInt(in.nextLine());
//            int n=in.nextInt();
            String name =in.nextLine();
            ChuanHoa(name,n);
        }
    }
    private static void ChuanHoa(String s,int n){
        Vector<String> V= new Vector<String>();
        StringTokenizer st= new StringTokenizer(s);
//        StringBuilder kq= new StringBuilder();
        while(st.hasMoreElements()){
            StringBuilder kq= new StringBuilder();
            String tmp= st.nextToken();
            kq.append(Character.toUpperCase(tmp.charAt(0)));
            for(int i=1;i<tmp.length();i++){
                kq.append(Character.toLowerCase(tmp.charAt(i)));
            }
            V.add(kq.toString());
        }
        String ans="";
        if(n==1){
            ans=ans+V.get(V.size()-1)+" ";
            for(int i=0;i<V.size()-2;i++){
                ans+=V.get(i)+" ";
            }
            ans+=V.get(V.size()-2);
        }
        else if (n==2){
            for(int i=1;i<V.size();i++){
                ans=ans+V.get(i)+" ";
            }
            ans+=V.get(0);
        }

//        for(int i=0;i<V.size();i++){
//            ans=ans+V.get(i)+" ";
//        }
        System.out.println(ans);
    }
}
