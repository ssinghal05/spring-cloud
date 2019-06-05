package io.pivotal.springcloud.limitsservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration  retreiveLimitsFromConfig(){
        return new LimitConfiguration(1000,1,configuration.getMinimumFieldName(), configuration.getMaximumFieldName());

    }
}
