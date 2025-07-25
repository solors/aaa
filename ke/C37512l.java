package ke;

import ie.C33638i0;
import ie.C33640k0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tasks.kt */
@Metadata
/* renamed from: ke.l */
/* loaded from: classes8.dex */
public final class C37512l {
    @NotNull

    /* renamed from: a */
    public static final String f99163a = C33638i0.m22976e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f99164b;

    /* renamed from: c */
    public static final int f99165c;

    /* renamed from: d */
    public static final int f99166d;

    /* renamed from: e */
    public static final long f99167e;
    @NotNull

    /* renamed from: f */
    public static AbstractC37507g f99168f;
    @NotNull

    /* renamed from: g */
    public static final InterfaceC37509i f99169g;
    @NotNull

    /* renamed from: h */
    public static final InterfaceC37509i f99170h;

    static {
        long m22953f;
        int m16917e;
        int m22954e;
        int m22954e2;
        long m22953f2;
        m22953f = C33640k0.m22953f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f99164b = m22953f;
        m16917e = _Ranges.m16917e(C33638i0.m22980a(), 2);
        m22954e = C33640k0.m22954e("kotlinx.coroutines.scheduler.core.pool.size", m16917e, 1, 0, 8, null);
        f99165c = m22954e;
        m22954e2 = C33640k0.m22954e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f99166d = m22954e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m22953f2 = C33640k0.m22953f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f99167e = timeUnit.toNanos(m22953f2);
        f99168f = C37505e.f99153a;
        f99169g = new C37510j(0);
        f99170h = new C37510j(1);
    }
}
