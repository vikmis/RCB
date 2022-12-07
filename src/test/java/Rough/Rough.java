package Rough;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Rough {

	public static void main(String[] args) {

		File file = new File(
				"C:\\Users\\vikmishr3\\ApiWithRestAssured_And_Java\\RCB\\src\\test\\resources\\TeamRCB.json");

		// printPaths(file);
		String path = file.getAbsolutePath();

		System.out.println("Absolute Path : " + path);
		System.out.println("path : " + file.getPath());

		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(path));
			JSONObject jsonObject = (JSONObject) obj;
			String teamName = (String) jsonObject.get("name");
			String location = (String) jsonObject.get("location");
			JSONArray players = (JSONArray) jsonObject.get("player");
			
			System.out.println("Name: " + teamName);
			System.out.println("Course: " + location);
			System.out.println("player:");
			ArrayList pl = new ArrayList();
			Iterator iterator = players.iterator();
			while (iterator.hasNext()) {
				//System.out.println(iterator.next());
				pl.add(iterator.next());
			}
			
			for(int i=0;i<pl.size();i++) {
				System.out.println(pl.get(i));
				// JSONObject jsonObject1 = (JSONObject) pl.get(i);//3
				// System.out.println(jsonObject1.get("country"));
				//JSONArray jsonarray1 = (JSONArray) jsonObject1.get(i);//4
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
