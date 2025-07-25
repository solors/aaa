package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r */
/* loaded from: classes7.dex */
public final class C24747r {
    @NotNull

    /* renamed from: a */
    public final Context f63882a;
    @NotNull

    /* renamed from: b */
    public final Rect f63883b;
    @NotNull

    /* renamed from: c */
    public final Rect f63884c;
    @NotNull

    /* renamed from: d */
    public final Rect f63885d;
    @NotNull

    /* renamed from: e */
    public final Rect f63886e;
    @NotNull

    /* renamed from: f */
    public final Rect f63887f;
    @NotNull

    /* renamed from: g */
    public final Rect f63888g;
    @NotNull

    /* renamed from: h */
    public final Rect f63889h;
    @NotNull

    /* renamed from: i */
    public final Rect f63890i;

    public C24747r(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f63882a = applicationContext;
        this.f63883b = new Rect();
        this.f63884c = new Rect();
        this.f63885d = new Rect();
        this.f63886e = new Rect();
        this.f63887f = new Rect();
        this.f63888g = new Rect();
        this.f63889h = new Rect();
        this.f63890i = new Rect();
    }

    /* renamed from: a */
    public final void m45786a(int i, int i2) {
        this.f63883b.set(0, 0, i, i2);
        m45784c(this.f63883b, this.f63884c);
    }

    /* renamed from: b */
    public final void m45785b(int i, int i2, int i3, int i4) {
        this.f63887f.set(i, i2, i3 + i, i4 + i2);
        m45784c(this.f63887f, this.f63888g);
    }

    /* renamed from: c */
    public final void m45784c(Rect rect, Rect rect2) {
        C24705a c24705a = C24705a.f63784a;
        rect2.set(c24705a.m45889c(rect.left, this.f63882a), c24705a.m45889c(rect.top, this.f63882a), c24705a.m45889c(rect.right, this.f63882a), c24705a.m45889c(rect.bottom, this.f63882a));
    }

    @NotNull
    /* renamed from: d */
    public final Rect m45783d() {
        return this.f63888g;
    }

    /* renamed from: e */
    public final void m45782e(int i, int i2, int i3, int i4) {
        this.f63889h.set(i, i2, i3 + i, i4 + i2);
        m45784c(this.f63889h, this.f63890i);
    }

    /* renamed from: f */
    public final void m45781f(int i, int i2, int i3, int i4) {
        this.f63885d.set(i, i2, i3 + i, i4 + i2);
        m45784c(this.f63885d, this.f63886e);
    }

    @NotNull
    /* renamed from: g */
    public final Rect m45780g() {
        return this.f63890i;
    }

    @NotNull
    /* renamed from: h */
    public final Rect m45779h() {
        return this.f63886e;
    }

    @NotNull
    /* renamed from: i */
    public final Rect m45778i() {
        return this.f63884c;
    }
}
