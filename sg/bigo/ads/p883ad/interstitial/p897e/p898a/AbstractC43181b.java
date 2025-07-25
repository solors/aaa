package sg.bigo.ads.p883ad.interstitial.p897e.p898a;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* renamed from: sg.bigo.ads.ad.interstitial.e.a.b */
/* loaded from: classes10.dex */
public abstract class AbstractC43181b {

    /* renamed from: b */
    protected final int f113000b;

    /* renamed from: c */
    protected final int f113001c;

    /* renamed from: d */
    protected final int f113002d;

    /* renamed from: e */
    protected final int f113003e;

    /* renamed from: f */
    protected final int f113004f;

    /* renamed from: g */
    protected final int f113005g;

    /* renamed from: h */
    protected final int f113006h;

    /* renamed from: i */
    protected final int f113007i;

    /* renamed from: j */
    protected final C43182a f113008j = new C43182a(this, (byte) 0);

    /* renamed from: sg.bigo.ads.ad.interstitial.e.a.b$a */
    /* loaded from: classes10.dex */
    public static class C43182a {

        /* renamed from: a */
        public final boolean f113009a;

        /* renamed from: b */
        public int f113010b;

        /* renamed from: c */
        public final int f113011c;

        /* renamed from: d */
        public final int f113012d;

        /* renamed from: e */
        public final int f113013e;

        /* renamed from: f */
        public final int f113014f;

        /* renamed from: g */
        public final int f113015g;

        /* renamed from: h */
        public final int f113016h;

        /* renamed from: i */
        public final int f113017i;

        /* renamed from: j */
        public final int f113018j;

        /* renamed from: k */
        public final int f113019k;

        /* renamed from: l */
        public final int f113020l;

        /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private C43182a(@androidx.annotation.NonNull sg.bigo.ads.p883ad.interstitial.p897e.p898a.AbstractC43181b r9) {
            /*
                r8 = this;
                r8.<init>()
                int r0 = sg.bigo.ads.p883ad.interstitial.C43076d.f112767b
                int r1 = r9.m5987e()
                r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                r3 = 3
                r4 = 2
                r5 = 1041865114(0x3e19999a, float:0.15)
                r6 = 0
                r7 = -1
                if (r1 == r4) goto L32
                if (r1 == r3) goto L25
                r8.f113009a = r6
                r8.f113010b = r7
                int r1 = sg.bigo.ads.common.p940w.C43887b.m4686a(r0, r5)
                r8.f113011c = r1
                r8.f113012d = r0
                r8.f113014f = r0
                goto L40
            L25:
                r1 = 1
                r8.f113009a = r1
                r1 = 1050253722(0x3e99999a, float:0.3)
                int r1 = sg.bigo.ads.common.p940w.C43887b.m4686a(r2, r1)
                r8.f113010b = r1
                goto L36
            L32:
                r8.f113009a = r6
                r8.f113010b = r2
            L36:
                int r1 = sg.bigo.ads.common.p940w.C43887b.m4686a(r7, r5)
                r8.f113011c = r1
                r8.f113012d = r7
                r8.f113014f = r7
            L40:
                int r1 = r8.f113014f
                r2 = 128(0x80, float:1.794E-43)
                int r1 = sg.bigo.ads.common.p940w.C43887b.m4685a(r1, r2)
                r8.f113013e = r1
                int r1 = r9.mo5982c()
                if (r1 == r4) goto L5c
                r2 = 4
                if (r1 == r2) goto L5c
                int r1 = r8.f113010b
                r8.f113015g = r1
                int r1 = r8.f113011c
                r8.f113016h = r1
                goto L60
            L5c:
                r8.f113015g = r6
                r8.f113016h = r6
            L60:
                r8.f113017i = r7
                int r0 = sg.bigo.ads.common.p940w.C43887b.m4686a(r0, r5)
                r8.f113018j = r0
                int r9 = r9.m5988d()
                if (r9 == r4) goto L80
                if (r9 == r3) goto L78
                r9 = -16736769(0xffffffffff009dff, float:-1.7096155E38)
                r8.f113019k = r9
                r8.f113020l = r6
                return
            L78:
                r9 = 872415231(0x33ffffff, float:1.1920928E-7)
                r8.f113019k = r9
                r8.f113020l = r7
                return
            L80:
                r9 = -14972829(0xffffffffff1b8863, float:-2.067385E38)
                r8.f113019k = r9
                r8.f113020l = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.p883ad.interstitial.p897e.p898a.AbstractC43181b.C43182a.<init>(sg.bigo.ads.ad.interstitial.e.a.b):void");
        }

        /* synthetic */ C43182a(AbstractC43181b abstractC43181b, byte b) {
            this(abstractC43181b);
        }
    }

    public AbstractC43181b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f113000b = i;
        this.f113001c = i2;
        this.f113002d = i3;
        this.f113003e = i4;
        this.f113004f = i5;
        this.f113005g = i6;
        this.f113006h = i7;
        this.f113007i = i8;
    }

    @NonNull
    /* renamed from: a */
    public final C43182a m5991a() {
        return this.f113008j;
    }

    /* renamed from: b */
    public final int m5989b() {
        int i = this.f113000b;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return 0;
        }
        return i;
    }

    /* renamed from: c */
    public int mo5982c() {
        int i = this.f113001c;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            return 1;
        }
        return i;
    }

    /* renamed from: d */
    public final int m5988d() {
        int i = this.f113002d;
        if (i != 1 && i != 2 && i != 3) {
            return 1;
        }
        return i;
    }

    /* renamed from: e */
    public final int m5987e() {
        int i = this.f113003e;
        if (i != 1 && i != 2 && i != 3) {
            return 1;
        }
        return i;
    }

    /* renamed from: f */
    public final int m5986f() {
        int i = this.f113004f;
        if (i != 2 && i != 4 && i != 6 && i != 8 && i != 10 && i != 12 && i != 14 && i != 16 && i != 18 && i != 20) {
            return 20;
        }
        return i;
    }

    /* renamed from: g */
    public final long m5985g() {
        int i = this.f113005g;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return 0L;
        }
        return TimeUnit.SECONDS.toMillis(i);
    }

    /* renamed from: h */
    public final long m5984h() {
        int i = this.f113006h;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return TimeUnit.SECONDS.toMillis(2L);
        }
        return TimeUnit.SECONDS.toMillis(i);
    }

    /* renamed from: i */
    public final int m5983i() {
        int i = this.f113007i;
        if (i != 1 && i != 2 && i != 3) {
            return 3;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m5990a(AbstractC43181b abstractC43181b) {
        return abstractC43181b == null || abstractC43181b.m5989b() == 0;
    }
}
