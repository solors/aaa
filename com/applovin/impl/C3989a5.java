package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.a5 */
/* loaded from: classes2.dex */
public final class C3989a5 implements InterfaceC5044o2 {

    /* renamed from: s */
    public static final C3989a5 f4486s = new C3991b().m101044a("").m101050a();

    /* renamed from: t */
    public static final InterfaceC5044o2.InterfaceC5045a f4487t = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.js
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C3989a5.m101051b(bundle);
        }
    };

    /* renamed from: a */
    public final CharSequence f4488a;

    /* renamed from: b */
    public final Layout.Alignment f4489b;

    /* renamed from: c */
    public final Layout.Alignment f4490c;

    /* renamed from: d */
    public final Bitmap f4491d;

    /* renamed from: f */
    public final float f4492f;

    /* renamed from: g */
    public final int f4493g;

    /* renamed from: h */
    public final int f4494h;

    /* renamed from: i */
    public final float f4495i;

    /* renamed from: j */
    public final int f4496j;

    /* renamed from: k */
    public final float f4497k;

    /* renamed from: l */
    public final float f4498l;

    /* renamed from: m */
    public final boolean f4499m;

    /* renamed from: n */
    public final int f4500n;

    /* renamed from: o */
    public final int f4501o;

    /* renamed from: p */
    public final float f4502p;

    /* renamed from: q */
    public final int f4503q;

    /* renamed from: r */
    public final float f4504r;

    /* renamed from: com.applovin.impl.a5$b */
    /* loaded from: classes2.dex */
    public static final class C3991b {

        /* renamed from: a */
        private CharSequence f4505a;

        /* renamed from: b */
        private Bitmap f4506b;

        /* renamed from: c */
        private Layout.Alignment f4507c;

        /* renamed from: d */
        private Layout.Alignment f4508d;

        /* renamed from: e */
        private float f4509e;

        /* renamed from: f */
        private int f4510f;

        /* renamed from: g */
        private int f4511g;

        /* renamed from: h */
        private float f4512h;

        /* renamed from: i */
        private int f4513i;

        /* renamed from: j */
        private int f4514j;

        /* renamed from: k */
        private float f4515k;

        /* renamed from: l */
        private float f4516l;

        /* renamed from: m */
        private float f4517m;

        /* renamed from: n */
        private boolean f4518n;

        /* renamed from: o */
        private int f4519o;

        /* renamed from: p */
        private int f4520p;

        /* renamed from: q */
        private float f4521q;

        public C3991b() {
            this.f4505a = null;
            this.f4506b = null;
            this.f4507c = null;
            this.f4508d = null;
            this.f4509e = -3.4028235E38f;
            this.f4510f = Integer.MIN_VALUE;
            this.f4511g = Integer.MIN_VALUE;
            this.f4512h = -3.4028235E38f;
            this.f4513i = Integer.MIN_VALUE;
            this.f4514j = Integer.MIN_VALUE;
            this.f4515k = -3.4028235E38f;
            this.f4516l = -3.4028235E38f;
            this.f4517m = -3.4028235E38f;
            this.f4518n = false;
            this.f4519o = ViewCompat.MEASURED_STATE_MASK;
            this.f4520p = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public C3991b m101046a(Bitmap bitmap) {
            this.f4506b = bitmap;
            return this;
        }

        /* renamed from: b */
        public C3991b m101043b() {
            this.f4518n = false;
            return this;
        }

        /* renamed from: c */
        public int m101038c() {
            return this.f4511g;
        }

        /* renamed from: d */
        public int m101035d() {
            return this.f4513i;
        }

        /* renamed from: e */
        public CharSequence m101032e() {
            return this.f4505a;
        }

        /* renamed from: a */
        public C3991b m101049a(float f) {
            this.f4517m = f;
            return this;
        }

        /* renamed from: b */
        public C3991b m101042b(float f) {
            this.f4512h = f;
            return this;
        }

        /* renamed from: c */
        public C3991b m101037c(float f) {
            this.f4521q = f;
            return this;
        }

        /* renamed from: d */
        public C3991b m101034d(float f) {
            this.f4516l = f;
            return this;
        }

        /* renamed from: a */
        public C3991b m101048a(float f, int i) {
            this.f4509e = f;
            this.f4510f = i;
            return this;
        }

        /* renamed from: b */
        public C3991b m101040b(int i) {
            this.f4513i = i;
            return this;
        }

        /* renamed from: c */
        public C3991b m101036c(int i) {
            this.f4520p = i;
            return this;
        }

        /* renamed from: d */
        public C3991b m101033d(int i) {
            this.f4519o = i;
            this.f4518n = true;
            return this;
        }

        /* renamed from: b */
        public C3991b m101039b(Layout.Alignment alignment) {
            this.f4507c = alignment;
            return this;
        }

        /* renamed from: a */
        public C3991b m101047a(int i) {
            this.f4511g = i;
            return this;
        }

        /* renamed from: b */
        public C3991b m101041b(float f, int i) {
            this.f4515k = f;
            this.f4514j = i;
            return this;
        }

        /* renamed from: a */
        public C3991b m101045a(Layout.Alignment alignment) {
            this.f4508d = alignment;
            return this;
        }

        /* renamed from: a */
        public C3991b m101044a(CharSequence charSequence) {
            this.f4505a = charSequence;
            return this;
        }

        /* renamed from: a */
        public C3989a5 m101050a() {
            return new C3989a5(this.f4505a, this.f4507c, this.f4508d, this.f4506b, this.f4509e, this.f4510f, this.f4511g, this.f4512h, this.f4513i, this.f4514j, this.f4515k, this.f4516l, this.f4517m, this.f4518n, this.f4519o, this.f4520p, this.f4521q);
        }

        private C3991b(C3989a5 c3989a5) {
            this.f4505a = c3989a5.f4488a;
            this.f4506b = c3989a5.f4491d;
            this.f4507c = c3989a5.f4489b;
            this.f4508d = c3989a5.f4490c;
            this.f4509e = c3989a5.f4492f;
            this.f4510f = c3989a5.f4493g;
            this.f4511g = c3989a5.f4494h;
            this.f4512h = c3989a5.f4495i;
            this.f4513i = c3989a5.f4496j;
            this.f4514j = c3989a5.f4501o;
            this.f4515k = c3989a5.f4502p;
            this.f4516l = c3989a5.f4497k;
            this.f4517m = c3989a5.f4498l;
            this.f4518n = c3989a5.f4499m;
            this.f4519o = c3989a5.f4500n;
            this.f4520p = c3989a5.f4503q;
            this.f4521q = c3989a5.f4504r;
        }
    }

    private C3989a5(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            AbstractC4100b1.m100583a(bitmap);
        } else {
            AbstractC4100b1.m100580a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f4488a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f4488a = charSequence.toString();
        } else {
            this.f4488a = null;
        }
        this.f4489b = alignment;
        this.f4490c = alignment2;
        this.f4491d = bitmap;
        this.f4492f = f;
        this.f4493g = i;
        this.f4494h = i2;
        this.f4495i = f2;
        this.f4496j = i3;
        this.f4497k = f4;
        this.f4498l = f5;
        this.f4499m = z;
        this.f4500n = i5;
        this.f4501o = i4;
        this.f4502p = f3;
        this.f4503q = i6;
        this.f4504r = f6;
    }

    /* renamed from: a */
    private static String m101053a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: b */
    public static /* synthetic */ C3989a5 m101051b(Bundle bundle) {
        return m101052a(bundle);
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C3989a5.class != obj.getClass()) {
            return false;
        }
        C3989a5 c3989a5 = (C3989a5) obj;
        if (TextUtils.equals(this.f4488a, c3989a5.f4488a) && this.f4489b == c3989a5.f4489b && this.f4490c == c3989a5.f4490c && ((bitmap = this.f4491d) != null ? !((bitmap2 = c3989a5.f4491d) == null || !bitmap.sameAs(bitmap2)) : c3989a5.f4491d == null) && this.f4492f == c3989a5.f4492f && this.f4493g == c3989a5.f4493g && this.f4494h == c3989a5.f4494h && this.f4495i == c3989a5.f4495i && this.f4496j == c3989a5.f4496j && this.f4497k == c3989a5.f4497k && this.f4498l == c3989a5.f4498l && this.f4499m == c3989a5.f4499m && this.f4500n == c3989a5.f4500n && this.f4501o == c3989a5.f4501o && this.f4502p == c3989a5.f4502p && this.f4503q == c3989a5.f4503q && this.f4504r == c3989a5.f4504r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f4488a, this.f4489b, this.f4490c, this.f4491d, Float.valueOf(this.f4492f), Integer.valueOf(this.f4493g), Integer.valueOf(this.f4494h), Float.valueOf(this.f4495i), Integer.valueOf(this.f4496j), Float.valueOf(this.f4497k), Float.valueOf(this.f4498l), Boolean.valueOf(this.f4499m), Integer.valueOf(this.f4500n), Integer.valueOf(this.f4501o), Float.valueOf(this.f4502p), Integer.valueOf(this.f4503q), Float.valueOf(this.f4504r));
    }

    /* renamed from: a */
    public C3991b m101054a() {
        return new C3991b();
    }

    /* renamed from: a */
    public static final C3989a5 m101052a(Bundle bundle) {
        C3991b c3991b = new C3991b();
        CharSequence charSequence = bundle.getCharSequence(m101053a(0));
        if (charSequence != null) {
            c3991b.m101044a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m101053a(1));
        if (alignment != null) {
            c3991b.m101039b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(m101053a(2));
        if (alignment2 != null) {
            c3991b.m101045a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(m101053a(3));
        if (bitmap != null) {
            c3991b.m101046a(bitmap);
        }
        if (bundle.containsKey(m101053a(4)) && bundle.containsKey(m101053a(5))) {
            c3991b.m101048a(bundle.getFloat(m101053a(4)), bundle.getInt(m101053a(5)));
        }
        if (bundle.containsKey(m101053a(6))) {
            c3991b.m101047a(bundle.getInt(m101053a(6)));
        }
        if (bundle.containsKey(m101053a(7))) {
            c3991b.m101042b(bundle.getFloat(m101053a(7)));
        }
        if (bundle.containsKey(m101053a(8))) {
            c3991b.m101040b(bundle.getInt(m101053a(8)));
        }
        if (bundle.containsKey(m101053a(10)) && bundle.containsKey(m101053a(9))) {
            c3991b.m101041b(bundle.getFloat(m101053a(10)), bundle.getInt(m101053a(9)));
        }
        if (bundle.containsKey(m101053a(11))) {
            c3991b.m101034d(bundle.getFloat(m101053a(11)));
        }
        if (bundle.containsKey(m101053a(12))) {
            c3991b.m101049a(bundle.getFloat(m101053a(12)));
        }
        if (bundle.containsKey(m101053a(13))) {
            c3991b.m101033d(bundle.getInt(m101053a(13)));
        }
        if (!bundle.getBoolean(m101053a(14), false)) {
            c3991b.m101043b();
        }
        if (bundle.containsKey(m101053a(15))) {
            c3991b.m101036c(bundle.getInt(m101053a(15)));
        }
        if (bundle.containsKey(m101053a(16))) {
            c3991b.m101037c(bundle.getFloat(m101053a(16)));
        }
        return c3991b.m101050a();
    }
}
