package uk.gov.bcc.mobile.test;

import junit.framework.TestCase;
import uk.gov.bcc.mobile.service.MobileApiRequestService;

public class MobileApiRequestServiceTest extends TestCase {

	private MobileApiRequestService mobileservice = null;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		mobileservice = new MobileApiRequestService();
	}

	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		testGetMobileApiResponse();
	}

	public void testGetMobileApiResponse() {
		assertTrue(mobileservice.getHttpConnection());
	}

}
