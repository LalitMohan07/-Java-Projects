package com.demo.service;

import com.demo.Dao.accountDao;

public class accountService {
	private accountDao accdao;
	public accountService() {
		accdao = new accountDao();
	}
	public void unique() {
		accdao.uniqueAccount();
	}
	public void show() {
		accdao.display();
	}
	public void balanceAdd() {
		accdao.addBalance();
	}
	public void balanceRemove() {
		accdao.removeBalance();
	}
	public void updateAddress() {
		accdao.changeAddress();
	}
	public void Transactions() {
		accdao.totalTransactions();
	}
}
