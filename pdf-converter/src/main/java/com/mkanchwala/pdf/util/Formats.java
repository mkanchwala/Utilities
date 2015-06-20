package com.mkanchwala.pdf.util;

public enum Formats {
	PDF("pdf"),
	XLS("xls"),
	XLSX("xlsx");

	public final String parameterName;
	Formats(String aParameterName) {
		this.parameterName = aParameterName;
	}
}
