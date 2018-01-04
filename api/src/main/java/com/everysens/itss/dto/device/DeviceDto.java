package com.everysens.itss.dto.device;

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
public class DeviceDto extends BaseDto{

    @JsonProperty("ITSS_TRANSPORT_DEVICE_ID")
    public String transportDeviceId;

    @NotNull
    @JsonProperty("ITSS_TELEMATICS_DEVICE_ID")
    public String telematicsDeviceId;

}
