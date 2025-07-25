package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class xv1 implements View.OnLayoutChangeListener {
    @NotNull

    /* renamed from: a */
    private final C31752wh f87855a;
    @NotNull

    /* renamed from: b */
    private final C30100ck f87856b;
    @NotNull

    /* renamed from: c */
    private final yv1 f87857c;
    @NotNull

    /* renamed from: d */
    private final bh0 f87858d;
    @NotNull

    /* renamed from: e */
    private final Bitmap f87859e;

    public xv1(@NotNull C31752wh axisBackgroundColorProvider, @NotNull C30100ck bestSmartCenterProvider, @NotNull yv1 smartCenterMatrixScaler, @NotNull bh0 imageValue, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(axisBackgroundColorProvider, "axisBackgroundColorProvider");
        Intrinsics.checkNotNullParameter(bestSmartCenterProvider, "bestSmartCenterProvider");
        Intrinsics.checkNotNullParameter(smartCenterMatrixScaler, "smartCenterMatrixScaler");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f87855a = axisBackgroundColorProvider;
        this.f87856b = bestSmartCenterProvider;
        this.f87857c = smartCenterMatrixScaler;
        this.f87858d = imageValue;
        this.f87859e = bitmap;
    }

    /* renamed from: a */
    public static final void m27207a(xv1 this$0, RectF viewRect, ImageView view) {
        C31896yh m35753a;
        boolean z;
        sv1 m35752b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewRect, "$viewRect");
        Intrinsics.checkNotNullParameter(view, "$view");
        this$0.getClass();
        if (viewRect.height() != 0.0f) {
            C31752wh c31752wh = this$0.f87855a;
            bh0 imageValue = this$0.f87858d;
            c31752wh.getClass();
            Intrinsics.checkNotNullParameter(imageValue, "imageValue");
            aw1 m35471e = imageValue.m35471e();
            if (m35471e != null && (m35753a = m35471e.m35753a()) != null) {
                boolean z2 = true;
                if (m35753a.m26912a() != null && m35753a.m26909d() != null && Intrinsics.m17075f(m35753a.m26912a(), m35753a.m26909d())) {
                    z = true;
                } else {
                    z = false;
                }
                if (m35753a.m26911b() == null || m35753a.m26910c() == null || !Intrinsics.m17075f(m35753a.m26911b(), m35753a.m26910c())) {
                    z2 = false;
                }
                if (z || z2) {
                    C31752wh c31752wh2 = this$0.f87855a;
                    bh0 bh0Var = this$0.f87858d;
                    c31752wh2.getClass();
                    String m27901a = C31752wh.m27901a(viewRect, bh0Var);
                    aw1 m35471e2 = this$0.f87858d.m35471e();
                    if (m35471e2 != null && (m35752b = m35471e2.m35752b()) != null) {
                        if (m27901a != null) {
                            this$0.f87857c.m26560a(view, this$0.f87859e, m35752b, m27901a);
                            return;
                        } else {
                            this$0.f87857c.m26561a(view, this$0.f87859e, m35752b);
                            return;
                        }
                    }
                    return;
                }
            }
            sv1 m35223a = this$0.f87856b.m35223a(viewRect, this$0.f87858d);
            if (m35223a != null) {
                this$0.f87857c.m26561a(view, this$0.f87859e, m35223a);
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(@Nullable View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        final ImageView imageView;
        boolean z;
        if (view instanceof ImageView) {
            imageView = (ImageView) view;
        } else {
            imageView = null;
        }
        if (imageView == null) {
            return;
        }
        int i9 = i7 - i5;
        boolean z2 = false;
        if (i3 - i == i9 && i4 - i2 == i8 - i6) {
            z = false;
        } else {
            z = true;
        }
        if (i4 != i2 && i != i3) {
            z2 = true;
        }
        if (z && z2) {
            final RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            imageView.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.x03
                {
                    xv1.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    xv1.m27207a(xv1.this, rectF, imageView);
                }
            });
        }
    }
}
