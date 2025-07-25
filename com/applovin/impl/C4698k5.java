package com.applovin.impl;

import android.net.Uri;
import com.ironsource.C21114v8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.k5 */
/* loaded from: classes2.dex */
public final class C4698k5 {

    /* renamed from: a */
    public final Uri f7366a;

    /* renamed from: b */
    public final long f7367b;

    /* renamed from: c */
    public final int f7368c;

    /* renamed from: d */
    public final byte[] f7369d;

    /* renamed from: e */
    public final Map f7370e;

    /* renamed from: f */
    public final long f7371f;

    /* renamed from: g */
    public final long f7372g;

    /* renamed from: h */
    public final long f7373h;

    /* renamed from: i */
    public final String f7374i;

    /* renamed from: j */
    public final int f7375j;

    /* renamed from: k */
    public final Object f7376k;

    /* renamed from: com.applovin.impl.k5$b */
    /* loaded from: classes2.dex */
    public static final class C4700b {

        /* renamed from: a */
        private Uri f7377a;

        /* renamed from: b */
        private long f7378b;

        /* renamed from: c */
        private int f7379c;

        /* renamed from: d */
        private byte[] f7380d;

        /* renamed from: e */
        private Map f7381e;

        /* renamed from: f */
        private long f7382f;

        /* renamed from: g */
        private long f7383g;

        /* renamed from: h */
        private String f7384h;

        /* renamed from: i */
        private int f7385i;

        /* renamed from: j */
        private Object f7386j;

        public C4700b() {
            this.f7379c = 1;
            this.f7381e = Collections.emptyMap();
            this.f7383g = -1L;
        }

        /* renamed from: a */
        public C4698k5 m98020a() {
            AbstractC4100b1.m100582a(this.f7377a, "The uri must be set.");
            return new C4698k5(this.f7377a, this.f7378b, this.f7379c, this.f7380d, this.f7381e, this.f7382f, this.f7383g, this.f7384h, this.f7385i, this.f7386j);
        }

        /* renamed from: b */
        public C4700b m98013b(int i) {
            this.f7379c = i;
            return this;
        }

        /* renamed from: b */
        public C4700b m98012b(String str) {
            this.f7377a = Uri.parse(str);
            return this;
        }

        /* renamed from: a */
        public C4700b m98019a(int i) {
            this.f7385i = i;
            return this;
        }

        /* renamed from: a */
        public C4700b m98014a(byte[] bArr) {
            this.f7380d = bArr;
            return this;
        }

        private C4700b(C4698k5 c4698k5) {
            this.f7377a = c4698k5.f7366a;
            this.f7378b = c4698k5.f7367b;
            this.f7379c = c4698k5.f7368c;
            this.f7380d = c4698k5.f7369d;
            this.f7381e = c4698k5.f7370e;
            this.f7382f = c4698k5.f7372g;
            this.f7383g = c4698k5.f7373h;
            this.f7384h = c4698k5.f7374i;
            this.f7385i = c4698k5.f7375j;
            this.f7386j = c4698k5.f7376k;
        }

        /* renamed from: a */
        public C4700b m98015a(Map map) {
            this.f7381e = map;
            return this;
        }

        /* renamed from: a */
        public C4700b m98016a(String str) {
            this.f7384h = str;
            return this;
        }

        /* renamed from: a */
        public C4700b m98018a(long j) {
            this.f7382f = j;
            return this;
        }

        /* renamed from: a */
        public C4700b m98017a(Uri uri) {
            this.f7377a = uri;
            return this;
        }
    }

    private C4698k5(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        AbstractC4100b1.m100580a(j4 >= 0);
        AbstractC4100b1.m100580a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f7366a = uri;
        this.f7367b = j;
        this.f7368c = i;
        this.f7369d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f7370e = Collections.unmodifiableMap(new HashMap(map));
        this.f7372g = j2;
        this.f7371f = j4;
        this.f7373h = j3;
        this.f7374i = str;
        this.f7375j = i2;
        this.f7376k = obj;
    }

    /* renamed from: a */
    public static String m98023a(int i) {
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

    /* renamed from: b */
    public final String m98022b() {
        return m98023a(this.f7368c);
    }

    public String toString() {
        return "DataSpec[" + m98022b() + " " + this.f7366a + ", " + this.f7372g + ", " + this.f7373h + ", " + this.f7374i + ", " + this.f7375j + C21114v8.C21123i.f54139e;
    }

    /* renamed from: a */
    public C4700b m98024a() {
        return new C4700b();
    }

    /* renamed from: b */
    public boolean m98021b(int i) {
        return (this.f7375j & i) == i;
    }
}
