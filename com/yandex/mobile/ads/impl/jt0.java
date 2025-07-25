package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.offline.StreamKey;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.oh0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class jt0 implements InterfaceC30632jl {

    /* renamed from: h */
    public static final InterfaceC30632jl.InterfaceC30633a<jt0> f81080h;

    /* renamed from: b */
    public final String f81081b;
    @Nullable

    /* renamed from: c */
    public final C30666g f81082c;

    /* renamed from: d */
    public final C30663e f81083d;

    /* renamed from: e */
    public final mt0 f81084e;

    /* renamed from: f */
    public final C30660c f81085f;

    /* renamed from: g */
    public final C30667h f81086g;

    /* renamed from: com.yandex.mobile.ads.impl.jt0$b */
    /* loaded from: classes8.dex */
    public static class C30658b implements InterfaceC30632jl {

        /* renamed from: g */
        public static final InterfaceC30632jl.InterfaceC30633a<C30660c> f81096g = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.dr2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                jt0.C30660c m32771a;
                m32771a = jt0.C30658b.m32771a(bundle);
                return m32771a;
            }
        };
        @IntRange(from = 0)

        /* renamed from: b */
        public final long f81097b;

        /* renamed from: c */
        public final long f81098c;

        /* renamed from: d */
        public final boolean f81099d;

        /* renamed from: e */
        public final boolean f81100e;

        /* renamed from: f */
        public final boolean f81101f;

        /* renamed from: com.yandex.mobile.ads.impl.jt0$b$a */
        /* loaded from: classes8.dex */
        public static final class C30659a {

            /* renamed from: a */
            private long f81102a;

            /* renamed from: b */
            private long f81103b = Long.MIN_VALUE;

            /* renamed from: c */
            private boolean f81104c;

            /* renamed from: d */
            private boolean f81105d;

            /* renamed from: e */
            private boolean f81106e;
        }

        /* renamed from: a */
        public static C30660c m32771a(Bundle bundle) {
            C30659a c30659a = new C30659a();
            long j = bundle.getLong(Integer.toString(0, 36), 0L);
            if (j >= 0) {
                c30659a.f81102a = j;
                long j2 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (j2 == Long.MIN_VALUE || j2 >= 0) {
                    c30659a.f81103b = j2;
                    c30659a.f81104c = bundle.getBoolean(Integer.toString(2, 36), false);
                    c30659a.f81105d = bundle.getBoolean(Integer.toString(3, 36), false);
                    c30659a.f81106e = bundle.getBoolean(Integer.toString(4, 36), false);
                    return new C30660c(c30659a);
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30658b)) {
                return false;
            }
            C30658b c30658b = (C30658b) obj;
            if (this.f81097b == c30658b.f81097b && this.f81098c == c30658b.f81098c && this.f81099d == c30658b.f81099d && this.f81100e == c30658b.f81100e && this.f81101f == c30658b.f81101f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j = this.f81097b;
            long j2 = this.f81098c;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f81099d ? 1 : 0)) * 31) + (this.f81100e ? 1 : 0)) * 31) + (this.f81101f ? 1 : 0);
        }

        private C30658b(C30659a c30659a) {
            this.f81097b = c30659a.f81102a;
            this.f81098c = c30659a.f81103b;
            this.f81099d = c30659a.f81104c;
            this.f81100e = c30659a.f81105d;
            this.f81101f = c30659a.f81106e;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.jt0$c */
    /* loaded from: classes8.dex */
    public static final class C30660c extends C30658b {

        /* renamed from: h */
        public static final C30660c f81107h = new C30660c(new C30658b.C30659a());

        private C30660c(C30658b.C30659a c30659a) {
            super(c30659a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$d */
    /* loaded from: classes8.dex */
    public static final class C30661d {

        /* renamed from: a */
        public final UUID f81108a;
        @Nullable

        /* renamed from: b */
        public final Uri f81109b;

        /* renamed from: c */
        public final ph0<String, String> f81110c;

        /* renamed from: d */
        public final boolean f81111d;

        /* renamed from: e */
        public final boolean f81112e;

        /* renamed from: f */
        public final boolean f81113f;

        /* renamed from: g */
        public final oh0<Integer> f81114g;
        @Nullable

        /* renamed from: h */
        private final byte[] f81115h;

        /* renamed from: com.yandex.mobile.ads.impl.jt0$d$a */
        /* loaded from: classes8.dex */
        public static final class C30662a {

            /* renamed from: a */
            private ph0<String, String> f81116a;

            /* renamed from: b */
            private oh0<Integer> f81117b;

            @Deprecated
            private C30662a() {
                this.f81116a = ph0.m30663g();
                this.f81117b = oh0.m31009h();
            }
        }

        private C30661d(C30662a c30662a) {
            c30662a.getClass();
            this.f81108a = (UUID) C30937nf.m31570a((Object) null);
            this.f81109b = null;
            this.f81110c = c30662a.f81116a;
            this.f81111d = false;
            this.f81113f = false;
            this.f81112e = false;
            this.f81114g = c30662a.f81117b;
            this.f81115h = null;
        }

        @Nullable
        /* renamed from: a */
        public final byte[] m32759a() {
            byte[] bArr = this.f81115h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30661d)) {
                return false;
            }
            C30661d c30661d = (C30661d) obj;
            if (this.f81108a.equals(c30661d.f81108a) && y32.m27076a(this.f81109b, c30661d.f81109b) && y32.m27076a(this.f81110c, c30661d.f81110c) && this.f81111d == c30661d.f81111d && this.f81113f == c30661d.f81113f && this.f81112e == c30661d.f81112e && this.f81114g.equals(c30661d.f81114g) && Arrays.equals(this.f81115h, c30661d.f81115h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.f81108a.hashCode() * 31;
            Uri uri = this.f81109b;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = this.f81110c.hashCode();
            int hashCode3 = this.f81114g.hashCode();
            return Arrays.hashCode(this.f81115h) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i) * 31)) * 31) + (this.f81111d ? 1 : 0)) * 31) + (this.f81113f ? 1 : 0)) * 31) + (this.f81112e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$e */
    /* loaded from: classes8.dex */
    public static final class C30663e implements InterfaceC30632jl {

        /* renamed from: g */
        public static final C30663e f81118g = new C30663e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* renamed from: h */
        public static final InterfaceC30632jl.InterfaceC30633a<C30663e> f81119h = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.hr2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                jt0.C30663e m32756a;
                m32756a = jt0.C30663e.m32756a(bundle);
                return m32756a;
            }
        };

        /* renamed from: b */
        public final long f81120b;

        /* renamed from: c */
        public final long f81121c;

        /* renamed from: d */
        public final long f81122d;

        /* renamed from: e */
        public final float f81123e;

        /* renamed from: f */
        public final float f81124f;

        /* renamed from: com.yandex.mobile.ads.impl.jt0$e$a */
        /* loaded from: classes8.dex */
        public static final class C30664a {

            /* renamed from: a */
            private long f81125a = -9223372036854775807L;

            /* renamed from: b */
            private long f81126b = -9223372036854775807L;

            /* renamed from: c */
            private long f81127c = -9223372036854775807L;

            /* renamed from: d */
            private float f81128d = -3.4028235E38f;

            /* renamed from: e */
            private float f81129e = -3.4028235E38f;

            /* renamed from: a */
            public final C30663e m32754a() {
                return new C30663e(this.f81125a, this.f81126b, this.f81127c, this.f81128d, this.f81129e);
            }
        }

        @Deprecated
        public C30663e(long j, long j2, long j3, float f, float f2) {
            this.f81120b = j;
            this.f81121c = j2;
            this.f81122d = j3;
            this.f81123e = f;
            this.f81124f = f2;
        }

        /* renamed from: a */
        public static C30663e m32756a(Bundle bundle) {
            return new C30663e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30663e)) {
                return false;
            }
            C30663e c30663e = (C30663e) obj;
            if (this.f81120b == c30663e.f81120b && this.f81121c == c30663e.f81121c && this.f81122d == c30663e.f81122d && this.f81123e == c30663e.f81123e && this.f81124f == c30663e.f81124f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            long j = this.f81120b;
            long j2 = this.f81121c;
            long j3 = this.f81122d;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f81123e;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f81124f;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$f */
    /* loaded from: classes8.dex */
    public static class C30665f {

        /* renamed from: a */
        public final Uri f81130a;
        @Nullable

        /* renamed from: b */
        public final String f81131b;
        @Nullable

        /* renamed from: c */
        public final C30661d f81132c;

        /* renamed from: d */
        public final List<StreamKey> f81133d;
        @Nullable

        /* renamed from: e */
        public final String f81134e;

        /* renamed from: f */
        public final oh0<C30670j> f81135f;
        @Nullable

        /* renamed from: g */
        public final Object f81136g;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30665f)) {
                return false;
            }
            C30665f c30665f = (C30665f) obj;
            if (this.f81130a.equals(c30665f.f81130a) && y32.m27076a(this.f81131b, c30665f.f81131b) && y32.m27076a(this.f81132c, c30665f.f81132c) && y32.m27076a((Object) null, (Object) null) && this.f81133d.equals(c30665f.f81133d) && y32.m27076a(this.f81134e, c30665f.f81134e) && this.f81135f.equals(c30665f.f81135f) && y32.m27076a(this.f81136g, c30665f.f81136g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f81130a.hashCode() * 31;
            String str = this.f81131b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            C30661d c30661d = this.f81132c;
            if (c30661d == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c30661d.hashCode();
            }
            int hashCode5 = (this.f81133d.hashCode() + ((i2 + hashCode2) * 961)) * 31;
            String str2 = this.f81134e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (this.f81135f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
            Object obj = this.f81136g;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode6 + i;
        }

        private C30665f(Uri uri, @Nullable String str, @Nullable C30661d c30661d, List list, @Nullable String str2, oh0 oh0Var, @Nullable Object obj) {
            this.f81130a = uri;
            this.f81131b = str;
            this.f81132c = c30661d;
            this.f81133d = list;
            this.f81134e = str2;
            this.f81135f = oh0Var;
            oh0.C31039a m31010g = oh0.m31010g();
            for (int i = 0; i < oh0Var.size(); i++) {
                m31010g.m31999b(((C30670j) oh0Var.get(i)).m32745a().m32744a());
            }
            m31010g.m31008a();
            this.f81136g = obj;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.jt0$g */
    /* loaded from: classes8.dex */
    public static final class C30666g extends C30665f {
        private C30666g(Uri uri, @Nullable String str, @Nullable C30661d c30661d, List list, @Nullable String str2, oh0 oh0Var, @Nullable Object obj) {
            super(uri, str, c30661d, list, str2, oh0Var, obj);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$h */
    /* loaded from: classes8.dex */
    public static final class C30667h implements InterfaceC30632jl {

        /* renamed from: d */
        public static final C30667h f81137d = new C30667h(new C30668a());

        /* renamed from: e */
        public static final InterfaceC30632jl.InterfaceC30633a<C30667h> f81138e = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.kr2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                jt0.C30667h m32753a;
                m32753a = jt0.C30667h.m32753a(bundle);
                return m32753a;
            }
        };
        @Nullable

        /* renamed from: b */
        public final Uri f81139b;
        @Nullable

        /* renamed from: c */
        public final String f81140c;

        /* renamed from: com.yandex.mobile.ads.impl.jt0$h$a */
        /* loaded from: classes8.dex */
        public static final class C30668a {
            @Nullable

            /* renamed from: a */
            private Uri f81141a;
            @Nullable

            /* renamed from: b */
            private String f81142b;
            @Nullable

            /* renamed from: c */
            private Bundle f81143c;
        }

        private C30667h(C30668a c30668a) {
            this.f81139b = c30668a.f81141a;
            this.f81140c = c30668a.f81142b;
            Bundle unused = c30668a.f81143c;
        }

        /* renamed from: a */
        public static C30667h m32753a(Bundle bundle) {
            C30668a c30668a = new C30668a();
            c30668a.f81141a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
            c30668a.f81142b = bundle.getString(Integer.toString(1, 36));
            c30668a.f81143c = bundle.getBundle(Integer.toString(2, 36));
            return new C30667h(c30668a);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30667h)) {
                return false;
            }
            C30667h c30667h = (C30667h) obj;
            if (y32.m27076a(this.f81139b, c30667h.f81139b) && y32.m27076a(this.f81140c, c30667h.f81140c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            Uri uri = this.f81139b;
            int i = 0;
            if (uri == null) {
                hashCode = 0;
            } else {
                hashCode = uri.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.f81140c;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }
    }

    @Deprecated
    /* renamed from: com.yandex.mobile.ads.impl.jt0$i */
    /* loaded from: classes8.dex */
    public static final class C30669i extends C30670j {
        private C30669i(C30670j.C30671a c30671a) {
            super(c30671a);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$j */
    /* loaded from: classes8.dex */
    public static class C30670j {

        /* renamed from: a */
        public final Uri f81144a;
        @Nullable

        /* renamed from: b */
        public final String f81145b;
        @Nullable

        /* renamed from: c */
        public final String f81146c;

        /* renamed from: d */
        public final int f81147d;

        /* renamed from: e */
        public final int f81148e;
        @Nullable

        /* renamed from: f */
        public final String f81149f;
        @Nullable

        /* renamed from: g */
        public final String f81150g;

        /* renamed from: com.yandex.mobile.ads.impl.jt0$j$a */
        /* loaded from: classes8.dex */
        public static final class C30671a {

            /* renamed from: a */
            private Uri f81151a;
            @Nullable

            /* renamed from: b */
            private String f81152b;
            @Nullable

            /* renamed from: c */
            private String f81153c;

            /* renamed from: d */
            private int f81154d;

            /* renamed from: e */
            private int f81155e;
            @Nullable

            /* renamed from: f */
            private String f81156f;
            @Nullable

            /* renamed from: g */
            private String f81157g;

            private C30671a(C30670j c30670j) {
                this.f81151a = c30670j.f81144a;
                this.f81152b = c30670j.f81145b;
                this.f81153c = c30670j.f81146c;
                this.f81154d = c30670j.f81147d;
                this.f81155e = c30670j.f81148e;
                this.f81156f = c30670j.f81149f;
                this.f81157g = c30670j.f81150g;
            }

            /* renamed from: a */
            public C30669i m32744a() {
                return new C30669i(this);
            }
        }

        /* renamed from: a */
        public final C30671a m32745a() {
            return new C30671a();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30670j)) {
                return false;
            }
            C30670j c30670j = (C30670j) obj;
            if (this.f81144a.equals(c30670j.f81144a) && y32.m27076a(this.f81145b, c30670j.f81145b) && y32.m27076a(this.f81146c, c30670j.f81146c) && this.f81147d == c30670j.f81147d && this.f81148e == c30670j.f81148e && y32.m27076a(this.f81149f, c30670j.f81149f) && y32.m27076a(this.f81150g, c30670j.f81150g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f81144a.hashCode() * 31;
            String str = this.f81145b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            String str2 = this.f81146c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (((((i2 + hashCode2) * 31) + this.f81147d) * 31) + this.f81148e) * 31;
            String str3 = this.f81149f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.f81150g;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        private C30670j(C30671a c30671a) {
            this.f81144a = c30671a.f81151a;
            this.f81145b = c30671a.f81152b;
            this.f81146c = c30671a.f81153c;
            this.f81147d = c30671a.f81154d;
            this.f81148e = c30671a.f81155e;
            this.f81149f = c30671a.f81156f;
            this.f81150g = c30671a.f81157g;
        }
    }

    static {
        new C30661d.C30662a();
        Collections.emptyList();
        oh0.m31009h();
        C30663e.C30664a c30664a = new C30663e.C30664a();
        C30667h c30667h = C30667h.f81137d;
        c30664a.m32754a();
        mt0 mt0Var = mt0.f82351H;
        f81080h = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.cr2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                jt0 m32779a;
                m32779a = jt0.m32779a(bundle);
                return m32779a;
            }
        };
    }

    /* renamed from: a */
    public static jt0 m32779a(Bundle bundle) {
        C30663e fromBundle;
        mt0 fromBundle2;
        C30660c fromBundle3;
        C30667h fromBundle4;
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        if (bundle2 == null) {
            fromBundle = C30663e.f81118g;
        } else {
            fromBundle = C30663e.f81119h.fromBundle(bundle2);
        }
        C30663e c30663e = fromBundle;
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        if (bundle3 == null) {
            fromBundle2 = mt0.f82351H;
        } else {
            fromBundle2 = mt0.f82352I.fromBundle(bundle3);
        }
        mt0 mt0Var = fromBundle2;
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        if (bundle4 == null) {
            fromBundle3 = C30660c.f81107h;
        } else {
            fromBundle3 = C30658b.f81096g.fromBundle(bundle4);
        }
        C30660c c30660c = fromBundle3;
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        if (bundle5 == null) {
            fromBundle4 = C30667h.f81137d;
        } else {
            fromBundle4 = C30667h.f81138e.fromBundle(bundle5);
        }
        return new jt0(string, c30660c, null, c30663e, mt0Var, fromBundle4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt0)) {
            return false;
        }
        jt0 jt0Var = (jt0) obj;
        if (y32.m27076a(this.f81081b, jt0Var.f81081b) && this.f81085f.equals(jt0Var.f81085f) && y32.m27076a(this.f81082c, jt0Var.f81082c) && y32.m27076a(this.f81083d, jt0Var.f81083d) && y32.m27076a(this.f81084e, jt0Var.f81084e) && y32.m27076a(this.f81086g, jt0Var.f81086g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f81081b.hashCode() * 31;
        C30666g c30666g = this.f81082c;
        if (c30666g != null) {
            i = c30666g.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f81083d.hashCode();
        int hashCode3 = this.f81085f.hashCode();
        int hashCode4 = this.f81084e.hashCode();
        return this.f81086g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31)) * 31);
    }

    private jt0(String str, C30660c c30660c, @Nullable C30666g c30666g, C30663e c30663e, mt0 mt0Var, C30667h c30667h) {
        this.f81081b = str;
        this.f81082c = c30666g;
        this.f81083d = c30663e;
        this.f81084e = mt0Var;
        this.f81085f = c30660c;
        this.f81086g = c30667h;
    }

    /* renamed from: com.yandex.mobile.ads.impl.jt0$a */
    /* loaded from: classes8.dex */
    public static final class C30657a {
        @Nullable

        /* renamed from: a */
        private String f81087a;
        @Nullable

        /* renamed from: b */
        private Uri f81088b;
        @Nullable

        /* renamed from: f */
        private String f81092f;

        /* renamed from: c */
        private C30658b.C30659a f81089c = new C30658b.C30659a();

        /* renamed from: d */
        private C30661d.C30662a f81090d = new C30661d.C30662a();

        /* renamed from: e */
        private List<StreamKey> f81091e = Collections.emptyList();

        /* renamed from: g */
        private oh0<C30670j> f81093g = oh0.m31009h();

        /* renamed from: h */
        private C30663e.C30664a f81094h = new C30663e.C30664a();

        /* renamed from: i */
        private C30667h f81095i = C30667h.f81137d;

        /* renamed from: a */
        public final jt0 m32776a() {
            this.f81090d.getClass();
            Uri uri = this.f81088b;
            C30666g c30666g = uri != null ? new C30666g(uri, null, null, this.f81091e, this.f81092f, this.f81093g, null) : null;
            String str = this.f81087a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C30658b.C30659a c30659a = this.f81089c;
            c30659a.getClass();
            return new jt0(str2, new C30660c(c30659a), c30666g, this.f81094h.m32754a(), mt0.f82351H, this.f81095i);
        }

        /* renamed from: b */
        public final C30657a m32772b(String str) {
            str.getClass();
            this.f81087a = str;
            return this;
        }

        /* renamed from: a */
        public final C30657a m32774a(@Nullable String str) {
            this.f81092f = str;
            return this;
        }

        /* renamed from: a */
        public final C30657a m32773a(@Nullable List<StreamKey> list) {
            List<StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.f81091e = emptyList;
            return this;
        }

        /* renamed from: a */
        public final C30657a m32775a(@Nullable Uri uri) {
            this.f81088b = uri;
            return this;
        }
    }

    /* renamed from: a */
    public static jt0 m32778a(String str) {
        C30658b.C30659a c30659a = new C30658b.C30659a();
        new C30661d.C30662a();
        List emptyList = Collections.emptyList();
        oh0 m31009h = oh0.m31009h();
        C30667h c30667h = C30667h.f81137d;
        Uri parse = str == null ? null : Uri.parse(str);
        return new jt0("", new C30660c(c30659a), parse != null ? new C30666g(parse, null, null, emptyList, null, m31009h, null) : null, new C30663e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), mt0.f82351H, c30667h);
    }
}
