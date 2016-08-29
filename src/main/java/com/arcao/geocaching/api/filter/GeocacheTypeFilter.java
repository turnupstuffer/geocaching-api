package com.arcao.geocaching.api.filter;


import com.arcao.geocaching.api.data.type.GeocacheType;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class GeocacheTypeFilter implements Filter {
    private static final String NAME = "GeocacheType";

    private final GeocacheType[] geocacheTypes;

    public GeocacheTypeFilter(GeocacheType... geocacheTypes) {
        this.geocacheTypes = geocacheTypes;
    }

    public boolean isValid() {
        if (geocacheTypes == null || geocacheTypes.length == 0)
            return false;

        boolean valid = false;
        for (GeocacheType geocacheType : geocacheTypes) {
            if (geocacheType != null)
                valid = true;
        }

        return valid;
    }

    public void writeJson(JsonWriter w) throws IOException {
        w.name(NAME);
        w.beginObject();
        w.name("GeocacheTypeIds");
        w.beginArray();
        for (GeocacheType geocacheType : geocacheTypes) {
            if (geocacheType != null)
                w.value(geocacheType.id);
        }
        w.endArray();
        w.endObject();
    }

    public String getName() {
        return NAME;
    }

}