package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public @interface RestrictedApi {
    String allowedOnPath() default "";

    Class<? extends Annotation>[] allowlistAnnotations() default {};

    Class<? extends Annotation>[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link();
}
