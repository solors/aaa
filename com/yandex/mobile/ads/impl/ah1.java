package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import be.MathJVM;
import java.util.Iterator;
import kotlin.collections.PrimitiveIterators;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import p850qd._ComparisonsJvm;

/* loaded from: classes8.dex */
public final class ah1 {
    @NotNull

    /* renamed from: a */
    private final C30031bk f76789a;

    public /* synthetic */ ah1() {
        this(new C30031bk());
    }

    @NotNull
    /* renamed from: a */
    public final Bitmap m35870a(@NotNull Bitmap bitmap, @NotNull bh0 imageValue) {
        Comparable m12773i;
        int m103792c;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && imageValue.m35469g() != 0 && imageValue.m35475a() != 0) {
            if (imageValue.m35475a() * bitmap.getWidth() == bitmap.getHeight() * imageValue.m35469g()) {
                return bitmap;
            }
            this.f76789a.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(imageValue, "imageValue");
            pu1 size = new pu1(bitmap.getWidth(), bitmap.getHeight());
            if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && imageValue.m35469g() != 0 && imageValue.m35475a() != 0) {
                Iterator<Integer> it = new PrimitiveRanges(bitmap.getWidth(), Math.max(bitmap.getWidth(), Math.min(100, (imageValue.m35469g() * 100) / imageValue.m35475a()))).iterator();
                double d = 1.0d;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    int nextInt = ((PrimitiveIterators) it).nextInt();
                    if ((imageValue.m35475a() * nextInt) % imageValue.m35469g() == 0) {
                        size = new pu1(nextInt, (imageValue.m35475a() * nextInt) / imageValue.m35469g());
                        break;
                    }
                    double m35475a = (imageValue.m35475a() * nextInt) / imageValue.m35469g();
                    m103792c = MathJVM.m103792c(m35475a);
                    double abs = Math.abs(m103792c - m35475a) / m35475a;
                    if (abs < d) {
                        size = new pu1(nextInt, m103792c);
                        d = abs;
                    }
                }
            }
            pu1 pu1Var = new pu1(bitmap.getWidth(), bitmap.getHeight());
            Intrinsics.checkNotNullParameter(pu1Var, "<this>");
            Intrinsics.checkNotNullParameter(size, "size");
            int m30581b = size.m30581b();
            m12773i = _ComparisonsJvm.m12773i(new pu1(size.m30581b(), (pu1Var.m30582a() * m30581b) / pu1Var.m30581b()), new pu1((pu1Var.m30581b() * size.m30582a()) / pu1Var.m30582a(), size.m30582a()));
            pu1 pu1Var2 = (pu1) m12773i;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, pu1Var2.m30581b(), pu1Var2.m30582a(), false);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (createScaledBitmap.getWidth() - size.m30581b()) / 2, (createScaledBitmap.getHeight() - size.m30582a()) / 2, size.m30581b(), size.m30582a(), (Matrix) null, false);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            return createBitmap;
        }
        return bitmap;
    }

    public ah1(@NotNull C30031bk bestSizeForScalePreviewCalculator) {
        Intrinsics.checkNotNullParameter(bestSizeForScalePreviewCalculator, "bestSizeForScalePreviewCalculator");
        this.f76789a = bestSizeForScalePreviewCalculator;
    }
}
