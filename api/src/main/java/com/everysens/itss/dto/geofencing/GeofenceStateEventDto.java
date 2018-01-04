package com.everysens.itss.dto.geofencing;

import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeofenceStateEventDto extends BaseDeviceResponseDto{

    @NotNull
    @JsonUnwrapped
    GeofenceStateDto state;

}
