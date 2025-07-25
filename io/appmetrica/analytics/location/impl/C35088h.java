package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* renamed from: io.appmetrica.analytics.location.impl.h */
/* loaded from: classes9.dex */
public final class C35088h implements Consumer {

    /* renamed from: a */
    public final C35093m f95727a;

    public C35088h(@NonNull C35093m c35093m) {
        this.f95727a = c35093m;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a */
    public final void consume(@Nullable Location location) {
        if (location != null) {
            this.f95727a.updateData(location);
        }
    }
}
