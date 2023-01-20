package com.tpe.service;

import com.tpe.domain.Message;

public class WhatsAppService implements MessageService {

    public void sendMessage(Message message){
        System.out.println("Ben WhatsApp Servisiyim, size mesaj gonderiyorum: "+message.getMessage());
    }

}
