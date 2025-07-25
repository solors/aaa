package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l1 */
/* loaded from: classes8.dex */
public final class C30763l1 {
    @NotNull

    /* renamed from: b */
    public static final C30764a f81656b = new C30764a(0);
    @Nullable

    /* renamed from: c */
    private static volatile C30763l1 f81657c;
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f81658a;

    /* renamed from: com.yandex.mobile.ads.impl.l1$a */
    /* loaded from: classes8.dex */
    public static final class C30764a {
        private C30764a() {
        }

        @NotNull
        /* renamed from: a */
        public final C30763l1 m32376a() {
            C30763l1 c30763l1 = C30763l1.f81657c;
            if (c30763l1 == null) {
                synchronized (this) {
                    c30763l1 = C30763l1.f81657c;
                    if (c30763l1 == null) {
                        c30763l1 = new C30763l1(0);
                        C30763l1.f81657c = c30763l1;
                    }
                }
            }
            return c30763l1;
        }

        public /* synthetic */ C30764a(int i) {
            this();
        }
    }

    private C30763l1() {
        this.f81658a = new LinkedHashMap();
        m32377a("window_type_browser", new C31622v0());
    }

    @Nullable
    /* renamed from: a */
    public final synchronized InterfaceC30595j1 m32379a(@NotNull Context context, @NotNull RelativeLayout rootLayout, @NotNull C31012o1 listener, @NotNull C29980b1 eventController, @NotNull Intent intent, @NotNull Window window, @Nullable C31942z0 c31942z0) {
        InterfaceC30688k1 interfaceC30688k1;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(window, "window");
        String stringExtra = intent.getStringExtra("window_type");
        if (stringExtra == null || (interfaceC30688k1 = (InterfaceC30688k1) this.f81658a.get(stringExtra)) == null) {
            return null;
        }
        return interfaceC30688k1.mo28582a(context, rootLayout, listener, eventController, intent, window, c31942z0);
    }

    public /* synthetic */ C30763l1(int i) {
        this();
    }

    /* renamed from: a */
    public final synchronized void m32377a(@NotNull String windowType, @NotNull InterfaceC30688k1 creator) {
        Intrinsics.checkNotNullParameter(windowType, "windowType");
        Intrinsics.checkNotNullParameter(creator, "creator");
        if (!this.f81658a.containsKey(windowType)) {
            this.f81658a.put(windowType, creator);
        }
    }
}
