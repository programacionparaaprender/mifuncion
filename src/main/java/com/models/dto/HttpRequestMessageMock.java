package com.models.dto;

import java.net.URI;
import java.util.Map;
import java.util.Optional;

import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage.Builder;


import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.HttpStatusType;;


public class HttpRequestMessageMock implements HttpRequestMessage<Optional<String>> {
    Map<String, String> QueryParameters;
    Map<String, String> Headers;
    HttpMethod HttpMethod;
    URI Uri;
    Optional<String> Body;
    public HttpRequestMessageMock(Map<String, String> QueryParameters, Map<String, String> Headers,String url, String strBody, HttpMethod HttpMethod){
        this.QueryParameters = QueryParameters;
        this.Headers = Headers;
        this.Uri = Uri.create(url);
        this.Body = Optional.of(strBody);
        this.HttpMethod = HttpMethod;
    }

    public HttpRequestMessageMock(){

    }

    @Override
    public Builder createResponseBuilder(HttpStatus arg0) {
        return null;
    }

    @Override
    public Builder createResponseBuilder(HttpStatusType arg0) {
        return null;
    }

    @Override
    public Optional<String> getBody() {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public Map<String, String> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HttpMethod getHttpMethod() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public URI getUri() {
        // TODO Auto-generated method stub
        return null;
    }
    
}