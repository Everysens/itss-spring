package com.everysens.itss.controller.position;

import com.everysens.itss.api.Fields;
import com.everysens.itss.api.position.PositionApi;
import com.everysens.itss.controller.BaseController;
import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import com.everysens.itss.facade.position.IPositionFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class PositionController extends BaseController {

    private final IPositionFacade positionService;

    @Autowired
    public PositionController(IAuthenticationFacade authenticationFacade, IPositionFacade positionFacade){
        super(authenticationFacade);
        this.positionService = positionFacade;

    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = PositionApi.LAST_POSITION)
    public PositionEventDto getLastPosition(
            @RequestParam(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
            @RequestParam(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
            @RequestParam(Fields.ITSS_PASSPHRASE) String passPhrase){
        checkAuthentication(customerSystemId, passPhrase);
        return positionService.getLastPosition(customerSystemId, transportDeviceId);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = PositionApi.LAST_POSITION)
    public void notifyLastPosition(@RequestBody PositionEventDto event){
        checkAuthentication(event);
        positionService.notifyLastPosition(event);
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/positionsTimeInterval")
    public PositionEventListDto getPositionsTimeInterval(
            @RequestParam(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
            @RequestParam(Fields.FROM_UTC_TIMESTAMP) Double fromUtcTimestamp,
            @RequestParam(Fields.TO_UTC_TIMESTAMP) Double toUtcTimeStamp,
            @RequestParam(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
            @RequestParam(Fields.ITSS_PASSPHRASE) String passPhrase) {
        checkAuthentication(customerSystemId, passPhrase);
        return positionService.getPositionsFromTo(
                customerSystemId,
                transportDeviceId,
                Math.round(fromUtcTimestamp * 1000),
                Math.round(toUtcTimeStamp * 1000)
        );
    }

}
