package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@InternalComposeTracingApi
@Metadata
/* loaded from: classes.dex */
public interface CompositionTracer {
    boolean isTraceInProgress();

    void traceEventEnd();

    void traceEventStart(int i, int i2, int i3, @NotNull String str);
}
