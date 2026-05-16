package dev.all_things.boot.autoconfigure.cache.hazelcast;

import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

/**
 * Provides autoconfiguration for Hazelcast.
 */
@AutoConfiguration
@Import(HazelcastConfiguration.class)
@ConditionalOnClass(value = { HazelcastInstance.class })
@EnableConfigurationProperties(HazelcastProperties.class)
public class HazelcastAutoConfiguration
{
}
