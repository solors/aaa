package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.i2 */
/* loaded from: classes9.dex */
public final class C34604i2 implements InterfaceC35045yj, ApplicationStateProvider {

    /* renamed from: a */
    public final HashSet f94592a = new HashSet();

    /* renamed from: b */
    public final HashSet f94593b = new HashSet();

    /* renamed from: c */
    public volatile ApplicationState f94594c = ApplicationState.UNKNOWN;

    /* renamed from: d */
    public final CopyOnWriteArraySet f94595d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void m21559a(int i) {
        this.f94592a.remove(Integer.valueOf(i));
        m21560a();
    }

    /* renamed from: b */
    public final void m21558b(int i) {
        this.f94593b.add(Integer.valueOf(i));
        this.f94592a.remove(Integer.valueOf(i));
        m21560a();
    }

    /* renamed from: c */
    public final void m21557c(int i) {
        this.f94592a.add(Integer.valueOf(i));
        this.f94593b.remove(Integer.valueOf(i));
        m21560a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f94594c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onCreate() {
        m21560a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onDestroy() {
        if (this.f94594c == ApplicationState.VISIBLE) {
            this.f94594c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f94595d.add(applicationStateObserver);
        }
        return this.f94594c;
    }

    /* renamed from: a */
    public final void m21560a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f94592a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f94593b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f94594c != applicationState) {
            this.f94594c = applicationState;
            Iterator it = this.f94595d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f94594c);
            }
        }
    }
}
