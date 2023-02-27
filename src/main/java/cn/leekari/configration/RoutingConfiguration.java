//package cn.leekari.configration;
//
//import cn.leekari.entity.TestUser;
//import cn.leekari.service.TestService;
//import cn.leekari.utils.Result;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RouterFunctions.route;
//
//@Configuration
//public class RoutingConfiguration {
//
//    @Bean
//    public RouterFunction<ServerResponse> monoUserRouterFunction(TestService testService) {
//        return RouterFunctions.route(RequestPredicates.GET("/user/{userId}")
//                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)), testService::getUser);
//    }
//}
