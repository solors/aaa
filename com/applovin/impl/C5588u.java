package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.C5588u;
import com.applovin.impl.InterfaceC5044o2;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.applovin.impl.u */
/* loaded from: classes2.dex */
public final class C5588u implements InterfaceC5044o2 {

    /* renamed from: h */
    public static final C5588u f10959h = new C5588u(null, new C5589a[0], 0, -9223372036854775807L, 0);

    /* renamed from: i */
    private static final C5589a f10960i = new C5589a(0).m94340c(0);

    /* renamed from: j */
    public static final InterfaceC5044o2.InterfaceC5045a f10961j = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.y50
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C5588u.m94350b(bundle);
        }
    };

    /* renamed from: a */
    public final Object f10962a;

    /* renamed from: b */
    public final int f10963b;

    /* renamed from: c */
    public final long f10964c;

    /* renamed from: d */
    public final long f10965d;

    /* renamed from: f */
    public final int f10966f;

    /* renamed from: g */
    private final C5589a[] f10967g;

    /* renamed from: com.applovin.impl.u$a */
    /* loaded from: classes2.dex */
    public static final class C5589a implements InterfaceC5044o2 {

        /* renamed from: i */
        public static final InterfaceC5044o2.InterfaceC5045a f10968i = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.z50
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return C5588u.C5589a.m94342b(bundle);
            }
        };

        /* renamed from: a */
        public final long f10969a;

        /* renamed from: b */
        public final int f10970b;

        /* renamed from: c */
        public final Uri[] f10971c;

        /* renamed from: d */
        public final int[] f10972d;

        /* renamed from: f */
        public final long[] f10973f;

        /* renamed from: g */
        public final long f10974g;

        /* renamed from: h */
        public final boolean f10975h;

        public C5589a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        /* renamed from: a */
        private static long[] m94345a(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        /* renamed from: b */
        public static /* synthetic */ C5589a m94342b(Bundle bundle) {
            return m94347a(bundle);
        }

        /* renamed from: c */
        public boolean m94341c() {
            return this.f10970b == -1 || m94349a() < this.f10970b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5589a.class != obj.getClass()) {
                return false;
            }
            C5589a c5589a = (C5589a) obj;
            if (this.f10969a == c5589a.f10969a && this.f10970b == c5589a.f10970b && Arrays.equals(this.f10971c, c5589a.f10971c) && Arrays.equals(this.f10972d, c5589a.f10972d) && Arrays.equals(this.f10973f, c5589a.f10973f) && this.f10974g == c5589a.f10974g && this.f10975h == c5589a.f10975h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f10969a;
            long j2 = this.f10974g;
            return (((((((((((this.f10970b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f10971c)) * 31) + Arrays.hashCode(this.f10972d)) * 31) + Arrays.hashCode(this.f10973f)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f10975h ? 1 : 0);
        }

        private C5589a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            AbstractC4100b1.m100580a(iArr.length == uriArr.length);
            this.f10969a = j;
            this.f10970b = i;
            this.f10972d = iArr;
            this.f10971c = uriArr;
            this.f10973f = jArr;
            this.f10974g = j2;
            this.f10975h = z;
        }

        /* renamed from: b */
        public boolean m94344b() {
            if (this.f10970b == -1) {
                return true;
            }
            for (int i = 0; i < this.f10970b; i++) {
                int i2 = this.f10972d[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public C5589a m94340c(int i) {
            int[] m94346a = m94346a(this.f10972d, i);
            long[] m94345a = m94345a(this.f10973f, i);
            return new C5589a(this.f10969a, i, m94346a, (Uri[]) Arrays.copyOf(this.f10971c, i), m94345a, this.f10974g, this.f10975h);
        }

        /* renamed from: a */
        private static int[] m94346a(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: b */
        private static String m94343b(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public static C5589a m94347a(Bundle bundle) {
            long j = bundle.getLong(m94343b(0));
            int i = bundle.getInt(m94343b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m94343b(2));
            int[] intArray = bundle.getIntArray(m94343b(3));
            long[] longArray = bundle.getLongArray(m94343b(4));
            long j2 = bundle.getLong(m94343b(5));
            boolean z = bundle.getBoolean(m94343b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C5589a(j, i, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        /* renamed from: a */
        public int m94349a() {
            return m94348a(-1);
        }

        /* renamed from: a */
        public int m94348a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f10972d;
                if (i3 >= iArr.length || this.f10975h || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }
    }

    private C5588u(Object obj, C5589a[] c5589aArr, long j, long j2, int i) {
        this.f10962a = obj;
        this.f10964c = j;
        this.f10965d = j2;
        this.f10963b = c5589aArr.length + i;
        this.f10967g = c5589aArr;
        this.f10966f = i;
    }

    /* renamed from: a */
    public static C5588u m94353a(Bundle bundle) {
        C5589a[] c5589aArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m94352b(1));
        if (parcelableArrayList == null) {
            c5589aArr = new C5589a[0];
        } else {
            C5589a[] c5589aArr2 = new C5589a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c5589aArr2[i] = (C5589a) C5589a.f10968i.mo92505a((Bundle) parcelableArrayList.get(i));
            }
            c5589aArr = c5589aArr2;
        }
        return new C5588u(null, c5589aArr, bundle.getLong(m94352b(2), 0L), bundle.getLong(m94352b(3), -9223372036854775807L), bundle.getInt(m94352b(4)));
    }

    /* renamed from: b */
    public static /* synthetic */ C5588u m94350b(Bundle bundle) {
        return m94353a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5588u.class != obj.getClass()) {
            return false;
        }
        C5588u c5588u = (C5588u) obj;
        if (AbstractC5863xp.m93016a(this.f10962a, c5588u.f10962a) && this.f10963b == c5588u.f10963b && this.f10964c == c5588u.f10964c && this.f10965d == c5588u.f10965d && this.f10966f == c5588u.f10966f && Arrays.equals(this.f10967g, c5588u.f10967g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = this.f10963b * 31;
        Object obj = this.f10962a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i + hashCode) * 31) + ((int) this.f10964c)) * 31) + ((int) this.f10965d)) * 31) + this.f10966f) * 31) + Arrays.hashCode(this.f10967g);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f10962a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f10964c);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f10967g.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f10967g[i].f10969a);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f10967g[i].f10972d.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f10967g[i].f10972d[i2];
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    sb2.append('?');
                                } else {
                                    sb2.append('!');
                                }
                            } else {
                                sb2.append('P');
                            }
                        } else {
                            sb2.append('S');
                        }
                    } else {
                        sb2.append('R');
                    }
                } else {
                    sb2.append('_');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f10967g[i].f10973f[i2]);
                sb2.append(')');
                if (i2 < this.f10967g[i].f10972d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f10967g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    /* renamed from: b */
    public int m94351b(long j, long j2) {
        int i = this.f10963b - 1;
        while (i >= 0 && m94354a(j, j2, i)) {
            i--;
        }
        if (i < 0 || !m94356a(i).m94344b()) {
            return -1;
        }
        return i;
    }

    /* renamed from: b */
    private static String m94352b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public C5589a m94356a(int i) {
        int i2 = this.f10966f;
        if (i < i2) {
            return f10960i;
        }
        return this.f10967g[i - i2];
    }

    /* renamed from: a */
    public int m94355a(long j, long j2) {
        if (j != Long.MIN_VALUE) {
            if (j2 == -9223372036854775807L || j < j2) {
                int i = this.f10966f;
                while (i < this.f10963b && ((m94356a(i).f10969a != Long.MIN_VALUE && m94356a(i).f10969a <= j) || !m94356a(i).m94341c())) {
                    i++;
                }
                if (i < this.f10963b) {
                    return i;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m94354a(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = m94356a(i).f10969a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }
}
