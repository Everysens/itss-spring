package com.everysens.itss.dto.movement;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MovementState {

    MOVING,
    STANDING,
    PARKING,
    UNKNOWN;

    @JsonCreator
    public static MovementState deserialize(String value) {
        if(value == null)
            return null;
        return MovementState.valueOf(value.toUpperCase());
    }

    @JsonValue
    public String serialize() {
        return this.name().toLowerCase();
    }
}
