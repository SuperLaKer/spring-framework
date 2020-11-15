package com.slk.doInterfaceInstance;


import com.slk.doInterfaceInstance.DaoBeanFactory;
import com.slk.doInterfaceInstance.UserDao;
import com.slk.utils.StringUtils;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;



public class DaoImportRegistrar implements ImportBeanDefinitionRegistrar {

	// 模拟扫描出来的类
	private Class scanClass = UserDao.class;

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {

		// 创建userDao的bd
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(scanClass);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();

		// bd创建对象的时候，会new DaoBeanFactory()，然后给构造方法提供一个参数
		System.out.println(beanDefinition.getBeanClass());
		beanDefinition.setBeanClass(DaoBeanFactory.class);
		System.out.println(beanDefinition.getBeanClass());

		/*给BeanClass的构造方法参数设置值：顺序对应好*/
		// mybatis xml通过property标签赋值的
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(scanClass.getName());
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("haha");
		registry.registerBeanDefinition(StringUtils.FirstWordToLowerCase(scanClass.getSimpleName()), beanDefinition);
	}
}
