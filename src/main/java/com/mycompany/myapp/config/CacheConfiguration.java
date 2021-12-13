package com.mycompany.myapp.config;

import io.github.jhipster.config.JHipsterProperties;
import java.time.Duration;
import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;
import org.hibernate.cache.jcache.ConfigSettings;
import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.boot.autoconfigure.orm.jpa.HibernatePropertiesCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
public class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        JHipsterProperties.Cache.Ehcache ehcache = jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration =
            Eh107Configuration.fromEhcacheCacheConfiguration(
                CacheConfigurationBuilder
                    .newCacheConfigurationBuilder(Object.class, Object.class, ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                    .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(ehcache.getTimeToLiveSeconds())))
                    .build()
            );
    }

    @Bean
    public HibernatePropertiesCustomizer hibernatePropertiesCustomizer(javax.cache.CacheManager cacheManager) {
        return hibernateProperties -> hibernateProperties.put(ConfigSettings.CACHE_MANAGER, cacheManager);
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            createCache(cm, com.mycompany.myapp.repository.UserRepository.USERS_BY_LOGIN_CACHE);
            createCache(cm, com.mycompany.myapp.repository.UserRepository.USERS_BY_EMAIL_CACHE);
            createCache(cm, com.mycompany.myapp.domain.User.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Authority.class.getName());
            createCache(cm, com.mycompany.myapp.domain.User.class.getName() + ".authorities");
            createCache(cm, com.mycompany.myapp.domain.Page.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Page.class.getName() + ".genericObjectsLists");
            createCache(cm, com.mycompany.myapp.domain.Page.class.getName() + ".flexBoxes");
            createCache(cm, com.mycompany.myapp.domain.Spacing.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Spacing.class.getName() + ".margins");
            createCache(cm, com.mycompany.myapp.domain.Spacing.class.getName() + ".paddings");
            createCache(cm, com.mycompany.myapp.domain.FlexBox.class.getName());
            createCache(cm, com.mycompany.myapp.domain.FlexBox.class.getName() + ".elements");
            createCache(cm, com.mycompany.myapp.domain.Attributes.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Elements.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Elements.class.getName() + ".elements");
            createCache(cm, com.mycompany.myapp.domain.Button.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Text.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Table.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Head.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Head.class.getName() + ".labels");
            createCache(cm, com.mycompany.myapp.domain.Label.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Label.class.getName() + ".objectContainingStrings");
            createCache(cm, com.mycompany.myapp.domain.Body.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Body.class.getName() + ".tabelValues");
            createCache(cm, com.mycompany.myapp.domain.TabelValues.class.getName());
            createCache(cm, com.mycompany.myapp.domain.TabelValues.class.getName() + ".objectContainingStrings");
            createCache(cm, com.mycompany.myapp.domain.TabelValues.class.getName() + ".displayAtts");
            createCache(cm, com.mycompany.myapp.domain.DisplayAtt.class.getName());
            createCache(cm, com.mycompany.myapp.domain.DisplayAtt.class.getName() + ".badgeTypes");
            createCache(cm, com.mycompany.myapp.domain.BadgeType.class.getName());
            createCache(cm, com.mycompany.myapp.domain.FormWrap.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Badge.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Icon.class.getName());
            createCache(cm, com.mycompany.myapp.domain.Image.class.getName());
            createCache(cm, com.mycompany.myapp.domain.ObjectContainingString.class.getName());
            // jhipster-needle-ehcache-add-entry
        };
    }

    private void createCache(javax.cache.CacheManager cm, String cacheName) {
        javax.cache.Cache<Object, Object> cache = cm.getCache(cacheName);
        if (cache == null) {
            cm.createCache(cacheName, jcacheConfiguration);
        }
    }
}
