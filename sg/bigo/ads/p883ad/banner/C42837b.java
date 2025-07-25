package sg.bigo.ads.p883ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.InterfaceC43501Ad;

/* renamed from: sg.bigo.ads.ad.banner.b */
/* loaded from: classes10.dex */
public final class C42837b {

    /* renamed from: a */
    private static final Map<InterfaceC42839b, C42838a> f112160a = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.ad.banner.b$a */
    /* loaded from: classes10.dex */
    public static final class C42838a {

        /* renamed from: a */
        final long[] f112161a;

        private C42838a() {
            this.f112161a = new long[9];
        }

        /* synthetic */ C42838a(byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.ad.banner.b$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC42839b {
    }

    /* renamed from: a */
    public static <T extends InterfaceC43501Ad> long m6515a(InterfaceC42839b interfaceC42839b, long j) {
        if (j == -1) {
            return -1L;
        }
        return j - m6506j(interfaceC42839b).f112161a[4];
    }

    /* renamed from: b */
    public static <T extends InterfaceC43501Ad> void m6514b(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 1);
    }

    /* renamed from: c */
    public static <T extends InterfaceC43501Ad> void m6513c(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 2);
    }

    /* renamed from: d */
    public static <T extends InterfaceC43501Ad> void m6512d(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 3);
    }

    /* renamed from: e */
    public static <T extends InterfaceC43501Ad> void m6511e(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 4);
    }

    /* renamed from: f */
    public static <T extends InterfaceC43501Ad> void m6510f(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 5);
    }

    /* renamed from: g */
    public static <T extends InterfaceC43501Ad> void m6509g(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 6);
    }

    /* renamed from: h */
    public static <T extends InterfaceC43501Ad> void m6508h(InterfaceC42839b interfaceC42839b) {
        f112160a.remove(interfaceC42839b);
    }

    /* renamed from: i */
    public static <T extends InterfaceC43501Ad> long m6507i(InterfaceC42839b interfaceC42839b) {
        long[] jArr = m6506j(interfaceC42839b).f112161a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    /* renamed from: j */
    private static <T extends InterfaceC43501Ad> C42838a m6506j(InterfaceC42839b interfaceC42839b) {
        Map<InterfaceC42839b, C42838a> map = f112160a;
        C42838a c42838a = map.get(interfaceC42839b);
        if (c42838a == null) {
            C42838a c42838a2 = new C42838a((byte) 0);
            map.put(interfaceC42839b, c42838a2);
            return c42838a2;
        }
        return c42838a;
    }

    /* renamed from: a */
    public static <T extends InterfaceC43501Ad> void m6517a(InterfaceC42839b interfaceC42839b) {
        m6516a(interfaceC42839b, 0);
    }

    /* renamed from: a */
    private static <T extends InterfaceC43501Ad> void m6516a(InterfaceC42839b interfaceC42839b, int i) {
        m6506j(interfaceC42839b).f112161a[i] = SystemClock.elapsedRealtime();
    }
}
