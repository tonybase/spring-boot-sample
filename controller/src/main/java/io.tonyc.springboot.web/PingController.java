package io.tonyc.springboot.endpoint;

import io.tonyc.web.common.bean.Constants;
import io.tonyc.web.common.bean.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tony on 2015/12/10.
 */
@RestController
@RequestMapping(Constants.URI_API)
public class PingController {

    /**
     * check if the network connecting is ok.
     *
     * @return
     */
    @RequestMapping("/ping")
    public ResponseEntity<ResponseMessage> ping() {
        return new ResponseEntity(ResponseMessage.info("connected"), HttpStatus.OK);
    }

}