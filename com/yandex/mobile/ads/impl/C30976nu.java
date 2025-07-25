package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.nu */
/* loaded from: classes8.dex */
public final class C30976nu {

    /* renamed from: a */
    public final Uri f83111a;

    /* renamed from: b */
    public final long f83112b;

    /* renamed from: c */
    public final int f83113c;
    @Nullable

    /* renamed from: d */
    public final byte[] f83114d;

    /* renamed from: e */
    public final Map<String, String> f83115e;

    /* renamed from: f */
    public final long f83116f;

    /* renamed from: g */
    public final long f83117g;
    @Nullable

    /* renamed from: h */
    public final String f83118h;

    /* renamed from: i */
    public final int f83119i;
    @Nullable

    /* renamed from: j */
    public final Object f83120j;

    /* renamed from: com.yandex.mobile.ads.impl.nu$a */
    /* loaded from: classes8.dex */
    public static final class C30977a {
        @Nullable

        /* renamed from: a */
        private Uri f83121a;

        /* renamed from: b */
        private long f83122b;

        /* renamed from: c */
        private int f83123c;
        @Nullable

        /* renamed from: d */
        private byte[] f83124d;

        /* renamed from: e */
        private Map<String, String> f83125e;

        /* renamed from: f */
        private long f83126f;

        /* renamed from: g */
        private long f83127g;
        @Nullable

        /* renamed from: h */
        private String f83128h;

        /* renamed from: i */
        private int f83129i;
        @Nullable

        /* renamed from: j */
        private Object f83130j;

        /* renamed from: a */
        public final C30976nu m31291a() {
            if (this.f83121a != null) {
                return new C30976nu(this.f83121a, this.f83122b, this.f83123c, this.f83124d, this.f83125e, this.f83126f, this.f83127g, this.f83128h, this.f83129i, this.f83130j);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        /* renamed from: b */
        public final C30977a m31284b() {
            this.f83123c = 2;
            return this;
        }

        /* renamed from: c */
        public final C30977a m31281c(long j) {
            this.f83122b = j;
            return this;
        }

        public C30977a() {
            this.f83123c = 1;
            this.f83125e = Collections.emptyMap();
            this.f83127g = -1L;
        }

        /* renamed from: b */
        public final C30977a m31283b(long j) {
            this.f83126f = j;
            return this;
        }

        /* renamed from: b */
        public final C30977a m31282b(String str) {
            this.f83121a = Uri.parse(str);
            return this;
        }

        /* renamed from: a */
        public final C30977a m31290a(int i) {
            this.f83129i = i;
            return this;
        }

        /* renamed from: a */
        public final C30977a m31285a(@Nullable byte[] bArr) {
            this.f83124d = bArr;
            return this;
        }

        private C30977a(C30976nu c30976nu) {
            this.f83121a = c30976nu.f83111a;
            this.f83122b = c30976nu.f83112b;
            this.f83123c = c30976nu.f83113c;
            this.f83124d = c30976nu.f83114d;
            this.f83125e = c30976nu.f83115e;
            this.f83126f = c30976nu.f83116f;
            this.f83127g = c30976nu.f83117g;
            this.f83128h = c30976nu.f83118h;
            this.f83129i = c30976nu.f83119i;
            this.f83130j = c30976nu.f83120j;
        }

        /* renamed from: a */
        public final C30977a m31286a(Map<String, String> map) {
            this.f83125e = map;
            return this;
        }

        /* renamed from: a */
        public final C30977a m31287a(@Nullable String str) {
            this.f83128h = str;
            return this;
        }

        /* renamed from: a */
        public final C30977a m31289a(long j) {
            this.f83127g = j;
            return this;
        }

        /* renamed from: a */
        public final C30977a m31288a(Uri uri) {
            this.f83121a = uri;
            return this;
        }
    }

    static {
        i40.m33371a("goog.exo.datasource");
    }

    /* renamed from: a */
    public static String m31293a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public final String toString() {
        return "DataSpec[" + m31293a(this.f83113c) + " " + this.f83111a + ", " + this.f83116f + ", " + this.f83117g + ", " + this.f83118h + ", " + this.f83119i + C21114v8.C21123i.f54139e;
    }

    private C30976nu(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        boolean z = true;
        C30937nf.m31567a(j + j2 >= 0);
        C30937nf.m31567a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C30937nf.m31567a(z);
        this.f83111a = uri;
        this.f83112b = j;
        this.f83113c = i;
        this.f83114d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f83115e = Collections.unmodifiableMap(new HashMap(map));
        this.f83116f = j2;
        this.f83117g = j3;
        this.f83118h = str;
        this.f83119i = i2;
        this.f83120j = obj;
    }

    /* renamed from: a */
    public final C30976nu m31292a(long j) {
        return this.f83117g == j ? this : new C30976nu(this.f83111a, this.f83112b, this.f83113c, this.f83114d, this.f83115e, this.f83116f, j, this.f83118h, this.f83119i, this.f83120j);
    }

    /* renamed from: a */
    public final C30977a m31294a() {
        return new C30977a();
    }
}
