package SteshM.CBC.Elearning.System.utilities;

import SteshM.CBC.Elearning.System.DTO.ResponseDTO;

public class Utilities {
    public static ResponseDTO createSuccessfulResponse(String message , Object data){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatusCode(200);
        responseDTO.setStatusDescription(message);
        return responseDTO;
    }
    public static ResponseDTO createFailedResponse(Long statusCode , String message){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setStatusCode(statusCode);
        responseDTO.setStatusDescription(message);
        return responseDTO;
    }
}
