package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class x00 implements InterfaceC30466hj {
    @NotNull

    /* renamed from: a */
    private final String f87451a;
    @NotNull

    /* renamed from: b */
    private final h10 f87452b;
    @NotNull

    /* renamed from: c */
    private final List<String> f87453c;

    public x00(@NotNull String actionType, @NotNull h10 design, @NotNull ArrayList trackingUrls) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        this.f87451a = actionType;
        this.f87452b = design;
        this.f87453c = trackingUrls;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f87451a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30466hj
    @NotNull
    /* renamed from: b */
    public final List<String> mo27603b() {
        return this.f87453c;
    }

    @NotNull
    /* renamed from: c */
    public final h10 m27715c() {
        return this.f87452b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        if (Intrinsics.m17075f(this.f87451a, x00Var.f87451a) && Intrinsics.m17075f(this.f87452b, x00Var.f87452b) && Intrinsics.m17075f(this.f87453c, x00Var.f87453c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f87452b.hashCode();
        return this.f87453c.hashCode() + ((hashCode + (this.f87451a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f87451a;
        h10 h10Var = this.f87452b;
        List<String> list = this.f87453c;
        return "DivKitAdtuneAction(actionType=" + str + ", design=" + h10Var + ", trackingUrls=" + list + ")";
    }
}
