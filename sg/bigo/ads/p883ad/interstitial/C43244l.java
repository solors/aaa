package sg.bigo.ads.p883ad.interstitial;

import android.os.SystemClock;
import java.lang.reflect.Array;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.ad.interstitial.l */
/* loaded from: classes10.dex */
public final class C43244l {

    /* renamed from: a */
    int f113207a = 1;

    /* renamed from: b */
    int f113208b = 2;

    /* renamed from: c */
    int f113209c = 3;

    /* renamed from: d */
    int f113210d = 4;

    /* renamed from: e */
    int f113211e = 5;

    /* renamed from: f */
    int f113212f = 6;

    /* renamed from: g */
    int f113213g = 7;

    /* renamed from: h */
    int f113214h = 8;

    /* renamed from: i */
    int f113215i = 1;

    /* renamed from: j */
    int f113216j = 2;

    /* renamed from: k */
    long f113217k = 0;

    /* renamed from: l */
    long f113218l = 0;

    /* renamed from: m */
    long f113219m = 0;

    /* renamed from: n */
    int[] f113220n = new int[10];

    /* renamed from: o */
    long[] f113221o = new long[10];

    /* renamed from: p */
    long[] f113222p = new long[10];

    /* renamed from: q */
    boolean[][] f113223q;

    /* renamed from: r */
    boolean[][] f113224r;

    /* renamed from: s */
    boolean f113225s;

    public C43244l() {
        Class cls = Boolean.TYPE;
        this.f113223q = (boolean[][]) Array.newInstance(cls, 10, 10);
        this.f113224r = (boolean[][]) Array.newInstance(cls, 10, 10);
        this.f113225s = false;
    }

    /* renamed from: a */
    private int m5880a() {
        return (this.f113217k == 0 || SystemClock.elapsedRealtime() - this.f113217k > 5000) ? this.f113216j : this.f113215i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5879a(int i) {
        try {
            long[] jArr = this.f113221o;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5878a(InterfaceC43550c interfaceC43550c, int i) {
        try {
            long[] jArr = this.f113221o;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
            if (this.f113222p[i] != 0) {
                int[] iArr = this.f113220n;
                int i2 = iArr[i];
                iArr[i] = 0;
                m5877a(interfaceC43550c, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m5877a(InterfaceC43550c interfaceC43550c, int i, int i2) {
        try {
            boolean[] zArr = this.f113224r[i2];
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            C44136b.m3878a(interfaceC43550c, i, i2, SystemClock.elapsedRealtime() - this.f113222p[i]);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m5876a(InterfaceC43550c interfaceC43550c, int i, int i2, int i3, int i4, int i5) {
        try {
            this.f113222p[i] = SystemClock.elapsedRealtime();
            this.f113220n[i] = m5880a();
            m5875a(interfaceC43550c, i, this.f113220n[i], i2, i3, i4, i5);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m5875a(InterfaceC43550c interfaceC43550c, int i, int i2, int i3, int i4, int i5, int i6) {
        long elapsedRealtime;
        long j;
        try {
            if (this.f113225s) {
                return;
            }
            boolean[] zArr = this.f113223q[i2];
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.f113221o[i];
            if (i == this.f113207a) {
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = this.f113221o[i];
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime();
                j = this.f113218l;
            }
            C44136b.m3877a(interfaceC43550c, i, i2, elapsedRealtime2, elapsedRealtime - j, i3, i4, i5, i6);
        } catch (Exception unused) {
        }
    }
}
