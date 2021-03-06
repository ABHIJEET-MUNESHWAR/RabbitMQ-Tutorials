package org.springframework.amqp.tutorials.tut1;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    23/08/17,
 * Time:    3:13 PM
 */
public class Tut1Sender {

  @Autowired
  private RabbitTemplate template;

  @Autowired
  private Queue queue;

  @Scheduled(fixedDelay = 1000, initialDelay = 500)
  public void send() {
    String message = "Hello World !";
    this.template.convertAndSend(queue.getName(), message);
    System.out.println(" [x] Sent: " + message);
  }
}
