package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Lb */
/* loaded from: classes9.dex */
public final class C34038Lb implements InterfaceC33966Ib, ToggleObserver {

    /* renamed from: a */
    public final ArrayList f93175a = new ArrayList();

    /* renamed from: b */
    public final IHandlerExecutor f93176b = C34693la.m21444h().m21431u().m20771c();

    /* renamed from: c */
    public C34001Jm f93177c;

    /* renamed from: d */
    public boolean f93178d;

    /* renamed from: a */
    public final void m22480a(@Nullable Toggle toggle) {
        C34001Jm c34001Jm = new C34001Jm(toggle);
        this.f93177c = c34001Jm;
        c34001Jm.f93089c.registerObserver(this, true);
    }

    /* renamed from: b */
    public final void m22474b(@NotNull Object obj) {
        C34001Jm c34001Jm = this.f93177c;
        if (c34001Jm == null) {
            Intrinsics.m17056y("togglesHolder");
            c34001Jm = null;
        }
        c34001Jm.f93088b.m22746b(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.f93176b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.io
            {
                C34038Lb.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C34038Lb.m22478a(C34038Lb.this, z);
            }
        });
    }

    /* renamed from: a */
    public final void m22477a(@NotNull final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.f93176b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.jo
            {
                C34038Lb.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C34038Lb.m22479a(C34038Lb.this, locationControllerObserver, z);
            }
        });
    }

    /* renamed from: a */
    public static final void m22479a(C34038Lb c34038Lb, LocationControllerObserver locationControllerObserver, boolean z) {
        c34038Lb.f93175a.add(locationControllerObserver);
        if (z) {
            if (c34038Lb.f93178d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    /* renamed from: a */
    public static final void m22478a(C34038Lb c34038Lb, boolean z) {
        if (c34038Lb.f93178d != z) {
            c34038Lb.f93178d = z;
            Function1 function1 = z ? C33990Jb.f93061a : C34014Kb.f93127a;
            for (LocationControllerObserver locationControllerObserver : c34038Lb.f93175a) {
                function1.invoke(locationControllerObserver);
            }
        }
    }

    /* renamed from: a */
    public final void m22476a(@NotNull Object obj) {
        C34001Jm c34001Jm = this.f93177c;
        if (c34001Jm == null) {
            Intrinsics.m17056y("togglesHolder");
            c34001Jm = null;
        }
        c34001Jm.f93088b.m22747a(obj);
    }

    /* renamed from: a */
    public final void m22475a(boolean z) {
        C34001Jm c34001Jm = this.f93177c;
        if (c34001Jm == null) {
            Intrinsics.m17056y("togglesHolder");
            c34001Jm = null;
        }
        c34001Jm.f93087a.m22143a(z);
    }
}
