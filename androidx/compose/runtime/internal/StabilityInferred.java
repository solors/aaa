package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: StabilityInferred.kt */
@Target({ElementType.TYPE})
@ComposeCompilerApi
@Metadata
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface StabilityInferred {
    int parameters();
}
