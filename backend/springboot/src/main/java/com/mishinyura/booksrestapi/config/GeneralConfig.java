package com.mishinyura.booksrestapi.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Class GeneralConfig.
 * Implements General Configuration for Spring Application.
 *
 * @author Mishin Yura (mishin.inbox@gmail.com)
 * @since 08.07.2022
 */
@Configuration
public class GeneralConfig {
    /**
     * @return ModelMapper
     */
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
