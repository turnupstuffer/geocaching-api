package com.arcao.geocaching.api.data;

import com.arcao.geocaching.api.impl.live_geocaching_api.builder.JsonSerializable;
import com.arcao.geocaching.api.util.DebugUtils;
import com.google.auto.value.AutoValue;
import com.google.gson.stream.JsonWriter;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.io.Serializable;


@AutoValue
public abstract class DeviceInfo implements JsonSerializable, Serializable {
    private static final long serialVersionUID = 7352443462642812711L;

    public abstract int applicationCurrentMemoryUsage();

    public abstract int applicationPeakMemoryUsage();

    public abstract String applicationSoftwareVersion();

    public abstract String deviceManufacturer();

    public abstract String deviceName();

    public abstract String deviceOperatingSystem();

    public abstract float deviceTotalMemoryInMb();

    public abstract String deviceUniqueId();

    @Nullable
    public abstract String mobileHardwareVersion();

    @Nullable
    public abstract String webBrowserVersion();

    public void writeJson(JsonWriter w) throws IOException {
        w.beginObject();

        w.name("ApplicationCurrentMemoryUsage").value(applicationCurrentMemoryUsage());
        w.name("ApplicationPeakMemoryUsage").value(applicationPeakMemoryUsage());
        w.name("ApplicationSoftwareVersion").value(applicationSoftwareVersion());
        w.name("DeviceManufacturer").value(deviceManufacturer());
        w.name("DeviceName").value(deviceName());
        w.name("DeviceOperatingSystem").value(deviceOperatingSystem());
        w.name("DeviceTotalMemoryInMB").value(deviceTotalMemoryInMb());
        w.name("DeviceUniqueId").value(deviceUniqueId());
        if (mobileHardwareVersion() != null)
            w.name("MobileHardwareVersion").value(mobileHardwareVersion());
        if (webBrowserVersion() != null)
            w.name("WebBrowserVersion").value(webBrowserVersion());

        w.endObject();
    }

    @Override
    public String toString() {
        return DebugUtils.toString(this);
    }

    public static Builder builder() {
        return new AutoValue_DeviceInfo.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder applicationCurrentMemoryUsage(int applicationCurrentMemoryUsage);

        public abstract Builder applicationPeakMemoryUsage(int applicationPeakMemoryUsage);

        public abstract Builder applicationSoftwareVersion(String applicationSoftwareVersion);

        public abstract Builder deviceManufacturer(String deviceManufacturer);

        public abstract Builder deviceName(String deviceName);

        public abstract Builder deviceOperatingSystem(String deviceOperatingSystem);

        public abstract Builder deviceTotalMemoryInMb(float deviceTotalMemoryInMb);

        public abstract Builder deviceUniqueId(String deviceUniqueId);

        public abstract Builder mobileHardwareVersion(@Nullable String mobileHardwareVersion);

        public abstract Builder webBrowserVersion(@Nullable String webBrowserVersion);

        public abstract DeviceInfo build();
    }
}
