package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

@Target({ElementType.TYPE})
@ComposeCompilerApi
@Metadata
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: androidx.compose.runtime.internal.LiveLiteralFileInfo */
/* loaded from: classes.dex */
public @interface LiveLiteral {
    String file();
}
