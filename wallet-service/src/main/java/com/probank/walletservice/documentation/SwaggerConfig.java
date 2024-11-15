package com.probank.walletservice.documentation;



import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@Configuration
@EnableScheduling
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Logic Control App")
                        .version("1.0")
                        .description("This API provides all the functionalities for the Logic Control Application.")
                        .termsOfService("https://example.com/terms")
                        .contact(new Contact()
                                .name("Logic Control Support")
                                .url("https://example.com/support")
                                .email("support@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html")))
                .servers(List.of(
                        new Server().url("https://staging-812204315267.us-central1.run.app").description("Staging server"),
                         new Server().url("http://localhost:5124").description("Quality server"),
                         new Server().url("http://localhost:8080").description("Local server"),
        new Server().url("http://driverappservice.lapapps.ng:5124").description("Production server")
                ))
                .externalDocs(new ExternalDocumentation()
                        .description("Logic Control App Wiki Documentation")
                        .url("https://example.com/wiki"))
                .tags(List.of(
//                        new Tag().name("User Management")
//                                .description("Operations related to user management, including creating, updating, and deleting users."),
                        new Tag().name("User Management - Registration")
                                .description("Operations related to managing user roles and permissions."),
                        new Tag().name("User Management - Authentication")
                                .description("Endpoints for user authentication, including login and OTP verification."),
                        new Tag().name("User Management - Profile Management")
                                .description("Endpoints for managing user profiles, including updating user information."),
                        new Tag().name("Logic Module- Shipment Management")
                                .description("Endpoints for managing shipments, including fetching and updating shipment data."),
                        new Tag().name("Logic Module- Truck Management")
                                .description("Endpoints for managing trucks, including fetching and updating truck statuses."),
                       new Tag().name("Logic Module- Task Management")
                                .description("Endpoints for managing tasks, including delegating and fetching task metrics."),
                        new Tag().name("Logic Module- Rating and Feedback Management")
                                .description("Endpoints for managing ratings and feedback, including fetching and updating rating data."),
                        new Tag().name("Incentive Module - Incentive Management")
                                .description("Endpoints for managing incentives, including updating incentive configurations and getting analytics on incentive metrics."),
                        new Tag().name("Incentive Module - Payout Management")
                                .description("Endpoints for managing payments of users, including getting payment reports and fetching payment options such as bank list."),
                        new Tag().name("Reverse Logistics - Order Management")
                                .description("Endpoints for managing backhaul orders, including creating, updating, and deleting orders."),
                        new Tag().name("Reverse Logistics - BackHaulAssignment")
                                .description("Endpoints for managing backhaul assignments, including assigning and unassigning backhaul orders."),
                        new Tag().name("Safety Module - Violations Management")
                                .description("Endpoints for managing violations, including fetching and updating violation data."),
                        new Tag().name("Safety Module - Safety Metrics")
                                .description("Endpoints for managing safety metrics, blocked drivers, including fetching and updating safety data."),
                        new Tag().name("Notification Management")
                                .description("Endpoints for managing notifications, including creating and sending notifications."),
                        new Tag().name("Public API Integration")
                                .description("Endpoints for integrating with external systems and services."),
        new Tag().name("DriverProfile Management - Metrics")
                .description("Endpoints for managing and retrieving driverProfile performance metrics."),
//                        new Tag().name("Transporter Management")
//                                .description("Endpoints for managing transporters, including creating and updating transporter information."),
                new Tag().name("Transporter Management - Metrics")
                        .description("Endpoints for managing and retrieving transporter performance metrics.")

                ))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));

    }
}