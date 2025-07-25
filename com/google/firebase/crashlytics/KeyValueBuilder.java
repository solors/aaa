package com.google.firebase.crashlytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: KeyValueBuilder.kt */
@Metadata
/* loaded from: classes4.dex */
public final class KeyValueBuilder {
    @NotNull

    /* renamed from: a */
    private final FirebaseCrashlytics f42254a;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.f42254a = crashlytics;
    }

    public final void key(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42254a.setCustomKey(key, z);
    }

    public final void key(@NotNull String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42254a.setCustomKey(key, d);
    }

    public final void key(@NotNull String key, float f) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42254a.setCustomKey(key, f);
    }

    public final void key(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42254a.setCustomKey(key, i);
    }

    public final void key(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42254a.setCustomKey(key, j);
    }

    public final void key(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42254a.setCustomKey(key, value);
    }
}
