package com.cts.azure.function.azurehandler;

import com.cts.azure.function.domains.User;
import com.cts.azure.function.util.ResponseDTO;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;

public class UserHandler extends AzureSpringBootRequestHandler<Object, ResponseDTO> {

    @FunctionName("userSave")
    public ResponseDTO save(
            @HttpTrigger(name = "userSaveRequest", methods = {HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<User>> request,
            ExecutionContext context) {
        context.getLogger().info("Save request processed.");
        return handleRequest(request.getBody().get(), context);
    }

    @FunctionName("userGet")
    public ResponseDTO get(
            @HttpTrigger(name = "userGetRequest", methods = {HttpMethod.GET},route = "{id}", authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage request,
            @BindingName("id") Integer id, ExecutionContext context) {
        context.getLogger().info("Get request processed.");
        return handleRequest(id, context);
    }

}