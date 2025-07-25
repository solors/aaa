package com.facebook.internal.qualityvalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ExcusesForDesignViolations.kt */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.SOURCE)
@Metadata
/* loaded from: classes4.dex */
public @interface ExcusesForDesignViolations {
    Excuse[] value();
}
