package net.radu.Frontend.services;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class PictureUploadUtility {

	private static final String ABS_PATH = "D:/BigData/EventApp/Frontend/src/main/webapp/assets/images/";
	private static String REAL_PATH = "";
	private static Random generator;
	
	public static void uploadFile(HttpServletRequest request, MultipartFile picture) {
		generator = new Random();
		
		//getting realpath
		REAL_PATH = request.getSession().getServletContext().getRealPath("/assets/images/");
		
		//making sure that all directories exist
		//create directory
		if(!new File(ABS_PATH).exists()){
			//creating directories
			new File(ABS_PATH).mkdirs();
		}
		
		if(!new File(REAL_PATH).exists()){
			//creating directories
			new File(REAL_PATH).mkdirs();
		}
		
		try{
			//SERVER UPLOAD
			picture.transferTo(new File(REAL_PATH+generator+".jpg"));
			//PROJECT DIR UPLOAD
			picture.transferTo(new File(ABS_PATH+generator+".jpg"));
		}catch(IOException ex){
			
		}
	}
	
}
