package com.yandex.mobile.ads.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ge */
/* loaded from: classes8.dex */
public final class C30377ge implements InterfaceC30854mh {

    /* renamed from: f */
    private static final long f79598f = TimeUnit.SECONDS.toMillis(30);
    @NotNull

    /* renamed from: g */
    private static final Object f79599g = new Object();
    @NotNull

    /* renamed from: a */
    private final C30309fe f79600a;
    @NotNull

    /* renamed from: b */
    private final C30549ie f79601b;
    @NotNull

    /* renamed from: c */
    private final Handler f79602c;
    @NotNull

    /* renamed from: d */
    private final WeakHashMap<InterfaceC30947nh, Object> f79603d;

    /* renamed from: e */
    private boolean f79604e;

    /* renamed from: com.yandex.mobile.ads.impl.ge$a */
    /* loaded from: classes8.dex */
    public final class C30378a implements InterfaceC30231ee {
        public C30378a() {
            C30377ge.this = r1;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30231ee
        /* renamed from: a */
        public final void mo33872a(@Nullable String str) {
            C30377ge.this.m33880a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ge$b */
    /* loaded from: classes8.dex */
    public static final class C30379b extends Lambda implements Functions<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30379b() {
            super(0);
            C30377ge.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            C30377ge.this.f79601b.getClass();
            C30549ie.m33291a();
            C30377ge.this.m33880a();
            return Unit.f99208a;
        }
    }

    public C30377ge(@NotNull C30309fe appMetricaAutograbLoader, @NotNull C30549ie appMetricaErrorProvider, @NotNull Handler stopStartupParamsRequestHandler) {
        Intrinsics.checkNotNullParameter(appMetricaAutograbLoader, "appMetricaAutograbLoader");
        Intrinsics.checkNotNullParameter(appMetricaErrorProvider, "appMetricaErrorProvider");
        Intrinsics.checkNotNullParameter(stopStartupParamsRequestHandler, "stopStartupParamsRequestHandler");
        this.f79600a = appMetricaAutograbLoader;
        this.f79601b = appMetricaErrorProvider;
        this.f79602c = stopStartupParamsRequestHandler;
        this.f79603d = new WeakHashMap<>();
    }

    /* renamed from: c */
    private final void m33874c() {
        synchronized (f79599g) {
            this.f79602c.removeCallbacksAndMessages(null);
            this.f79604e = false;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: d */
    private final void m33873d() {
        boolean z;
        synchronized (f79599g) {
            if (!this.f79604e) {
                z = true;
                this.f79604e = true;
            } else {
                z = false;
            }
            Unit unit = Unit.f99208a;
        }
        if (z) {
            m33877b();
            this.f79600a.m34169a(new C30378a());
        }
    }

    /* renamed from: a */
    public final void m33880a() {
        HashSet hashSet;
        um0.m28728a(new Object[0]);
        synchronized (f79599g) {
            hashSet = new HashSet(this.f79603d.keySet());
            this.f79603d.clear();
            m33874c();
            Unit unit = Unit.f99208a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC30947nh) it.next()).mo31511a(null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30854mh
    /* renamed from: b */
    public final void mo32002b(@NotNull InterfaceC30947nh autograbRequestListener) {
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        synchronized (f79599g) {
            this.f79603d.remove(autograbRequestListener);
        }
    }

    /* renamed from: b */
    private final void m33877b() {
        final C30379b c30379b = new C30379b();
        this.f79602c.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.dp2
            @Override // java.lang.Runnable
            public final void run() {
                C30377ge.m33878a(c30379b);
            }
        }, f79598f);
    }

    /* renamed from: a */
    public static final void m33878a(Functions tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30854mh
    /* renamed from: a */
    public final void mo32003a(@NotNull InterfaceC30947nh autograbRequestListener) {
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        synchronized (f79599g) {
            this.f79603d.put(autograbRequestListener, null);
        }
        try {
            m33873d();
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            this.f79601b.getClass();
            C30549ie.m33288b();
            m33880a();
        }
    }
}
