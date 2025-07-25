package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.xt */
/* loaded from: classes8.dex */
public final class C31840xt implements InterfaceC30632jl {

    /* renamed from: s */
    public static final C31840xt f87805s;

    /* renamed from: t */
    public static final InterfaceC30632jl.InterfaceC30633a<C31840xt> f87806t;
    @Nullable

    /* renamed from: b */
    public final CharSequence f87807b;
    @Nullable

    /* renamed from: c */
    public final Layout.Alignment f87808c;
    @Nullable

    /* renamed from: d */
    public final Layout.Alignment f87809d;
    @Nullable

    /* renamed from: e */
    public final Bitmap f87810e;

    /* renamed from: f */
    public final float f87811f;

    /* renamed from: g */
    public final int f87812g;

    /* renamed from: h */
    public final int f87813h;

    /* renamed from: i */
    public final float f87814i;

    /* renamed from: j */
    public final int f87815j;

    /* renamed from: k */
    public final float f87816k;

    /* renamed from: l */
    public final float f87817l;

    /* renamed from: m */
    public final boolean f87818m;

    /* renamed from: n */
    public final int f87819n;

    /* renamed from: o */
    public final int f87820o;

    /* renamed from: p */
    public final float f87821p;

    /* renamed from: q */
    public final int f87822q;

    /* renamed from: r */
    public final float f87823r;

    /* renamed from: com.yandex.mobile.ads.impl.xt$a */
    /* loaded from: classes8.dex */
    public static final class C31841a {
        @Nullable

        /* renamed from: a */
        private CharSequence f87824a;
        @Nullable

        /* renamed from: b */
        private Bitmap f87825b;
        @Nullable

        /* renamed from: c */
        private Layout.Alignment f87826c;
        @Nullable

        /* renamed from: d */
        private Layout.Alignment f87827d;

        /* renamed from: e */
        private float f87828e;

        /* renamed from: f */
        private int f87829f;

        /* renamed from: g */
        private int f87830g;

        /* renamed from: h */
        private float f87831h;

        /* renamed from: i */
        private int f87832i;

        /* renamed from: j */
        private int f87833j;

        /* renamed from: k */
        private float f87834k;

        /* renamed from: l */
        private float f87835l;

        /* renamed from: m */
        private float f87836m;

        /* renamed from: n */
        private boolean f87837n;
        @ColorInt

        /* renamed from: o */
        private int f87838o;

        /* renamed from: p */
        private int f87839p;

        /* renamed from: q */
        private float f87840q;

        public C31841a() {
            this.f87824a = null;
            this.f87825b = null;
            this.f87826c = null;
            this.f87827d = null;
            this.f87828e = -3.4028235E38f;
            this.f87829f = Integer.MIN_VALUE;
            this.f87830g = Integer.MIN_VALUE;
            this.f87831h = -3.4028235E38f;
            this.f87832i = Integer.MIN_VALUE;
            this.f87833j = Integer.MIN_VALUE;
            this.f87834k = -3.4028235E38f;
            this.f87835l = -3.4028235E38f;
            this.f87836m = -3.4028235E38f;
            this.f87837n = false;
            this.f87838o = ViewCompat.MEASURED_STATE_MASK;
            this.f87839p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public final C31841a m27247a(Bitmap bitmap) {
            this.f87825b = bitmap;
            return this;
        }

        /* renamed from: b */
        public final int m27243b() {
            return this.f87830g;
        }

        /* renamed from: c */
        public final int m27237c() {
            return this.f87832i;
        }

        @Nullable
        /* renamed from: d */
        public final CharSequence m27233d() {
            return this.f87824a;
        }

        /* renamed from: a */
        public final C31841a m27250a(float f) {
            this.f87836m = f;
            return this;
        }

        /* renamed from: b */
        public final C31841a m27242b(float f) {
            this.f87831h = f;
            return this;
        }

        /* renamed from: c */
        public final void m27236c(float f) {
            this.f87840q = f;
        }

        /* renamed from: d */
        public final C31841a m27232d(float f) {
            this.f87835l = f;
            return this;
        }

        /* renamed from: a */
        public final C31841a m27248a(int i, float f) {
            this.f87828e = f;
            this.f87829f = i;
            return this;
        }

        /* renamed from: b */
        public final C31841a m27241b(int i) {
            this.f87832i = i;
            return this;
        }

        /* renamed from: c */
        public final C31841a m27235c(int i) {
            this.f87839p = i;
            return this;
        }

        /* renamed from: d */
        public final void m27231d(@ColorInt int i) {
            this.f87838o = i;
            this.f87837n = true;
        }

        /* renamed from: b */
        public final C31841a m27239b(@Nullable Layout.Alignment alignment) {
            this.f87826c = alignment;
            return this;
        }

        /* renamed from: a */
        public final C31841a m27249a(int i) {
            this.f87830g = i;
            return this;
        }

        /* renamed from: b */
        public final void m27240b(int i, float f) {
            this.f87834k = f;
            this.f87833j = i;
        }

        /* renamed from: a */
        public final void m27246a(@Nullable Layout.Alignment alignment) {
            this.f87827d = alignment;
        }

        /* renamed from: a */
        public final C31841a m27244a(CharSequence charSequence) {
            this.f87824a = charSequence;
            return this;
        }

        /* renamed from: a */
        public final C31840xt m27251a() {
            return new C31840xt(this.f87824a, this.f87826c, this.f87827d, this.f87825b, this.f87828e, this.f87829f, this.f87830g, this.f87831h, this.f87832i, this.f87833j, this.f87834k, this.f87835l, this.f87836m, this.f87837n, this.f87838o, this.f87839p, this.f87840q);
        }

        private C31841a(C31840xt c31840xt) {
            this.f87824a = c31840xt.f87807b;
            this.f87825b = c31840xt.f87810e;
            this.f87826c = c31840xt.f87808c;
            this.f87827d = c31840xt.f87809d;
            this.f87828e = c31840xt.f87811f;
            this.f87829f = c31840xt.f87812g;
            this.f87830g = c31840xt.f87813h;
            this.f87831h = c31840xt.f87814i;
            this.f87832i = c31840xt.f87815j;
            this.f87833j = c31840xt.f87820o;
            this.f87834k = c31840xt.f87821p;
            this.f87835l = c31840xt.f87816k;
            this.f87836m = c31840xt.f87817l;
            this.f87837n = c31840xt.f87818m;
            this.f87838o = c31840xt.f87819n;
            this.f87839p = c31840xt.f87822q;
            this.f87840q = c31840xt.f87823r;
        }
    }

