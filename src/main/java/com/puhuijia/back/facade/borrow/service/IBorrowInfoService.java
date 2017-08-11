package com.puhuijia.back.facade.borrow.service;


import net.sf.json.JSONObject;

/**
 * <p>Copyright © JinNuoFeng Network Technology Co.,Ltd.</p>
 * Created by Alan on 2017/8/8.
 */
public interface IBorrowInfoService {

    JSONObject getBorrowInfo(Integer borrowId) throws Exception;
}
