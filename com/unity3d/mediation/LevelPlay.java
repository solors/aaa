package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C20527nk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlay {
    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    @Metadata
    /* loaded from: classes7.dex */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");
        
        @NotNull

        /* renamed from: a */
        private final String f74476a;

        AdFormat(String str) {
            this.f74476a = str;
        }

        @NotNull
        public final String getValue() {
            return this.f74476a;
        }
    }

    private LevelPlay() {
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest initRequest, @NotNull LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C20527nk.f52219a.m56144a(context, initRequest, listener);
    }
}
