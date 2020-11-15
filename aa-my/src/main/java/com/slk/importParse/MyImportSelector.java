package com.slk.importParse;

import com.slk.service.UserServiceForSelector;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	@NotNull
	@Override
	public String[] selectImports(@NotNull AnnotationMetadata importingClassMetadata) {
		// 根据这个字符串UserServiceForSelector.class.getName()，new了一个bd
		// 生成bean的名字也是这个
		// 貌似和@bean差不多
		return new String[]{UserServiceForSelector.class.getName()};
	}
}
