package com.arcao.geocaching.api.data.apilimits;

import com.arcao.geocaching.api.util.DebugUtils;

import java.io.Serializable;

/**
 * Container class for a method limit information
 * @author arcao
 */
public class MethodLimit implements Serializable {
	private static final long serialVersionUID = 3914171011300602155L;
	
	private final int period;
  private final long limit;
  private final String methodName;
  private final boolean partnerMethod;
  
  public MethodLimit(int period, long limit, String methodName, boolean partnerMethod) {
    this.period = period;
    this.limit = limit;
    this.methodName = methodName;
    this.partnerMethod = partnerMethod;
  }

  /**
   * Returns a period for this limit in the minutes
   * @return period in a minutes
   */
  public int getPeriod() {
    return period;
  }

  /**
   * Returns a limit for this method calling
   * @return limit for a method
   */
  public long getLimit() {
    return limit;
  }
  
  /**
   * Returns a method name for which is applied this limit
   * @return method name
   */
  public String getMethodName() {
    return methodName;
  }
  
  /**
   * Returns if this method is partner method
   * @return is partner method
   */
  public boolean isPartnerMethod() {
    return partnerMethod;
  }

  @Override
  public String toString() {
    return DebugUtils.toString(this);
  }
}
