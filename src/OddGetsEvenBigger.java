import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddGetsEvenBigger
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[] temp = br.readLine().split(" ");
        StringBuilder ans = new StringBuilder();
        List<Integer> a = new ArrayList<>();
        for(int i = 0;i<temp.length;i++)
        {
            if(Integer.parseInt(temp[i]) % 2 != 0)
                a.add(Integer.parseInt(temp[i]));
        }
        if(a.size() == 0) {
            ans.append("0");
        }
        else {
            Collections.sort(a, Collections.reverseOrder());
            for (int i = 0; i < a.size(); i++) {
                ans.append(a.get(i));
            }
        }
        System.out.print(ans.toString());
    }
}
