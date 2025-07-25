package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xo0 {
    @Nullable

    /* renamed from: a */
    private final List<InterfaceC31780x> f87765a;
    @Nullable

    /* renamed from: b */
    private final FalseClick f87766b;
    @NotNull

    /* renamed from: c */
    private final List<String> f87767c;
    @Nullable

    /* renamed from: d */
    private final String f87768d;

    /* renamed from: e */
    private final long f87769e;

    /* JADX WARN: Multi-variable type inference failed */
    public xo0(@Nullable List<? extends InterfaceC31780x> list, @Nullable FalseClick falseClick, @NotNull List<String> trackingUrls, @Nullable String str, long j) {
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f87765a = list;
        this.f87766b = falseClick;
        this.f87767c = trackingUrls;
        this.f87768d = str;
        this.f87769e = j;
    }

    @Nullable
    /* renamed from: a */
    public final List<InterfaceC31780x> m27443a() {
        return this.f87765a;
    }

    /* renamed from: b */
    public final long m27442b() {
        return this.f87769e;
    }

    @Nullable
    /* renamed from: c */
    public final FalseClick m27441c() {
        return this.f87766b;
    }

    @NotNull
    /* renamed from: d */
    public final List<String> m27440d() {
        return this.f87767c;
    }

    @Nullable
    /* renamed from: e */
    public final String m27439e() {
        return this.f87768d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo0)) {
            return false;
        }
        xo0 xo0Var = (xo0) obj;
        if (Intrinsics.m17075f(this.f87765a, xo0Var.f87765a) && Intrinsics.m17075f(this.f87766b, xo0Var.f87766b) && Intrinsics.m17075f(this.f87767c, xo0Var.f87767c) && Intrinsics.m17075f(this.f87768d, xo0Var.f87768d) && this.f87769e == xo0Var.f87769e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        List<InterfaceC31780x> list = this.f87765a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        FalseClick falseClick = this.f87766b;
        if (falseClick == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = falseClick.hashCode();
        }
        int m30807a = C31097p9.m30807a(this.f87767c, (i2 + hashCode2) * 31, 31);
        String str = this.f87768d;
        if (str != null) {
            i = str.hashCode();
        }
        return Long.hashCode(this.f87769e) + ((m30807a + i) * 31);
    }

    @NotNull
    public final String toString() {
        List<InterfaceC31780x> list = this.f87765a;
        FalseClick falseClick = this.f87766b;
        List<String> list2 = this.f87767c;
        String str = this.f87768d;
        long j = this.f87769e;
        return "Link(actions=" + list + ", falseClick=" + falseClick + ", trackingUrls=" + list2 + ", url=" + str + ", clickableDelay=" + j + ")";
    }
}
