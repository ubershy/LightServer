package com.github.tort32.lightserver.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.github.tort32.lifx.light.recieve.State;
import com.wordnik.swagger.annotations.ApiModel;

@ApiModel(value = "LIFX endpoint state")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LifxState {

	@XmlElement(required = true)
	public LifxHSBK color;
	
	@XmlElement(required = true)
	public boolean power;
	
	@XmlElement(required = true)
	public String label;
	
	protected LifxState() {
		// Empty
	}
	
	public LifxState(State state) {
		this.color = new LifxHSBK(state.mColor);
		this.power = state.mPower.isOn();
		this.label = state.mLabel.toString();
	}

}