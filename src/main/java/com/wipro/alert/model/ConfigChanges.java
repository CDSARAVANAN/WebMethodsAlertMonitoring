package com.wipro.alert.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class ConfigChanges 
{
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdapterInstance() {
		return adapterInstance;
	}
	public void setAdapterInstance(String adapterInstance) {
		this.adapterInstance = adapterInstance;
	}
	public String getAdapterType() {
		return adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getParamValues() {
		return paramValues;
	}
	public void setParamValues(String paramValues) {
		this.paramValues = paramValues;
	}
//mark id as primary key
//defining id as column name
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column
private int id;
//defining name as column name
@Column
private String adapterInstance;
@Column
private String adapterType;
@Column
private String component;
@Column
private String action;
@Column
private String param;
@Column
private String errorCode;
@Column
private String paramValues;

}