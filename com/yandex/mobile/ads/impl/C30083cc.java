package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.cc */
/* loaded from: classes8.dex */
public final class C30083cc implements InterfaceC30375gc {
    @NotNull

    /* renamed from: f */
    private static final Object f77583f = new Object();
    @Nullable

    /* renamed from: g */
    private static volatile C30083cc f77584g;

    /* renamed from: h */
    public static final /* synthetic */ int f77585h = 0;
    @NotNull

    /* renamed from: a */
    private final Handler f77586a;
    @NotNull

    /* renamed from: b */
    private final C30455hc f77587b;
    @NotNull

    /* renamed from: c */
    private final C30543ic f77588c;

    /* renamed from: d */
    private boolean f77589d;
    @NotNull

    /* renamed from: e */
    private final C31243qx f77590e;

    /* renamed from: com.yandex.mobile.ads.impl.cc$a */
    /* loaded from: classes8.dex */
    public static final class C30084a {
        @NotNull
        /* renamed from: a */
        public static C30083cc m35303a(@NotNull Context context) {
            C30083cc c30083cc;
            Intrinsics.checkNotNullParameter(context, "context");
            C30083cc c30083cc2 = C30083cc.f77584g;
            if (c30083cc2 == null) {
                synchronized (C30083cc.f77583f) {
                    c30083cc = C30083cc.f77584g;
                    if (c30083cc == null) {
                        c30083cc = new C30083cc(context);
                        C30083cc.f77584g = c30083cc;
                    }
                }
                return c30083cc;
            }
            return c30083cc2;
        }
    }

    /* synthetic */ C30083cc(Context context) {
        this(new Handler(Looper.getMainLooper()), new C30455hc(), new C30543ic(context), new C30717kc());
    }

    /* renamed from: b */
    public static final void m35309b(C30083cc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m35304e();
        this$0.f77587b.m33583a();
    }

    /* renamed from: d */
    private final void m35305d() {
        this.f77586a.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.nl2
            {
                C30083cc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30083cc.m35309b(C30083cc.this);
            }
        }, this.f77590e.m30201a());
    }

    /* renamed from: e */
    private final void m35304e() {
        synchronized (f77583f) {
            this.f77586a.removeCallbacksAndMessages(null);
            this.f77589d = false;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: a */
    public final void m35311a(@NotNull InterfaceC30617jc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77587b.m33579b(listener);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30375gc
    /* renamed from: a */
    public final void mo33888a(@NotNull C30011bc advertisingInfoHolder) {
        Intrinsics.checkNotNullParameter(advertisingInfoHolder, "advertisingInfoHolder");
        m35304e();
        this.f77587b.m33580b(advertisingInfoHolder);
    }

    /* renamed from: b */
    public final void m35308b(@NotNull InterfaceC30617jc listener) {
        boolean z;
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f77587b.m33581a(listener);
        synchronized (f77583f) {
            if (this.f77589d) {
                z = false;
            } else {
                z = true;
                this.f77589d = true;
            }
            Unit unit = Unit.f99208a;
        }
        if (z) {
            m35305d();
            this.f77588c.m33320a(this);
        }
    }

    private C30083cc(Handler handler, C30455hc c30455hc, C30543ic c30543ic, C30717kc c30717kc) {
        this.f77586a = handler;
        this.f77587b = c30455hc;
        this.f77588c = c30543ic;
        c30717kc.getClass();
        this.f77590e = C30717kc.m32596a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30375gc
    /* renamed from: a */
    public final void mo33889a() {
        m35304e();
        this.f77587b.m33583a();
    }
}
