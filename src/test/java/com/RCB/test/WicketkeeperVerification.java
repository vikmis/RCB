package com.RCB.test;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Utility.JsonReader;
import junit.framework.Assert;

public class WicketkeeperVerification {
	@Test

	public void validateWicketKeeper() {
		ArrayList playerlist = JsonReader.getPlayer("player");
		for (int i = 0; i < playerlist.size(); i++) {

			JSONObject jsonObject1 = (JSONObject) playerlist.get(i);// 3

			if (jsonObject1.get("role").equals("Wicket-keeper")) {

				String actual = (String) jsonObject1.get("role");

				String expected = "Wicket-keeper";
				Assert.assertEquals(expected, actual);
			}

		}
	}

}
