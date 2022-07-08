package com.mishinyura.booksrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class AppRunner.
 * Implements Application runner.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 08.07.2022
 */
@SpringBootApplication
public class AppRunner {
    /**
     * The entry point of a Java application.
     *
     * @param args Args
     */
    public static void main(final String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }

}
