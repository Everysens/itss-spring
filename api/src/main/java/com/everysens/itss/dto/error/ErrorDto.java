package com.everysens.itss.dto.error;

import com.everysens.itss.dto.BaseDto;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorDto extends BaseDto{

    public final static ErrorDto authenticationFailed = ErrorDto.builder().code(0100).message("Authentication failed.").build();
    public final static ErrorDto invalidParameter = ErrorDto.builder().code(0101).message("Parameter validation failed.").build();
    public final static ErrorDto systemIdNotFound = ErrorDto.builder().code(1001).message("The given system ID could not be found ").build();
    public final static ErrorDto missingSystemId = ErrorDto.builder().code(1002).message("The system ID is missing").build();
    public final static ErrorDto invalidPassPhrase = ErrorDto.builder().code(1003).message("The pass phrase cannot be validated").build();
    public final static ErrorDto missingPassPhrase = ErrorDto.builder().code(1004).message("The pass phrase is missing").build();
    public final static ErrorDto telematicDeviceIdNotFound = ErrorDto.builder().code(2001).message("The ITSS_TELEMATICS_DEVICE_ID could not be found").build();
    public final static ErrorDto invalidTelematicDeviceId = ErrorDto.builder().code(2002).message("The ITSS_TELEMATICS_DEVICE_ID format is not specification compliant").build();
    public final static ErrorDto transportDeviceIdNotFound = ErrorDto.builder().code(2003).message("The ITSS_TRANSPORT_DEVICE_ID could not be found").build();
    public final static ErrorDto invalidTransportDeviceId = ErrorDto.builder().code(2004).message("The ITSS_TRANSPORT_DEVICE_ID format is not specification compliant").build();
    public final static ErrorDto telematicAndTransportDeviceIdNotPaired = ErrorDto.builder().code(2005).message("The ITSS_TELEMATICS_DEVICE_ID and the ITSS_TRANSPORT_DEVICE_ID are not paired.").build();
    public final static ErrorDto invalidFromUtcTimestamp = ErrorDto.builder().code(2006).message("The From_UTCtimestamp is invalid.").build();
    public final static ErrorDto invalidToUtcTimestamp = ErrorDto.builder().code(2007).message("The To_UTCtimestamp is invalid. ").build();
    public final static ErrorDto invalidUtcTimestampInterval = ErrorDto.builder().code(2008).message("The time interval between From_UTCtimestamp and To_UTCtimestamp is invalid.").build();
    public final static ErrorDto missingTelematicDeviceId = ErrorDto.builder().code(2009).message("The parameter ITSS_TELEMATICS_DEVICE_ID is missing.").build();
    public final static ErrorDto missingTransportDeviceId = ErrorDto.builder().code(2010).message("The parameter ITSS_TRANSPORT_DEVICE_ID is missing.").build();
    public final static ErrorDto missingFromUtcTimestamp = ErrorDto.builder().code(2011).message("The parameter From_UTCtimestamp is missing.").build();
    public final static ErrorDto missingToUtcTimestamp = ErrorDto.builder().code(2012).message("The parameter To_UTCtimestamp is missing.").build();
    public final static ErrorDto tooManyData = ErrorDto.builder().code(3001).message("The response contains too many data and cannot be processed by the Telematics Application.").build();

    private int code;
    private String message;
    private List<ErrorDto> errors;

    public ErrorDto(int code, String message){
        this(code, message, new ArrayList<>());
    }

}
