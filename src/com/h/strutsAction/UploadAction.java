package com.h.strutsAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	private String username;
	private File file;
	private String fileFileName;
	private String fileContentType;

	@Override
	public String execute() throws Exception {

		//String root = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/upload");
		//String root = ServletActionContext.getRequest().getRealPath("/upload");
		//String directory="/upload";  
        //String root=ServletActionContext.getServletContext().getRealPath(directory);
        String root= "/Users/liujingjie/work/java_project/upload";
		
		
		InputStream is = new FileInputStream(file);
		
		File destFile = new File(root,fileFileName);
		
		OutputStream os = new FileOutputStream(destFile);
		
		byte[] buffer = new byte[400];
		
		int length = 0;
		
		while(-1 != (length = is.read(buffer))) {
			os.write(buffer, 0, length);
		}
		is.close();
		os.close();
		
		return SUCCESS;
	}

}
