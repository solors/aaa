package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.C20640pi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class IronSourceAds {
    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    @Metadata
    /* loaded from: classes7.dex */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");
        
        @NotNull

        /* renamed from: a */
        private final String f74430a;

        AdFormat(String str) {
            this.f74430a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f74430a;
        }
    }

    private IronSourceAds() {
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        C20640pi.f52419a.m55802a(context, initRequest, initializationListener);
    }
}
