package HW1;

import com.google.gson.Gson;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Map<String,String> json = Map.of(
                "name","Jon",
                "lastname","Doe"
        );
        System.out.println(new Gson().toJson(json));
    }
}
