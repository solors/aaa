package com.vungle.ads;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.c */
/* loaded from: classes7.dex */
public class AdConfig {
    public static final int AUTO_ROTATE = 2;
    @NotNull
    public static final C29117a Companion = new C29117a(null);
    public static final int IMMEDIATE_BACK = 2;
    public static final int LANDSCAPE = 1;
    public static final int PORTRAIT = 0;
    @NotNull
    private static final String WATERMARK = "WATERMARK";
    private int settings;
    @NotNull
    private Map<String, String> extras = new LinkedHashMap();
    private int adOrientation = 2;

    /* compiled from: AdConfig.kt */
    @Metadata
    /* renamed from: com.vungle.ads.c$a */
    /* loaded from: classes7.dex */
    public static final class C29117a {
        private C29117a() {
        }

        public /* synthetic */ C29117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getAdOrientation() {
        return this.adOrientation;
    }

    public final int getSettings() {
        return this.settings;
    }

    @Nullable
    public final String getWatermark$vungle_ads_release() {
        return this.extras.get(WATERMARK);
    }

    public final void setAdOrientation(int i) {
        this.adOrientation = i;
    }

    public final void setBackButtonImmediatelyEnabled(boolean z) {
        int i;
        if (z) {
            i = this.settings | 2;
        } else {
            i = this.settings & (-3);
        }
        this.settings = i;
    }

    public final void setWatermark(@NotNull String watermark) {
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.extras.put(WATERMARK, watermark);
    }

    public static /* synthetic */ void getAdOrientation$annotations() {
    }
}
