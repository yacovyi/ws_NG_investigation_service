package com.ws.ng.configuration;


import com.ws.ng.StatusService;
import com.ws.ng.providers.KafkaProducerCreator;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * Similar to Guice Module.
 * It holds all bindings that need to be injected.
 */
public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bindFactory(ConfigurationProvider.class).to(Config.class).in(Singleton.class);
        bind(KafkaProducerCreator.class).to(KafkaProducerCreator.class).in(Singleton.class);
        bind(StatusService.class).to(StatusService.class).in(Singleton.class);
    }
}
