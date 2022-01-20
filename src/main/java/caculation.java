import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class caculation {
    public static void main(String[] args) throws IOException {
       // String filee = "testca.xlx";
        FileReader file = new FileReader("D:\\Caculation\\Simple.txt"); //
        BufferedReader bf = new BufferedReader(file);

        String st = bf.readLine();

        int sum=0;
        int count=0;
        while ((st=bf.readLine()) !=null) {
            StringTokenizer stn = new StringTokenizer(st);
            String rn= stn.nextToken();

            int phy=Integer.parseInt(stn.nextToken());
            int chem=Integer.parseInt(stn.nextToken());

            sum=sum+phy+chem;
            count ++;
            System.out.println("Roll number" + rn);
            System.out.printf("Total make=%d", sum);


        }
    }
}
