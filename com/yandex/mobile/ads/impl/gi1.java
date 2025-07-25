package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class gi1 implements tr0 {

    /* renamed from: a */
    private final float f79665a;
    @NotNull

    /* renamed from: b */
    private final tr0.C31476a f79666b;
    @NotNull

    /* renamed from: c */
    private final C30846mf f79667c;

    public gi1(float f) {
        this(f, new tr0.C31476a());
    }

    @Override // com.yandex.mobile.ads.impl.tr0
    @NotNull
    /* renamed from: a */
    public final tr0.C31476a mo27438a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int m32025a = this.f79667c.m32025a(size);
            if (mode2 == Integer.MIN_VALUE) {
                m32025a = (int) Math.min(size2, m32025a);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(m32025a, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int m32024b = this.f79667c.m32024b(size2);
            if (mode == Integer.MIN_VALUE) {
                m32024b = (int) Math.min(size, m32024b);
            }
            i = View.MeasureSpec.makeMeasureSpec(m32024b, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f79665a) {
                i = View.MeasureSpec.makeMeasureSpec(this.f79667c.m32024b(size2), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int m32025a2 = this.f79667c.m32025a(size);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(m32025a2, 1073741824);
                i = makeMeasureSpec;
            }
        }
        tr0.C31476a c31476a = this.f79666b;
        c31476a.f85812a = i;
        c31476a.f85813b = i2;
        return c31476a;
    }

    public /* synthetic */ gi1(float f, tr0.C31476a c31476a) {
        this(f, c31476a, new C30846mf(f));
    }

    public gi1(float f, @NotNull tr0.C31476a measureSpecHolder, @NotNull C30846mf aspectRatioResolver) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        Intrinsics.checkNotNullParameter(aspectRatioResolver, "aspectRatioResolver");
        this.f79665a = f;
        this.f79666b = measureSpecHolder;
        this.f79667c = aspectRatioResolver;
    }
}
