package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import com.yandex.mobile.ads.impl.C31006o0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class a60 {
    @NotNull

    /* renamed from: a */
    private final EnumC30803lr f76717a;

    /* renamed from: b */
    private final long f76718b;
    @NotNull

    /* renamed from: c */
    private final C31006o0.EnumC31007a f76719c;
    @Nullable

    /* renamed from: d */
    private final FalseClick f76720d;
    @NotNull

    /* renamed from: e */
    private final Map<String, Object> f76721e;
    @Nullable

    /* renamed from: f */
    private final C30280f f76722f;

    public a60(@NotNull EnumC30803lr adType, long j, @NotNull C31006o0.EnumC31007a activityInteractionType, @Nullable FalseClick falseClick, @NotNull Map<String, ? extends Object> reportData, @Nullable C30280f c30280f) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(activityInteractionType, "activityInteractionType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.f76717a = adType;
        this.f76718b = j;
        this.f76719c = activityInteractionType;
        this.f76720d = falseClick;
        this.f76721e = reportData;
        this.f76722f = c30280f;
    }

    @Nullable
    /* renamed from: a */
    public final C30280f m35963a() {
        return this.f76722f;
    }

    @NotNull
    /* renamed from: b */
    public final C31006o0.EnumC31007a m35962b() {
        return this.f76719c;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC30803lr m35961c() {
        return this.f76717a;
    }

    @Nullable
    /* renamed from: d */
    public final FalseClick m35960d() {
        return this.f76720d;
    }

    @NotNull
    /* renamed from: e */
    public final Map<String, Object> m35959e() {
        return this.f76721e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a60)) {
            return false;
        }
        a60 a60Var = (a60) obj;
        if (this.f76717a == a60Var.f76717a && this.f76718b == a60Var.f76718b && this.f76719c == a60Var.f76719c && Intrinsics.m17075f(this.f76720d, a60Var.f76720d) && Intrinsics.m17075f(this.f76721e, a60Var.f76721e) && Intrinsics.m17075f(this.f76722f, a60Var.f76722f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m35958f() {
        return this.f76718b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f76719c.hashCode() + ((Long.hashCode(this.f76718b) + (this.f76717a.hashCode() * 31)) * 31)) * 31;
        FalseClick falseClick = this.f76720d;
        int i = 0;
        if (falseClick == null) {
            hashCode = 0;
        } else {
            hashCode = falseClick.hashCode();
        }
        int hashCode3 = (this.f76721e.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        C30280f c30280f = this.f76722f;
        if (c30280f != null) {
            i = c30280f.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        EnumC30803lr enumC30803lr = this.f76717a;
        long j = this.f76718b;
        C31006o0.EnumC31007a enumC31007a = this.f76719c;
        FalseClick falseClick = this.f76720d;
        Map<String, Object> map = this.f76721e;
        C30280f c30280f = this.f76722f;
        return "FalseClickData(adType=" + enumC30803lr + ", startTime=" + j + ", activityInteractionType=" + enumC31007a + ", falseClick=" + falseClick + ", reportData=" + map + ", abExperiments=" + c30280f + ")";
    }
}
