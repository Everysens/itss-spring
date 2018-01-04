package com.everysens.itss.api.position;

import com.everysens.itss.api.Fields;
import com.everysens.itss.dto.position.PositionEventDto;
import retrofit2.Response;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface PositionApi {

    Response<PositionEventDto> getLastPosition(@Url String url,
                                               @Query(Fields.ITSS_TransportDeviceID) String transportDeviceId,
                                               @Query(Fields.ITSS_CustomerSystemID) String customerSystemId,
                                               @Query(Fields.ITSS_PassPhrase) String passPhrase);

}
