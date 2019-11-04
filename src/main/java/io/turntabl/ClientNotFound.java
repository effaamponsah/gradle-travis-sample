package io.turntabl;

public class ClientNotFound extends RuntimeException {
    public  ClientNotFound(){

    }

    public ClientNotFound(String errorMsg){
        super(errorMsg);
    }
}
