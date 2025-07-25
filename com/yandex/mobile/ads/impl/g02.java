package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C30363g5;
import com.yandex.mobile.ads.impl.InterfaceC30632jl;
import com.yandex.mobile.ads.impl.g02;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.oh0;

/* loaded from: classes8.dex */
public abstract class g02 implements InterfaceC30632jl {

    /* renamed from: b */
    public static final g02 f79382b = new C30351a();

    /* renamed from: com.yandex.mobile.ads.impl.g02$a */
    /* loaded from: classes8.dex */
    final class C30351a extends g02 {
        C30351a() {
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo31769a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: b */
        public final int mo31764b() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo31765a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final C30354d mo31766a(int i, C30354d c30354d, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final C30352b mo31767a(int i, C30352b c30352b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final Object mo31768a(int i) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.g02$b */
    /* loaded from: classes8.dex */
    public static final class C30352b implements InterfaceC30632jl {

        /* renamed from: i */
        public static final InterfaceC30632jl.InterfaceC30633a<C30352b> f79383i = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.ro2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return g02.C30352b.m34017b(bundle);
            }
        };
        @Nullable

        /* renamed from: b */
        public Object f79384b;
        @Nullable

        /* renamed from: c */
        public Object f79385c;

        /* renamed from: d */
        public int f79386d;

        /* renamed from: e */
        public long f79387e;

        /* renamed from: f */
        public long f79388f;

        /* renamed from: g */
        public boolean f79389g;

        /* renamed from: h */
        private C30363g5 f79390h = C30363g5.f79498h;

        /* renamed from: a */
        public static C30352b m34023a(Bundle bundle) {
            C30363g5 c30363g5;
            int i = bundle.getInt(Integer.toString(0, 36), 0);
            long j = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j2 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            if (bundle2 != null) {
                c30363g5 = C30363g5.f79500j.fromBundle(bundle2);
            } else {
                c30363g5 = C30363g5.f79498h;
            }
            C30363g5 c30363g52 = c30363g5;
            C30352b c30352b = new C30352b();
            c30352b.m34022a(null, null, i, j, j2, c30363g52, z);
            return c30352b;
        }

        /* renamed from: b */
        public static /* synthetic */ C30352b m34017b(Bundle bundle) {
            return m34023a(bundle);
        }

        /* renamed from: d */
        public final int m34011d(int i) {
            return this.f79390h.m33927a(i).m33923a(-1);
        }

        /* renamed from: e */
        public final boolean m34010e(int i) {
            boolean z;
            C30363g5.C30364a m33927a = this.f79390h.m33927a(i);
            if (m33927a.f79509c != -1) {
                z = false;
                for (int i2 = 0; i2 < m33927a.f79509c; i2++) {
                    int i3 = m33927a.f79511e[i2];
                    if (i3 != 0 && i3 != 1) {
                    }
                }
                return !z;
            }
            z = true;
            return !z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C30352b.class.equals(obj.getClass())) {
                return false;
            }
            C30352b c30352b = (C30352b) obj;
            if (y32.m27076a(this.f79384b, c30352b.f79384b) && y32.m27076a(this.f79385c, c30352b.f79385c) && this.f79386d == c30352b.f79386d && this.f79387e == c30352b.f79387e && this.f79388f == c30352b.f79388f && this.f79389g == c30352b.f79389g && y32.m27076a(this.f79390h, c30352b.f79390h)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean m34009f(int i) {
            return this.f79390h.m33927a(i).f79514h;
        }

        public final int hashCode() {
            int hashCode;
            Object obj = this.f79384b;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode + 217) * 31;
            Object obj2 = this.f79385c;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f79387e;
            long j2 = this.f79388f;
            return this.f79390h.hashCode() + ((((((((((i2 + i) * 31) + this.f79386d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f79389g ? 1 : 0)) * 31);
        }

        /* renamed from: b */
        public final int m34018b(long j) {
            C30363g5 c30363g5 = this.f79390h;
            long j2 = this.f79387e;
            int i = c30363g5.f79502c - 1;
            while (i >= 0 && j != Long.MIN_VALUE) {
                long j3 = c30363g5.m33927a(i).f79508b;
                if (j3 != Long.MIN_VALUE) {
                    if (j >= j3) {
                        break;
                    }
                    i--;
                } else {
                    if (j2 != -9223372036854775807L && j >= j2) {
                        break;
                    }
                    i--;
                }
            }
            if (i >= 0) {
                C30363g5.C30364a m33927a = c30363g5.m33927a(i);
                if (m33927a.f79509c == -1) {
                    return i;
                }
                for (int i2 = 0; i2 < m33927a.f79509c; i2++) {
                    int i3 = m33927a.f79511e[i2];
                    if (i3 == 0 || i3 == 1) {
                        return i;
                    }
                }
            }
            return -1;
        }

        /* renamed from: c */
        public final long m34015c(int i) {
            return this.f79390h.m33927a(i).f79513g;
        }

        /* renamed from: c */
        public final int m34014c(int i, int i2) {
            return this.f79390h.m33927a(i).m33923a(i2);
        }

        /* renamed from: d */
        public final int m34012d() {
            return this.f79390h.f79505f;
        }

        /* renamed from: c */
        public final long m34016c() {
            return this.f79388f;
        }

        /* renamed from: b */
        public final long m34020b(int i) {
            return this.f79390h.m33927a(i).f79508b;
        }

        /* renamed from: b */
        public final long m34021b() {
            return this.f79390h.f79503d;
        }

        /* renamed from: b */
        public final int m34019b(int i, int i2) {
            C30363g5.C30364a m33927a = this.f79390h.m33927a(i);
            if (m33927a.f79509c != -1) {
                return m33927a.f79511e[i2];
            }
            return 0;
        }

        /* renamed from: a */
        public final int m34026a(int i) {
            return this.f79390h.m33927a(i).f79509c;
        }

        /* renamed from: a */
        public final long m34025a(int i, int i2) {
            C30363g5.C30364a m33927a = this.f79390h.m33927a(i);
            if (m33927a.f79509c != -1) {
                return m33927a.f79512f[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: a */
        public final int m34027a() {
            return this.f79390h.f79502c;
        }

        /* renamed from: a */
        public final int m34024a(long j) {
            C30363g5 c30363g5 = this.f79390h;
            long j2 = this.f79387e;
            c30363g5.getClass();
            if (j != Long.MIN_VALUE) {
                if (j2 == -9223372036854775807L || j < j2) {
                    int i = c30363g5.f79505f;
                    while (i < c30363g5.f79502c) {
                        if (c30363g5.m33927a(i).f79508b == Long.MIN_VALUE || c30363g5.m33927a(i).f79508b > j) {
                            C30363g5.C30364a m33927a = c30363g5.m33927a(i);
                            if (m33927a.f79509c == -1 || m33927a.m33923a(-1) < m33927a.f79509c) {
                                break;
                            }
                        }
                        i++;
                    }
                    if (i < c30363g5.f79502c) {
                        return i;
                    }
                    return -1;
                }
                return -1;
            }
            return -1;
        }

        /* renamed from: a */
        public final C30352b m34022a(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, C30363g5 c30363g5, boolean z) {
            this.f79384b = obj;
            this.f79385c = obj2;
            this.f79386d = i;
            this.f79387e = j;
            this.f79388f = j2;
            this.f79390h = c30363g5;
            this.f79389g = z;
            return this;
        }
    }

    static {
        new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.qo2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return g02.m34029b(bundle);
            }
        };
    }

    /* renamed from: a */
    public static g02 m34033a(Bundle bundle) {
        oh0 m34030a = m34030a(C30354d.f79398v, C30566il.m33214a(bundle, Integer.toString(0, 36)));
        oh0 m34030a2 = m34030a(C30352b.f79383i, C30566il.m33214a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = m34030a.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = i;
            }
            intArray = iArr;
        }
        return new C30353c(m34030a, m34030a2, intArray);
    }

    /* renamed from: b */
    public static /* synthetic */ g02 m34029b(Bundle bundle) {
        return m34033a(bundle);
    }

    /* renamed from: a */
    public abstract int mo31769a();

    /* renamed from: a */
    public abstract int mo31765a(Object obj);

    /* renamed from: a */
    public abstract C30352b mo31767a(int i, C30352b c30352b, boolean z);

    /* renamed from: a */
    public abstract C30354d mo31766a(int i, C30354d c30354d, long j);

    /* renamed from: a */
    public abstract Object mo31768a(int i);

    /* renamed from: b */
    public abstract int mo31764b();

    /* renamed from: c */
    public final boolean m34028c() {
        if (mo31764b() == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        int mo33747b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g02)) {
            return false;
        }
        g02 g02Var = (g02) obj;
        if (g02Var.mo31764b() != mo31764b() || g02Var.mo31769a() != mo31769a()) {
            return false;
        }
        C30354d c30354d = new C30354d();
        C30352b c30352b = new C30352b();
        C30354d c30354d2 = new C30354d();
        C30352b c30352b2 = new C30352b();
        for (int i = 0; i < mo31764b(); i++) {
            if (!mo31766a(i, c30354d, 0L).equals(g02Var.mo31766a(i, c30354d2, 0L))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo31769a(); i2++) {
            if (!mo31767a(i2, c30352b, true).equals(g02Var.mo31767a(i2, c30352b2, true))) {
                return false;
            }
        }
        int mo33749a = mo33749a(true);
        if (mo33749a != g02Var.mo33749a(true) || (mo33747b = mo33747b(true)) != g02Var.mo33747b(true)) {
            return false;
        }
        while (mo33749a != mo33747b) {
            int mo33752a = mo33752a(mo33749a, 0, true);
            if (mo33752a != g02Var.mo33752a(mo33749a, 0, true)) {
                return false;
            }
            mo33749a = mo33752a;
        }
        return true;
    }

    public final int hashCode() {
        C30354d c30354d = new C30354d();
        C30352b c30352b = new C30352b();
        int mo31764b = mo31764b() + 217;
        for (int i = 0; i < mo31764b(); i++) {
            mo31764b = (mo31764b * 31) + mo31766a(i, c30354d, 0L).hashCode();
        }
        int mo31769a = mo31769a() + (mo31764b * 31);
        for (int i2 = 0; i2 < mo31769a(); i2++) {
            mo31769a = (mo31769a * 31) + mo31767a(i2, c30352b, true).hashCode();
        }
        int mo33749a = mo33749a(true);
        while (mo33749a != -1) {
            mo31769a = (mo31769a * 31) + mo33749a;
            mo33749a = mo33752a(mo33749a, 0, true);
        }
        return mo31769a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.g02$c */
    /* loaded from: classes8.dex */
    public static final class C30353c extends g02 {

        /* renamed from: c */
        private final oh0<C30354d> f79391c;

        /* renamed from: d */
        private final oh0<C30352b> f79392d;

        /* renamed from: e */
        private final int[] f79393e;

        /* renamed from: f */
        private final int[] f79394f;

        public C30353c(oh0<C30354d> oh0Var, oh0<C30352b> oh0Var2, int[] iArr) {
            boolean z;
            if (oh0Var.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            C30937nf.m31567a(z);
            this.f79391c = oh0Var;
            this.f79392d = oh0Var2;
            this.f79393e = iArr;
            this.f79394f = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f79394f[iArr[i]] = i;
            }
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo33749a(boolean z) {
            if (m34028c()) {
                return -1;
            }
            if (z) {
                return this.f79393e[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: b */
        public final int mo33747b(boolean z) {
            if (m34028c()) {
                return -1;
            }
            if (z) {
                return this.f79393e[this.f79391c.size() - 1];
            }
            return this.f79391c.size() - 1;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo33752a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo33747b(z)) {
                return z ? this.f79393e[this.f79394f[i] + 1] : i + 1;
            } else if (i2 == 2) {
                return mo33749a(z);
            } else {
                return -1;
            }
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final C30352b mo31767a(int i, C30352b c30352b, boolean z) {
            C30352b c30352b2 = this.f79392d.get(i);
            c30352b.m34022a(c30352b2.f79384b, c30352b2.f79385c, c30352b2.f79386d, c30352b2.f79387e, c30352b2.f79388f, c30352b2.f79390h, c30352b2.f79389g);
            return c30352b;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: b */
        public final int mo33748b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != mo33749a(z)) {
                return z ? this.f79393e[this.f79394f[i] - 1] : i - 1;
            } else if (i2 == 2) {
                return mo33747b(z);
            } else {
                return -1;
            }
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo31769a() {
            return this.f79392d.size();
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final C30354d mo31766a(int i, C30354d c30354d, long j) {
            C30354d c30354d2 = this.f79391c.get(i);
            c30354d.m34006a(c30354d2.f79399b, c30354d2.f79401d, c30354d2.f79402e, c30354d2.f79403f, c30354d2.f79404g, c30354d2.f79405h, c30354d2.f79406i, c30354d2.f79407j, c30354d2.f79409l, c30354d2.f79411n, c30354d2.f79412o, c30354d2.f79413p, c30354d2.f79414q, c30354d2.f79415r);
            c30354d.f79410m = c30354d2.f79410m;
            return c30354d;
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: b */
        public final int mo31764b() {
            return this.f79391c.size();
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final int mo31765a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.g02
        /* renamed from: a */
        public final Object mo31768a(int i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public int mo33747b(boolean z) {
        if (m34028c()) {
            return -1;
        }
        return mo31764b() - 1;
    }

    /* renamed from: b */
    public int mo33748b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo33749a(z)) {
                return -1;
            }
            return i - 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo33749a(z) ? mo33747b(z) : i - 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: a */
    private static <T extends InterfaceC30632jl> oh0<T> m34030a(InterfaceC30632jl.InterfaceC30633a<T> interfaceC30633a, @Nullable IBinder iBinder) {
        int readInt;
        if (iBinder == null) {
            return oh0.m31009h();
        }
        oh0.C31039a c31039a = new oh0.C31039a();
        int i = BinderC30470hl.f80098a;
        int i2 = oh0.f83515d;
        oh0.C31039a c31039a2 = new oh0.C31039a();
        int i3 = 0;
        int i4 = 1;
        while (i4 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i3);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            c31039a2.m31999b(readBundle);
                            i3++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i4 = readInt;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        oh0 m31008a = c31039a2.m31008a();
        for (int i5 = 0; i5 < m31008a.size(); i5++) {
            c31039a.m31999b(interfaceC30633a.fromBundle((Bundle) m31008a.get(i5)));
        }
        return c31039a.m31008a();
    }

    /* renamed from: com.yandex.mobile.ads.impl.g02$d */
    /* loaded from: classes8.dex */
    public static final class C30354d implements InterfaceC30632jl {

        /* renamed from: s */
        public static final Object f79395s = new Object();

        /* renamed from: t */
        private static final Object f79396t = new Object();

        /* renamed from: u */
        private static final jt0 f79397u = new jt0.C30657a().m32772b("com.monetization.ads.exoplayer2.Timeline").m32775a(Uri.EMPTY).m32776a();

        /* renamed from: v */
        public static final InterfaceC30632jl.InterfaceC30633a<C30354d> f79398v = new InterfaceC30632jl.InterfaceC30633a() { // from class: com.yandex.mobile.ads.impl.so2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30632jl.InterfaceC30633a
            public final InterfaceC30632jl fromBundle(Bundle bundle) {
                return g02.C30354d.m34005b(bundle);
            }
        };
        @Nullable
        @Deprecated

        /* renamed from: c */
        public Object f79400c;
        @Nullable

        /* renamed from: e */
        public Object f79402e;

        /* renamed from: f */
        public long f79403f;

        /* renamed from: g */
        public long f79404g;

        /* renamed from: h */
        public long f79405h;

        /* renamed from: i */
        public boolean f79406i;

        /* renamed from: j */
        public boolean f79407j;
        @Deprecated

        /* renamed from: k */
        public boolean f79408k;
        @Nullable

        /* renamed from: l */
        public jt0.C30663e f79409l;

        /* renamed from: m */
        public boolean f79410m;

        /* renamed from: n */
        public long f79411n;

        /* renamed from: o */
        public long f79412o;

        /* renamed from: p */
        public int f79413p;

        /* renamed from: q */
        public int f79414q;

        /* renamed from: r */
        public long f79415r;

        /* renamed from: b */
        public Object f79399b = f79395s;

        /* renamed from: d */
        public jt0 f79401d = f79397u;

        /* renamed from: a */
        public static C30354d m34007a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            jt0 fromBundle = bundle2 != null ? jt0.f81080h.fromBundle(bundle2) : null;
            long j = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j2 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j3 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z2 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            jt0.C30663e fromBundle2 = bundle3 != null ? jt0.C30663e.f81119h.fromBundle(bundle3) : null;
            boolean z3 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j4 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j5 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i = bundle.getInt(Integer.toString(11, 36), 0);
            int i2 = bundle.getInt(Integer.toString(12, 36), 0);
            long j6 = bundle.getLong(Integer.toString(13, 36), 0L);
            C30354d c30354d = new C30354d();
            c30354d.m34006a(f79396t, fromBundle, null, j, j2, j3, z, z2, fromBundle2, j4, j5, i, i2, j6);
            c30354d.f79410m = z3;
            return c30354d;
        }

        /* renamed from: b */
        public static /* synthetic */ C30354d m34005b(Bundle bundle) {
            return m34007a(bundle);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C30354d.class.equals(obj.getClass())) {
                return false;
            }
            C30354d c30354d = (C30354d) obj;
            if (y32.m27076a(this.f79399b, c30354d.f79399b) && y32.m27076a(this.f79401d, c30354d.f79401d) && y32.m27076a(this.f79402e, c30354d.f79402e) && y32.m27076a(this.f79409l, c30354d.f79409l) && this.f79403f == c30354d.f79403f && this.f79404g == c30354d.f79404g && this.f79405h == c30354d.f79405h && this.f79406i == c30354d.f79406i && this.f79407j == c30354d.f79407j && this.f79410m == c30354d.f79410m && this.f79411n == c30354d.f79411n && this.f79412o == c30354d.f79412o && this.f79413p == c30354d.f79413p && this.f79414q == c30354d.f79414q && this.f79415r == c30354d.f79415r) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f79401d.hashCode() + ((this.f79399b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f79402e;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            jt0.C30663e c30663e = this.f79409l;
            if (c30663e != null) {
                i = c30663e.hashCode();
            }
            long j = this.f79403f;
            long j2 = this.f79404g;
            long j3 = this.f79405h;
            long j4 = this.f79411n;
            long j5 = this.f79412o;
            long j6 = this.f79415r;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f79406i ? 1 : 0)) * 31) + (this.f79407j ? 1 : 0)) * 31) + (this.f79410m ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f79413p) * 31) + this.f79414q) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        /* renamed from: a */
        public final boolean m34008a() {
            boolean z = this.f79408k;
            jt0.C30663e c30663e = this.f79409l;
            if (z == (c30663e != null)) {
                return c30663e != null;
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public final C30354d m34006a(Object obj, @Nullable jt0 jt0Var, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable jt0.C30663e c30663e, long j4, long j5, int i, int i2, long j6) {
            jt0.C30666g c30666g;
            this.f79399b = obj;
            this.f79401d = jt0Var != null ? jt0Var : f79397u;
            this.f79400c = (jt0Var == null || (c30666g = jt0Var.f81082c) == null) ? null : c30666g.f81136g;
            this.f79402e = obj2;
            this.f79403f = j;
            this.f79404g = j2;
            this.f79405h = j3;
            this.f79406i = z;
            this.f79407j = z2;
            this.f79408k = c30663e != null;
            this.f79409l = c30663e;
            this.f79411n = j4;
            this.f79412o = j5;
            this.f79413p = i;
            this.f79414q = i2;
            this.f79415r = j6;
            this.f79410m = false;
            return this;
        }
    }

    /* renamed from: a */
    public int mo33749a(boolean z) {
        return m34028c() ? -1 : 0;
    }

    /* renamed from: a */
    public final int m34034a(int i, C30352b c30352b, C30354d c30354d, int i2, boolean z) {
        int i3 = mo31767a(i, c30352b, false).f79386d;
        if (mo31766a(i3, c30354d, 0L).f79414q == i) {
            int mo33752a = mo33752a(i3, i2, z);
            if (mo33752a == -1) {
                return -1;
            }
            return mo31766a(mo33752a, c30354d, 0L).f79413p;
        }
        return i + 1;
    }

    /* renamed from: a */
    public int mo33752a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo33747b(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo33747b(z) ? mo33749a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: a */
    public final C30352b m34035a(int i, C30352b c30352b) {
        return mo31767a(i, c30352b, false);
    }

    /* renamed from: a */
    public C30352b mo33751a(Object obj, C30352b c30352b) {
        return mo31767a(mo31765a(obj), c30352b, true);
    }

    /* renamed from: a */
    public final Pair<Object, Long> m34032a(C30354d c30354d, C30352b c30352b, int i, long j) {
        Pair<Object, Long> m34031a = m34031a(c30354d, c30352b, i, j, 0L);
        m34031a.getClass();
        return m34031a;
    }

    @Nullable
    /* renamed from: a */
    public final Pair<Object, Long> m34031a(C30354d c30354d, C30352b c30352b, int i, long j, long j2) {
        C30937nf.m31572a(i, mo31764b());
        mo31766a(i, c30354d, j2);
        if (j == -9223372036854775807L) {
            j = c30354d.f79411n;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c30354d.f79413p;
        mo31767a(i2, c30352b, false);
        while (i2 < c30354d.f79414q && c30352b.f79388f != j) {
            int i3 = i2 + 1;
            if (mo31767a(i3, c30352b, false).f79388f > j) {
                break;
            }
            i2 = i3;
        }
        mo31767a(i2, c30352b, true);
        long j3 = j - c30352b.f79388f;
        long j4 = c30352b.f79387e;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = c30352b.f79385c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }
}
