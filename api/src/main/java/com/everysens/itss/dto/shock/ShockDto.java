package com.everysens.itss.dto.shock;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ShockDto {

    @NotNull
    @JsonProperty("X-Axis_triggered")
    private Boolean xAxisTriggered;

    @NotNull
    @JsonProperty("X-Axis")
    private Double xAxis;

    @NotNull
    @JsonProperty("Y-Axis_triggered")
    private Boolean yAxisTriggered;

    @NotNull
    @JsonProperty("Y-Axis")
    private Double yAxis;

    @NotNull
    @JsonProperty("Z-Axis_triggered")
    private Boolean zAxisTriggered;

    @NotNull
    @JsonProperty("Y-Axis")
    private Double zAxis;


}
