package com.google.common.p384io;

import com.google.common.annotations.GwtCompatible;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@GwtCompatible
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.common.io.ParametricNullness */
/* loaded from: classes4.dex */
@interface ParametricNullness {
}
