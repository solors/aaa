package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.vw */
/* loaded from: classes8.dex */
public final class C31691vw {
    @Nullable

    /* renamed from: a */
    private final C31691vw f86896a;
    @NotNull

    /* renamed from: b */
    private final AbstractC31685vv f86897b;

    /* renamed from: c */
    private final boolean f86898c;
    @NotNull

    /* renamed from: d */
    private final List<AbstractC31846xw> f86899d;

    /* JADX WARN: Multi-variable type inference failed */
    public C31691vw(@Nullable C31691vw c31691vw, @NotNull AbstractC31685vv destination, boolean z, @NotNull List<? extends AbstractC31846xw> uiData) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.f86896a = c31691vw;
        this.f86897b = destination;
        this.f86898c = z;
        this.f86899d = uiData;
    }

    /* renamed from: a */
    public static C31691vw m28207a(C31691vw c31691vw, C31691vw c31691vw2, AbstractC31685vv destination, boolean z, List uiData, int i) {
        if ((i & 1) != 0) {
            c31691vw2 = c31691vw.f86896a;
        }
        if ((i & 2) != 0) {
            destination = c31691vw.f86897b;
        }
        if ((i & 4) != 0) {
            z = c31691vw.f86898c;
        }
        if ((i & 8) != 0) {
            uiData = c31691vw.f86899d;
        }
        c31691vw.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new C31691vw(c31691vw2, destination, z, uiData);
    }

    @Nullable
    /* renamed from: b */
    public final C31691vw m28206b() {
        return this.f86896a;
    }

    @NotNull
    /* renamed from: c */
    public final List<AbstractC31846xw> m28205c() {
        return this.f86899d;
    }

    /* renamed from: d */
    public final boolean m28204d() {
        return this.f86898c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31691vw)) {
            return false;
        }
        C31691vw c31691vw = (C31691vw) obj;
        if (Intrinsics.m17075f(this.f86896a, c31691vw.f86896a) && Intrinsics.m17075f(this.f86897b, c31691vw.f86897b) && this.f86898c == c31691vw.f86898c && Intrinsics.m17075f(this.f86899d, c31691vw.f86899d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        C31691vw c31691vw = this.f86896a;
        if (c31691vw == null) {
            hashCode = 0;
        } else {
            hashCode = c31691vw.hashCode();
        }
        int hashCode2 = this.f86897b.hashCode();
        return this.f86899d.hashCode() + C31331s6.m29848a(this.f86898c, (hashCode2 + (hashCode * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        C31691vw c31691vw = this.f86896a;
        AbstractC31685vv abstractC31685vv = this.f86897b;
        boolean z = this.f86898c;
        List<AbstractC31846xw> list = this.f86899d;
        return "DebugPanelUiState(prevState=" + c31691vw + ", destination=" + abstractC31685vv + ", isLoading=" + z + ", uiData=" + list + ")";
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC31685vv m28208a() {
        return this.f86897b;
    }
}
