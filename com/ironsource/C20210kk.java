package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.kk */
/* loaded from: classes6.dex */
public final class C20210kk {
    @NotNull

    /* renamed from: a */
    private final C20279lk f50851a;

    @Metadata
    /* renamed from: com.ironsource.kk$a */
    /* loaded from: classes6.dex */
    public static final class C20211a {
        @NotNull

        /* renamed from: a */
        private C20210kk f50852a = new C20210kk(null);

        @NotNull
        /* renamed from: a */
        public final C20211a m57632a(@Nullable InterfaceC20475mk interfaceC20475mk) {
            this.f50852a.m57637a(interfaceC20475mk);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20211a m57631a(@NotNull String adUnitId) {
            Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
            this.f50852a.m57636a(adUnitId);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C20210kk m57633a() {
            return this.f50852a;
        }
    }

    private C20210kk() {
        this.f50851a = new C20279lk(this);
    }

    @NotNull
    /* renamed from: a */
    public final String m57643a() {
        return this.f50851a.m54125b();
    }

    /* renamed from: b */
    public final boolean m57635b() {
        return this.f50851a.m57406e();
    }

    /* renamed from: c */
    public final void m57634c() {
        this.f50851a.m57404f();
    }

    public /* synthetic */ C20210kk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final void m57642a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        m57640a(this, activity, null, 2, null);
    }

    /* renamed from: a */
    public final void m57641a(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f50851a.m57429a(activity, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m57640a(C20210kk c20210kk, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c20210kk.m57641a(activity, str);
    }

    /* renamed from: a */
    public final void m57638a(@Nullable ImpressionDataListener impressionDataListener) {
        this.f50851a.m57422a(impressionDataListener);
    }

    /* renamed from: a */
    public final void m57637a(@Nullable InterfaceC20475mk interfaceC20475mk) {
        this.f50851a.m57416a(interfaceC20475mk);
    }

    /* renamed from: a */
    public final void m57636a(String str) {
        this.f50851a.m54127a(str);
    }
}
