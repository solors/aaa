package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* renamed from: com.ironsource.ve */
/* loaded from: classes6.dex */
public final class C21130ve implements InterfaceC20169jt {
    @NotNull

    /* renamed from: a */
    public static final C21130ve f54189a = new C21130ve();
    @NotNull

    /* renamed from: b */
    private static final Handler f54190b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private static boolean f54191c;
    @NotNull

    /* renamed from: d */
    private static final InterfaceC38501j f54192d;
    @NotNull

    /* renamed from: e */
    private static final HandlerThreadC21017ti f54193e;
    @NotNull

    /* renamed from: f */
    private static final HandlerThreadC21017ti f54194f;
    @NotNull

    /* renamed from: g */
    private static final HandlerThreadC21017ti f54195g;

    @Metadata
    /* renamed from: com.ironsource.ve$a */
    /* loaded from: classes6.dex */
    static final class C21131a extends Lambda implements Functions<C21327zp> {

        /* renamed from: a */
        public static final C21131a f54196a = new C21131a();

        C21131a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final C21327zp invoke() {
            return new C21327zp(0, null, null, 7, null);
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C21131a.f54196a);
        f54192d = m14554a;
        HandlerThreadC21017ti handlerThreadC21017ti = new HandlerThreadC21017ti("isadplayer-background");
        handlerThreadC21017ti.start();
        handlerThreadC21017ti.m54792a();
        f54193e = handlerThreadC21017ti;
        HandlerThreadC21017ti handlerThreadC21017ti2 = new HandlerThreadC21017ti("isadplayer-publisher-callbacks");
        handlerThreadC21017ti2.start();
        handlerThreadC21017ti2.m54792a();
        f54194f = handlerThreadC21017ti2;
        HandlerThreadC21017ti handlerThreadC21017ti3 = new HandlerThreadC21017ti("isadplayer-release");
        handlerThreadC21017ti3.start();
        handlerThreadC21017ti3.m54792a();
        f54195g = handlerThreadC21017ti3;
    }

    private C21130ve() {
    }

    /* renamed from: b */
    private final C21327zp m54476b() {
        return (C21327zp) f54192d.getValue();
    }

    /* renamed from: f */
    private final boolean m54464f(Runnable runnable) {
        if (f54191c && m54476b().getQueue().contains(runnable)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: a */
    public final Looper m54481a() {
        return f54193e.getLooper();
    }

    @NotNull
    /* renamed from: c */
    public final ThreadPoolExecutor m54472c() {
        return m54476b();
    }

    /* renamed from: d */
    public final void m54467d(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m54471c(this, action, 0L, 2, null);
    }

    /* renamed from: e */
    public final void m54465e(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (m54464f(action)) {
            m54476b().remove(action);
        } else {
            f54195g.m54788b(action);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m54480a(C21130ve c21130ve, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c21130ve.m54473b(runnable, j);
    }

    /* renamed from: b */
    public static /* synthetic */ void m54475b(C21130ve c21130ve, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c21130ve.m54469c(runnable, j);
    }

    /* renamed from: c */
    public static /* synthetic */ void m54471c(C21130ve c21130ve, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        c21130ve.m54466d(runnable, j);
    }

    /* renamed from: d */
    public final void m54466d(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f54190b.postDelayed(action, j);
    }

    @Override // com.ironsource.InterfaceC20169jt
    /* renamed from: a */
    public void mo54479a(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m54471c(this, action, 0L, 2, null);
    }

    /* renamed from: b */
    public final void m54474b(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m54480a(this, action, 0L, 2, (Object) null);
    }

    /* renamed from: c */
    public final void m54470c(@NotNull Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        m54475b(this, action, 0L, 2, null);
    }

    /* renamed from: d */
    public final boolean m54468d() {
        return f54191c;
    }

    @Override // com.ironsource.InterfaceC20169jt
    /* renamed from: a */
    public void mo54478a(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (f54191c) {
            m54476b().schedule(action, j, TimeUnit.MILLISECONDS);
        } else {
            f54195g.m54789a(action, j);
        }
    }

    /* renamed from: b */
    public final void m54473b(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f54193e.m54789a(action, j);
    }

    /* renamed from: c */
    public final void m54469c(@NotNull Runnable action, long j) {
        Intrinsics.checkNotNullParameter(action, "action");
        f54194f.m54789a(action, j);
    }

    /* renamed from: a */
    public final void m54477a(boolean z) {
        f54191c = z;
    }
}
