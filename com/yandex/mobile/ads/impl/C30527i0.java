package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C30761l0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i0 */
/* loaded from: classes8.dex */
public final class C30527i0 implements InterfaceC30350g0 {
    @NotNull

    /* renamed from: f */
    private static final Object f80270f = new Object();
    @Nullable

    /* renamed from: g */
    private static volatile C30527i0 f80271g;
    @NotNull

    /* renamed from: a */
    private final Object f80272a = new Object();
    @NotNull

    /* renamed from: b */
    private final WeakHashMap f80273b = new WeakHashMap();
    @NotNull

    /* renamed from: c */
    private final WeakHashMap f80274c = new WeakHashMap();
    @NotNull

    /* renamed from: d */
    private final C30528a f80275d = new C30528a();

    /* renamed from: e */
    private boolean f80276e;

    /* renamed from: com.yandex.mobile.ads.impl.i0$a */
    /* loaded from: classes8.dex */
    public static final class C30528a implements Application.ActivityLifecycleCallbacks {
        C30528a() {
        }

        /* renamed from: a */
        private final HashSet m33395a(WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (C30527i0.this.f80272a) {
                Set keySet = weakHashMap.keySet();
                hashSet = new HashSet(keySet.size());
                for (Object obj : keySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = m33395a(C30527i0.this.f80274c).iterator();
            while (it.hasNext()) {
                ((cn1) it.next()).mo32383a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = m33395a(C30527i0.this.f80273b).iterator();
            while (it.hasNext()) {
                ((InterfaceC31250r0) it.next()).mo29884a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = m33395a(C30527i0.this.f80273b).iterator();
            while (it.hasNext()) {
                ((InterfaceC31250r0) it.next()).mo29882b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Iterator it = m33395a(C30527i0.this.f80274c).iterator();
            while (it.hasNext()) {
                ((cn1) it.next()).mo32382b(activity, outState);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C30527i0.this.m33402b(activity);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30350g0
    /* renamed from: b */
    public final void mo33400b(@NotNull Context context, @NotNull InterfaceC31250r0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80272a) {
            this.f80273b.put(listener, null);
            if (!m33398c()) {
                m33408a(context);
            }
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: c */
    public final boolean m33398c() {
        boolean z;
        synchronized (this.f80272a) {
            z = this.f80276e;
        }
        return z;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m33408a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f80275d);
            this.f80276e = true;
        } catch (Throwable unused) {
            Object[] args = new Object[0];
            int i = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30350g0
    /* renamed from: a */
    public final void mo33406a(@NotNull Context context, @NotNull InterfaceC31250r0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80272a) {
            this.f80273b.remove(listener);
            m33402b(context);
            Unit unit = Unit.f99208a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30350g0
    /* renamed from: b */
    public final void mo33401b(@NotNull Context context, @NotNull C30761l0.C30762a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80272a) {
            this.f80274c.put(listener, null);
            if (!m33398c()) {
                m33408a(context);
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30350g0
    /* renamed from: a */
    public final void mo33407a(@NotNull Context context, @NotNull C30761l0.C30762a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f80272a) {
            this.f80274c.remove(listener);
            m33402b(context);
            Unit unit = Unit.f99208a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m33402b(Context context) {
        synchronized (this.f80272a) {
            if (this.f80273b.isEmpty() && this.f80274c.isEmpty()) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (m33398c()) {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.m17073h(applicationContext, "null cannot be cast to non-null type android.app.Application");
                    ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f80275d);
                    this.f80276e = false;
                }
            }
            Unit unit = Unit.f99208a;
        }
    }
}
