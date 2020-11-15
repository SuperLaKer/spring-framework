package com.slk.anno;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(TheImportSelector.class)
public @interface MyEnableAop {
	boolean value();
}
