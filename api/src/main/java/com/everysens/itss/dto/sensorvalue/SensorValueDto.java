package com.everysens.itss.dto.sensorvalue;


import com.everysens.itss.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SensorValueDto extends BaseDto{

    @NotNull
    @JsonProperty("SamplingUTCTimestamp")
    private Double samplingUtcTimestamp;

    @NotNull
    @JsonProperty("ITSS_SensorId")
    private String sensorId;

    @NotNull
    private Double value;

    @NotNull
    @JsonProperty("ITSS_SensorType")
    private String sensorType;

    @JsonProperty("ITSS_SensorPosition")
    private String position;

}
