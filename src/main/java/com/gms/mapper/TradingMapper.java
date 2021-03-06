package com.gms.mapper;

import com.alibaba.fastjson.JSONObject;
import com.gms.entity.Trading;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Orion on 2020/6/9 13:24
 */
@Repository
public interface TradingMapper {
    //搜索所有交易
    @Select("select * from Trading")
    List<Trading> getAllTrading();

    //搜索所有未删除的交易
    @Select("select tradingId from Trading where isDelete=0")
    List<Integer> getAllTradingIdNotDelete();
    @Select("select * from Trading where isDelete=0")
    List<Trading> getAllTradingNotDelete();
    //搜索所有已删除的交易
    @Select("select tradingId from Trading where isDelete=1")
    List<Integer> getAllTradingIdDeleted();

    //根据订单号搜索交易
    @Select("select * from Trading where tradingId=#{tradingId} and isDelete=0")
    Trading getTradingByID(Trading trading);

    //根据用户ID搜索交易
    @Select("select tradingId from Trading where userId=#{userId} and isDelete=0")
    List<Integer> getTradingIdByUserId(Trading trading);

    //根据交易类型搜索交易
    @Select("select tradingId from Trading where tradingType=#{tradingType} and isDelete=0")
    List<Integer> getTradingIdByTradingType(Trading trading);

    //返回trading
    @Select("select * from Trading where tradingType=#{tradingType} and isDelete=0")
    List<Trading>  getTradingByTradingType(int tradingType);

    //根据交易时间搜索交易
    @Select("select tradingId from Trading where tradingTime>=#{minTime} and tradingTime<#{maxTime} and isDelete=0")
    List<Integer> getTradingIdByTradingTime(int minTime,int maxTime);


    //新增一条交易
    @Insert("insert into Trading(tradingId,userId,tradingType,tradingTime,counterParty,transactionAmount,tradingContent,isDelete) " +
            "values(#{tradingId},#{userId},#{tradingType},#{tradingTime},#{counterParty},#{transactionAmount},#{tradingContent},#{isDelete})")
    public int insertTrading(Trading trading);


    //删除一条交易
    @Update("update Trading set isDelete=1 where tradingId=#{tradingId}")
    public int deleteTrading(int tradingId);

    //修改一条交易
    @Update("update Trading set userId=#{userId},tradingType=#{tradingType},counterParty=#{counterParty},transactionAmount=#{transactionAmount},tradingContent=#{tradingContent}" +
            " where tradingId=#{tradingId}")
    public int changeTrading(Trading trading);


    //增加支付账单
    @Insert("insert into Payment(paymentUid,isPay) values(#{paymentUid},#{isPay})")
    public int insertPayment(String paymentUid,Boolean isPay);
    //查支付账单
    @Select("select isPay from Payment where paymentUid=#{paymentUid}")
    Boolean getIsPay(String paymentUid);
    //支付
    @Update("update Payment set isPay=1 where paymentUid=#{paymentUid}")
    public int pay(String paymentUid);
//    @Update("update Employee set Name=#{Name} where FileID=#{id}")
//    public int updateTrading(Trading trading);
}
