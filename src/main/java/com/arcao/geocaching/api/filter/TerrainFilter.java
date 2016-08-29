package com.arcao.geocaching.api.filter;

import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class TerrainFilter implements Filter {
    private static final String NAME = "Terrain";

    protected final float min;
    protected final float max;

    public TerrainFilter(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public String getName() {
        return NAME;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }

    public boolean isValid() {
        return min != 1 || max != 5;
    }

    public void writeJson(JsonWriter w) throws IOException {
        w.name(NAME);
        w.beginObject();

        w.name("MinTerrain").value(min);
        w.name("MaxTerrain").value(max);

        w.endObject();
    }
}