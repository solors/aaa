package androidx.compose.runtime.internal;

import androidx.compose.runtime.ExperimentalComposeApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Decoy.kt */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Metadata
@Retention(RetentionPolicy.RUNTIME)
@ExperimentalComposeApi
/* loaded from: classes.dex */
public @interface Decoy {
    String[] signature();

    String targetName();
}
