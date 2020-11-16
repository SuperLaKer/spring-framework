package com.slk.selectors;

import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class UserServiceSelector implements ImportSelector {
	@NotNull
	@Override
	public String[] selectImports(@NotNull AnnotationMetadata importingClassMetadata) {
		return new String[]{UserServiceBySelector.class.getName()};
	}
}
