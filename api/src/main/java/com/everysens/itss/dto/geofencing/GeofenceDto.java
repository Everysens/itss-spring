package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class GeofenceDto extends BaseDto {

    @NotNull
    @JsonProperty("GeofenceID")
    private String id;

    @NotNull
    @JsonProperty("GeofenceName")
    private String name;

}
