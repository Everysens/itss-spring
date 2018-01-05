package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder(builderMethodName = "geofenceBuilder")
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class GeofenceEventListDto extends PositionEventDto {

    @NotNull
    @JsonProperty("UTCtimestamp")
    private Double utcTimestamp;

    @NotNull
    @JsonProperty("ITSS_GeofenceList")
    private List<GeofenceDto> geofences;

}
