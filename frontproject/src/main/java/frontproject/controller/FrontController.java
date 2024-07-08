package frontproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 frontcontroller�� ��� �����θ� ���� ���� �޾�
 ���ҿ� �´� ��Ʈ�ѷ��� ��û�� �б��ϴ� ó���� �Ѵ�. 
 */

public class FrontController extends HttpServlet {
    
	public FrontController() {
        super();
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	
    	String requestURL = request.getRequestURI(); //��ü url(����������)
    	String contextPath = request.getContextPath(); //������Ʈ path
    	
    	String command 
    		= requestURL.substring(contextPath.length()+1);//������Ʈ path�� ������ uri
    	
    	String[] uris = command.split("/");
    	if(uris[0].equals("sampleTB")) {
    		
    		SampleTBController sampleTBController 
    			= new SampleTBController();
    		
    		
    		sampleTBController.getAction(request,response,uris);
    		
    	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String requestURL = request.getRequestURI(); //��ü url(����������)
    	String contextPath = request.getContextPath(); //������Ʈ path
    	
    	String command 
    		= requestURL.substring(contextPath.length()+1);//������Ʈ path�� ������ uri
    	
    	String[] uris = command.split("/");
    	if(uris[0].equals("sampleTB")) {
    		
    		SampleTBController sampleTBController 
    			= new SampleTBController();
    		
    		
    		sampleTBController.postAction(request,response,uris);
    		
    	}
		
	}

}
