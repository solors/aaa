package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ua */
/* loaded from: classes9.dex */
public final class C34932ua implements HostRetryInfoProvider {

    /* renamed from: a */
    public final C34858re f95460a;

    /* renamed from: b */
    public final EnumC34804pd f95461b;

    public C34932ua(@NotNull C34858re c34858re, @NotNull EnumC34804pd enumC34804pd) {
        this.f95460a = c34858re;
        this.f95461b = enumC34804pd;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f95460a.m21025a(this.f95461b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f95460a.m21026a(this.f95461b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.f95460a.m21020b(this.f95461b, j).m21149b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f95460a.m21021b(this.f95461b, i).m21149b();
    }
}
