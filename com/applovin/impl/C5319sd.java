package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.C5319sd;
import com.applovin.impl.InterfaceC5044o2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.applovin.impl.sd */
/* loaded from: classes2.dex */
public final class C5319sd implements InterfaceC5044o2 {

    /* renamed from: g */
    public static final C5319sd f9639g = new C5322c().m95635a();

    /* renamed from: h */
    public static final InterfaceC5044o2.InterfaceC5045a f9640h = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.x40
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C5319sd.m95636b(bundle);
        }
    };

    /* renamed from: a */
    public final String f9641a;

    /* renamed from: b */
    public final C5328g f9642b;

    /* renamed from: c */
    public final C5326f f9643c;

    /* renamed from: d */
    public final C5631ud f9644d;

    /* renamed from: f */
    public final C5323d f9645f;

    /* renamed from: com.applovin.impl.sd$b */
    /* loaded from: classes2.dex */
    public static final class C5321b {
    }

    /* renamed from: com.applovin.impl.sd$d */
    /* loaded from: classes2.dex */
    public static final class C5323d implements InterfaceC5044o2 {

        /* renamed from: g */
        public static final InterfaceC5044o2.InterfaceC5045a f9661g = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.y40
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return C5319sd.C5323d.m95628b(bundle);
            }
        };

        /* renamed from: a */
        public final long f9662a;

        /* renamed from: b */
        public final long f9663b;

        /* renamed from: c */
        public final boolean f9664c;

        /* renamed from: d */
        public final boolean f9665d;

        /* renamed from: f */
        public final boolean f9666f;

        private C5323d(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f9662a = j;
            this.f9663b = j2;
            this.f9664c = z;
            this.f9665d = z2;
            this.f9666f = z3;
        }

        /* renamed from: a */
        private static String m95630a(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public static /* synthetic */ C5323d m95628b(Bundle bundle) {
            return m95629a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5323d)) {
                return false;
            }
            C5323d c5323d = (C5323d) obj;
            if (this.f9662a == c5323d.f9662a && this.f9663b == c5323d.f9663b && this.f9664c == c5323d.f9664c && this.f9665d == c5323d.f9665d && this.f9666f == c5323d.f9666f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f9662a;
            long j2 = this.f9663b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f9664c ? 1 : 0)) * 31) + (this.f9665d ? 1 : 0)) * 31) + (this.f9666f ? 1 : 0);
        }

        /* renamed from: a */
        public static /* synthetic */ C5323d m95629a(Bundle bundle) {
            return new C5323d(bundle.getLong(m95630a(0), 0L), bundle.getLong(m95630a(1), Long.MIN_VALUE), bundle.getBoolean(m95630a(2), false), bundle.getBoolean(m95630a(3), false), bundle.getBoolean(m95630a(4), false));
        }
    }

    /* renamed from: com.applovin.impl.sd$e */
    /* loaded from: classes2.dex */
    public static final class C5324e {

        /* renamed from: a */
        public final UUID f9667a;

        /* renamed from: b */
        public final Uri f9668b;

        /* renamed from: c */
        public final AbstractC4387fb f9669c;

        /* renamed from: d */
        public final boolean f9670d;

        /* renamed from: e */
        public final boolean f9671e;

        /* renamed from: f */
        public final boolean f9672f;

        /* renamed from: g */
        public final AbstractC4247db f9673g;

        /* renamed from: h */
        private final byte[] f9674h;

        /* renamed from: com.applovin.impl.sd$e$a */
        /* loaded from: classes2.dex */
        public static final class C5325a {

            /* renamed from: a */
            private UUID f9675a;

            /* renamed from: b */
            private Uri f9676b;

            /* renamed from: c */
            private AbstractC4387fb f9677c;

            /* renamed from: d */
            private boolean f9678d;

            /* renamed from: e */
            private boolean f9679e;

            /* renamed from: f */
            private boolean f9680f;

            /* renamed from: g */
            private AbstractC4247db f9681g;

            /* renamed from: h */
            private byte[] f9682h;

            private C5325a() {
                this.f9677c = AbstractC4387fb.m99379h();
                this.f9681g = AbstractC4247db.m99829h();
            }

            /* renamed from: a */
            public C5324e m95624a() {
                return new C5324e(this);
            }

            private C5325a(C5324e c5324e) {
                this.f9675a = c5324e.f9667a;
                this.f9676b = c5324e.f9668b;
                this.f9677c = c5324e.f9669c;
                this.f9678d = c5324e.f9670d;
                this.f9679e = c5324e.f9671e;
                this.f9680f = c5324e.f9672f;
                this.f9681g = c5324e.f9673g;
                this.f9682h = c5324e.f9674h;
            }
        }

        private C5324e(C5325a c5325a) {
            AbstractC4100b1.m100577b((c5325a.f9680f && c5325a.f9676b == null) ? false : true);
            this.f9667a = (UUID) AbstractC4100b1.m100583a(c5325a.f9675a);
            this.f9668b = c5325a.f9676b;
            this.f9669c = c5325a.f9677c;
            this.f9670d = c5325a.f9678d;
            this.f9672f = c5325a.f9680f;
            this.f9671e = c5325a.f9679e;
            this.f9673g = c5325a.f9681g;
            this.f9674h = c5325a.f9682h != null ? Arrays.copyOf(c5325a.f9682h, c5325a.f9682h.length) : null;
        }

        /* renamed from: b */
        public byte[] m95625b() {
            byte[] bArr = this.f9674h;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5324e)) {
                return false;
            }
            C5324e c5324e = (C5324e) obj;
            if (this.f9667a.equals(c5324e.f9667a) && AbstractC5863xp.m93016a(this.f9668b, c5324e.f9668b) && AbstractC5863xp.m93016a(this.f9669c, c5324e.f9669c) && this.f9670d == c5324e.f9670d && this.f9672f == c5324e.f9672f && this.f9671e == c5324e.f9671e && this.f9673g.equals(c5324e.f9673g) && Arrays.equals(this.f9674h, c5324e.f9674h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f9667a.hashCode() * 31;
            Uri uri = this.f9668b;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((hashCode + i) * 31) + this.f9669c.hashCode()) * 31) + (this.f9670d ? 1 : 0)) * 31) + (this.f9672f ? 1 : 0)) * 31) + (this.f9671e ? 1 : 0)) * 31) + this.f9673g.hashCode()) * 31) + Arrays.hashCode(this.f9674h);
        }

        /* renamed from: a */
        public C5325a m95627a() {
            return new C5325a();
        }
    }

    /* renamed from: com.applovin.impl.sd$f */
    /* loaded from: classes2.dex */
    public static final class C5326f implements InterfaceC5044o2 {

        /* renamed from: g */
        public static final C5326f f9683g = new C5327a().m95611a();

        /* renamed from: h */
        public static final InterfaceC5044o2.InterfaceC5045a f9684h = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.z40
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return C5319sd.C5326f.m95612b(bundle);
            }
        };

        /* renamed from: a */
        public final long f9685a;

        /* renamed from: b */
        public final long f9686b;

        /* renamed from: c */
        public final long f9687c;

        /* renamed from: d */
        public final float f9688d;

        /* renamed from: f */
        public final float f9689f;

        /* renamed from: com.applovin.impl.sd$f$a */
        /* loaded from: classes2.dex */
        public static final class C5327a {

            /* renamed from: a */
            private long f9690a;

            /* renamed from: b */
            private long f9691b;

            /* renamed from: c */
            private long f9692c;

            /* renamed from: d */
            private float f9693d;

            /* renamed from: e */
            private float f9694e;

            public C5327a() {
                this.f9690a = -9223372036854775807L;
                this.f9691b = -9223372036854775807L;
                this.f9692c = -9223372036854775807L;
                this.f9693d = -3.4028235E38f;
                this.f9694e = -3.4028235E38f;
            }

            /* renamed from: a */
            public C5326f m95611a() {
                return new C5326f(this);
            }

            private C5327a(C5326f c5326f) {
                this.f9690a = c5326f.f9685a;
                this.f9691b = c5326f.f9686b;
                this.f9692c = c5326f.f9687c;
                this.f9693d = c5326f.f9688d;
                this.f9694e = c5326f.f9689f;
            }
        }

        public C5326f(long j, long j2, long j3, float f, float f2) {
            this.f9685a = j;
            this.f9686b = j2;
            this.f9687c = j3;
            this.f9688d = f;
            this.f9689f = f2;
        }

        /* renamed from: a */
        private static String m95614a(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: b */
        public static /* synthetic */ C5326f m95612b(Bundle bundle) {
            return m95613a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5326f)) {
                return false;
            }
            C5326f c5326f = (C5326f) obj;
            if (this.f9685a == c5326f.f9685a && this.f9686b == c5326f.f9686b && this.f9687c == c5326f.f9687c && this.f9688d == c5326f.f9688d && this.f9689f == c5326f.f9689f) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            long j = this.f9685a;
            long j2 = this.f9686b;
            long j3 = this.f9687c;
            int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f9688d;
            int i3 = 0;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i4 = (i2 + i) * 31;
            float f2 = this.f9689f;
            if (f2 != 0.0f) {
                i3 = Float.floatToIntBits(f2);
            }
            return i4 + i3;
        }

        /* renamed from: a */
        public C5327a m95615a() {
            return new C5327a();
        }

        /* renamed from: a */
        public static /* synthetic */ C5326f m95613a(Bundle bundle) {
            return new C5326f(bundle.getLong(m95614a(0), -9223372036854775807L), bundle.getLong(m95614a(1), -9223372036854775807L), bundle.getLong(m95614a(2), -9223372036854775807L), bundle.getFloat(m95614a(3), -3.4028235E38f), bundle.getFloat(m95614a(4), -3.4028235E38f));
        }

        private C5326f(C5327a c5327a) {
            this(c5327a.f9690a, c5327a.f9691b, c5327a.f9692c, c5327a.f9693d, c5327a.f9694e);
        }
    }

    /* renamed from: com.applovin.impl.sd$g */
    /* loaded from: classes2.dex */
    public static final class C5328g {

        /* renamed from: a */
        public final Uri f9695a;

        /* renamed from: b */
        public final String f9696b;

        /* renamed from: c */
        public final C5324e f9697c;

        /* renamed from: d */
        public final List f9698d;

        /* renamed from: e */
        public final String f9699e;

        /* renamed from: f */
        public final List f9700f;

        /* renamed from: g */
        public final Object f9701g;

        private C5328g(Uri uri, String str, C5324e c5324e, C5321b c5321b, List list, String str2, List list2, Object obj) {
            this.f9695a = uri;
            this.f9696b = str;
            this.f9697c = c5324e;
            this.f9698d = list;
            this.f9699e = str2;
            this.f9700f = list2;
            this.f9701g = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5328g)) {
                return false;
            }
            C5328g c5328g = (C5328g) obj;
            if (this.f9695a.equals(c5328g.f9695a) && AbstractC5863xp.m93016a((Object) this.f9696b, (Object) c5328g.f9696b) && AbstractC5863xp.m93016a(this.f9697c, c5328g.f9697c) && AbstractC5863xp.m93016a((Object) null, (Object) null) && this.f9698d.equals(c5328g.f9698d) && AbstractC5863xp.m93016a((Object) this.f9699e, (Object) c5328g.f9699e) && this.f9700f.equals(c5328g.f9700f) && AbstractC5863xp.m93016a(this.f9701g, c5328g.f9701g)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.f9695a.hashCode() * 31;
            String str = this.f9696b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            C5324e c5324e = this.f9697c;
            if (c5324e == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c5324e.hashCode();
            }
            int hashCode5 = (((i2 + hashCode2) * 961) + this.f9698d.hashCode()) * 31;
            String str2 = this.f9699e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.f9700f.hashCode()) * 31;
            Object obj = this.f9701g;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode6 + i;
        }
    }

    private C5319sd(String str, C5323d c5323d, C5328g c5328g, C5326f c5326f, C5631ud c5631ud) {
        this.f9641a = str;
        this.f9642b = c5328g;
        this.f9643c = c5326f;
        this.f9644d = c5631ud;
        this.f9645f = c5323d;
    }

    /* renamed from: a */
    public static C5319sd m95637a(Bundle bundle) {
        C5326f c5326f;
        C5631ud c5631ud;
        C5323d c5323d;
        String str = (String) AbstractC4100b1.m100583a((Object) bundle.getString(m95639a(0), ""));
        Bundle bundle2 = bundle.getBundle(m95639a(1));
        if (bundle2 == null) {
            c5326f = C5326f.f9683g;
        } else {
            c5326f = (C5326f) C5326f.f9684h.mo92505a(bundle2);
        }
        C5326f c5326f2 = c5326f;
        Bundle bundle3 = bundle.getBundle(m95639a(2));
        if (bundle3 == null) {
            c5631ud = C5631ud.f11140H;
        } else {
            c5631ud = (C5631ud) C5631ud.f11141I.mo92505a(bundle3);
        }
        C5631ud c5631ud2 = c5631ud;
        Bundle bundle4 = bundle.getBundle(m95639a(3));
        if (bundle4 == null) {
            c5323d = new C5323d(0L, Long.MIN_VALUE, false, false, false);
        } else {
            c5323d = (C5323d) C5323d.f9661g.mo92505a(bundle4);
        }
        return new C5319sd(str, c5323d, null, c5326f2, c5631ud2);
    }

    /* renamed from: b */
    public static /* synthetic */ C5319sd m95636b(Bundle bundle) {
        return m95637a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5319sd)) {
            return false;
        }
        C5319sd c5319sd = (C5319sd) obj;
        if (AbstractC5863xp.m93016a((Object) this.f9641a, (Object) c5319sd.f9641a) && this.f9645f.equals(c5319sd.f9645f) && AbstractC5863xp.m93016a(this.f9642b, c5319sd.f9642b) && AbstractC5863xp.m93016a(this.f9643c, c5319sd.f9643c) && AbstractC5863xp.m93016a(this.f9644d, c5319sd.f9644d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f9641a.hashCode() * 31;
        C5328g c5328g = this.f9642b;
        if (c5328g != null) {
            i = c5328g.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + this.f9643c.hashCode()) * 31) + this.f9645f.hashCode()) * 31) + this.f9644d.hashCode();
    }

    /* renamed from: com.applovin.impl.sd$c */
    /* loaded from: classes2.dex */
    public static final class C5322c {

        /* renamed from: a */
        private String f9646a;

        /* renamed from: b */
        private Uri f9647b;

        /* renamed from: c */
        private String f9648c;

        /* renamed from: d */
        private long f9649d;

        /* renamed from: e */
        private long f9650e;

        /* renamed from: f */
        private boolean f9651f;

        /* renamed from: g */
        private boolean f9652g;

        /* renamed from: h */
        private boolean f9653h;

        /* renamed from: i */
        private C5324e.C5325a f9654i;

        /* renamed from: j */
        private List f9655j;

        /* renamed from: k */
        private String f9656k;

        /* renamed from: l */
        private List f9657l;

        /* renamed from: m */
        private Object f9658m;

        /* renamed from: n */
        private C5631ud f9659n;

        /* renamed from: o */
        private C5326f.C5327a f9660o;

        public C5322c() {
            this.f9650e = Long.MIN_VALUE;
            this.f9654i = new C5324e.C5325a();
            this.f9655j = Collections.emptyList();
            this.f9657l = Collections.emptyList();
            this.f9660o = new C5326f.C5327a();
        }

        /* renamed from: a */
        public C5319sd m95635a() {
            C5328g c5328g;
            AbstractC4100b1.m100577b(this.f9654i.f9676b == null || this.f9654i.f9675a != null);
            Uri uri = this.f9647b;
            if (uri != null) {
                c5328g = new C5328g(uri, this.f9648c, this.f9654i.f9675a != null ? this.f9654i.m95624a() : null, null, this.f9655j, this.f9656k, this.f9657l, this.f9658m);
            } else {
                c5328g = null;
            }
            String str = this.f9646a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C5323d c5323d = new C5323d(this.f9649d, this.f9650e, this.f9651f, this.f9652g, this.f9653h);
            C5326f m95611a = this.f9660o.m95611a();
            C5631ud c5631ud = this.f9659n;
            if (c5631ud == null) {
                c5631ud = C5631ud.f11140H;
            }
            return new C5319sd(str2, c5323d, c5328g, m95611a, c5631ud);
        }

        /* renamed from: b */
        public C5322c m95631b(String str) {
            this.f9646a = (String) AbstractC4100b1.m100583a((Object) str);
            return this;
        }

        private C5322c(C5319sd c5319sd) {
            this();
            C5324e.C5325a c5325a;
            C5323d c5323d = c5319sd.f9645f;
            this.f9650e = c5323d.f9663b;
            this.f9651f = c5323d.f9664c;
            this.f9652g = c5323d.f9665d;
            this.f9649d = c5323d.f9662a;
            this.f9653h = c5323d.f9666f;
            this.f9646a = c5319sd.f9641a;
            this.f9659n = c5319sd.f9644d;
            this.f9660o = c5319sd.f9643c.m95615a();
            C5328g c5328g = c5319sd.f9642b;
            if (c5328g != null) {
                this.f9656k = c5328g.f9699e;
                this.f9648c = c5328g.f9696b;
                this.f9647b = c5328g.f9695a;
                this.f9655j = c5328g.f9698d;
                this.f9657l = c5328g.f9700f;
                this.f9658m = c5328g.f9701g;
                C5324e c5324e = c5328g.f9697c;
                if (c5324e != null) {
                    c5325a = c5324e.m95627a();
                } else {
                    c5325a = new C5324e.C5325a();
                }
                this.f9654i = c5325a;
            }
        }

        /* renamed from: a */
        public C5322c m95632a(String str) {
            this.f9656k = str;
            return this;
        }

        /* renamed from: a */
        public C5322c m95633a(Object obj) {
            this.f9658m = obj;
            return this;
        }

        /* renamed from: a */
        public C5322c m95634a(Uri uri) {
            this.f9647b = uri;
            return this;
        }
    }

    /* renamed from: a */
    private static String m95639a(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public static C5319sd m95638a(Uri uri) {
        return new C5322c().m95634a(uri).m95635a();
    }

    /* renamed from: a */
    public C5322c m95640a() {
        return new C5322c();
    }
}
