package com.everysens.itss.client;

import com.everysens.itss.api.geofencing.GeofencingApi;
import com.everysens.itss.api.loadingstate.LoadingStateApi;
import com.everysens.itss.api.mileage.MileageApi;
import com.everysens.itss.api.movement.MovementStateApi;
import com.everysens.itss.api.position.PositionApi;
import com.everysens.itss.api.sensorvalue.SensorValueApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@Getter
public class ItssClient {

    @Getter(AccessLevel.NONE)
    private Retrofit retrofit;

    // APIs

    private PositionApi positionApi;
    private MileageApi mileageApi;
    private LoadingStateApi loadingStateApi;
    private SensorValueApi sensorValueApi;
    private GeofencingApi geofencingApi;
    private MovementStateApi movementStateApi;

    @Builder
    public ItssClient(String baseUrl, ObjectMapper objectMapper){
        this.retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(new OkHttpClient())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();

        this.positionApi = this.retrofit.create(PositionApi.class);
        this.mileageApi = this.retrofit.create(MileageApi.class);
        this.loadingStateApi = this.retrofit.create(LoadingStateApi.class);
        this.sensorValueApi = this.retrofit.create(SensorValueApi.class);
        this.geofencingApi = this.retrofit.create(GeofencingApi.class);
        this.movementStateApi = this.retrofit.create(MovementStateApi.class);
    }

}
