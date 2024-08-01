import java.io.File;
import java.io.IOException;
import java.util.*;

public class str_arraylst_srch {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Scanner con = new Scanner(System.in);
        try{
            for(int i=0; i<10000; i++){
                strings.add(getString());
            }
        } catch (IOException e){System.out.println(e.getMessage());}
        System.out.print("Enter a string to see if it is present: ");
        String s = con.nextLine();
        boolean flag = false;
        for (String string : strings) {
            if (s.equals(string)) {
                System.out.print(s + " is present in the ArrayList!");
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(s+" is not present in the ArrayList!");
        }

    }

    public static String getString() throws IOException {
        File file = new File("/Users/nipunjuneja/Documents/sample_txt.txt");
        Scanner con = new Scanner(file);
        ArrayList<String> str_lst = new ArrayList<>();
        while(con.hasNext()){
            str_lst.add(con.next());
        }
        Random rand = new Random();
        return str_lst.get(rand.nextInt(str_lst.size()));

    }
}
