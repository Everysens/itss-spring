package com.everysens.itss.controller.movement;

import com.everysens.itss.api.Fields;
import com.everysens.itss.api.movement.MovementStateApi;
import com.everysens.itss.controller.BaseController;
import com.everysens.itss.dto.movement.MovementStateEventDto;
import com.everysens.itss.service.authentication.IAuthenticationService;
import com.everysens.itss.service.movement.IMovementStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

public class MovementStateController extends BaseController {

    private final IMovementStateService movementStateService;

    @Autowired
    public MovementStateController(IAuthenticationService authenticationService,
                                   IMovementStateService movementStateService) {
        super(authenticationService);
        this.movementStateService = movementStateService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            value = MovementStateApi.LAST_MOVEMENT_STATE
    )
    @ResponseBody
    @ResponseStatus(OK)
    public MovementStateEventDto getLastMovementState(
            @RequestParam(Fields.ITSS_TRANSPORT_DEVICE_ID) String transportDeviceId,
            @RequestParam(Fields.ITSS_CUSTOMER_SYSTEM_ID) String customerSystemId,
            @RequestParam(Fields.ITSS_PASSPHRASE) String passPhrase){
        checkAuthentication(customerSystemId, passPhrase);
        return movementStateService.getLastMovementState(customerSystemId, transportDeviceId);

    }

    @RequestMapping(
            method = RequestMethod.POST,
            value = MovementStateApi.LAST_MOVEMENT_STATE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public void notifyLastPosition(@RequestBody MovementStateEventDto event){
        checkAuthentication(event.getTelematicsApplicationId(), event.getPassPhrase());
        movementStateService.notifyLastMovementState(event);
    }

}
