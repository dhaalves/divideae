package com.dhaalves.divideae;

import com.dhaalves.divideae.DivideAeApp;
import com.dhaalves.divideae.config.AsyncSyncConfiguration;
import com.dhaalves.divideae.config.EmbeddedElasticsearch;
import com.dhaalves.divideae.config.EmbeddedKafka;
import com.dhaalves.divideae.config.EmbeddedMongo;
import com.dhaalves.divideae.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { DivideAeApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
@EmbeddedKafka
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
