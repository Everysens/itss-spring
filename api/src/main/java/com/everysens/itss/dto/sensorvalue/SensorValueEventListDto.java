package com.everysens.itss.dto.sensorvalue;


import com.everysens.itss.dto.BaseDeviceResponseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class SensorValueEventListDto extends BaseDeviceResponseDto{

    @NotNull
    @JsonProperty("ITSS_SensorValueList")
    private List<SensorValueDto> sensorValues;

}
