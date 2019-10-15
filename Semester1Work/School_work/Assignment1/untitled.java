import java.util.ArrayList;
public class untitled {
    public static void main(String[] args) {
        String hello = "Hello world at @jamesbartlett @akj";
        int at = hello.indexOf('@', 24);
        int lastat = at;
        int start = hello.lastIndexOf('@', at);
        String extract = hello.substring(start, at);
        System.out.println(extract);
            }

        }
