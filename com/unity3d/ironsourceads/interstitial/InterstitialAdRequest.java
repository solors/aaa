package com.unity3d.ironsourceads.interstitial;

import android.os.Bundle;
import com.ironsource.C20710qm;
import com.ironsource.C21226xi;
import com.ironsource.InterfaceC20599oo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class InterstitialAdRequest {
    @NotNull

    /* renamed from: a */
    private final String f74454a;
    @NotNull

    /* renamed from: b */
    private final String f74455b;
    @Nullable

    /* renamed from: c */
    private final Bundle f74456c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC20599oo f74457d;
    @NotNull

    /* renamed from: e */
    private final String f74458e;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f74459a;
        @NotNull

        /* renamed from: b */
        private final String f74460b;
        @Nullable

        /* renamed from: c */
        private Bundle f74461c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f74459a = instanceId;
            this.f74460b = adm;
        }

        @NotNull
        public final InterstitialAdRequest build() {
            return new InterstitialAdRequest(this.f74459a, this.f74460b, this.f74461c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f74460b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f74459a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f74461c = extraParams;
            return this;
        }
    }

    private InterstitialAdRequest(String str, String str2, Bundle bundle) {
        this.f74454a = str;
        this.f74455b = str2;
        this.f74456c = bundle;
        this.f74457d = new C20710qm(str);
        String m54131b = C21226xi.m54131b();
        Intrinsics.checkNotNullExpressionValue(m54131b, "generateMultipleUniqueInstanceId()");
        this.f74458e = m54131b;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f74458e;
    }

    @NotNull
    public final String getAdm() {
        return this.f74455b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f74456c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74454a;
    }

    @NotNull
    public final InterfaceC20599oo getProviderName$mediationsdk_release() {
        return this.f74457d;
    }

    public /* synthetic */ InterstitialAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
