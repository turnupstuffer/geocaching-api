package com.arcao.geocaching.api.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeocachingUtilsTest {
  @Test
  public void testBase31Decode() {
    assertEquals(1,     GeocachingUtils.base31Decode("1"));
    assertEquals(31,    GeocachingUtils.base31Decode("10"));
    assertEquals(31*31, GeocachingUtils.base31Decode("100"));
  }
  
  @Test
  public void testBase31Encode() {
    assertEquals("1",   GeocachingUtils.base31Encode(1));
    assertEquals("10",  GeocachingUtils.base31Encode(31));
    assertEquals("100", GeocachingUtils.base31Encode(31*31));
  }

  @Test
  public void testCacheCodeToCacheId() {
    assertEquals(0x0,     GeocachingUtils.cacheCodeToCacheId("GC0"));
    assertEquals(0xFFFF,  GeocachingUtils.cacheCodeToCacheId("GCFFFF"));
    assertEquals(0x10000, GeocachingUtils.cacheCodeToCacheId("GCG000"));
    assertEquals(95327,   GeocachingUtils.cacheCodeToCacheId("GCH000"));
    assertEquals(1272588, GeocachingUtils.cacheCodeToCacheId("GC1TG15"));
  }

  @Test
  public void testCacheIdToCacheCode() {
    assertEquals("GC0",     GeocachingUtils.cacheIdToCacheCode(0));
    assertEquals("GCFFFF",  GeocachingUtils.cacheIdToCacheCode(0xFFFF));
    assertEquals("GCG000",  GeocachingUtils.cacheIdToCacheCode(0x10000));
    assertEquals("GCH000",  GeocachingUtils.cacheIdToCacheCode(95327));
    assertEquals("GC1TG15", GeocachingUtils.cacheIdToCacheCode(1272588));
  }
}