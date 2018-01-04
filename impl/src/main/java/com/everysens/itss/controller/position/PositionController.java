package com.everysens.itss.controller.position;

import com.everysens.itss.api.Fields;
import com.everysens.itss.api.position.PositionApi;
import com.everysens.itss.controller.BaseController;
import com.everysens.itss.dto.position.PositionEventDto;
import com.everysens.itss.dto.position.PositionEventListDto;
import com.everysens.itss.service.authentication.IAuthenticationService;
import com.everysens.itss.service.position.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


public class PositionController extends BaseController {

    private final IPositionService positionService;

    @Autowired
    public PositionController(IAuthenticationService authenticationService, IPositionService positionService){
        super(authenticationService);
        this.positionService = positionService;

    }
    @RequestMapping(
            method = RequestMethod.GET,
            value = PositionApi.LAST_POSITION
    )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PositionEventDto getLastPosition(
            @RequestParam(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
            @RequestParam(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
            @RequestParam(Fields.ITSS_PASSPHRASE) String passPhrase){
        checkAuthentication(customerSystemId, passPhrase);
        return positionService.getLastPosition(customerSystemId, transportDeviceId);

    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = PositionApi.LAST_POSITION
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void notifyLastPosition(@RequestBody PositionEventDto event){
        checkAuthentication(event.getTelematicsApplicationId(), event.getPassPhrase());
        positionService.notifyLastPosition(event);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/positionsTimeInterval"
    )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
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
