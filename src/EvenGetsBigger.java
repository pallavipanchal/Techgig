import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenGetsBigger
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<temp.length;i++)
        {
            if(Integer.parseInt(temp[i]) % 2 == 0)
                ans.append(temp[i]);

        }
        if(ans.length() == 0)
            ans.append("0");
        System.out.print(ans.toString());
    }
}
