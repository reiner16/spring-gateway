package com.demo.springgateway.routes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;

@Configuration
public class RoutesConfig {
/*@Value("${uri.api.clientes}")
private String clientesUri;

@Bean
public RouteLocator clientesRouteLocator(RouteLocatorBuilder builder){
return builder.routes()
/*.route("all_clientes", r -> r.path("/promerica/v1/api/cliente/all")//El Id debe ser único
.and().method(HttpMethod.GET)
.filters(
f -> f.rewritePath("/promerica/v1/api/cliente/all", "/v1/api/cliente/all")
.addRequestHeader("X-GATEWAY-REQUEST-HEADER", "GATEWAY_REQUEST")
.addResponseHeader("X-GATEWAY-RESPONSE-HEADER", "GATEWAY_RESPONSE")
).uri(clientesUri))*/
/* .route("clientes_by_id",
r -> r.path("/promerica/v1/api/cliente-por-id/{id}")
.filters(
f -> f.rewritePath("/promerica/v1/api/cliente-por-id/", "/v1/api/cliente/")
.addRequestHeader("X-GATEWAY-REQUEST-HEADER", "GATEWAY_REQUEST")
.addResponseHeader("X-GATEWAY-RESPONSE-HEADER", "GATEWAY_RESPONSEDEALBERTOSALAZAR"))
.uri(clientesUri))
.route("employee_all", r -> r.path("/v1/api/employee/all")//El Id debe ser único
.filters(
f -> f.rewritePath("/promerica/v1/api/employee/all", "/v1/api/employee/all")
.addRequestHeader("X-GATEWAY-REQUEST-HEADER", "GATEWAY_REQUEST")
.addResponseHeader("X-GATEWAY-RESPONSE-HEADER", "GATEWAY_RESPONSE")
).uri(clientesUri)).build();
}*/

}
