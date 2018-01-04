
package com.everysens.itss.dto.position;

import com.everysens.itss.dto.BaseDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class LocationInfoDto extends BaseDto {

    @JsonProperty("Location_ZIP")
    private String zip;

    @JsonProperty("Location_City")
    private String city;

    @JsonProperty("Location_Street")
    private String street;

    @JsonProperty("Location_Description")
    private String description;

    @JsonProperty("Location_Country")
    private String country;

    @JsonProperty("Location_UIC_Code")
    private String uicCode;

    @JsonProperty("Location_GeoZone")
    private String geoZone;

    @JsonProperty("Location_POI_ID")
    private String poiId;

}
