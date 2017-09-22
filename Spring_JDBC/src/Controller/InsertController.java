package Controller;

import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Dao.InsertDao;
import Vo.RegiVo;

@Controller
public class InsertController {
	
@RequestMapping(value = "/Register.do",method = RequestMethod.GET)
public ModelAndView addRegister()
{
	return new ModelAndView("Register","r",new RegiVo());
}

@RequestMapping(value = "/insert.do",method = RequestMethod.GET) 
public ModelAndView insert(@ModelAttribute RegiVo r) throws SQLException
{
	InsertDao dao=new InsertDao();
	dao.insert(r);
	
	return new ModelAndView("redirect:Register.do");
}

@RequestMapping(value = "/search.do",method = RequestMethod.GET)
public ModelAndView search(HttpSession session) throws SQLException
{
	List ls= new ArrayList();
	InsertDao d=new InsertDao();
	ls=d.search();
	return new ModelAndView("Search","data",ls);		
}

@RequestMapping(value = "/edit.do",method = RequestMethod.GET)
public ModelAndView edit(HttpSession session,@RequestParam("id") int i) throws SQLException
{
	List ls = new ArrayList();	
	RegiVo r =new RegiVo();
	r.setId(i);
	
	InsertDao dao =new InsertDao();
	ls= dao.edit(r);
	return new ModelAndView("edit","data",ls);
}
@RequestMapping(value= "/update.do",method = RequestMethod.GET)
public ModelAndView update(@ModelAttribute RegiVo r,@RequestParam("id") int i){
	
	r.setId(i);
	InsertDao dao = new InsertDao();
	dao.update(r);
	return new ModelAndView("redirect:search.do");	
	}
}