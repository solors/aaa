package com.pubmatic.sdk.webrendering.dsa;

import android.content.Context;
import com.pubmatic.sdk.common.utility.POBUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBDsaHtmlContent.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBDsaHtmlContent {
    @NotNull
    public static final POBDsaHtmlContent INSTANCE = new POBDsaHtmlContent();
    @Nullable

    /* renamed from: a */
    private static String f71132a;

    /* compiled from: POBDsaHtmlContent.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface OnContentListener {
        void onPageContentReceived(@NotNull String str);
    }

    private POBDsaHtmlContent() {
    }

    /* renamed from: a */
    public static final void m39927a(Context context, final POBDsaHtmlContent this_run, final OnContentListener listener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        final String readFromAssets = POBUtils.readFromAssets(context, "dsa_page.html");
        POBUtils.runOnMainThread(new Runnable() { // from class: com.pubmatic.sdk.webrendering.dsa.b
            @Override // java.lang.Runnable
            public final void run() {
                POBDsaHtmlContent.m39924c(readFromAssets, this_run, listener);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ void m39925b(Context context, POBDsaHtmlContent pOBDsaHtmlContent, OnContentListener onContentListener) {
        m39927a(context, pOBDsaHtmlContent, onContentListener);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39924c(String str, POBDsaHtmlContent pOBDsaHtmlContent, OnContentListener onContentListener) {
        m39926a(str, pOBDsaHtmlContent, onContentListener);
    }

    public static final void getHtmlContent(@NotNull final Context context, @NotNull final OnContentListener listener) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = f71132a;
        if (str != null) {
            listener.onPageContentReceived(str);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            final POBDsaHtmlContent pOBDsaHtmlContent = INSTANCE;
            POBUtils.runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.webrendering.dsa.a
                @Override // java.lang.Runnable
                public final void run() {
                    POBDsaHtmlContent.m39925b(context, pOBDsaHtmlContent, listener);
                }
            });
        }
    }

    /* renamed from: a */
    public static final void m39926a(String str, POBDsaHtmlContent this_run, OnContentListener listener) {
        Intrinsics.checkNotNullParameter(this_run, "$this_run");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        if (str != null) {
            f71132a = str;
            listener.onPageContentReceived(str);
        }
    }
}
