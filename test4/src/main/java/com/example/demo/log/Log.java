package com.example.demo.log;

import io.corp.calculator.TracerImpl;

/**
 * Log Tracer
 */
public class Log {

    private TracerImpl tracerImpl;
    private String message;

	public Log() {
        this.setTracerImpl(new TracerImpl());
    }

	public TracerImpl getTracerImpl() {
		return tracerImpl;
	}

	public void setTracerImpl(TracerImpl tracerImpl) {
		this.tracerImpl = tracerImpl;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		getTracerImpl().trace(message);
	}
}
