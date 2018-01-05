package com.everysens.itss.controller.movement;

import com.everysens.itss.api.Fields;
import com.everysens.itss.api.movement.MovementStateApi;
import com.everysens.itss.controller.BaseController;
import com.everysens.itss.dto.movement.MovementStateEventDto;
import com.everysens.itss.facade.authentication.IAuthenticationFacade;
import com.everysens.itss.facade.movement.IMovementStateFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@Controller
public class MovementStateController extends BaseController {

    private final IMovementStateFacade movementStateService;

    @Autowired
    public MovementStateController(IAuthenticationFacade authenticationFacade,
                                   IMovementStateFacade movementStateFacade) {
        super(authenticationFacade);
        this.movementStateService = movementStateFacade;
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
        checkAuthentication(event);
        movementStateService.notifyLastMovementState(event);
    }

}
