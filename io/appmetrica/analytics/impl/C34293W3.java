package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.W3 */
/* loaded from: classes9.dex */
public final class C34293W3 extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final C34858re f93631a;

    public C34293W3(@NotNull C34858re c34858re) {
        super(c34858re.m21012e(), "[ClientApiTrackingStatusToggle]");
        this.f93631a = c34858re;
    }

    /* renamed from: a */
    public final void m22143a(boolean z) {
        updateState(z);
        this.f93631a.m21013d(z);
    }
}
