package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder(builderMethodName = "geofenceStateBuilder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeofenceStateEventDto extends PositionEventDto{

    @NotNull
    @JsonProperty("UTCtimestamp")
    private Double utcTimestamp;

    @NotNull
    @JsonProperty("ITSS_Geofence")
    private GeofenceDto geofence;

    @NotNull
    @JsonProperty("ITSS_GeofenceEventTrigger")
    private GeofenceEventTrigger eventTrigger;

}
