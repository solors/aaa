package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h */
/* loaded from: classes7.dex */
public final class C24582h {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C24583a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63428a;

        static {
            int[] iArr = new int[EnumC24581g.values().length];
            try {
                iArr[EnumC24581g.STATIC_AD_UNKNOWN_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24581g.STATIC_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24581g.STATIC_AD_WEBVIEW_RECEIVED_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24581g.STATIC_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f63428a = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final EnumC24584i m46103a(@NotNull EnumC24581g enumC24581g) {
        Intrinsics.checkNotNullParameter(enumC24581g, "<this>");
        int i = C24583a.f63428a[enumC24581g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC24584i.STATIC_BANNER_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return EnumC24584i.STATIC_BANNER_AD_WEBVIEW_RECEIVED_ERROR;
            }
            return EnumC24584i.STATIC_BANNER_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR;
        }
        return EnumC24584i.STATIC_BANNER_AD_UNKNOWN_ERROR;
    }

    @NotNull
    /* renamed from: b */
    public static final EnumC24585j m46102b(@NotNull EnumC24581g enumC24581g) {
        Intrinsics.checkNotNullParameter(enumC24581g, "<this>");
        int i = C24583a.f63428a[enumC24581g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return EnumC24585j.STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return EnumC24585j.STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR;
            }
            return EnumC24585j.STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR;
        }
        return EnumC24585j.STATIC_FULLSCREEN_AD_UNKNOWN_ERROR;
    }
}
