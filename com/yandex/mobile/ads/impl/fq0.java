package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class fq0 {
    @NotNull

    /* renamed from: a */
    private final dq0 f79279a;
    @NotNull

    /* renamed from: b */
    private final vc1 f79280b;
    @Nullable

    /* renamed from: c */
    private eq0 f79281c;

    public /* synthetic */ fq0(Context context, String str) {
        this(context, str, new dq0(context, str), new vc1(context), null);
    }

    /* renamed from: a */
    private final eq0 m34101a() {
        sb0 m34872a = this.f79279a.m34872a();
        if (m34872a != null) {
            boolean m28369a = this.f79280b.m28369a();
            boolean m28368b = this.f79280b.m28368b();
            if (m28369a || m28368b) {
                return m34872a.m29655a();
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final eq0 m34100b() {
        eq0 eq0Var = this.f79281c;
        if (eq0Var == null) {
            return m34101a();
        }
        return eq0Var;
    }

    /* renamed from: c */
    public final void m34099c() {
        this.f79281c = m34101a();
        this.f79281c = m34101a();
    }

    public fq0(@NotNull Context context, @NotNull String locationServicesClassName, @NotNull dq0 locationServices, @NotNull vc1 permissionExtractor, @Nullable eq0 eq0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationServicesClassName, "locationServicesClassName");
        Intrinsics.checkNotNullParameter(locationServices, "locationServices");
        Intrinsics.checkNotNullParameter(permissionExtractor, "permissionExtractor");
        this.f79279a = locationServices;
        this.f79280b = permissionExtractor;
        this.f79281c = eq0Var;
    }
}
