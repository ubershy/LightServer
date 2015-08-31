package com.github.tort32.lightserver.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "LIFX endpoint")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class LifxEndpoint {

	@XmlElement(required = true)
	@ApiModelProperty( value = "Device service IP", required = true )
	public String ip;
	
	@XmlElement(required = true)
	@ApiModelProperty( value = "Device MAC", required = true )
	public String mac;

	@XmlElement(required = true)
	@ApiModelProperty( value = "Device service port", required = true )
	public int port;
	
	protected LifxEndpoint() {
		// Empty
	}

	public LifxEndpoint(String ip, String mac, int port) {
		this.ip = ip;
		this.mac = mac;
		this.port = port;
	}

}