package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.C45077m;

@Metadata
/* renamed from: com.yandex.div.internal.widget.c */
/* loaded from: classes8.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    private int f76123a;

    /* renamed from: b */
    private boolean f76124b;

    /* renamed from: c */
    private float f76125c;

    /* renamed from: d */
    private float f76126d;
    @NotNull

    /* renamed from: e */
    private final C45077m f76127e;
    @NotNull

    /* renamed from: f */
    private final C45077m f76128f;

    /* renamed from: g */
    private int f76129g;

    /* renamed from: h */
    private int f76130h;

    /* renamed from: j */
    static final /* synthetic */ KProperty<Object>[] f76122j = {Reflection.m17039e(new MutablePropertyReference1Impl(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0)), Reflection.m17039e(new MutablePropertyReference1Impl(DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0))};
    @NotNull

    /* renamed from: i */
    public static final C29804a f76121i = new C29804a(null);

    /* compiled from: DivLayoutParams.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.c$a */
    /* loaded from: classes8.dex */
    public static final class C29804a {
        private C29804a() {
        }

        public /* synthetic */ C29804a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DivLayoutParams(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76123a = 8388659;
        this.f76127e = new C45077m(1, null, 2, null);
        this.f76128f = new C45077m(1, null, 2, null);
        this.f76129g = Integer.MAX_VALUE;
        this.f76130h = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int m36374a() {
        return this.f76127e.m991a(this, f76122j[0]).intValue();
    }

    /* renamed from: b */
    public final int m36373b() {
        return this.f76123a;
    }

    /* renamed from: c */
    public final int m36372c() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    /* renamed from: d */
    public final float m36371d() {
        return this.f76126d;
    }

    /* renamed from: e */
    public final int m36370e() {
        return this.f76129g;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || DivLayoutParams.class != obj.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        if (((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.f76123a == divLayoutParams.f76123a && this.f76124b == divLayoutParams.f76124b && m36374a() == divLayoutParams.m36374a() && m36368g() == divLayoutParams.m36368g()) {
            if (this.f76125c == divLayoutParams.f76125c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f76126d == divLayoutParams.f76126d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && this.f76129g == divLayoutParams.f76129g && this.f76130h == divLayoutParams.f76130h) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final int m36369f() {
        return this.f76130h;
    }

    /* renamed from: g */
    public final int m36368g() {
        return this.f76128f.m991a(this, f76122j[1]).intValue();
    }

    /* renamed from: h */
    public final int m36367h() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public int hashCode() {
        int hashCode = ((((((((((((super.hashCode() * 31) + this.f76123a) * 31) + (this.f76124b ? 1 : 0)) * 31) + m36374a()) * 31) + m36368g()) * 31) + Float.floatToIntBits(this.f76125c)) * 31) + Float.floatToIntBits(this.f76126d)) * 31;
        int i = this.f76129g;
        int i2 = 0;
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        int i4 = this.f76130h;
        if (i4 != Integer.MAX_VALUE) {
            i2 = i4;
        }
        return i3 + i2;
    }

    /* renamed from: i */
    public final float m36366i() {
        return this.f76125c;
    }

    /* renamed from: j */
    public final boolean m36365j() {
        return this.f76124b;
    }

    /* renamed from: k */
    public final void m36364k(boolean z) {
        this.f76124b = z;
    }

    /* renamed from: l */
    public final void m36363l(int i) {
        this.f76127e.m990b(this, f76122j[0], Integer.valueOf(i));
    }

    /* renamed from: m */
    public final void m36362m(int i) {
        this.f76123a = i;
    }

    /* renamed from: n */
    public final void m36361n(float f) {
        this.f76126d = f;
    }

    /* renamed from: o */
    public final void m36360o(int i) {
        this.f76129g = i;
    }

    /* renamed from: p */
    public final void m36359p(int i) {
        this.f76130h = i;
    }

    /* renamed from: q */
    public final void m36358q(int i) {
        this.f76128f.m990b(this, f76122j[1], Integer.valueOf(i));
    }

    /* renamed from: r */
    public final void m36357r(float f) {
        this.f76125c = f;
    }

    public DivLayoutParams(int i, int i2) {
        super(i, i2);
        this.f76123a = 8388659;
        this.f76127e = new C45077m(1, null, 2, null);
        this.f76128f = new C45077m(1, null, 2, null);
        this.f76129g = Integer.MAX_VALUE;
        this.f76130h = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f76123a = 8388659;
        this.f76127e = new C45077m(1, null, 2, null);
        this.f76128f = new C45077m(1, null, 2, null);
        this.f76129g = Integer.MAX_VALUE;
        this.f76130h = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@Nullable ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f76123a = 8388659;
        this.f76127e = new C45077m(1, null, 2, null);
        this.f76128f = new C45077m(1, null, 2, null);
        this.f76129g = Integer.MAX_VALUE;
        this.f76130h = Integer.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLayoutParams(@NotNull DivLayoutParams source) {
        super((ViewGroup.MarginLayoutParams) source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.f76123a = 8388659;
        this.f76127e = new C45077m(1, null, 2, null);
        this.f76128f = new C45077m(1, null, 2, null);
        this.f76129g = Integer.MAX_VALUE;
        this.f76130h = Integer.MAX_VALUE;
        this.f76123a = source.f76123a;
        this.f76124b = source.f76124b;
        this.f76125c = source.f76125c;
        this.f76126d = source.f76126d;
        m36363l(source.m36374a());
        m36358q(source.m36368g());
        this.f76129g = source.f76129g;
        this.f76130h = source.f76130h;
    }
}
