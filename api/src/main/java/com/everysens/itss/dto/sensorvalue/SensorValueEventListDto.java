package com.everysens.itss.dto.sensorvalue;


import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
public class SensorValueEventListDto extends BaseDeviceResponseDto{

    @NotNull
    @JsonProperty("ITSS_SensorValueList")
    private List<SensorValueDto> sensorValues;

}
