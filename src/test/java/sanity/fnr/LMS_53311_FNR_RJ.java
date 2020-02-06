package fnr;

import org.testng.annotations.Test;

import common.LOgin;

public class LMS_53311_FNR_RJ 
{
	@Test
	public void scenario1() throws Exception

	{

        System.out.println("LMSfnr.LMS_53311_FNR_RJ");
		try {
			
			LOgin.login("envi");
			
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			
		}
	}
}
