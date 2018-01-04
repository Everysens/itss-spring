package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.position.PositionEventDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class GeofenceEventListDto extends PositionEventDto {

    @NotNull
    @JsonProperty("ITSS_GeofenceList")
    private List<GeofenceDto> geofences;

}