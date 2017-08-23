package org.springframework.amqp.tutorials.tut1;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    23/08/17,
 * Time:    3:13 PM
 */

@RabbitListener(queues = "hello")
public class Tut1Receiver {

  @RabbitHandler
  public void receive(String in) {
    System.out.println(" [x] received: " + in);
  }
}
