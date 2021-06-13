package com.example.demo.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class ExceptionMessage {
	private String timpstamp;
	private String message;

	public ExceptionMessage(String message) {
		this.message = message;
		this.timpstamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	public String getTimpstamp() {
		return timpstamp;
	}

	public void setTimpstamp(String timpstamp) {
		this.timpstamp = timpstamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
