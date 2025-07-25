package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b8 */
/* loaded from: classes8.dex */
public final class C29997b8 {
    @NotNull
    /* renamed from: a */
    public static RelativeLayout.LayoutParams m35576a(@NotNull Context context, @Nullable qu1 qu1Var) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        if (qu1Var != null) {
            layoutParams = new RelativeLayout.LayoutParams(cc2.m35261a(context, qu1Var.mo29651c(context)), cc2.m35261a(context, qu1Var.mo29653a(context)));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.widget.RelativeLayout.LayoutParams m35578a(@org.jetbrains.annotations.NotNull android.content.Context r10, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.ab0 r11) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r1 = "anchorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            r1 = 1103626240(0x41c80000, float:25.0)
            int r1 = com.yandex.mobile.ads.impl.cc2.m35261a(r10, r1)
            r2 = 1115684864(0x42800000, float:64.0)
            int r2 = com.yandex.mobile.ads.impl.cc2.m35261a(r10, r2)
            int r3 = r2 >> 1
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r2, r2)
            int r5 = r11.getId()
            r6 = 7
            r4.addRule(r6, r5)
            int r5 = r11.getId()
            r6 = 6
            r4.addRule(r6, r5)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            int r5 = r11.width
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L4b
            int r5 = r5 + r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            android.content.res.Resources r9 = r10.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r9 = r9.widthPixels
            if (r5 < r9) goto L49
            goto L4b
        L49:
            r5 = r6
            goto L4c
        L4b:
            r5 = r7
        L4c:
            int r11 = r11.height
            if (r11 == r8) goto L62
            int r11 = r11 + r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.heightPixels
            if (r11 < r10) goto L61
            goto L62
        L61:
            r7 = r6
        L62:
            int r10 = r1 >> 1
            int r2 = r2 - r1
            int r2 = r2 / 2
            int r10 = r10 - r2
            if (r5 != 0) goto L6e
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            int r10 = -r3
        L6e:
            r4.setMargins(r6, r10, r10, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C29997b8.m35578a(android.content.Context, com.yandex.mobile.ads.impl.ab0):android.widget.RelativeLayout$LayoutParams");
    }

    @NotNull
    /* renamed from: a */
    public static final RelativeLayout.LayoutParams m35577a(@NotNull Context context, @Nullable C30149d8<?> c30149d8) {
        RelativeLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(context, "context");
        if (c30149d8 != null) {
            layoutParams = new RelativeLayout.LayoutParams(cc2.m35261a(context, c30149d8.m35051r()), cc2.m35261a(context, c30149d8.m35066c()));
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.addRule(13);
        return layoutParams;
    }
}
