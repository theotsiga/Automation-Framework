package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pages.SampleFrameworkPage;

public class TESTSampleFramework extends BaseTest
{
	@Test
	public void submit() throws IOException
	
	{
		SampleFrameworkPage sample = new SampleFrameworkPage(driver);
		sample.submitdetails();
	}
	
	
	
	
}
