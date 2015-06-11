package com.arcao.geocaching.api.live_geocaching_api;

import java.util.Date;
import java.util.List;

import com.arcao.geocaching.api.data.GeocacheLog;
import com.arcao.geocaching.api.data.type.GeocacheLogType;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.arcao.geocaching.api.exception.GeocachingApiException;

public class GetUsersGeocacheLogsTest extends AbstractGeocachingTest {
	private static final String USER_NAME = "Arcao";
	
	@Test
	public void simpleGetUsersGeocacheLogsTest() throws GeocachingApiException {
		List<GeocacheLog> logs = api.getUsersGeocacheLogs(USER_NAME, null, null, new GeocacheLogType[] { GeocacheLogType.FoundIt }, false, 0, 25);
		
		Assert.assertEquals(25, logs.size());
	}
	
	@Test
	@Ignore // Date filter does not work
	public void dateFilteredGetUsersGeocacheLogsTest() throws GeocachingApiException {
		Date startDate = new Date(1345161600000L); // 08/17/2012
		Date endDate = new Date(1351468799000L);   // 10/28/2012
		
		
		List<GeocacheLog> logs = api.getUsersGeocacheLogs(USER_NAME, startDate, endDate, new GeocacheLogType[] { GeocacheLogType.FoundIt }, false, 0, 25);
		
		Assert.assertEquals(3, logs.size());
	}
}
