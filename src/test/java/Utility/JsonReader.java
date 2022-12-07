package Utility;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonReader {

	static File file = new File(
			"C:\\Users\\vikmishr3\\ApiWithRestAssured_And_Java\\RCB\\src\\test\\resources\\TeamRCB.json");

	static String path = file.getAbsolutePath();
	static JSONParser parser = new JSONParser();
	static FileReader fileReader;
	static Object obj;
	static JSONObject jsonObject;
	static JSONArray players;
	static String Value;

	public static String getJsonAttributeValue(String value) {

		try {
			fileReader = new FileReader(path);
			obj = parser.parse(fileReader);
			jsonObject = (JSONObject) obj;
			Value = (String) jsonObject.get(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return Value;
	}

	public static ArrayList getPlayer(String playerlist) {
		int p=0;
		ArrayList pl = new ArrayList();
		System.out.println(jsonObject);
		players = (JSONArray) jsonObject.get(playerlist);
		System.out.println(players);
		Iterator iterator = players.iterator();
		while (iterator.hasNext()) {
			pl.add(iterator.next());
		}
		
		
		return pl;
	}
}