    static {
        C31841a c31841a = new C31841a();
        c31841a.f87824a = "";
        f87805s = c31841a.m27251a();
        f87806t = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.u03
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return C31840xt.m27252b(bundle);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ C31840xt m27252b(Bundle bundle) {
        return m27253a(bundle);
    }

    /* renamed from: a */
    public final C31841a m27254a() {
        return new C31841a();
    }

    public final boolean equals(@Nullable Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C31840xt.class != obj.getClass()) {
            return false;
        }
        C31840xt c31840xt = (C31840xt) obj;
        if (TextUtils.equals(this.f87807b, c31840xt.f87807b) && this.f87808c == c31840xt.f87808c && this.f87809d == c31840xt.f87809d && ((bitmap = this.f87810e) != null ? !((bitmap2 = c31840xt.f87810e) == null || !bitmap.sameAs(bitmap2)) : c31840xt.f87810e == null) && this.f87811f == c31840xt.f87811f && this.f87812g == c31840xt.f87812g && this.f87813h == c31840xt.f87813h && this.f87814i == c31840xt.f87814i && this.f87815j == c31840xt.f87815j && this.f87816k == c31840xt.f87816k && this.f87817l == c31840xt.f87817l && this.f87818m == c31840xt.f87818m && this.f87819n == c31840xt.f87819n && this.f87820o == c31840xt.f87820o && this.f87821p == c31840xt.f87821p && this.f87822q == c31840xt.f87822q && this.f87823r == c31840xt.f87823r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f87807b, this.f87808c, this.f87809d, this.f87810e, Float.valueOf(this.f87811f), Integer.valueOf(this.f87812g), Integer.valueOf(this.f87813h), Float.valueOf(this.f87814i), Integer.valueOf(this.f87815j), Float.valueOf(this.f87816k), Float.valueOf(this.f87817l), Boolean.valueOf(this.f87818m), Integer.valueOf(this.f87819n), Integer.valueOf(this.f87820o), Float.valueOf(this.f87821p), Integer.valueOf(this.f87822q), Float.valueOf(this.f87823r)});
    }

    private C31840xt(@Nullable CharSequence charSequence, @Nullable Layout.Alignment alignment, @Nullable Layout.Alignment alignment2, @Nullable Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            C30937nf.m31570a(bitmap);
        } else {
            C30937nf.m31567a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f87807b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f87807b = charSequence.toString();
        } else {
            this.f87807b = null;
        }
        this.f87808c = alignment;
        this.f87809d = alignment2;
        this.f87810e = bitmap;
        this.f87811f = f;
        this.f87812g = i;
        this.f87813h = i2;
        this.f87814i = f2;
        this.f87815j = i3;
        this.f87816k = f4;
        this.f87817l = f5;
        this.f87818m = z;
        this.f87819n = i5;
        this.f87820o = i4;
        this.f87821p = f3;
        this.f87822q = i6;
        this.f87823r = f6;
    }

    /* renamed from: a */
    public static final C31840xt m27253a(Bundle bundle) {
        C31841a c31841a = new C31841a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            c31841a.f87824a = charSequence;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            c31841a.f87826c = alignment;
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            c31841a.f87827d = alignment2;
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            c31841a.f87825b = bitmap;
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            float f = bundle.getFloat(Integer.toString(4, 36));
            int i = bundle.getInt(Integer.toString(5, 36));
            c31841a.f87828e = f;
            c31841a.f87829f = i;
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            c31841a.f87830g = bundle.getInt(Integer.toString(6, 36));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            c31841a.f87831h = bundle.getFloat(Integer.toString(7, 36));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            c31841a.f87832i = bundle.getInt(Integer.toString(8, 36));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            float f2 = bundle.getFloat(Integer.toString(10, 36));
            int i2 = bundle.getInt(Integer.toString(9, 36));
            c31841a.f87834k = f2;
            c31841a.f87833j = i2;
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            c31841a.f87835l = bundle.getFloat(Integer.toString(11, 36));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            c31841a.f87836m = bundle.getFloat(Integer.toString(12, 36));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            c31841a.f87838o = bundle.getInt(Integer.toString(13, 36));
            c31841a.f87837n = true;
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            c31841a.f87837n = false;
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            c31841a.f87839p = bundle.getInt(Integer.toString(15, 36));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            c31841a.f87840q = bundle.getFloat(Integer.toString(16, 36));
        }
        return c31841a.m27251a();
    }
}
