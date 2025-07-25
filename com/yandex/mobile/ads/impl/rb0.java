package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rb0 implements aq0 {
    @NotNull

    /* renamed from: a */
    private final fq0 f84694a;
    @NotNull

    /* renamed from: b */
    private final Object f84695b;

    public /* synthetic */ rb0(Context context, String str) {
        this(context, str, new fq0(context, str));
    }

    @Override // com.yandex.mobile.ads.impl.aq0
    @Nullable
    /* renamed from: a */
    public final Location mo30087a() {
        Location location;
        synchronized (this.f84695b) {
            eq0 m34100b = this.f84694a.m34100b();
            if (m34100b != null && m34100b.m34470b()) {
                location = m34100b.m34471a();
                this.f84694a.m34099c();
            } else {
                location = null;
            }
        }
        return location;
    }

    public rb0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull fq0 locationTaskManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationTaskManager, "locationTaskManager");
        this.f84694a = locationTaskManager;
        this.f84695b = new Object();
    }
}
