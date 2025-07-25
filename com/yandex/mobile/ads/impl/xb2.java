package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class xb2 {
    @NotNull
    /* renamed from: a */
    public static final tb2 m27585a(@NotNull CustomizableMediaView customizableMediaView, @NotNull String mediaType) {
        Integer num;
        wr0 wr0Var;
        wr0 wr0Var2;
        Map m17281m;
        Intrinsics.checkNotNullParameter(customizableMediaView, "<this>");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        ViewGroup.LayoutParams layoutParams = customizableMediaView.getLayoutParams();
        Integer num2 = null;
        if (layoutParams != null) {
            num = Integer.valueOf(z22.m26466a(layoutParams.width));
        } else {
            num = null;
        }
        ViewGroup.LayoutParams layoutParams2 = customizableMediaView.getLayoutParams();
        if (layoutParams2 != null) {
            num2 = Integer.valueOf(z22.m26466a(layoutParams2.height));
        }
        int m26466a = z22.m26466a(View.MeasureSpec.getSize(customizableMediaView.getWidthMeasureSpec()));
        int m26466a2 = z22.m26466a(View.MeasureSpec.getSize(customizableMediaView.getHeightMeasureSpec()));
        int mode = View.MeasureSpec.getMode(customizableMediaView.getWidthMeasureSpec());
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    wr0Var = wr0.f87339d;
                } else {
                    wr0Var = wr0.f87337b;
                }
            } else {
                wr0Var = wr0.f87339d;
            }
        } else {
            wr0Var = wr0.f87338c;
        }
        int mode2 = View.MeasureSpec.getMode(customizableMediaView.getHeightMeasureSpec());
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    wr0Var2 = wr0.f87339d;
                } else {
                    wr0Var2 = wr0.f87337b;
                }
            } else {
                wr0Var2 = wr0.f87339d;
            }
        } else {
            wr0Var2 = wr0.f87338c;
        }
        int m26466a3 = z22.m26466a(customizableMediaView.getWidth());
        int m26466a4 = z22.m26466a(customizableMediaView.getHeight());
        m17281m = C37559r0.m17281m(C38513v.m14532a("asset", "media"), C38513v.m14532a("media_type", mediaType));
        return new tb2(new sb2(m26466a3, m26466a4), new po0(num, num2), new ur0(new vr0(m26466a, wr0Var), new vr0(m26466a2, wr0Var2)), m17281m);
    }
}
