package com.everysens.itss.controller.position;

import com.everysens.itss.api.Fields;
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
            value = "/lastPosition"
    )
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public PositionEventDto getLastPosition(
            @RequestParam(Fields.ITSS_TransportDeviceID) String transportDeviceId,
            @RequestParam(Fields.ITSS_CustomerSystemID) String customerSystemId,
            @RequestParam(Fields.ITSS_PassPhrase) String passPhrase){
        checkAuthentication(customerSystemId, passPhrase);
        return positionService.getLastPosition(customerSystemId, transportDeviceId);

    }

    @RequestMapping(
            method = RequestMethod.POST
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
    public PositionEventListDto getLastPosition(
            @RequestParam(Fields.ITSS_TransportDeviceID) String transportDeviceId,
            @RequestParam(Fields.fromUTCtimestamp) Double fromUtcTimestamp,
            @RequestParam(Fields.toUTCtimestamp) Double toUtcTimeStamp,
            @RequestParam(Fields.ITSS_CustomerSystemID) String customerSystemId,
            @RequestParam(Fields.ITSS_PassPhrase) String passPhrase) {
        checkAuthentication(customerSystemId, passPhrase);
        return positionService.getPositionsFromTo(
                customerSystemId,
                transportDeviceId,
                Math.round(fromUtcTimestamp * 1000),
                Math.round(toUtcTimeStamp * 1000)
        );
    }

}
