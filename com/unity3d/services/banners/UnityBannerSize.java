package com.unity3d.services.banners;

import android.content.Context;
import be.MathJVM;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnityBannerSize.kt */
@Metadata
/* loaded from: classes7.dex */
public final class UnityBannerSize {
    private final int height;
    private final int width;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    @NotNull
    private static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    @NotNull
    private static final UnityBannerSize standard = new UnityBannerSize(320, 50);

    /* compiled from: UnityBannerSize.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UnityBannerSize getDynamicSize(@NotNull Context context) {
            int m103791d;
            Intrinsics.checkNotNullParameter(context, "context");
            m103791d = MathJVM.m103791d(ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (m103791d >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            if (m103791d >= getIabStandard().getWidth()) {
                return getIabStandard();
            }
            return getStandard();
        }

        @NotNull
        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        @NotNull
        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        @NotNull
        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    @NotNull
    public static final UnityBannerSize getDynamicSize(@NotNull Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
