package command;

import javax.servlet.http.HttpServletRequest;

import domain.MemberBean;

public class DeleteCommand extends Command {
	public DeleteCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1, 
				request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		execute();
	}
	@Override
	public void execute() {
		System.out.println("멤버 삭제 진입");
		MemberBean member = new MemberBean();
		member.setMemberId(request.getParameter("user-id"));
		member.setPass(request.getParameter("pass"));
		//MemberServiceImpl.getInstance().deleteMember(member);
		System.out.println("멤버 삭제 성공");
		super.execute();
	}
}