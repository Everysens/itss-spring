package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.position.PositionDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class GeofenceStateDto extends PositionDto{

    @JsonProperty("ITSS_Geofence")
    private GeofenceDto geofence;

    @NotNull
    @JsonProperty("ITSS_GeofenceEventTrigger")
    private GeofenceEventTrigger eventTrigger;
}
