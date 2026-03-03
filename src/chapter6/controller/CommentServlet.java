package chapter6.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chapter6.beans.Comment;
import chapter6.beans.User;
import chapter6.logging.InitApplication;
import chapter6.service.CommentService;

@WebServlet(urlPatterns = { "/comment" })
public class CommentServlet extends HttpServlet {

	/**
	* ロガーインスタンスの生成
	*/
	Logger log = Logger.getLogger("twitter");

	/**
	* デフォルトコンストラクタ
	* アプリケーションの初期化を実施する。
	*/
	public CommentServlet() {
		InitApplication application = InitApplication.getInstance();
		application.init();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		log.info(new Object(){}.getClass().getEnclosingClass().getName() +
			        " : " + new Object(){}.getClass().getEnclosingMethod().getName());

		HttpSession session = request.getSession();
		Comment comment = new Comment();

		User user = (User) session.getAttribute("loginUser");
		String text = request.getParameter("text");
		int messageId = Integer.parseInt(request.getParameter("message_id"));

		comment.setUserId(user.getId());
		comment.setText(text);
		comment.setMessageId(messageId);

		new CommentService().insert(comment);

		response.sendRedirect("./");
	}
}