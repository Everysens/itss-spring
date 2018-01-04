package com.everysens.itss.dto.geofencing;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GeofenceEventTrigger {
    ENTER,
    EXIT;

    @JsonCreator
    public static GeofenceEventTrigger deserialize(String value) {
        if(value == null)
            return null;
        return GeofenceEventTrigger.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String serialize() {
        return this.name().toLowerCase();
    }

}
