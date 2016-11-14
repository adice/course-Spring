package com.pdf;

import java.awt.Color;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;

public class UserListPdfView extends AbstractPdfView {
	
	@Override
	protected void buildPdfDocument(Map<String, Object> model, com.lowagie.text.Document document,
			com.lowagie.text.pdf.PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "inline;filename="+new String("用户列表".getBytes(),"iso8859-1"));
		Table table=new Table(2);
		table.setWidth(100);
		table.setBorder(1);
		//中文字体
		BaseFont baseFont=BaseFont.createFont("STSongStd-Light","UniGB-UCS2-H",false);
		Font cnFont=new Font(baseFont,10,Font.NORMAL,Color.red);
		table.addCell(new Phrase("学号",cnFont));
		table.addCell(new Phrase("姓名",cnFont));
		
		for(int i=0;i<10;i++){
			table.addCell(""+i+1);
			table.addCell("zhao"+i+1);
		}
		document.add(table);
	}

}
