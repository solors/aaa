package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.hu0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ou0 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f83610a;
    @NotNull

    /* renamed from: b */
    private final pu0 f83611b;

    /* renamed from: c */
    private boolean f83612c;

    /* renamed from: com.yandex.mobile.ads.impl.ou0$a */
    /* loaded from: classes8.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC31065a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        final /* synthetic */ CustomizableMediaView f83614b;

        /* renamed from: c */
        final /* synthetic */ hu0.EnumC30501a f83615c;

        ViewTreeObserver$OnPreDrawListenerC31065a(CustomizableMediaView customizableMediaView, hu0.EnumC30501a enumC30501a) {
            this.f83614b = customizableMediaView;
            this.f83615c = enumC30501a;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ou0.this.f83611b.m30585a(this.f83614b, this.f83615c.m33466a());
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ou0(android.content.Context r4, com.yandex.mobile.ads.impl.C30359g3 r5) {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.pu0 r0 = new com.yandex.mobile.ads.impl.pu0
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r2 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.<init>(r1, r5)
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ou0.<init>(android.content.Context, com.yandex.mobile.ads.impl.g3):void");
    }

    /* renamed from: a */
    public final void m30884a(@NotNull CustomizableMediaView mediaView, @NotNull hu0.EnumC30501a type) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f83612c) {
            if (this.f83610a.m33968b() == EnumC30803lr.f81897g) {
                cc2.m35256a(mediaView, new ViewTreeObserver$OnPreDrawListenerC31065a(mediaView, type));
            }
            this.f83612c = false;
        }
    }

    public ou0(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull pu0 mediaViewSizeInfoController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mediaViewSizeInfoController, "mediaViewSizeInfoController");
        this.f83610a = adConfiguration;
        this.f83611b = mediaViewSizeInfoController;
        this.f83612c = true;
    }
}
