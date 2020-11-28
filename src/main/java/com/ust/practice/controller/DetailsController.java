/**
 * Project Name  :test
 * 
 */
package com.ust.practice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.practice.model.Details;
import com.ust.practice.model.Message;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import javax.ws.rs.HttpMethod;

/**
 * DetailsController Class is a controller class which consist of post method which returns message class object
 * @author Akhila
 *
 */
@RestController
@Slf4j
public class DetailsController {
	/**
	 * message is a post method which is used for accepting the details object and returning the message 
	 */
	@PostMapping("/hello")
	
	@SwaggerToken
    @ApiOperation(value = "Display Message", notes = "Returns 200 OK/204 NO_CONTENT", httpMethod = HttpMethod.POST)
	public ResponseEntity<Message> message(@RequestBody Details details)
    {
        log.info("Begining the Post operation");

        Message responseMessage = new Message();
        
        responseMessage.setMessage("Hi "+details.getName());
        
        log.info("Ending Post operation");
        
        return ResponseEntity.ok(responseMessage) ;
        
        
    }

	
	
}
