package com.everysens.itss.api.position;

import com.everysens.itss.api.Fields;
import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.everysens.itss.api.Fields.BASE_PATH_1_1;

public interface PositionApi {

    public final static String LAST_POSITION = "lastPosition";
    public final static String POSITIONS_TIME_INTERVAL = "positionsTimeInterval";

    @GET(value = BASE_PATH_1_1 + LAST_POSITION)
    Response<PositionEventDto> getLastPosition(@Query(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
                                               @Query(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
                                               @Query(Fields.ITSS_PASSPHRASE) String passPhrase);

    @GET(value = BASE_PATH_1_1 + POSITIONS_TIME_INTERVAL)
    Response<PositionEventListDto> getPositionsTimeInterval(@Query(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
                                                            @Query(Fields.FROM_UTC_TIMESTAMP) Double fromUtcTimeStamp,
                                                            @Query(Fields.TO_UTC_TIMESTAMP) Double toUtcTimeStamp,
                                                            @Query(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
                                                            @Query(Fields.ITSS_PASSPHRASE) String passPhrase);

}
