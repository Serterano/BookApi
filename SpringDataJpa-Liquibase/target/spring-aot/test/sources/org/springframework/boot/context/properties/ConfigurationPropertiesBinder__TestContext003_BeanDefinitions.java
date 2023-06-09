package org.springframework.boot.context.properties;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConfigurationPropertiesBinder}
 */
public class ConfigurationPropertiesBinder__TestContext003_BeanDefinitions {
  /**
   * Bean definitions for {@link ConfigurationPropertiesBinder.ConfigurationPropertiesBinderFactory}
   */
  public static class ConfigurationPropertiesBinderFactory__BeanDefinitions {
    /**
     * Get the bean definition for 'internalConfigurationPropertiesBinder'
     */
    public static BeanDefinition getInternalConfigurationPropertiesBinderBeanDefinition() {
      Class<?> beanType = ConfigurationPropertiesBinder.ConfigurationPropertiesBinderFactory.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
      beanDefinition.setInstanceSupplier(ConfigurationPropertiesBinder.ConfigurationPropertiesBinderFactory::new);
      return beanDefinition;
    }
  }
}
