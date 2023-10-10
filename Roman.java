import java.util.*;
public class Roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> h1=new HashMap<>();
        h1.put('I',1);
        h1.put('V',5);
        h1.put('X',10);
        h1.put('L',50);
        h1.put('C',100);
        h1.put('D',500);
        h1.put('M',1000);
        int result= h1.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            if(h1.get(s.charAt(i))>h1.get(s.charAt(i+1)))
            {
                result+=h1.get(s.charAt(i));
            }
            else
            {
                result-=h1.get(s.charAt(i));
            }
        }
        System.out.println(result);

    }
}
