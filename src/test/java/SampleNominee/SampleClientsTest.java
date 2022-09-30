package SampleNominee;

import org.testng.annotations.Test;

public class SampleClientsTest 
{
@Test(groups = "smoketest")
public void Chand()
{
	System.out.println("....MOON...");
}
@Test(groups = "smoketest")
public void Stars()
{
	System.out.println("....****...");
}
@Test(groups = {"smoketest, regressiontest"})
public void Sweet()
{
	System.out.println("....Champakali...");
}

}

