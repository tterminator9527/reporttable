package actions;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import db.Db;

public class HeaderConstruction {
	public static Logger log = Logger.getLogger(HeaderConstruction.class);  
	
	public String report_name;
	public String column1;
	public String column2;
	public String column3;
	
	int column_count = 0;
	StringBuffer columnTemplateBuf = new StringBuffer(); //构造的用于插入数据库sql片段
	StringBuffer columnValueTemplateBuf = new StringBuffer(); //构造的用于插入数据库sql片段
	public  String productReportHeader(){
		outputDebug();
		
		//report_name
		if(!report_name.equalsIgnoreCase("")){ 
			columnTemplateBuf.append("report_name,");
			columnValueTemplateBuf.append("'" + report_name + "',");
		}
		//column1
		if(!column1.equalsIgnoreCase("")){
			column_count++;
			columnTemplateBuf.append("column1,");
			columnValueTemplateBuf.append("'" + column1 + "',");
		}
		//column2
		if(!column2.equalsIgnoreCase("")){
			column_count++;
			columnTemplateBuf.append("column2,");
			columnValueTemplateBuf.append("'" + column2 + "',");
		}
		//column3		
		if(!column3.equalsIgnoreCase("")){
			column_count++;
			columnTemplateBuf.append("column3,");
			columnValueTemplateBuf.append("'" + column3 + "',");
		}

		columnTemplateBuf.append("column_count"); //增加一列计数总列数
		columnValueTemplateBuf.append(column_count); //增加一列计数总列数
		
		log.debug(columnTemplateBuf.toString());
		log.debug(columnValueTemplateBuf.toString());
		
		//insert into the database
		String sql = "insert into customtable" + "( " + columnTemplateBuf.toString() + ") " + "values" + "(" + columnValueTemplateBuf.toString() + ");";
		log.debug(sql);
		
		try {
			Connection conn = Db.getConnection();
			Statement statement = (Statement) conn.createStatement();
			statement.execute(sql);
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	protected void outputDebug(){
		//system.out
		System.out.println("参数调试！输出自System.out.println！");
		System.out.println("参数调试！输出自System.out.println！");
		System.out.println("参数调试！输出自System.out.println！");
		
		//log.info
		log.info("调试参数！！！输出自log.info！！！");
		log.info("调试参数！！！输出自log.info！！！");
		log.info("调试参数！！！输出自log.info！！！");
		
		//log.error
		log.error("调试参数！！！输出自log.error！！！");
		log.error("调试参数！！！输出自log.error！！！");
		log.error("调试参数！！！输出自log.error！！！");
		
		//log.warn
		log.warn("调试参数！！！输出自log.warn！！！");
		log.warn("调试参数！！！输出自log.warn！！！");
		log.warn("调试参数！！！输出自log.warn！！！");
		
		//log.debug
		log.debug("姓名：" + report_name + "，输出自log.debug！！！");
		log.debug("昵称：" + column1 + "，输出自log.debug！！！");
		log.debug("邮箱：" + column2 + "，输出自log.debug！！！");
		log.debug("联系方式：" + column3 + "，输出自log.debug！！！");
	}
	
}
