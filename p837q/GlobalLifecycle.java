package p837q;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: q.h */
/* loaded from: classes2.dex */
public final class GlobalLifecycle extends Lifecycle {
    @NotNull

    /* renamed from: a */
    public static final GlobalLifecycle f103263a = new GlobalLifecycle();
    @NotNull

    /* renamed from: b */
    private static final LifecycleOwner f103264b = new LifecycleOwner() { // from class: q.g
        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return GlobalLifecycle.m13107b();
        }
    };

    private GlobalLifecycle() {
    }

    /* renamed from: b */
    public static /* synthetic */ Lifecycle m13107b() {
        return m13106c();
    }

    /* renamed from: c */
    public static final Lifecycle m13106c() {
        return f103263a;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
            LifecycleOwner lifecycleOwner = f103264b;
            defaultLifecycleObserver.onCreate(lifecycleOwner);
            defaultLifecycleObserver.onStart(lifecycleOwner);
            defaultLifecycleObserver.onResume(lifecycleOwner);
            return;
        }
        throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull LifecycleObserver lifecycleObserver) {
    }
}
