package com.everysens.itss.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@ToString(callSuper = true)
public abstract class BaseDeviceResponseDto extends BaseResponseDto{

    @JsonProperty("ITSS_TransportDeviceID")
    protected String transportDeviceId;

    @NotNull
    @JsonProperty("ITSS_TelematicsDeviceID")
    protected String telematicsDeviceId;

}
