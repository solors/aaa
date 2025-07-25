package com.unity3d.ironsourceads.rewarded;

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
public final class RewardedAdRequest {
    @NotNull

    /* renamed from: a */
    private final String f74467a;
    @NotNull

    /* renamed from: b */
    private final String f74468b;
    @Nullable

    /* renamed from: c */
    private final Bundle f74469c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC20599oo f74470d;
    @NotNull

    /* renamed from: e */
    private final String f74471e;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f74472a;
        @NotNull

        /* renamed from: b */
        private final String f74473b;
        @Nullable

        /* renamed from: c */
        private Bundle f74474c;

        public Builder(@NotNull String instanceId, @NotNull String adm) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            this.f74472a = instanceId;
            this.f74473b = adm;
        }

        @NotNull
        public final RewardedAdRequest build() {
            return new RewardedAdRequest(this.f74472a, this.f74473b, this.f74474c, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f74473b;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f74472a;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f74474c = extraParams;
            return this;
        }
    }

    private RewardedAdRequest(String str, String str2, Bundle bundle) {
        this.f74467a = str;
        this.f74468b = str2;
        this.f74469c = bundle;
        this.f74470d = new C20710qm(str);
        String m54131b = C21226xi.m54131b();
        Intrinsics.checkNotNullExpressionValue(m54131b, "generateMultipleUniqueInstanceId()");
        this.f74471e = m54131b;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f74471e;
    }

    @NotNull
    public final String getAdm() {
        return this.f74468b;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f74469c;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74467a;
    }

    @NotNull
    public final InterfaceC20599oo getProviderName$mediationsdk_release() {
        return this.f74470d;
    }

    public /* synthetic */ RewardedAdRequest(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }
}
