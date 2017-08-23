package org.springframework.amqp.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    23/08/17,
 * Time:    2:37 PM
 */
public class RabbitAmqpTutorialsRunner implements CommandLineRunner {

  @Autowired
  ConfigurableApplicationContext ctx;
  @Value("${tutorial.client.duration:0}")
  private int duration;

  @Override
  public void run(String... strings) throws Exception {
    System.out.println("Ready ... running for " + duration + "ms");
    Thread.sleep(duration);
    ctx.close();
  }
}
