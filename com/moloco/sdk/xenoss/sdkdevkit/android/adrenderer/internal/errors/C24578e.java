package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e */
/* loaded from: classes7.dex */
public final class C24578e {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C24579a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63416a;

        static {
            int[] iArr = new int[EnumC24577d.values().length];
            try {
                iArr[EnumC24577d.MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24577d.MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24577d.MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC24577d.MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC24577d.MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC24577d.MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC24577d.MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC24577d.MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f63416a = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static final EnumC24577d m46107a(@NotNull EnumC24577d enumC24577d) {
        Intrinsics.checkNotNullParameter(enumC24577d, "<this>");
        switch (C24579a.f63416a[enumC24577d.ordinal()]) {
            case 1:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR;
            case 2:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR;
            case 3:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR;
            case 4:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR;
            case 5:
                return EnumC24577d.MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR;
            case 6:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR;
            case 7:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR;
            case 8:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR;
            case 9:
                return EnumC24577d.MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return enumC24577d;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    /* renamed from: b */
    public static final EnumC24577d m46106b(@NotNull EnumC24577d enumC24577d) {
        Intrinsics.checkNotNullParameter(enumC24577d, "<this>");
        switch (C24579a.f63416a[enumC24577d.ordinal()]) {
            case 1:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR;
            case 2:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR;
            case 3:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR;
            case 4:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR;
            case 5:
                return EnumC24577d.MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return enumC24577d;
            case 11:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR;
            case 12:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR;
            case 13:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR;
            case 14:
                return EnumC24577d.MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
