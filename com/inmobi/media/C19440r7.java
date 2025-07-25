package com.inmobi.media;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.r7 */
/* loaded from: classes6.dex */
public final class C19440r7 {

    /* renamed from: a */
    public boolean f48625a;

    /* renamed from: b */
    public final C19020M6 f48626b;

    /* renamed from: c */
    public final InterfaceC18850A4 f48627c;

    /* renamed from: d */
    public final String f48628d;

    /* renamed from: e */
    public final C19524x7 f48629e;

    public C19440r7(Context context, AdConfig adConfig, C19020M6 mNativeAdContainer, C19328j7 dataModel, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(mNativeAdContainer, "mNativeAdContainer");
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        this.f48626b = mNativeAdContainer;
        this.f48627c = interfaceC18850A4;
        this.f48628d = C19440r7.class.getSimpleName();
        C19524x7 c19524x7 = new C19524x7(context, adConfig, mNativeAdContainer, dataModel, new C19426q7(this), new C19412p7(this), this, interfaceC18850A4);
        this.f48629e = c19524x7;
        C19525x8 c19525x8 = c19524x7.f48893m;
        int i = mNativeAdContainer.f47470A;
        c19525x8.getClass();
        C19525x8.f48900f = i;
    }

    /* renamed from: a */
    public final C18895D7 m59917a(View view, ViewGroup parent, boolean z, GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9) {
        KeyEvent.Callback callback;
        C18895D7 c18895d7;
        InterfaceC18850A4 interfaceC18850A4;
        Intrinsics.checkNotNullParameter(parent, "parent");
        C18895D7 c18895d72 = null;
        if (view != null) {
            callback = view.findViewWithTag("InMobiAdView");
        } else {
            callback = null;
        }
        if (callback instanceof C18895D7) {
            c18895d72 = (C18895D7) callback;
        }
        if (z) {
            c18895d7 = this.f48629e.m59583a(c18895d72, parent, gestureDetector$OnGestureListenerC19100S9);
        } else {
            C19524x7 c19524x7 = this.f48629e;
            c19524x7.getClass();
            Intrinsics.checkNotNullParameter(parent, "parent");
            c19524x7.f48895o = gestureDetector$OnGestureListenerC19100S9;
            C18895D7 container = c19524x7.m59584a(c18895d72, parent);
            if (!c19524x7.f48894n) {
                C19216b7 root = c19524x7.f48883c.f48397f;
                if (container != null && root != null) {
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(root, "root");
                    c19524x7.m59578b((ViewGroup) container, root);
                }
            }
            c18895d7 = container;
        }
        if (c18895d72 == null && (interfaceC18850A4 = this.f48627c) != null) {
            String TAG = this.f48628d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((C18864B4) interfaceC18850A4).m61255b(TAG, "InMobiNative.getPrimaryView called with Non Native View.");
        }
        if (c18895d7 != null) {
            c18895d7.setNativeStrandAd(this.f48626b);
        }
        if (c18895d7 != null) {
            c18895d7.setTag("InMobiAdView");
        }
        return c18895d7;
    }
}
