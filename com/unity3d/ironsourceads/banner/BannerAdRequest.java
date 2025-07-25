package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C20710qm;
import com.ironsource.C21226xi;
import com.ironsource.InterfaceC20599oo;
import com.unity3d.ironsourceads.AdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class BannerAdRequest {
    @NotNull

    /* renamed from: a */
    private final Context f74435a;
    @NotNull

    /* renamed from: b */
    private final String f74436b;
    @NotNull

    /* renamed from: c */
    private final String f74437c;
    @NotNull

    /* renamed from: d */
    private final AdSize f74438d;
    @Nullable

    /* renamed from: e */
    private final Bundle f74439e;
    @NotNull

    /* renamed from: f */
    private final InterfaceC20599oo f74440f;
    @NotNull

    /* renamed from: g */
    private final String f74441g;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final Context f74442a;
        @NotNull

        /* renamed from: b */
        private final String f74443b;
        @NotNull

        /* renamed from: c */
        private final String f74444c;
        @NotNull

        /* renamed from: d */
        private final AdSize f74445d;
        @Nullable

        /* renamed from: e */
        private Bundle f74446e;

        public Builder(@NotNull Context context, @NotNull String instanceId, @NotNull String adm, @NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(size, "size");
            this.f74442a = context;
            this.f74443b = instanceId;
            this.f74444c = adm;
            this.f74445d = size;
        }

        @NotNull
        public final BannerAdRequest build() {
            return new BannerAdRequest(this.f74442a, this.f74443b, this.f74444c, this.f74445d, this.f74446e, null);
        }

        @NotNull
        public final String getAdm() {
            return this.f74444c;
        }

        @NotNull
        public final Context getContext() {
            return this.f74442a;
        }

        @NotNull
        public final String getInstanceId() {
            return this.f74443b;
        }

        @NotNull
        public final AdSize getSize() {
            return this.f74445d;
        }

        @NotNull
        public final Builder withExtraParams(@NotNull Bundle extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            this.f74446e = extraParams;
            return this;
        }
    }

    private BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle) {
        this.f74435a = context;
        this.f74436b = str;
        this.f74437c = str2;
        this.f74438d = adSize;
        this.f74439e = bundle;
        this.f74440f = new C20710qm(str);
        String m54131b = C21226xi.m54131b();
        Intrinsics.checkNotNullExpressionValue(m54131b, "generateMultipleUniqueInstanceId()");
        this.f74441g = m54131b;
    }

    @NotNull
    public final String getAdId$mediationsdk_release() {
        return this.f74441g;
    }

    @NotNull
    public final String getAdm() {
        return this.f74437c;
    }

    @NotNull
    public final Context getContext() {
        return this.f74435a;
    }

    @Nullable
    public final Bundle getExtraParams() {
        return this.f74439e;
    }

    @NotNull
    public final String getInstanceId() {
        return this.f74436b;
    }

    @NotNull
    public final InterfaceC20599oo getProviderName$mediationsdk_release() {
        return this.f74440f;
    }

    @NotNull
    public final AdSize getSize() {
        return this.f74438d;
    }

    public /* synthetic */ BannerAdRequest(Context context, String str, String str2, AdSize adSize, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, adSize, bundle);
    }
}
