package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38498g;

/* loaded from: classes8.dex */
public final class ua1 {
    @NotNull

    /* renamed from: g */
    public static final C31566a f86178g = new C31566a(0);

    /* renamed from: h */
    private static final long f86179h = TimeUnit.SECONDS.toMillis(1);
    @Nullable

    /* renamed from: i */
    private static volatile ua1 f86180i;
    @NotNull

    /* renamed from: a */
    private final Object f86181a;
    @NotNull

    /* renamed from: b */
    private final Handler f86182b;
    @NotNull

    /* renamed from: c */
    private final ta1 f86183c;
    @NotNull

    /* renamed from: d */
    private final ra1 f86184d;

    /* renamed from: e */
    private boolean f86185e;

    /* renamed from: f */
    private boolean f86186f;

    /* renamed from: com.yandex.mobile.ads.impl.ua1$a */
    /* loaded from: classes8.dex */
    public static final class C31566a {
        private C31566a() {
        }

        @NotNull
        /* renamed from: a */
        public final ua1 m28831a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            ua1 ua1Var = ua1.f86180i;
            if (ua1Var == null) {
                synchronized (this) {
                    ua1Var = ua1.f86180i;
                    if (ua1Var == null) {
                        ua1Var = new ua1(context, 0);
                        ua1.f86180i = ua1Var;
                    }
                }
            }
            return ua1Var;
        }

        public /* synthetic */ C31566a(int i) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ua1$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C31567b implements p52, FunctionAdapter {
        C31567b() {
            ua1.this = r1;
        }

        @Override // com.yandex.mobile.ads.impl.p52
        /* renamed from: b */
        public final void mo28830b() {
            ua1.m28839a(ua1.this);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof p52) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.m17075f(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final InterfaceC38498g<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, ua1.this, ua1.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private ua1(Context context) {
        this.f86181a = new Object();
        this.f86182b = new Handler(Looper.getMainLooper());
        this.f86183c = new ta1(context);
        this.f86184d = new ra1();
    }

    /* renamed from: a */
    public static final void m28839a(ua1 ua1Var) {
        synchronized (ua1Var.f86181a) {
            ua1Var.f86186f = true;
            Unit unit = Unit.f99208a;
        }
        ua1Var.m28833d();
        ua1Var.f86184d.m30090b();
    }

    /* renamed from: c */
    private final void m28835c() {
        this.f86182b.postDelayed(new Runnable() { // from class: com.yandex.mobile.ads.impl.yy2
            {
                ua1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ua1.m28834c(ua1.this);
            }
        }, f86179h);
    }

    /* renamed from: b */
    private final void m28838b() {
        boolean z;
        synchronized (this.f86181a) {
            if (this.f86185e) {
                z = false;
            } else {
                z = true;
                this.f86185e = true;
            }
            Unit unit = Unit.f99208a;
        }
        if (z) {
            m28835c();
            this.f86183c.m29245a(new C31567b());
        }
    }

    /* renamed from: d */
    private final void m28833d() {
        synchronized (this.f86181a) {
            this.f86182b.removeCallbacksAndMessages(null);
            this.f86185e = false;
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: c */
    public static final void m28834c(ua1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f86183c.m29246a();
        synchronized (this$0.f86181a) {
            this$0.f86186f = true;
            Unit unit = Unit.f99208a;
        }
        this$0.m28833d();
        this$0.f86184d.m30090b();
    }

    public /* synthetic */ ua1(Context context, int i) {
        this(context);
    }

    /* renamed from: a */
    public final void m28840a(@NotNull p52 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f86181a) {
            this.f86184d.m30089b(listener);
            if (!this.f86184d.m30092a()) {
                this.f86183c.m29246a();
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: b */
    public final void m28837b(@NotNull p52 listener) {
        boolean z;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f86181a) {
            z = !this.f86186f;
            if (z) {
                this.f86184d.m30091a(listener);
            }
            Unit unit = Unit.f99208a;
        }
        if (z) {
            m28838b();
        } else {
            listener.mo28830b();
        }
    }
}
