package com.everysens.itss.dto.device;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Builder
@Data
@NoArgsConstructor
public class DeviceDto {

    @JsonProperty("ITSS_TRANSPORT_DEVICE_ID")
    public String transportDeviceId;

    @NotNull
    @JsonProperty("ITSS_TELEMATICS_DEVICE_ID")
    public String telematicsDeviceId;

}
