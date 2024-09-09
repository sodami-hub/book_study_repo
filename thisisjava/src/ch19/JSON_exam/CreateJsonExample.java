package ch19.JSON_exam;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonExample{
    public static void main(String[] args) throws IOException {
        JSONObject root = new JSONObject();

        root.put("id", "winter");
        root.put("name", "lee");
        root.put("age",25);
        root.put("student",true);

        JSONObject tel = new JSONObject();
        tel.put("home","02-1234-1234");
        tel.put("mobile", "010-1234-1234");
        root.put("tel",tel);

        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("c");
        skill.put("c++");
        root.put("skill",skill);

        String json = root.toString();

        System.out.println(json);

        Writer writer = new FileWriter("/Users/leejinhun/Downloads/newJson.json", Charset.forName("UTF-8"));
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
