package com.kh.pop.model.vo;

import java.util.Objects;

public class Popup {
	private int popupNo;
	private String popupWriter;
	private String popupName;
	private String popupStart;
	private String popupEnd;
	private String popupLocation;
	
	public Popup(int popupNo, String popupWriter, String popupName, String popupStart,
			String popupEnd, String popupLocation) {
		super();
		this.popupNo = popupNo;
		this.popupWriter = popupWriter;
		this.popupName = popupName;
		this.popupStart = popupStart;
		this.popupEnd = popupEnd;
		this.popupLocation = popupLocation;
	}
	public Popup() {
		super();
	}
	public int getPopupNo() {
		return popupNo;
	}
	public void setPopupNo(int popupNo) {
		this.popupNo = popupNo;
	}
	public String getPopupWriter() {
		return popupWriter;
	}
	public void setPopupWriter(String popupWriter) {
		this.popupWriter = popupWriter;
	}
	public String getPopupName() {
		return popupName;
	}
	public void setPopupName(String popupName) {
		this.popupName = popupName;
	}

	public String getPopupStart() {
		return popupStart;
	}
	public void setPopupStart(String popupStart) {
		this.popupStart = popupStart;
	}
	public String getPopupEnd() {
		return popupEnd;
	}
	public void setPopupEnd(String popupEnd) {
		this.popupEnd = popupEnd;
	}
	public String getPopupLocation() {
		return popupLocation;
	}
	public void setPopupLocation(String popupLocation) {
		this.popupLocation = popupLocation;
	}
	@Override
	public String toString() {
		return "Popup [popupNo=" + popupNo + ", popupWriter=" + popupWriter + ", popupName=" + popupName
				+ ", popupStart=" + popupStart + ", popupEnd=" + popupEnd
				+ ", popupLocation=" + popupLocation + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash( popupEnd, popupLocation, popupName, popupNo, popupStart, popupWriter);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Popup other = (Popup) obj;
		return 
				 Objects.equals(popupLocation, other.popupLocation) && Objects.equals(popupName, other.popupName)
				&& popupNo == other.popupNo && Objects.equals(popupStart, other.popupStart)
				&& Objects.equals(popupWriter, other.popupWriter);
	}

}
