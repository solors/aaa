package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
@Metadata
/* loaded from: classes4.dex */
public final class ParametersBuilder {
    @NotNull

    /* renamed from: a */
    private final Bundle f42048a = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.f42048a;
    }

    public final void param(@NonNull String key, double d) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42048a.putDouble(key, d);
    }

    public final void param(@NonNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f42048a.putLong(key, j);
    }

    public final void param(@NonNull String key, @NonNull Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42048a.putBundle(key, value);
    }

    public final void param(@NonNull String key, @NonNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42048a.putString(key, value);
    }

    public final void param(@NonNull String key, @NonNull Bundle[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42048a.putParcelableArray(key, value);
    }
}
