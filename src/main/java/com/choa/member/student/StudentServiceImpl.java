package com.choa.member.student;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.util.FileSaver;

@Service
public class StudentServiceImpl implements MemberService {

	@Autowired
	private StudentDAOImpl studentDAOImpl;
	
	@Override
	public MemberDTO memberLogin(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.memberLogin(memberDTO);
	}
	
	@Override
	public int memberJoin(MemberDTO memberDTO, HttpSession session) throws Exception {
		FileSaver fileSaver = new FileSaver();
		memberDTO.setOriName(memberDTO.getF1().getOriginalFilename());
		memberDTO.setFileName(fileSaver.filesave(session.getServletContext().getRealPath("resources/upload"), memberDTO.getF1()));
		return studentDAOImpl.memberJoin(memberDTO);
	}
	
	@Override
	public MemberDTO memberPage(MemberDTO memberDTO) throws Exception {
		return studentDAOImpl.memberPage(memberDTO.getId());
	}
}
