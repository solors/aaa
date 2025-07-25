package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ve */
/* loaded from: classes9.dex */
public final class C34962ve implements InterfaceC34106O7 {
    @NonNull

    /* renamed from: a */
    public final C33969Ie f95517a;
    @NonNull

    /* renamed from: b */
    public final List<C34936ue> f95518b;

    public C34962ve(@NonNull C33969Ie c33969Ie, @NonNull List<C34936ue> list) {
        this.f95517a = c33969Ie;
        this.f95518b = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34106O7
    @NonNull
    /* renamed from: a */
    public final List<C34936ue> mo20868a() {
        return this.f95518b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34106O7
    @Nullable
    /* renamed from: b */
    public final Object mo20867b() {
        return this.f95517a;
    }

    @Nullable
    /* renamed from: c */
    public final C33969Ie m20866c() {
        return this.f95517a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f95517a + ", candidates=" + this.f95518b + '}';
    }
}
