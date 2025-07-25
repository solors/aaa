package androidx.compose.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: ComposableInferredTarget.kt */
@Target({ElementType.METHOD})
@Metadata
@InternalComposeApi
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface ComposableInferredTarget {
    String scheme();
}
