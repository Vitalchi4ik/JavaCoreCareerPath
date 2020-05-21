package fifrteenth.task;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TaskNumberFifteen {
    public static String getResource(String resourceName) {
        try {
            return Paths.get(TaskNumberFifteen.class.getResource(resourceName).toURI()).toFile().getPath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return resourceName;
    }

    public static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines =Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        List l = readFileInList(getResource("/text"));
        Iterator<String> itr = l.iterator();
        ArrayList<String> strTextList = new ArrayList<String>();
        String strText = "";
        String temp;

        while (itr.hasNext()){
             strText = itr.next();
        }

        for(String parserStrings : strText.split(" "))
        {
            strTextList.add(parserStrings.replaceAll("[^a-zA-Z0-9]", ""));
        }

        for (int i = 0; i < strTextList.size(); i++)
        {
            for (int j = i + 1; j < strTextList.size(); j++) {
                if (strTextList.get(i).toLowerCase().compareTo(strTextList.get(j).toLowerCase())>0)
                {
                    temp = strTextList.get(i);
                    strTextList.set(i, strTextList.get(j));
                    strTextList.set(j, temp);
                }
            }
        }
        System.out.println("Strings in sorted ascending by words:");
        for (String st : strTextList){
            System.out.println(st);
        }
    }
}

