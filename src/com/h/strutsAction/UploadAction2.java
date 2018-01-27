package com.h.strutsAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction2 extends ActionSupport {

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	private String username;
	private List<File> file;
	private List<String> fileFileName;
	private List<String> fileContentType;

	@Override
	public String execute() throws Exception {
		
		if(null == file) {
			return INPUT;
		}
		
		for(int i = 0; i<file.size(); i++) {

			InputStream is = new FileInputStream(file.get(i));
			String root= "/Users/liujingjie/work/java_project/upload";
			File destFile = new File(root,fileFileName.get(i));
			
			OutputStream os = new FileOutputStream(destFile);
			
			byte[] buffer = new byte[400];
			
			int length = 0;
			
			while(-1 != (length = is.read(buffer))) {
				os.write(buffer, 0, length);
			}
			is.close();
			os.close();
			
		}
        
		
		return SUCCESS;
	}

}
