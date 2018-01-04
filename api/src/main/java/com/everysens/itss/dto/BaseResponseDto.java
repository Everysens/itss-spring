package com.everysens.itss.dto;

import com.everysens.itss.dto.position.GNSSPositionDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public abstract class BaseResponseDto extends BaseDto{

    @JsonProperty("ITSS_TransportDeviceID")
    public String transportDeviceId;

    @NotNull
    @JsonProperty("ITSS_TelematicsDeviceID")
    public String telematicsDeviceId;

    @JsonProperty("GNSS_Position")
    public GNSSPositionDto gnssPosition;

    @NotNull
    @JsonProperty("ITSS_TelematicsApplicationID")
    public String telematicsApplicationId;

    @NotNull
    @Size(min = 1, max = 20)
    @JsonProperty("ITSS_PassPhrase")
    public String passPhrase;
}
