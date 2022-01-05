package com.paramazon.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ErrorDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
		private String error;
		private String code;
		private Date currentDate;
		
		public ErrorDetails() {
			super();
		}

		public ErrorDetails(String error, String code, Date currentDate) {
			this.error = error;
			this.code = code;
			this.currentDate = currentDate;
		}
		
		public Date getCurrentDate() {
			return currentDate;
		}
		public void setCurrentDate(Date currentDate) {
			this.currentDate = currentDate;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}

}
