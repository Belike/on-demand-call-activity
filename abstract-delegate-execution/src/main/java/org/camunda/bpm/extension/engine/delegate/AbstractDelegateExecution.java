package org.camunda.bpm.extension.engine.delegate;

import java.util.Map;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngineServices;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.runtime.Incident;
import org.camunda.bpm.model.bpmn.BpmnModelInstance;
import org.camunda.bpm.model.bpmn.instance.FlowElement;

/**
 * Abstract base class for implementing a {@link DelegateExecution} for
 * executing a {@link JavaDelegate} without being forced to implement all
 * methods provided, which makes the implementation more robust to future
 * changes.
 * 
 * @author Falko Menge (Camunda)
 */
public class AbstractDelegateExecution extends SimpleVariableScope implements DelegateExecution {

  private static final long serialVersionUID = 1L;

  public AbstractDelegateExecution() {
    super();
  }

  public AbstractDelegateExecution(Map<String, ? extends Object> variables) {
    super(variables);
  }

  @Override
  public String getId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getProcessInstanceId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getProcessDefinitionId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getCurrentActivityId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getActivityInstanceId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getTenantId() {
    throw new UnsupportedOperationException();
  }
  @Override
  public String getCurrentActivityName() {
    throw new UnsupportedOperationException();
  }

  @Override
  public FlowElement getBpmnModelElementInstance() {
    throw new UnsupportedOperationException();
  }

  @Override
  public BpmnModelInstance getBpmnModelInstance() {
    throw new UnsupportedOperationException();
  }

  @Override
  public ProcessEngineServices getProcessEngineServices() {
    throw new UnsupportedOperationException();
  }

  /**
   * @since 7.10.0
   */
//  @Override
  public ProcessEngine getProcessEngine() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getParentId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getParentActivityInstanceId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getEventName() {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getCurrentTransitionId() {
    throw new UnsupportedOperationException();
  }

  @Override
  public DelegateExecution getProcessInstance() {
    throw new UnsupportedOperationException();
  }

  @Override
  public DelegateExecution getSuperExecution() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean isCanceled() {
    throw new UnsupportedOperationException();
  }

  /**
   * @since 7.8.0
   */
//  @Override
  public Incident createIncident(String incidentType, String configuration) {
    throw new UnsupportedOperationException();
  }

  /**
   * @since 7.8.0
   */
//  @Override
  public Incident createIncident(String incidentType, String configuration, String message) {
    throw new UnsupportedOperationException();
  }

  /**
   * @since 7.8.0
   */
//  @Override
  public void resolveIncident(String incidentId) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getBusinessKey() {
    return getProcessBusinessKey();
  }

  @Override
  public String getProcessBusinessKey() {
    throw new UnsupportedOperationException();
  }

  /**
   * @since 7.10.0
   */
//  @Override
  public void setProcessBusinessKey(String businessKey) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void setVariable(String variableName, Object value, String activityId) {
    throw new UnsupportedOperationException();
  }

}