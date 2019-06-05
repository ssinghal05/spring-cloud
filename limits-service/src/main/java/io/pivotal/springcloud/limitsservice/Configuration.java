package io.pivotal.springcloud.limitsservice;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


// Demonstration of how to use configuration
@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
public class Configuration {


    private String minimumFieldName;

    private String maximumFieldName;
}
