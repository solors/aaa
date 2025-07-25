package androidx.compose.runtime.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class ThreadMapKt {
    @NotNull
    private static final ThreadMap emptyThreadMap = new ThreadMap(0, new long[0], new Object[0]);

    @NotNull
    public static final ThreadMap getEmptyThreadMap() {
        return emptyThreadMap;
    }
}
