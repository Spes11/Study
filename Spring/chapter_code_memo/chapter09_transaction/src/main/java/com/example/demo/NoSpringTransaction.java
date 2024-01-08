package com.example.demo;

import java.sql.Connection;

import javax.management.RuntimeErrorException;

public class NoSpringTransaction {
	
	public Resevation reserve(ReservationInput reservationInput) {
//		①DataSorceオブジェクトからConnetionオブジェクトを取得。
		try(Connection con = dataSource.getConnection();){
//			②トランザクションの開始を指示
			con.setAutoCommit(false);
//			③Repositoryメソッドを呼び出す。
			try {
				Training training = trainingRepository.setById(con,reservationInput.getTrainingId());
				
				trainingRepository.update(con,trainig);
				
				reservationRepository.insert(con,reservation);
//				④トランザクションのコミット指示をする。
				con.commit();
				returin reservation;
//				⑤例外が発生した場合は、例外をキャッチしてロールバックを出す。
			}catch(Exception ex) {
				if (con!=null) {
					con.rollback();
				}
				throw ex;
			}
		}
	}catch (SQLException ex) {
		throw new RuntimeErrorException("DBエラー",ex;
		}
	}
}
