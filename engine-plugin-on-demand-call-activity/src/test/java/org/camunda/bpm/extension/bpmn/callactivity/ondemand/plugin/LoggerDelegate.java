package org.camunda.bpm.extension.bpmn.callactivity.ondemand.plugin;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDelegate implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        logger.info("Running logger delegate...");
        logger.info("variableSetByChildProcessProvider from parent: "
            + execution.getSuperExecution().getVariable("variableSetByChildProcessProvider"));
        logger.info("variableSetByChildProcessProvider from child: "
            + execution.getVariable("variableSetByChildProcessProvider"));
    }
}
