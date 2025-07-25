package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: FunctionKeyMeta.kt */
@Target({ElementType.TYPE})
@ComposeCompilerApi
@Metadata
@Repeatable(Container.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface FunctionKeyMeta {

    /* compiled from: FunctionKeyMeta.kt */
    @Target({ElementType.TYPE})
    @Metadata
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Container {
        FunctionKeyMeta[] value();
    }

    int endOffset();

    int key();

    int startOffset();
}
