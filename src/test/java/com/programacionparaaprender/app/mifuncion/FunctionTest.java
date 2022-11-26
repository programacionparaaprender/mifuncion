package com.programacionparaaprender.app.mifuncion;

import com.models.dto.HttpRequestMessageMock;
import com.models.dto.HttpResponseMessageMock;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for Function class.
 */
@ExtendWith(MockitoExtension.class)
public class FunctionTest {
    /**
     * Unit test for HttpTriggerJava method.
     **/
	@Mock
    ExecutionContext context;

    @Mock
    Function function;
    
    @BeforeEach 
    void setUp()
    {
       
        
    }
    @Test
    public void testCorrectFunction() {
        Map<String, String> QueryParameters = new HashMap<String, String>();
        QueryParameters.put("name", "Luis Correa");
        Map<String, String> Headers = new HashMap<String, String>();
        Headers.put("Content-Type", "application/json");
        String url="http://localhost:7071/api/HttpExample";
        String strBody;
        strBody = "";
        HttpMethod HttpMethod = com.microsoft.azure.functions.HttpMethod.value("GET");
        HttpRequestMessageMock req = new HttpRequestMessageMock(QueryParameters, Headers, url, strBody, HttpMethod);

        HttpStatus status = HttpStatus.OK;
        HttpResponseMessage.Builder resBuilder = new HttpResponseMessageMock.HttpResponseMessageBuilderMock().status(status);
        HttpResponseMessage  esperado = resBuilder.build();
        when(this.function.run(req, context)).thenReturn(esperado);
        HttpResponseMessage retResultado = function.run(req, context);
        assertEquals(esperado, retResultado);
        assertEquals(esperado.getStatus(), HttpStatus.OK);
        // Verify
        verify(function).run(req, context);
 
	}
}
