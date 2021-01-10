package com.companyname.bank;

//import com.ricky.codelab.kafka.util.PropertyUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.io.IOException;
import java.util.Properties;

/**
 * @description: kafka-producer
 * @author:
 * @create: 2021-01-06 16:24
 **/
public class KafkaProducerDemo {
   private int total = 10000000;

   public static void main(String[] args) {
      new KafkaProducerDemo().send();
   }

   public void send() {
      //TODO 生产者
      long start = System.currentTimeMillis();
      System.out.println("Kafka Producer send msg start,total msgs:" + total);
      // 启动生产者
      Producer<String, String> producer = null;
      try {
//         Properties props = PropertyUtils.load("producer_config.properties");
         producer = new KafkaProducer<String, String>(props);
         for (int i = 0; i < total; i++) {
            producer.send(new ProducerRecord<String, String>("hello",
                    String.valueOf(i), String.format("{\"type\":\"test\", \"t\":%d, \"k\":%d}", System.currentTimeMillis(), i)));

            // every so often send to a different topic
            if (i % 1000 == 0) {
               producer.send(new ProducerRecord<String, String>("test", String.format("{\"type\":\"marker\", \"t\":%d, \"k\":%d}", System.currentTimeMillis(), i)));
               producer.send(new ProducerRecord<String, String>("hello", String.format("{\"type\":\"marker\", \"t\":%d, \"k\":%d}", System.currentTimeMillis(), i)));

               producer.flush();
               System.out.println("Sent msg number " + i);
            }

         }
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         producer.close();
      }
      System.out.println("Kafka Producer send msg over,cost time:"+(System.currentTimeMillis()-start)+"ms");
   }
}
