package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ck */
/* loaded from: classes8.dex */
public final class C30100ck {
    @NotNull

    /* renamed from: a */
    private final tv1 f77648a = new tv1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.yandex.mobile.ads.impl.sv1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Nullable
    /* renamed from: a */
    public final sv1 m35223a(@NotNull RectF viewSize, @NotNull bh0 imageValue) {
        List<sv1> m35751c;
        Intrinsics.checkNotNullParameter(viewSize, "viewRect");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        RectF imageSize = new RectF(0.0f, 0.0f, imageValue.m35469g(), imageValue.m35475a());
        aw1 m35471e = imageValue.m35471e();
        sv1 first = null;
        if (m35471e == null || (m35751c = m35471e.m35751c()) == null) {
            return null;
        }
        Iterator it = m35751c.iterator();
        if (it.hasNext()) {
            first = it.next();
            while (it.hasNext()) {
                sv1 second = (sv1) it.next();
                first = (sv1) first;
                this.f77648a.getClass();
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                Intrinsics.checkNotNullParameter(imageSize, "imageSize");
                Intrinsics.checkNotNullParameter(viewSize, "viewSize");
                float m27737a = wv1.m27737a(first, viewSize, imageSize);
                float m27737a2 = wv1.m27737a(second, viewSize, imageSize);
                if (m27737a != Float.MAX_VALUE) {
                    if (m27737a == m27737a2) {
                        if (first.m29528a() > second.m29528a()) {
                        }
                    } else if (m27737a > m27737a2) {
                    }
                }
                first = second;
            }
        }
        return first;
    }
}
