package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.pp0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class id1 extends BroadcastReceiver {
    @NotNull

    /* renamed from: h */
    public static final C30547a f80423h = new C30547a(0);
    @Nullable

    /* renamed from: i */
    private static volatile id1 f80424i;
    @NotNull

    /* renamed from: a */
    private final Context f80425a;
    @NotNull

    /* renamed from: b */
    private final as1 f80426b;
    @NotNull

    /* renamed from: c */
    private final hd1 f80427c;
    @NotNull

    /* renamed from: d */
    private final gd1 f80428d;
    @NotNull

    /* renamed from: e */
    private final WeakHashMap<InterfaceC30548b, Object> f80429e;
    @NotNull

    /* renamed from: f */
    private final Object f80430f;
    @NotNull

    /* renamed from: g */
    private fd1 f80431g;

    /* renamed from: com.yandex.mobile.ads.impl.id1$a */
    /* loaded from: classes8.dex */
    public static final class C30547a {
        private C30547a() {
        }

        @NotNull
        /* renamed from: a */
        public final id1 m33296a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            id1 id1Var = id1.f80424i;
            if (id1Var == null) {
                synchronized (this) {
                    Context applicationContext = context.getApplicationContext();
                    int i = pp0.f84044f;
                    Executor m30601c = pp0.C31146a.m30600a().m30601c();
                    id1 id1Var2 = id1.f80424i;
                    if (id1Var2 == null) {
                        Intrinsics.m17074g(applicationContext);
                        id1Var2 = new id1(applicationContext, m30601c);
                        id1.f80424i = id1Var2;
                    }
                    id1Var = id1Var2;
                }
            }
            return id1Var;
        }

        public /* synthetic */ C30547a(int i) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.id1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30548b {
        /* renamed from: a */
        void mo31161a(@NotNull fd1 fd1Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* synthetic */ id1(Context context, Executor executor) {
        this(context, executor, as1.C29962a.m35776a(), new hd1(context), new gd1());
        int i = as1.f76895l;
    }

    /* renamed from: a */
    public static final void m33301a(id1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        fd1 m33574a = this$0.f80427c.m33574a();
        this$0.f80431g = m33574a;
        Objects.toString(m33574a);
        um0.m28725d(new Object[0]);
        try {
            this$0.f80428d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                this$0.f80425a.registerReceiver(this$0, intentFilter, 2);
            } else {
                this$0.f80425a.registerReceiver(this$0, intentFilter);
            }
        } catch (Exception unused) {
            Object[] args = new Object[0];
            int i = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        fd1 fd1Var;
        fd1 fd1Var2;
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        synchronized (this.f80430f) {
            fd1 fd1Var3 = this.f80431g;
            String action = intent.getAction();
            if (Intrinsics.m17075f(action, "android.intent.action.SCREEN_OFF")) {
                fd1Var = fd1.f79053c;
            } else if (Intrinsics.m17075f(action, "android.intent.action.USER_PRESENT")) {
                fd1Var = fd1.f79054d;
            } else if (this.f80431g != fd1.f79054d && Intrinsics.m17075f(action, "android.intent.action.SCREEN_ON")) {
                fd1Var = fd1.f79052b;
            } else {
                fd1Var = this.f80431g;
            }
            this.f80431g = fd1Var;
            if (fd1Var3 != fd1Var) {
                Objects.toString(fd1Var);
                um0.m28725d(new Object[0]);
            }
            fd1Var2 = this.f80431g;
            hashSet = new HashSet(this.f80429e.keySet());
            Unit unit = Unit.f99208a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC30548b) it.next()).mo31161a(fd1Var2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0023, code lost:
        if (r4.f80431g == com.yandex.mobile.ads.impl.fd1.f79054d) goto L8;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m33300b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.as1 r0 = r4.f80426b
            android.content.Context r1 = r4.f80425a
            com.yandex.mobile.ads.impl.yp1 r0 = r0.m35796a(r1)
            java.lang.Object r1 = r4.f80430f
            monitor-enter(r1)
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r0.m26755h0()     // Catch: java.lang.Throwable -> L29
            if (r0 != r2) goto L1f
            com.yandex.mobile.ads.impl.fd1 r0 = r4.f80431g     // Catch: java.lang.Throwable -> L29
            com.yandex.mobile.ads.impl.fd1 r3 = com.yandex.mobile.ads.impl.fd1.f79052b     // Catch: java.lang.Throwable -> L29
            if (r0 == r3) goto L27
            com.yandex.mobile.ads.impl.fd1 r3 = com.yandex.mobile.ads.impl.fd1.f79054d     // Catch: java.lang.Throwable -> L29
            if (r0 != r3) goto L26
            goto L27
        L1f:
            com.yandex.mobile.ads.impl.fd1 r0 = r4.f80431g     // Catch: java.lang.Throwable -> L29
            com.yandex.mobile.ads.impl.fd1 r3 = com.yandex.mobile.ads.impl.fd1.f79054d     // Catch: java.lang.Throwable -> L29
            if (r0 != r3) goto L26
            goto L27
        L26:
            r2 = 0
        L27:
            monitor-exit(r1)
            return r2
        L29:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.id1.m33300b():boolean");
    }

    private id1(Context context, Executor executor, as1 as1Var, hd1 hd1Var, gd1 gd1Var) {
        this.f80425a = context;
        this.f80426b = as1Var;
        this.f80427c = hd1Var;
        this.f80428d = gd1Var;
        this.f80429e = new WeakHashMap<>();
        this.f80430f = new Object();
        this.f80431g = fd1.f79054d;
        executor.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.kq2
            {
                id1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                id1.m33301a(id1.this);
            }
        });
    }

    /* renamed from: b */
    public final void m33299b(@NotNull InterfaceC30548b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f80430f) {
            this.f80429e.remove(callback);
        }
    }

    /* renamed from: a */
    public final void m33302a(@NotNull InterfaceC30548b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.f80430f) {
            this.f80429e.put(callback, null);
            Unit unit = Unit.f99208a;
        }
    }
}
