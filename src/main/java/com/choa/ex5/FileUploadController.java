package com.choa.ex5;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;

@Controller
public class FileUploadController {
	
	@RequestMapping(value="/test/fileUpForm")
	public void fileUp(){}
	
	
	public void fileUpload1(String name, MultipartHttpServletRequest request) throws Exception{
		System.out.println("name : " + name);
		MultipartFile f = request.getFile("f1");
		System.out.println("getName : " + f.getName());
		System.out.println("originalName : " + f.getOriginalFilename());
		System.out.println("getSize : " + f.getSize());
		String path = request.getSession().getServletContext().getRealPath("resources/upload");
		FileSaver fs = new FileSaver();
		fs.filesave(path, f.getOriginalFilename(), f.getBytes());
	}
	
	public void fileUpload2(String name, MultipartFile f1, HttpSession session) throws Exception{
		System.out.println("getName : " + f1.getName());
		System.out.println("originalName : " + f1.getOriginalFilename());
		System.out.println("getSize : " + f1.getSize());
		String path = session.getServletContext().getRealPath("resources/upload");
		FileSaver fs = new FileSaver();
		fs.filesave(path, f1.getOriginalFilename(), f1.getBytes());
	}
	
	@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload3(FileDTO fileDTO, HttpSession session) throws Exception{
		FileSaver fs = new FileSaver();
		String realPath = session.getServletContext().getRealPath("resources/upload");
		fs.filesave(realPath, fileDTO.getF1().getOriginalFilename(), fileDTO.getF1().getBytes());
	}
	
	private String upload1(MultipartFile f, String path) throws Exception{
		System.out.println("path : " + path);
		String fileName = UUID.randomUUID().toString();
		System.out.println("fileName : " + fileName);
		fileName=fileName+"_"+f.getOriginalFilename();
		File file = new File(path, fileName);
		
		FileCopyUtils.copy(f.getBytes(), file);
		
		return fileName;
	}
}
