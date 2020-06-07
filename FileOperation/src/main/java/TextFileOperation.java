import java.io.*;
import java.util.regex.Pattern;

public class TextFileOperation {
    public static void main(String[] args) throws IOException, NullPointerException, Exception {


        //PrintWriter printWriter = new PrintWriter("C:\\Users\\Priyal\\Downloads\\Message Transformer test - senior\\messages\\temp.txt");
        File file = new File("C:\\Users\\Priyal\\Downloads\\Message Transformer test - senior\\messages\\132443504.txt"); //132443509.txt    132443504.txt
        String reverse = "";
        String result = "";
        boolean available = false;

        if (file.isFile()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line = bufferedReader.readLine();

                while (line != null) {
                    if (line.startsWith("To:") && line.contains("domain.com")) {
                        while (line != null) {
                            line = bufferedReader.readLine();

                            if (line.startsWith("Body:")) {
                                while (line != null) {
                                    line = bufferedReader.readLine();
                                    if (line.contains("$") || line.contains("^") || line.contains("&") || line.contains("") || line.contains(line)) {
                                        line = line.replaceAll(Pattern.quote("$"), "e").replaceAll(Pattern.quote("^"), "y").replaceAll(Pattern.quote("&"), "u");
                                        System.out.println(line);
                                    }
                                }
                            }
                        }
                    }
                    if (line.trim().startsWith("Subject:SECURE:")){//&& line.subSequence(8,14).equals("SECURE:")) {
                        while (line != null) {
                            line = bufferedReader.readLine();

                            if (line.startsWith("Body:")) {
                                line = bufferedReader.readLine();
                                while (line != null) {
                                    //line = bufferedReader.readLine();
                                    for(int i = line.length() - 1; i >= 0; i--){
                                        reverse = reverse + line.charAt(i);
                                    }
                                    line = bufferedReader.readLine();
                                    System.out.println(reverse);
                                    reverse = "";
                                }
                            }
                        }
                    }

                    if(line.startsWith("Body:")) {
                        while (line != null) {
                            line = bufferedReader.readLine();
                            if (line.matches(".*\\d{10}.*")) {
                                BufferedReader br = new BufferedReader(new FileReader(file));
                                String newline = br.readLine();
                                while (newline != null) {
                                    if (newline.startsWith("Body:")) {
                                        while (newline != null) {
                                            newline = br.readLine();
                                                if (newline.contains("$") || newline.contains("^") || newline.contains("&") || newline.contains("") || newline.contains(newline)) {
                                                    newline = newline.replaceAll(Pattern.quote("$"), "e").replaceAll(Pattern.quote("^"), "y").replaceAll(Pattern.quote("&"), "u");

                                                    for(int i = newline.length() - 1; i >= 0; i--){
                                                        reverse = reverse + newline.charAt(i);
                                                    }

                                                    Pattern pattern = Pattern.compile("\\s");
                                                    String[] temp = pattern.split(reverse);

                                                    for(int j = 0; j < temp.length; j++){
                                                        if(j == temp.length - 1)
                                                        {
                                                            result = temp[j] + result;
                                                        }
                                                        else
                                                        {
                                                            result = " " + temp[j] + result;
                                                        }
                                                    }
                                                    System.out.println(result);
                                                    result = "";
                                                    reverse = "";
                                                }
                                        }
                                    }
                                    newline = br.readLine();
                                }
                            }
                        }
                    }
                line = bufferedReader.readLine();
                }
            bufferedReader.close();
            }
        }
    }

