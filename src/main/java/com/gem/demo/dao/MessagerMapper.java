package com.gem.demo.dao;

import com.gem.demo.entity.Message;

import java.util.List;

public interface MessagerMapper {
    //根据类别号获得该类别下的所有问题
    public List<Message> getMessageByCatory(int catoryId);

    //根据问题号获得答案

    public String getAnswerById(int messaged);

}
