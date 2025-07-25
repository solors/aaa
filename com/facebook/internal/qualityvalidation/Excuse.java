package com.facebook.internal.qualityvalidation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Excuse.kt */
@Target({})
@Retention(RetentionPolicy.SOURCE)
@Metadata
/* loaded from: classes4.dex */
public @interface Excuse {
    String reason();

    String type();
}
