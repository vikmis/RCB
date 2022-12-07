package com.RCB.test;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Utility.JsonReader;
import junit.framework.Assert;

public class ForeignPlayerVerification {

	@Test

	public void validateFourForeignPlayer() {
		int p = 0;
		String name = JsonReader.getJsonAttributeValue("name");
		String location = JsonReader.getJsonAttributeValue("location");
		System.out.println(name);
		System.out.println(location);
		ArrayList playerlist = JsonReader.getPlayer("player");
		for (int i = 0; i < playerlist.size(); i++) {

			JSONObject jsonObject1 = (JSONObject) playerlist.get(i);

			if (!jsonObject1.get("country").equals("India")) {
				p++;
			}

			Assert.assertTrue(p <= 4);

		}

	}

}
