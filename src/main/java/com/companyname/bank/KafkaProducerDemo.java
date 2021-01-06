package com.companyname.bank;

import org.apache.kafka.clients.producer.KafkaProducer;

/**
 * @description: kafka-producer
 * @author:
 * @create: 2021-01-06 16:24
 **/
public class KafkaProducerDemo {
   private  int total =10000000;
   public static  void main (String[]args){
       new KafkaProducerDemo().send();
   }
   public void send(){
       //TODO 生产者
   }

}
