package com.promineotech.blockbuster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.promineotech.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class })
public class Blockbuster {

  public static void main(String[] args) {
    SpringApplication.run(Blockbuster.class, args);

  }

}
