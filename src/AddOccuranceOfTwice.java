import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AddOccuranceOfTwice
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int sum = 0;
        String[] temp = br.readLine().split(" ");
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<temp.length;i++)
        {
            int val = Integer.parseInt(temp[i]);
            if(map.containsKey(val))
            {
                int count = map.get(val);
                map.put(val,count + 1);
            }
            else
                map.put(val,1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 2) {
                sum = sum + entry.getKey();
            }
        }
            System.out.print(sum);
    }
}
