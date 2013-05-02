package uk.gov.bcc.mobile.test;

import uk.gov.bcc.mobile.service.MobileApiRequestService;
import junit.framework.TestCase;
import junit.framework.TestResult;

public class MobileApiRequestServiceTest extends TestCase {
	
	private MobileApiRequestService mobileservice= null;

	@Override
	public void run(TestResult result) {
		// TODO Auto-generated method stub
		mobileservice.getMobileApiResponse();
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		mobileservice = new MobileApiRequestService();
	}
	
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		super.runTest();
	}
	
	public void testGetMobileApiResponse(){
		assertTrue(mobileservice.getHttpConnection());
	}
	
	

}
