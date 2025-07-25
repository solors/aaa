package com.applovin.impl;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.C3997a9;
import com.applovin.impl.InterfaceC5044o2;
import com.applovin.impl.InterfaceC5193qh;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.qh */
/* loaded from: classes2.dex */
public interface InterfaceC5193qh {

    /* renamed from: com.applovin.impl.qh$b */
    /* loaded from: classes2.dex */
    public static final class C5195b implements InterfaceC5044o2 {

        /* renamed from: b */
        public static final C5195b f9206b = new C5196a().m96320a();

        /* renamed from: c */
        public static final InterfaceC5044o2.InterfaceC5045a f9207c = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.h10
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return InterfaceC5193qh.C5195b.m96321b(bundle);
            }
        };

        /* renamed from: a */
        private final C3997a9 f9208a;

        /* renamed from: com.applovin.impl.qh$b$a */
        /* loaded from: classes2.dex */
        public static final class C5196a {

            /* renamed from: b */
            private static final int[] f9209b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* renamed from: a */
            private final C3997a9.C3999b f9210a = new C3997a9.C3999b();

            /* renamed from: a */
            public C5196a m96319a(int i) {
                this.f9210a.m101016a(i);
                return this;
            }

            /* renamed from: a */
            public C5196a m96317a(C5195b c5195b) {
                this.f9210a.m101014a(c5195b.f9208a);
                return this;
            }

            /* renamed from: a */
            public C5196a m96316a(int... iArr) {
                this.f9210a.m101013a(iArr);
                return this;
            }

            /* renamed from: a */
            public C5196a m96318a(int i, boolean z) {
                this.f9210a.m101015a(i, z);
                return this;
            }

            /* renamed from: a */
            public C5195b m96320a() {
                return new C5195b(this.f9210a.m101017a());
            }
        }

        private C5195b(C3997a9 c3997a9) {
            this.f9208a = c3997a9;
        }

        /* renamed from: b */
        public static /* synthetic */ C5195b m96321b(Bundle bundle) {
            return m96324a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5195b)) {
                return false;
            }
            return this.f9208a.equals(((C5195b) obj).f9208a);
        }

        public int hashCode() {
            return this.f9208a.hashCode();
        }

        /* renamed from: b */
        private static String m96322b(int i) {
            return Integer.toString(i, 36);
        }

        /* renamed from: a */
        public boolean m96325a(int i) {
            return this.f9208a.m101020a(i);
        }

        /* renamed from: a */
        public static C5195b m96324a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(m96322b(0));
            if (integerArrayList == null) {
                return f9206b;
            }
            C5196a c5196a = new C5196a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                c5196a.m96319a(integerArrayList.get(i).intValue());
            }
            return c5196a.m96320a();
        }
    }

    /* renamed from: com.applovin.impl.qh$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5197c {
        /* renamed from: a */
        default void mo96187a(int i) {
        }

        /* renamed from: b */
        default void mo96131b() {
        }

        /* renamed from: b */
        void mo94487b(int i);

        /* renamed from: c */
        default void mo96110c(int i) {
        }

        /* renamed from: e */
        default void m96315e(int i) {
        }

        /* renamed from: a */
        default void mo96179a(AbstractC4406fo abstractC4406fo, int i) {
        }

        /* renamed from: b */
        default void mo96306b(C5011nh c5011nh) {
        }

        /* renamed from: c */
        default void mo96100c(boolean z) {
        }

        /* renamed from: e */
        default void m96314e(boolean z) {
        }

        /* renamed from: a */
        default void mo94488a(C5011nh c5011nh) {
        }

        /* renamed from: b */
        default void mo96114b(boolean z) {
        }

        /* renamed from: a */
        default void mo96176a(C5123ph c5123ph) {
        }

        /* renamed from: b */
        default void mo96113b(boolean z, int i) {
        }

        /* renamed from: a */
        default void mo96175a(C5138po c5138po, C5575to c5575to) {
        }

        /* renamed from: a */
        default void mo96174a(C5195b c5195b) {
        }

        /* renamed from: a */
        default void mo96173a(C5200f c5200f, C5200f c5200f2, int i) {
        }

        /* renamed from: a */
        default void mo96309a(InterfaceC5193qh interfaceC5193qh, C5198d c5198d) {
        }

        /* renamed from: a */
        default void mo96140a(C5319sd c5319sd, int i) {
        }

        /* renamed from: a */
        default void mo96139a(C5631ud c5631ud) {
        }

        /* renamed from: a */
        default void mo96133a(boolean z, int i) {
        }

        /* renamed from: d */
        default void mo96092d(boolean z) {
        }
    }

    /* renamed from: com.applovin.impl.qh$d */
    /* loaded from: classes2.dex */
    public static final class C5198d {

        /* renamed from: a */
        private final C3997a9 f9211a;

        public C5198d(C3997a9 c3997a9) {
            this.f9211a = c3997a9;
        }

        /* renamed from: a */
        public boolean m96313a(int i) {
            return this.f9211a.m101020a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5198d)) {
                return false;
            }
            return this.f9211a.equals(((C5198d) obj).f9211a);
        }

        public int hashCode() {
            return this.f9211a.hashCode();
        }

        /* renamed from: a */
        public boolean m96312a(int... iArr) {
            return this.f9211a.m101019a(iArr);
        }
    }

    /* renamed from: com.applovin.impl.qh$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC5199e extends InterfaceC5197c {
        /* renamed from: a */
        default void mo96311a() {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: b */
        default void mo94487b(int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: c */
        default void mo96110c(int i) {
        }

        /* renamed from: a */
        default void mo96188a(float f) {
        }

        /* renamed from: b */
        default void m96307b(int i, boolean z) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: c */
        default void mo96100c(boolean z) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96187a(int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: b */
        default void mo96306b(C5011nh c5011nh) {
        }

        /* renamed from: a */
        default void mo96186a(int i, int i2) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: b */
        default void mo96114b(boolean z) {
        }

        /* renamed from: a */
        default void mo96180a(C4061af c4061af) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96179a(AbstractC4406fo abstractC4406fo, int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo94488a(C5011nh c5011nh) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96176a(C5123ph c5123ph) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96175a(C5138po c5138po, C5575to c5575to) {
        }

        /* renamed from: a */
        default void m96310a(C5171q6 c5171q6) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96174a(C5195b c5195b) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96173a(C5200f c5200f, C5200f c5200f2, int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96309a(InterfaceC5193qh interfaceC5193qh, C5198d c5198d) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96140a(C5319sd c5319sd, int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96139a(C5631ud c5631ud) {
        }

        /* renamed from: a */
        default void mo96138a(C5864xq c5864xq) {
        }

        /* renamed from: a */
        default void mo96308a(List list) {
        }

        /* renamed from: a */
        default void mo96134a(boolean z) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: a */
        default void mo96133a(boolean z, int i) {
        }

        @Override // com.applovin.impl.InterfaceC5193qh.InterfaceC5197c
        /* renamed from: d */
        default void mo96092d(boolean z) {
        }
    }

    /* renamed from: A */
    C5575to mo96369A();

    /* renamed from: B */
    void mo96368B();

    /* renamed from: C */
    C5631ud mo96367C();

    /* renamed from: D */
    void mo96366D();

    /* renamed from: E */
    int mo96365E();

    /* renamed from: F */
    long mo96364F();

    /* renamed from: a */
    C5123ph mo96363a();

    /* renamed from: a */
    void mo96362a(int i);

    /* renamed from: a */
    void mo96361a(int i, long j);

    /* renamed from: a */
    void mo96360a(long j);

    /* renamed from: a */
    void mo96359a(SurfaceView surfaceView);

    /* renamed from: a */
    void mo96358a(TextureView textureView);

    /* renamed from: a */
    void mo96357a(InterfaceC5199e interfaceC5199e);

    /* renamed from: a */
    void mo96356a(boolean z);

    /* renamed from: b */
    void mo96355b();

    /* renamed from: b */
    void mo96353b(SurfaceView surfaceView);

    /* renamed from: b */
    void mo96352b(TextureView textureView);

    /* renamed from: b */
    void mo96351b(InterfaceC5199e interfaceC5199e);

    /* renamed from: b */
    void mo96350b(boolean z);

    /* renamed from: b */
    boolean mo96354b(int i);

    /* renamed from: c */
    C5011nh mo96349c();

    /* renamed from: d */
    boolean mo96348d();

    /* renamed from: e */
    long mo96347e();

    /* renamed from: f */
    int mo96346f();

    /* renamed from: g */
    long mo96345g();

    long getCurrentPosition();

    long getDuration();

    /* renamed from: h */
    long mo96344h();

    /* renamed from: i */
    C5195b mo96343i();

    boolean isPlaying();

    /* renamed from: j */
    int mo96342j();

    /* renamed from: k */
    C5138po mo96341k();

    /* renamed from: l */
    boolean mo96340l();

    /* renamed from: m */
    int mo96339m();

    /* renamed from: n */
    AbstractC4406fo mo96338n();

    /* renamed from: o */
    int mo96337o();

    /* renamed from: p */
    Looper mo96336p();

    /* renamed from: q */
    long mo96335q();

    /* renamed from: r */
    boolean mo96334r();

    /* renamed from: s */
    long mo96333s();

    /* renamed from: t */
    int mo96332t();

    /* renamed from: u */
    void mo96331u();

    /* renamed from: v */
    int mo96330v();

    /* renamed from: w */
    void mo96329w();

    /* renamed from: x */
    List mo96328x();

    /* renamed from: y */
    boolean mo96327y();

    /* renamed from: z */
    C5864xq mo96326z();

    /* renamed from: com.applovin.impl.qh$f */
    /* loaded from: classes2.dex */
    public static final class C5200f implements InterfaceC5044o2 {

        /* renamed from: k */
        public static final InterfaceC5044o2.InterfaceC5045a f9212k = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.i10
            @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
            /* renamed from: a */
            public final InterfaceC5044o2 mo92505a(Bundle bundle) {
                return InterfaceC5193qh.C5200f.m96303b(bundle);
            }
        };

        /* renamed from: a */
        public final Object f9213a;

        /* renamed from: b */
        public final int f9214b;

        /* renamed from: c */
        public final C5319sd f9215c;

        /* renamed from: d */
        public final Object f9216d;

        /* renamed from: f */
        public final int f9217f;

        /* renamed from: g */
        public final long f9218g;

        /* renamed from: h */
        public final long f9219h;

        /* renamed from: i */
        public final int f9220i;

        /* renamed from: j */
        public final int f9221j;

        public C5200f(Object obj, int i, C5319sd c5319sd, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f9213a = obj;
            this.f9214b = i;
            this.f9215c = c5319sd;
            this.f9216d = obj2;
            this.f9217f = i2;
            this.f9218g = j;
            this.f9219h = j2;
            this.f9220i = i3;
            this.f9221j = i4;
        }

        /* renamed from: a */
        public static C5200f m96304a(Bundle bundle) {
            return new C5200f(null, bundle.getInt(m96305a(0), -1), (C5319sd) AbstractC5102p2.m96602a(C5319sd.f9640h, bundle.getBundle(m96305a(1))), null, bundle.getInt(m96305a(2), -1), bundle.getLong(m96305a(3), -9223372036854775807L), bundle.getLong(m96305a(4), -9223372036854775807L), bundle.getInt(m96305a(5), -1), bundle.getInt(m96305a(6), -1));
        }

        /* renamed from: b */
        public static /* synthetic */ C5200f m96303b(Bundle bundle) {
            return m96304a(bundle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5200f.class != obj.getClass()) {
                return false;
            }
            C5200f c5200f = (C5200f) obj;
            if (this.f9214b == c5200f.f9214b && this.f9217f == c5200f.f9217f && this.f9218g == c5200f.f9218g && this.f9219h == c5200f.f9219h && this.f9220i == c5200f.f9220i && this.f9221j == c5200f.f9221j && Objects.equal(this.f9213a, c5200f.f9213a) && Objects.equal(this.f9216d, c5200f.f9216d) && Objects.equal(this.f9215c, c5200f.f9215c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f9213a, Integer.valueOf(this.f9214b), this.f9215c, this.f9216d, Integer.valueOf(this.f9217f), Integer.valueOf(this.f9214b), Long.valueOf(this.f9218g), Long.valueOf(this.f9219h), Integer.valueOf(this.f9220i), Integer.valueOf(this.f9221j));
        }

        /* renamed from: a */
        private static String m96305a(int i) {
            return Integer.toString(i, 36);
        }
    }
}
