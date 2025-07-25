package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 */
/* loaded from: classes7.dex */
public final class C24573e0 {
    /* renamed from: a */
    public static final void m46124a(@NotNull Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("CLOSE_DELAY_SECONDS", i);
    }

    /* renamed from: b */
    public static final void m46123b(@NotNull Intent intent, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (bool != null) {
            bool.booleanValue();
            intent.putExtra("SKIP_ENABLED", bool.booleanValue());
        }
    }

    /* renamed from: c */
    public static final void m46122c(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_COMPLETE", z);
    }

    /* renamed from: d */
    public static final boolean m46121d(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false);
    }

    /* renamed from: e */
    public static final void m46120e(@NotNull Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("DEC_DELAY_SECONDS", i);
    }

    /* renamed from: f */
    public static final void m46119f(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("AUTO_STORE_ON_SKIP", z);
    }

    /* renamed from: g */
    public static final boolean m46118g(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
    }

    /* renamed from: h */
    public static final int m46117h(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("CLOSE_DELAY_SECONDS", 0);
    }

    /* renamed from: i */
    public static final void m46116i(@NotNull Intent intent, int i) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("SKIP_DELAY_SECONDS", i);
    }

    /* renamed from: j */
    public static final void m46115j(@NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        intent.putExtra("START_MUTED", z);
    }

    /* renamed from: k */
    public static final int m46114k(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("DEC_DELAY_SECONDS", 0);
    }

    @Nullable
    /* renamed from: l */
    public static final Boolean m46113l(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (intent.hasExtra("SKIP_ENABLED")) {
            return Boolean.valueOf(intent.getBooleanExtra("SKIP_ENABLED", false));
        }
        return null;
    }

    /* renamed from: m */
    public static final int m46112m(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getIntExtra("SKIP_DELAY_SECONDS", 0);
    }

    /* renamed from: n */
    public static final boolean m46111n(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        return intent.getBooleanExtra("START_MUTED", true);
    }
}
