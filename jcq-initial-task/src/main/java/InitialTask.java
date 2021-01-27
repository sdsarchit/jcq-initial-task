import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class InitialTask {

    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get(InitialTask.class.getClassLoader().getResource("sample.html").toURI());

        String contents = new String(Files.readAllBytes(path));
        int i=contents.indexOf("<title>");
        int j=contents.indexOf("</title>");
        String s=contents.substring(i+7, j);
        HashMap<String, String[]> m=new HashMap<String,String[]>();
        String[] s1= {"Mumbai","Hyderabad","Chennai","Pune","Delhi"};
        m.put("India", s1);
        String[] s2= {"Andong","Ansan","Busan","Chungju","Asan"};
        m.put("South Korea", s2);
        String[] s3= {"Kathmandu","Pokhara","Lalitpur","Birgunj","Bharatpur"};
        m.put("Nepal", s3);
        String[] s4= {"Adado","Daharro","Dharoor","Dilla","Docol"};
        m.put("Somalia", s4);
        String[] s5= {"Ba Ria","Bao Loc","Bien Hoa","Chi Linh","Di An"};
        m.put("Vietnam", s5);
        System.out.println("Country: "+s);
        System.out.println("5 cities in "+s);
        String[] k=m.get(s);
        for(String st:k) {
        	System.out.println(st);
        }
    }
}
