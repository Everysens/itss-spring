package com.everysens.itss.dto.shock;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@Builder(builderMethodName = "shockBuilder")
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ShockEventDto extends PositionEventDto {

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
