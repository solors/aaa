package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.eb */
/* loaded from: classes8.dex */
public final class C30227eb implements tr0 {

    /* renamed from: a */
    private final boolean f78499a;
    @NotNull

    /* renamed from: b */
    private final C31778wz f78500b;
    @NotNull

    /* renamed from: c */
    private final C32027zz f78501c;

    /* renamed from: d */
    private final Context f78502d;

    public /* synthetic */ C30227eb(Context context, boolean z, int i) {
        this(context, (i & 2) != 0 ? false : z, new C31778wz(), new C32027zz());
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            Context context = this.f78502d;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            int i3 = cc2.f77597b;
            Intrinsics.checkNotNullParameter(context, "context");
            int i4 = context.getResources().getDisplayMetrics().widthPixels;
            C32027zz c32027zz = this.f78501c;
            Context context2 = this.f78502d;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            c32027zz.getClass();
            int m25947a = C32027zz.m25947a(context2, 420.0f);
            int i5 = this.f78502d.getResources().getConfiguration().orientation;
            C31778wz c31778wz = this.f78500b;
            Context context3 = this.f78502d;
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            if (c31778wz.m27724a(context3) != EnumC31709vz.f87041b || i5 != 1) {
                i4 = (int) Math.min(i4, m25947a);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(i4, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z = this.f78499a;
            Context context4 = this.f78502d;
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            int i6 = cc2.f77597b;
            Intrinsics.checkNotNullParameter(context4, "context");
            int i7 = context4.getResources().getDisplayMetrics().heightPixels;
            C32027zz c32027zz2 = this.f78501c;
            Context context5 = this.f78502d;
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            c32027zz2.getClass();
            int m25947a2 = C32027zz.m25947a(context5, 350.0f);
            if (!z) {
                i7 = (int) Math.min(i7, m25947a2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) Math.min(i7, size2), 1073741824);
        }
        tr0.C31476a c31476a = new tr0.C31476a();
        c31476a.f85813b = i2;
        c31476a.f85812a = i;
        return c31476a;
    }

    public C30227eb(@NotNull Context context, boolean z, @NotNull C31778wz deviceTypeProvider, @NotNull C32027zz dimensionConverter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(deviceTypeProvider, "deviceTypeProvider");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f78499a = z;
        this.f78500b = deviceTypeProvider;
        this.f78501c = dimensionConverter;
        this.f78502d = context.getApplicationContext();
    }
}
