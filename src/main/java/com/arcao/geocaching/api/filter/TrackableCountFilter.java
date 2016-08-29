package com.arcao.geocaching.api.filter;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class TrackableCountFilter implements Filter {
    private static final String NAME = "TrackableCount";

    protected final Integer min;
    protected final Integer max;

    public TrackableCountFilter(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public String getName() {
        return NAME;
    }

    public boolean isValid() {
        return !(min != null && max != null && min > max) && (min != null || max != null);

    }

    public void writeJson(JsonWriter w) throws IOException {
        w.name(NAME);
        w.beginObject();
        if (min != null)
            w.name("MinTrackables").value(min.intValue());
        if (max != null)
            w.name("MaxTrackables").value(max.intValue());
        w.endObject();
    }
}