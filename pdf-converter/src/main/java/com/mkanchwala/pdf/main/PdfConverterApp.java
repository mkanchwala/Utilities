package com.mkanchwala.pdf.main;

import com.mkanchwala.pdf.ops.XLStoPDF;
import com.mkanchwala.pdf.util.Formats;

public class PdfConverterApp {
	
	public static void main(String[] args) throws Exception {
		String inputPath = args[0];
		String outputPath = args[1];
		String fileType = args[2];
		if(fileType.equalsIgnoreCase(Formats.XLS.parameterName) || fileType.equalsIgnoreCase(Formats.XLSX.parameterName)){
			XLStoPDF.convert(inputPath, outputPath);
		}
	}

}
