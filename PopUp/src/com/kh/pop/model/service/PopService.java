package com.kh.pop.model.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;
import java.util.function.Function;

import com.kh.pop.model.dao.PopDAO;
import com.kh.pop.model.vo.Popup;

public class PopService {
	
	private <T> T executeQuery(Function<Connection, T> daofunction) {
		Connection conn = null;
		T result = null;
		conn = getConnection();
		result = daofunction.apply(conn);

		close(conn);

		return result;

	}
	public List<Popup> findAll(){
		return executeQuery(new PopDAO()::findAll);
	}
	public int addPop(Popup popup) {
		return executeQuery(conn -> new PopDAO().addPop(conn, popup));
	}
	

}
