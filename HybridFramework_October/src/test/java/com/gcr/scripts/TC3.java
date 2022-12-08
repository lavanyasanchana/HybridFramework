package com.gcr.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.gcr.commands.ActionDriver;
import com.gcr.config.StartBrowser;
import com.gcr.reuse.CommonFunctions;

public class TC3 extends StartBrowser{
	@Test
	public void onlyLoginLogout() throws Exception {
		CommonFunctions cfs = new CommonFunctions();
		cfs.login();
		cfs.logout();
		
		
		}
}