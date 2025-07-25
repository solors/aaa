package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yv1 {
    @NotNull

    /* renamed from: a */
    private final uv1 f88570a = new uv1();
    @NotNull

    /* renamed from: b */
    private final Matrix f88571b = new Matrix();
    @NotNull

    /* renamed from: c */
    private final Paint f88572c;
    @NotNull

    /* renamed from: d */
    private final Rect f88573d;

    public yv1() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f88572c = paint;
        this.f88573d = new Rect();
    }

    /* renamed from: a */
    public final void m26561a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull sv1 smartCenter) {
        float m29526c;
        Float valueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float f = 0.0f;
        Float valueOf2 = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z = width / height > width2 / height2;
        float f2 = z ? width / width2 : height / height2;
        float f3 = width2 * f2;
        float f4 = height2 * f2;
        if (z) {
            m29526c = 0.0f;
        } else {
            m29526c = (width / 2) - (((smartCenter.m29526c() / 2) + smartCenter.m29525d()) * f2);
            if (m29526c > 0.0f) {
                valueOf = valueOf2;
            } else {
                valueOf = m29526c + f3 < width ? Float.valueOf(width - f3) : null;
            }
            if (valueOf != null) {
                m29526c = valueOf.floatValue();
            }
        }
        if (z) {
            float m29527b = (height / 2) - (((smartCenter.m29527b() / 2) + smartCenter.m29524e()) * f2);
            if (m29527b <= 0.0f) {
                valueOf2 = m29527b + f4 < height ? Float.valueOf(height - f4) : null;
            }
            f = valueOf2 != null ? valueOf2.floatValue() : m29527b;
        }
        this.f88571b.setScale(f2, f2);
        this.f88571b.postTranslate(m29526c, f);
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f88571b);
        uv1 uv1Var = this.f88570a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uv1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f88573d;
            rect.set(smartCenter.m29525d(), smartCenter.m29524e(), smartCenter.m29526c() + smartCenter.m29525d(), smartCenter.m29527b() + smartCenter.m29524e());
            canvas.drawRect(rect, this.f88572c);
            view.setImageBitmap(copy);
        }
    }

    /* renamed from: a */
    public final void m26560a(@NotNull ImageView view, @NotNull Bitmap bitmap, @NotNull sv1 smartCenter, @NotNull String backGroundColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(smartCenter, "smartCenter");
        Intrinsics.checkNotNullParameter(backGroundColor, "backGroundColor");
        float width = view.getWidth();
        float height = view.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float m29526c = smartCenter.m29526c();
        float m29527b = smartCenter.m29527b();
        if (height == 0.0f || m29527b == 0.0f || height2 == 0.0f) {
            return;
        }
        float f = width / height;
        float f2 = f < m29526c / m29527b ? width / m29526c : height / m29527b;
        if (f2 > 1.0f) {
            f2 = f < width2 / height2 ? width / width2 : height / height2;
        }
        float f3 = 2;
        this.f88571b.setScale(f2, f2);
        this.f88571b.postTranslate((width / f3) - (((smartCenter.m29526c() / 2) + smartCenter.m29525d()) * f2), (height / f3) - (((smartCenter.m29527b() / 2) + smartCenter.m29524e()) * f2));
        view.setScaleType(ImageView.ScaleType.MATRIX);
        view.setImageMatrix(this.f88571b);
        view.setBackgroundColor(Color.parseColor(backGroundColor));
        uv1 uv1Var = this.f88570a;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uv1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(copy);
            Rect rect = this.f88573d;
            rect.set(smartCenter.m29525d(), smartCenter.m29524e(), smartCenter.m29526c() + smartCenter.m29525d(), smartCenter.m29527b() + smartCenter.m29524e());
            canvas.drawRect(rect, this.f88572c);
            view.setImageBitmap(copy);
        }
    }
}
