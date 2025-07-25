package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* loaded from: classes9.dex */
public final class ConjunctiveCompositeThreadSafeToggle implements Toggle {

    /* renamed from: c */
    private final String f92473c;

    /* renamed from: e */
    private volatile boolean f92475e;

    /* renamed from: a */
    private final ArrayList f92471a = new ArrayList();

    /* renamed from: b */
    private final HashMap f92472b = new HashMap();

    /* renamed from: d */
    private final ReentrantLock f92474d = new ReentrantLock();

    public ConjunctiveCompositeThreadSafeToggle(@NotNull List<? extends Toggle> list, @NotNull String str) {
        this.f92473c = "[ConjunctiveCompositeToggle-" + str + ']';
        try {
            access$acquireLock(this);
            for (final Toggle toggle : list) {
                ToggleObserver toggleObserver = new ToggleObserver() { // from class: io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle$1$1$observer$1
                    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
                    public void onStateChanged(boolean z) {
                        ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle = ConjunctiveCompositeThreadSafeToggle.this;
                        Toggle toggle2 = toggle;
                        try {
                            ConjunctiveCompositeThreadSafeToggle.access$acquireLock(conjunctiveCompositeThreadSafeToggle);
                            ConjunctiveCompositeThreadSafeToggle.access$updateState(conjunctiveCompositeThreadSafeToggle, this, z, String.valueOf(Reflection.m17042b(toggle2.getClass()).getSimpleName()));
                        } finally {
                            ConjunctiveCompositeThreadSafeToggle.access$releaseLock(conjunctiveCompositeThreadSafeToggle);
                        }
                    }
                };
                this.f92472b.put(toggleObserver, Boolean.valueOf(toggle.getActualState()));
                toggle.registerObserver(toggleObserver, false);
            }
            setActualState(m22799a(this.f92472b.values()));
        } finally {
            access$releaseLock(this);
        }
    }

    /* renamed from: a */
    private static boolean m22799a(Collection collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final void access$acquireLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.getClass();
        boolean z = false;
        while (!z) {
            try {
                Result.C38506a c38506a = Result.f101870c;
                z = conjunctiveCompositeThreadSafeToggle.f92474d.tryLock(100L, TimeUnit.MILLISECONDS);
                Result.m14549b(Unit.f99208a);
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                Result.m14549b(C38508r.m14540a(th));
            }
            if (!z) {
                try {
                    Thread.sleep(100L);
                    Result.m14549b(Unit.f99208a);
                } catch (Throwable th2) {
                    Result.C38506a c38506a3 = Result.f101870c;
                    Result.m14549b(C38508r.m14540a(th2));
                }
            }
        }
    }

    public static final void access$releaseLock(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle) {
        conjunctiveCompositeThreadSafeToggle.f92474d.unlock();
    }

    public static final void access$updateState(ConjunctiveCompositeThreadSafeToggle conjunctiveCompositeThreadSafeToggle, ToggleObserver toggleObserver, boolean z, String str) {
        conjunctiveCompositeThreadSafeToggle.f92472b.put(toggleObserver, Boolean.valueOf(z));
        boolean m22799a = m22799a(conjunctiveCompositeThreadSafeToggle.f92472b.values());
        if (m22799a != conjunctiveCompositeThreadSafeToggle.getActualState()) {
            conjunctiveCompositeThreadSafeToggle.setActualState(m22799a);
            Iterator it = conjunctiveCompositeThreadSafeToggle.f92471a.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(m22799a);
            }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public boolean getActualState() {
        return this.f92475e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z) {
        try {
            access$acquireLock(this);
            this.f92471a.add(toggleObserver);
            if (z) {
                toggleObserver.onStateChanged(getActualState());
            }
        } finally {
            access$releaseLock(this);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public void removeObserver(@NotNull ToggleObserver toggleObserver) {
        try {
            access$acquireLock(this);
            this.f92471a.remove(toggleObserver);
        } finally {
            access$releaseLock(this);
        }
    }

    public void setActualState(boolean z) {
        this.f92475e = z;
    }

    @NotNull
    public String toString() {
        return "ConjunctiveCompositeThreadSafeToggle(toggleStates=" + this.f92472b + ", tag='" + this.f92473c + "', actualState=" + getActualState() + ')';
    }
}
