package com.everysens.itss.api.movement;

import com.everysens.itss.api.Fields;
import com.everysens.itss.dto.movement.MovementStateEventDto;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.everysens.itss.api.Fields.BASE_PATH_1_1;

public interface MovementStateApi {

    public final static String LAST_MOVEMENT_STATE = "movementState";

    @GET(value = BASE_PATH_1_1 + LAST_MOVEMENT_STATE)
    Response<MovementStateEventDto> getLastMovementState(@Query(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
                                                         @Query(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
                                                         @Query(Fields.ITSS_PASSPHRASE) String passPhrase);


}
