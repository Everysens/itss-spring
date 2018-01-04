
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GNSSPositionDto extends BaseDto {

    @NotNull
    @JsonProperty("GNSS_UTCtimestamp")
    private Double utcTimestamp;

    @NotNull
    @JsonProperty("GNSS_Latitude")
    private Double latitude;

    @JsonProperty("GNSS_Longitude")
    private Double longitude;

    @NotNull
    @JsonProperty("GNSS_Speed_kmph")
    private Double speedKmph;

    @NotNull
    @JsonProperty("GNSS_Heading_deg")
    private Double headingDeg;

    @JsonProperty("GNSS_Altitude")
    private Double altitude;

    @JsonProperty("GNSS_Accuracy")
    private Double accuracy;

    @JsonProperty("ITSS_LocationInfo")
    private LocationInfoDto locationInfo;

}
