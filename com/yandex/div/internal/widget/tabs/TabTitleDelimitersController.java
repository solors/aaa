package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.internal.widget.tabs.q */
/* loaded from: classes8.dex */
public final class TabTitleDelimitersController {
    @NotNull

    /* renamed from: a */
    private final Context f76454a;
    @NotNull

    /* renamed from: b */
    private final BaseIndicatorTabLayout.OvalIndicators f76455b;
    @Nullable

    /* renamed from: c */
    private Bitmap f76456c;

    /* renamed from: d */
    private int f76457d;

    /* renamed from: e */
    private int f76458e;

    public TabTitleDelimitersController(@NotNull Context context, @NotNull BaseIndicatorTabLayout.OvalIndicators indicators) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.f76454a = context;
        this.f76455b = indicators;
    }

    /* renamed from: a */
    private final void m36060a() {
        m36057d();
        if (!m36058c()) {
            return;
        }
        int childCount = this.f76455b.getChildCount();
        for (int i = 1; i < childCount; i++) {
            this.f76455b.addView(m36059b(), (i * 2) - 1);
        }
        this.f76455b.m36158s(true);
    }

    /* renamed from: b */
    private final View m36059b() {
        ImageView imageView = new ImageView(this.f76454a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f76458e, this.f76457d);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.f76456c);
        return imageView;
    }

    /* renamed from: c */
    private final boolean m36058c() {
        if (this.f76456c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final void m36057d() {
        if (this.f76455b.m36165l()) {
            for (int childCount = this.f76455b.getChildCount() - 1; childCount > 0; childCount -= 2) {
                this.f76455b.removeViewAt(childCount);
            }
        }
        this.f76455b.m36158s(false);
    }

    /* renamed from: e */
    public final void m36056e(int i) {
        if (!m36058c() || this.f76455b.getChildCount() == 1) {
            return;
        }
        if (i == 0) {
            this.f76455b.addView(m36059b(), 1);
        } else {
            this.f76455b.addView(m36059b(), i);
        }
    }

    /* renamed from: f */
    public final void m36055f(int i) {
        if (!m36058c() || this.f76455b.getChildCount() == 0) {
            return;
        }
        if (i == 0) {
            this.f76455b.removeViewAt(0);
        } else {
            this.f76455b.removeViewAt(i - 1);
        }
    }

    /* renamed from: g */
    public final void m36054g(@NotNull Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f76456c = bitmap;
        this.f76457d = i2;
        this.f76458e = i;
        m36060a();
    }
}
