package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class mt0 implements InterfaceC30632jl {

    /* renamed from: H */
    public static final mt0 f82351H = new mt0(new C30881a());

    /* renamed from: I */
    public static final InterfaceC30632jl.InterfaceC30633a<mt0> f82352I = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.ws2
        @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
        public final InterfaceC30632jl fromBundle(Bundle bundle) {
            return mt0.m31855b(bundle);
        }
    };
    @Nullable

    /* renamed from: A */
    public final CharSequence f82353A;
    @Nullable

    /* renamed from: B */
    public final Integer f82354B;
    @Nullable

    /* renamed from: C */
    public final Integer f82355C;
    @Nullable

    /* renamed from: D */
    public final CharSequence f82356D;
    @Nullable

    /* renamed from: E */
    public final CharSequence f82357E;
    @Nullable

    /* renamed from: F */
    public final CharSequence f82358F;
    @Nullable

    /* renamed from: G */
    public final Bundle f82359G;
    @Nullable

    /* renamed from: b */
    public final CharSequence f82360b;
    @Nullable

    /* renamed from: c */
    public final CharSequence f82361c;
    @Nullable

    /* renamed from: d */
    public final CharSequence f82362d;
    @Nullable

    /* renamed from: e */
    public final CharSequence f82363e;
    @Nullable

    /* renamed from: f */
    public final CharSequence f82364f;
    @Nullable

    /* renamed from: g */
    public final CharSequence f82365g;
    @Nullable

    /* renamed from: h */
    public final CharSequence f82366h;
    @Nullable

    /* renamed from: i */
    public final bj1 f82367i;
    @Nullable

    /* renamed from: j */
    public final bj1 f82368j;
    @Nullable

    /* renamed from: k */
    public final byte[] f82369k;
    @Nullable

    /* renamed from: l */
    public final Integer f82370l;
    @Nullable

    /* renamed from: m */
    public final Uri f82371m;
    @Nullable

    /* renamed from: n */
    public final Integer f82372n;
    @Nullable

    /* renamed from: o */
    public final Integer f82373o;
    @Nullable

    /* renamed from: p */
    public final Integer f82374p;
    @Nullable

    /* renamed from: q */
    public final Boolean f82375q;
    @Nullable
    @Deprecated

    /* renamed from: r */
    public final Integer f82376r;
    @Nullable

    /* renamed from: s */
    public final Integer f82377s;
    @Nullable

    /* renamed from: t */
    public final Integer f82378t;
    @Nullable

    /* renamed from: u */
    public final Integer f82379u;
    @Nullable

    /* renamed from: v */
    public final Integer f82380v;
    @Nullable

    /* renamed from: w */
    public final Integer f82381w;
    @Nullable

    /* renamed from: x */
    public final Integer f82382x;
    @Nullable

    /* renamed from: y */
    public final CharSequence f82383y;
    @Nullable

    /* renamed from: z */
    public final CharSequence f82384z;

    /* renamed from: com.yandex.mobile.ads.impl.mt0$a */
    /* loaded from: classes8.dex */
    public static final class C30881a {
        @Nullable

        /* renamed from: A */
        private Integer f82385A;
        @Nullable

        /* renamed from: B */
        private CharSequence f82386B;
        @Nullable

        /* renamed from: C */
        private CharSequence f82387C;
        @Nullable

        /* renamed from: D */
        private CharSequence f82388D;
        @Nullable

        /* renamed from: E */
        private Bundle f82389E;
        @Nullable

        /* renamed from: a */
        private CharSequence f82390a;
        @Nullable

        /* renamed from: b */
        private CharSequence f82391b;
        @Nullable

        /* renamed from: c */
        private CharSequence f82392c;
        @Nullable

        /* renamed from: d */
        private CharSequence f82393d;
        @Nullable

        /* renamed from: e */
        private CharSequence f82394e;
        @Nullable

        /* renamed from: f */
        private CharSequence f82395f;
        @Nullable

        /* renamed from: g */
        private CharSequence f82396g;
        @Nullable

        /* renamed from: h */
        private bj1 f82397h;
        @Nullable

        /* renamed from: i */
        private bj1 f82398i;
        @Nullable

        /* renamed from: j */
        private byte[] f82399j;
        @Nullable

        /* renamed from: k */
        private Integer f82400k;
        @Nullable

        /* renamed from: l */
        private Uri f82401l;
        @Nullable

        /* renamed from: m */
        private Integer f82402m;
        @Nullable

        /* renamed from: n */
        private Integer f82403n;
        @Nullable

        /* renamed from: o */
        private Integer f82404o;
        @Nullable

        /* renamed from: p */
        private Boolean f82405p;
        @Nullable

        /* renamed from: q */
        private Integer f82406q;
        @Nullable

        /* renamed from: r */
        private Integer f82407r;
        @Nullable

        /* renamed from: s */
        private Integer f82408s;
        @Nullable

        /* renamed from: t */
        private Integer f82409t;
        @Nullable

        /* renamed from: u */
        private Integer f82410u;
        @Nullable

        /* renamed from: v */
        private Integer f82411v;
        @Nullable

        /* renamed from: w */
        private CharSequence f82412w;
        @Nullable

        /* renamed from: x */
        private CharSequence f82413x;
        @Nullable

        /* renamed from: y */
        private CharSequence f82414y;
        @Nullable

        /* renamed from: z */
        private Integer f82415z;

        public C30881a() {
        }

        /* renamed from: a */
        public final void m31827a(int i, byte[] bArr) {
            if (this.f82399j == null || y32.m27076a((Object) Integer.valueOf(i), (Object) 3) || !y32.m27076a((Object) this.f82400k, (Object) 3)) {
                this.f82399j = (byte[]) bArr.clone();
                this.f82400k = Integer.valueOf(i);
            }
        }

        /* renamed from: b */
        public final void m31819b(@Nullable String str) {
            this.f82392c = str;
        }

        /* renamed from: c */
        public final void m31815c(@Nullable String str) {
            this.f82391b = str;
        }

        /* renamed from: d */
        public final void m31811d(@Nullable String str) {
            this.f82413x = str;
        }

        /* renamed from: e */
        public final void m31807e(@Nullable String str) {
            this.f82414y = str;
        }

        /* renamed from: f */
        public final void m31803f(@Nullable String str) {
            this.f82396g = str;
        }

        /* renamed from: g */
        public final void m31799g(@Nullable String str) {
            this.f82386B = str;
        }

        /* renamed from: h */
        public final void m31795h(@Nullable String str) {
            this.f82388D = str;
        }

        /* renamed from: i */
        public final void m31792i(@Nullable String str) {
            this.f82390a = str;
        }

        /* renamed from: j */
        public final void m31789j(@Nullable String str) {
            this.f82412w = str;
        }

        private C30881a(mt0 mt0Var) {
            this.f82390a = mt0Var.f82360b;
            this.f82391b = mt0Var.f82361c;
            this.f82392c = mt0Var.f82362d;
            this.f82393d = mt0Var.f82363e;
            this.f82394e = mt0Var.f82364f;
            this.f82395f = mt0Var.f82365g;
            this.f82396g = mt0Var.f82366h;
            this.f82397h = mt0Var.f82367i;
            this.f82398i = mt0Var.f82368j;
            this.f82399j = mt0Var.f82369k;
            this.f82400k = mt0Var.f82370l;
            this.f82401l = mt0Var.f82371m;
            this.f82402m = mt0Var.f82372n;
            this.f82403n = mt0Var.f82373o;
            this.f82404o = mt0Var.f82374p;
            this.f82405p = mt0Var.f82375q;
            this.f82406q = mt0Var.f82377s;
            this.f82407r = mt0Var.f82378t;
            this.f82408s = mt0Var.f82379u;
            this.f82409t = mt0Var.f82380v;
            this.f82410u = mt0Var.f82381w;
            this.f82411v = mt0Var.f82382x;
            this.f82412w = mt0Var.f82383y;
            this.f82413x = mt0Var.f82384z;
            this.f82414y = mt0Var.f82353A;
            this.f82415z = mt0Var.f82354B;
            this.f82385A = mt0Var.f82355C;
            this.f82386B = mt0Var.f82356D;
            this.f82387C = mt0Var.f82357E;
            this.f82388D = mt0Var.f82358F;
            this.f82389E = mt0Var.f82359G;
        }

        /* renamed from: b */
        public final C30881a m31820b(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
            this.f82407r = num;
            return this;
        }

        /* renamed from: c */
        public final void m31816c(@Nullable Integer num) {
            this.f82406q = num;
        }

        /* renamed from: d */
        public final void m31812d(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
            this.f82411v = num;
        }

        /* renamed from: e */
        public final void m31808e(@IntRange(from = 1, m105510to = 12) @Nullable Integer num) {
            this.f82410u = num;
        }

        /* renamed from: f */
        public final void m31804f(@Nullable Integer num) {
            this.f82409t = num;
        }

        /* renamed from: g */
        public final void m31800g(@Nullable Integer num) {
            this.f82403n = num;
        }

        /* renamed from: h */
        public final C30881a m31796h(@Nullable Integer num) {
            this.f82402m = num;
            return this;
        }

        /* renamed from: a */
        public final C30881a m31825a(@Nullable mt0 mt0Var) {
            if (mt0Var == null) {
                return this;
            }
            CharSequence charSequence = mt0Var.f82360b;
            if (charSequence != null) {
                this.f82390a = charSequence;
            }
            CharSequence charSequence2 = mt0Var.f82361c;
            if (charSequence2 != null) {
                this.f82391b = charSequence2;
            }
            CharSequence charSequence3 = mt0Var.f82362d;
            if (charSequence3 != null) {
                this.f82392c = charSequence3;
            }
            CharSequence charSequence4 = mt0Var.f82363e;
            if (charSequence4 != null) {
                this.f82393d = charSequence4;
            }
            CharSequence charSequence5 = mt0Var.f82364f;
            if (charSequence5 != null) {
                this.f82394e = charSequence5;
            }
            CharSequence charSequence6 = mt0Var.f82365g;
            if (charSequence6 != null) {
                this.f82395f = charSequence6;
            }
            CharSequence charSequence7 = mt0Var.f82366h;
            if (charSequence7 != null) {
                this.f82396g = charSequence7;
            }
            bj1 bj1Var = mt0Var.f82367i;
            if (bj1Var != null) {
                this.f82397h = bj1Var;
            }
            bj1 bj1Var2 = mt0Var.f82368j;
            if (bj1Var2 != null) {
                this.f82398i = bj1Var2;
            }
            byte[] bArr = mt0Var.f82369k;
            if (bArr != null) {
                Integer num = mt0Var.f82370l;
                this.f82399j = (byte[]) bArr.clone();
                this.f82400k = num;
            }
            Uri uri = mt0Var.f82371m;
            if (uri != null) {
                this.f82401l = uri;
            }
            Integer num2 = mt0Var.f82372n;
            if (num2 != null) {
                this.f82402m = num2;
            }
            Integer num3 = mt0Var.f82373o;
            if (num3 != null) {
                this.f82403n = num3;
            }
            Integer num4 = mt0Var.f82374p;
            if (num4 != null) {
                this.f82404o = num4;
            }
            Boolean bool = mt0Var.f82375q;
            if (bool != null) {
                this.f82405p = bool;
            }
            Integer num5 = mt0Var.f82376r;
            if (num5 != null) {
                this.f82406q = num5;
            }
            Integer num6 = mt0Var.f82377s;
            if (num6 != null) {
                this.f82406q = num6;
            }
            Integer num7 = mt0Var.f82378t;
            if (num7 != null) {
                this.f82407r = num7;
            }
            Integer num8 = mt0Var.f82379u;
            if (num8 != null) {
                this.f82408s = num8;
            }
            Integer num9 = mt0Var.f82380v;
            if (num9 != null) {
                this.f82409t = num9;
            }
            Integer num10 = mt0Var.f82381w;
            if (num10 != null) {
                this.f82410u = num10;
            }
            Integer num11 = mt0Var.f82382x;
            if (num11 != null) {
                this.f82411v = num11;
            }
            CharSequence charSequence8 = mt0Var.f82383y;
            if (charSequence8 != null) {
                this.f82412w = charSequence8;
            }
            CharSequence charSequence9 = mt0Var.f82384z;
            if (charSequence9 != null) {
                this.f82413x = charSequence9;
            }
            CharSequence charSequence10 = mt0Var.f82353A;
            if (charSequence10 != null) {
                this.f82414y = charSequence10;
            }
            Integer num12 = mt0Var.f82354B;
            if (num12 != null) {
                this.f82415z = num12;
            }
            Integer num13 = mt0Var.f82355C;
            if (num13 != null) {
                this.f82385A = num13;
            }
            CharSequence charSequence11 = mt0Var.f82356D;
            if (charSequence11 != null) {
                this.f82386B = charSequence11;
            }
            CharSequence charSequence12 = mt0Var.f82357E;
            if (charSequence12 != null) {
                this.f82387C = charSequence12;
            }
            CharSequence charSequence13 = mt0Var.f82358F;
            if (charSequence13 != null) {
                this.f82388D = charSequence13;
            }
            Bundle bundle = mt0Var.f82359G;
            if (bundle != null) {
                this.f82389E = bundle;
            }
            return this;
        }

        /* renamed from: a */
        public final void m31823a(@Nullable String str) {
            this.f82393d = str;
        }

        /* renamed from: a */
        public final void m31824a(@IntRange(from = 1, m105510to = 31) @Nullable Integer num) {
            this.f82408s = num;
        }

        /* renamed from: a */
        public final mt0 m31828a() {
            return new mt0(this);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ mt0 m31855b(Bundle bundle) {
        return m31856a(bundle);
    }

    /* renamed from: a */
    public final C30881a m31857a() {
        return new C30881a();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mt0.class != obj.getClass()) {
            return false;
        }
        mt0 mt0Var = (mt0) obj;
        if (y32.m27076a(this.f82360b, mt0Var.f82360b) && y32.m27076a(this.f82361c, mt0Var.f82361c) && y32.m27076a(this.f82362d, mt0Var.f82362d) && y32.m27076a(this.f82363e, mt0Var.f82363e) && y32.m27076a(this.f82364f, mt0Var.f82364f) && y32.m27076a(this.f82365g, mt0Var.f82365g) && y32.m27076a(this.f82366h, mt0Var.f82366h) && y32.m27076a(this.f82367i, mt0Var.f82367i) && y32.m27076a(this.f82368j, mt0Var.f82368j) && Arrays.equals(this.f82369k, mt0Var.f82369k) && y32.m27076a(this.f82370l, mt0Var.f82370l) && y32.m27076a(this.f82371m, mt0Var.f82371m) && y32.m27076a(this.f82372n, mt0Var.f82372n) && y32.m27076a(this.f82373o, mt0Var.f82373o) && y32.m27076a(this.f82374p, mt0Var.f82374p) && y32.m27076a(this.f82375q, mt0Var.f82375q) && y32.m27076a(this.f82377s, mt0Var.f82377s) && y32.m27076a(this.f82378t, mt0Var.f82378t) && y32.m27076a(this.f82379u, mt0Var.f82379u) && y32.m27076a(this.f82380v, mt0Var.f82380v) && y32.m27076a(this.f82381w, mt0Var.f82381w) && y32.m27076a(this.f82382x, mt0Var.f82382x) && y32.m27076a(this.f82383y, mt0Var.f82383y) && y32.m27076a(this.f82384z, mt0Var.f82384z) && y32.m27076a(this.f82353A, mt0Var.f82353A) && y32.m27076a(this.f82354B, mt0Var.f82354B) && y32.m27076a(this.f82355C, mt0Var.f82355C) && y32.m27076a(this.f82356D, mt0Var.f82356D) && y32.m27076a(this.f82357E, mt0Var.f82357E) && y32.m27076a(this.f82358F, mt0Var.f82358F)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f82360b, this.f82361c, this.f82362d, this.f82363e, this.f82364f, this.f82365g, this.f82366h, this.f82367i, this.f82368j, Integer.valueOf(Arrays.hashCode(this.f82369k)), this.f82370l, this.f82371m, this.f82372n, this.f82373o, this.f82374p, this.f82375q, this.f82377s, this.f82378t, this.f82379u, this.f82380v, this.f82381w, this.f82382x, this.f82383y, this.f82384z, this.f82353A, this.f82354B, this.f82355C, this.f82356D, this.f82357E, this.f82358F});
    }

    private mt0(C30881a c30881a) {
        this.f82360b = c30881a.f82390a;
        this.f82361c = c30881a.f82391b;
        this.f82362d = c30881a.f82392c;
        this.f82363e = c30881a.f82393d;
        this.f82364f = c30881a.f82394e;
        this.f82365g = c30881a.f82395f;
        this.f82366h = c30881a.f82396g;
        this.f82367i = c30881a.f82397h;
        this.f82368j = c30881a.f82398i;
        this.f82369k = c30881a.f82399j;
        this.f82370l = c30881a.f82400k;
        this.f82371m = c30881a.f82401l;
        this.f82372n = c30881a.f82402m;
        this.f82373o = c30881a.f82403n;
        this.f82374p = c30881a.f82404o;
        this.f82375q = c30881a.f82405p;
        Integer num = c30881a.f82406q;
        this.f82376r = num;
        this.f82377s = num;
        this.f82378t = c30881a.f82407r;
        this.f82379u = c30881a.f82408s;
        this.f82380v = c30881a.f82409t;
        this.f82381w = c30881a.f82410u;
        this.f82382x = c30881a.f82411v;
        this.f82383y = c30881a.f82412w;
        this.f82384z = c30881a.f82413x;
        this.f82353A = c30881a.f82414y;
        this.f82354B = c30881a.f82415z;
        this.f82355C = c30881a.f82385A;
        this.f82356D = c30881a.f82386B;
        this.f82357E = c30881a.f82387C;
        this.f82358F = c30881a.f82388D;
        this.f82359G = c30881a.f82389E;
    }

    /* renamed from: a */
    public static mt0 m31856a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        C30881a c30881a = new C30881a();
        c30881a.f82390a = bundle.getCharSequence(Integer.toString(0, 36));
        c30881a.f82391b = bundle.getCharSequence(Integer.toString(1, 36));
        c30881a.f82392c = bundle.getCharSequence(Integer.toString(2, 36));
        c30881a.f82393d = bundle.getCharSequence(Integer.toString(3, 36));
        c30881a.f82394e = bundle.getCharSequence(Integer.toString(4, 36));
        c30881a.f82395f = bundle.getCharSequence(Integer.toString(5, 36));
        c30881a.f82396g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        c30881a.f82399j = byteArray != null ? (byte[]) byteArray.clone() : null;
        c30881a.f82400k = valueOf;
        c30881a.f82401l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        c30881a.f82412w = bundle.getCharSequence(Integer.toString(22, 36));
        c30881a.f82413x = bundle.getCharSequence(Integer.toString(23, 36));
        c30881a.f82414y = bundle.getCharSequence(Integer.toString(24, 36));
        c30881a.f82386B = bundle.getCharSequence(Integer.toString(27, 36));
        c30881a.f82387C = bundle.getCharSequence(Integer.toString(28, 36));
        c30881a.f82388D = bundle.getCharSequence(Integer.toString(30, 36));
        c30881a.f82389E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            c30881a.f82397h = bj1.f77334b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            c30881a.f82398i = bj1.f77334b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            c30881a.f82402m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            c30881a.f82403n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            c30881a.f82404o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            c30881a.f82405p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            c30881a.f82406q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            c30881a.f82407r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            c30881a.f82408s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            c30881a.f82409t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            c30881a.f82410u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            c30881a.f82411v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            c30881a.f82415z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            c30881a.f82385A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new mt0(c30881a);
    }
}
