/*
 * JSP generated by Resin-4.0.45 (built Thu, 06 Aug 2015 12:42:25 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import deception.*;

public class _userview__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
                     ArrayList<User> roster = (ArrayList<User>)request.getAttribute("userlist");	
                    for (int i=0; i<roster.size(); i++) {
                		User user = (User)roster.get(i);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    out.print((user.getId() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getName() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getAbout() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getEmail() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getIsverified() ));
    out.write(_jsp_string3, 0, _jsp_string3.length);
    out.print((user.getProfilePicture() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getContactAddress() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getLikes() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print((user.getFriendsCount() ));
    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print((user.getMemberSince() ));
    out.write(_jsp_string5, 0, _jsp_string5.length);
     }
                    
    out.write(_jsp_string6, 0, _jsp_string6.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -5881050986011397250L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("userview.jsp"), 7437323481003942047L, false);
    _caucho_depends.add(depend);
    loader.addDependency(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("footer.jsp"), -6848856920362342834L, false);
    _caucho_depends.add(depend);
    loader.addDependency(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string5;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string4;
  private final static char []_jsp_string6;
  static {
    _jsp_string0 = "\n    \n    \n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>User View</title>\n</head>\n<body>\n<div>\n<table >\n                    <thead>\n                        <tr>\n                           \n                            <th>ID</th>\n                            <th>Name</th>\n                            <th>About</th>\n                            <th>Email</th>\n                            <th>Is Verified</th>  \n                            <th>Profile Picture</th>\n                            <th>Contact Address</th>\n                            <th>Likes</th>\n                            <th>Friends Count</th> \n                            <th>Member Since</th> \n                        </tr>\n                    </thead>\n                    <tbody>\n                    ".toCharArray();
    _jsp_string5 = "</th> \n                    </tr>\n                		\n                	   ".toCharArray();
    _jsp_string1 = "\n                		<tr>\n                        \n                        <th>".toCharArray();
    _jsp_string3 = "</th>  \n                        <th>".toCharArray();
    _jsp_string2 = "</th>\n                        <th>".toCharArray();
    _jsp_string4 = "</th> \n                        <th>".toCharArray();
    _jsp_string6 = "\n                    \n                    </tbody>\n</table>\n</div>\n\n\n\n</body>\n</html>\n\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>Insert title here</title>\n</head>\n<body>\n<div>\n	<div>\n		<p><a href ='#'> Back to Top</a></p>\n		<p>&copy; 2017 Joe and Zee, Inc &middot; <a href='#'>Privacy</a> &middot; <a href='#'>Terms</a>\n	\n	</div>\n\n</div>\n\n</body>\n</html> ".toCharArray();
  }
}