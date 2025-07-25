package com.google.common.reflect;

import com.google.common.annotations.GwtCompatible;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@GwtCompatible
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
@interface ElementTypesAreNonnullByDefault {
}
