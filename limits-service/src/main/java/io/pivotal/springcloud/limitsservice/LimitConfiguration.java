package io.pivotal.springcloud.limitsservice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class LimitConfiguration {

    private int maximum;

    private int minimum;

    private String mimumFieldName;

    private String maximumFieldName;
}
