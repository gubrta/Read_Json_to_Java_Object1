package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            /*
            URL url = new URL("https://dummyjson.com/products");
            show(url);
            */
            URL url = new URL("https://dummyjson.com/products/add");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");

            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();

            System.out.println("HTTP Status: " + status);
            Gson gson = new Gson();
            ClassName1 className1 = gson.fromJson(content.toString(), ClassName1.class);

            for ( ClassName1.Products Users : className1.getProducts()) {
                System.out.println(className1.getProducts());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static <IOException> void show(URL url) {
        try (InputStream in = (InputStream) url.openStream(); BufferedReader read = new BufferedReader(new InputStreamReader(in));) {
            String s;
            while ((s = read.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Throwable e) {
            //e.finalize();
            e.printStackTrace();
        }

    }
}
