package io.tonyc.web.common.bean;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tony on 2015/12/10.
 */
public class ResponseMessage {

    public static final String CODE_SUCCESS = "success";
    public static final String CODE_ERROR = "error";
    public static final String CODE_WARNING = "warning";
    public static final String CODE_DANGER = "danger";
    public static final String CODE_INFO = "info";

    private String code;
    private String message;
    private List<Error> errors = new LinkedList<Error>();

    public ResponseMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseMessage success(String text) {
        return new ResponseMessage(CODE_SUCCESS, text);
    }

    public static ResponseMessage error(String text) {
        return new ResponseMessage(CODE_ERROR, text);
    }

    public static ResponseMessage warning(String text) {
        return new ResponseMessage(CODE_WARNING, text);
    }

    public static ResponseMessage danger(String text) {
        return new ResponseMessage(CODE_DANGER, text);
    }

    public static ResponseMessage info(String text) {
        return new ResponseMessage(CODE_INFO, text);
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public void addError(String code, String message) {
        this.errors.add(new Error(code, message));
    }

    class Error {

        private String code;
        private String message;

        private Error(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

}