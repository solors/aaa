package mc;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformUtils.kt */
@Metadata
/* renamed from: mc.r */
/* loaded from: classes9.dex */
public final class C38274r {
    @NotNull

    /* renamed from: a */
    public static final C38274r f101158a;

    /* renamed from: b */
    private static final boolean f101159b;

    /* renamed from: c */
    private static final boolean f101160c;

    /* renamed from: d */
    private static final boolean f101161d;

    /* renamed from: e */
    private static final boolean f101162e;

    /* renamed from: f */
    private static final boolean f101163f;

    /* renamed from: g */
    private static final boolean f101164g;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        C38274r c38274r = new C38274r();
        f101158a = c38274r;
        boolean z4 = true;
        if (PlatformUtilsJvm.m15214a(c38274r) == PlatformUtils.Browser) {
            z = true;
        } else {
            z = false;
        }
        f101159b = z;
        if (PlatformUtilsJvm.m15214a(c38274r) == PlatformUtils.Node) {
            z2 = true;
        } else {
            z2 = false;
        }
        f101160c = z2;
        if (PlatformUtilsJvm.m15214a(c38274r) == PlatformUtils.Jvm) {
            z3 = true;
        } else {
            z3 = false;
        }
        f101161d = z3;
        if (PlatformUtilsJvm.m15214a(c38274r) != PlatformUtils.Native) {
            z4 = false;
        }
        f101162e = z4;
        f101163f = PlatformUtilsJvm.m15213b(c38274r);
        f101164g = PlatformUtilsJvm.m15212c(c38274r);
    }

    private C38274r() {
    }

    /* renamed from: a */
    public final boolean m15217a() {
        return f101159b;
    }

    /* renamed from: b */
    public final boolean m15216b() {
        return f101163f;
    }

    /* renamed from: c */
    public final boolean m15215c() {
        return f101162e;
    }
}
