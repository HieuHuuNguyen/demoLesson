package com.example.democonditional1;

import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.context.annotation.Conditional;

public class WindowOrMacRequired extends AnyNestedCondition {
    public WindowOrMacRequired (){
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @Conditional(WindowRequired.class)
    public  class RunOnWindow{}

    @Conditional(MacRequired.class)
    public class RunOnMac{}

}
