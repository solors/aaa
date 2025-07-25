package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ActualAndroid.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class Trace {
    @NotNull
    public static final Trace INSTANCE = new Trace();

    private Trace() {
    }

    @Nullable
    public final Object beginSection(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        android.os.Trace.beginSection(name);
        return null;
    }

    public final void endSection(@Nullable Object obj) {
        android.os.Trace.endSection();
    }
}
