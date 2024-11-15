package com.probank.walletservice.documentation;//package com.lafarge.logiccontrol.documentation;
//
//import io.swagger.v3.oas.annotations.Operation;
//import io.swagger.v3.oas.models.media.Content;
//import io.swagger.v3.oas.models.media.MediaType;
//import io.swagger.v3.oas.models.responses.ApiResponse;
//
//import io.swagger.v3.oas.models.responses.ApiResponses;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class GlobalApiResponsesAspect {
//
//    @Around("@within(org.springframework.web.bind.annotation.RestController) && @annotation(operation)")
//    public Object applyGlobalApiResponses(ProceedingJoinPoint joinPoint, Operation operation) throws Throwable {
//        io.swagger.v3.oas.annotations.responses.ApiResponse[] responses = operation.responses();
//        ApiResponses apiResponses = new ApiResponses();
//        if (responses != null) {
//            for (io.swagger.v3.oas.annotations.responses.ApiResponse response : responses) {
//                apiResponses.addApiResponse(response.responseCode(), new ApiResponse().description(response.description()));
//            }
//        }
//        apiResponses.addApiResponse("401", new ApiResponse().description("Unauthorized access"));
//        apiResponses.addApiResponse("403", new ApiResponse().description("Access forbidden"));
//        apiResponses.addApiResponse("500", new ApiResponse().description("Internal server error"));
//        return joinPoint.proceed();
//    }
//}