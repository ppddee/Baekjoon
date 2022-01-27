import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> ls = new Stack<>();
        Stack<Character> rs = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            ls.push(str.charAt(i));
        }

        int N  = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String cmd = br.readLine();
            switch (cmd.charAt(0)){
                case 'L':
                    if(ls.empty()) break;
                    rs.push(ls.pop());
                    break;
                case 'D':
                    if(rs.empty()) break;
                    ls.push(rs.pop());
                    break;
                case 'B':
                    if(ls.empty()) break;
                    ls.pop();
                    break;
                case 'P':
                    ls.push(cmd.charAt(2));
                    break;
            }
        }
        while(!ls.empty()){
            rs.push(ls.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!rs.empty()){
            sb.append(rs.pop());
        }
        System.out.println(sb.toString());
    }
}
