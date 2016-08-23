package com.arcao.geocaching.api.live_geocaching_api;

import com.arcao.geocaching.api.data.GeocacheLog;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GetGeocacheLogsByCacheCodeTest extends AbstractGeocachingTest {
    protected final static String CACHE_CODE = "GCY81P";

    @Test
    public void simpleGetGeocacheLogsByCacheCodeTest() throws Exception {
        List<GeocacheLog> logs = api.getGeocacheLogsByCacheCode(CACHE_CODE, 0, 10);

        Assert.assertNotNull(logs);
        Assert.assertEquals(10, logs.size());
    }
}
