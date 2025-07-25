package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a */
    private final String f92478a;

    /* renamed from: b */
    private boolean f92479b;

    /* renamed from: c */
    private final ArrayList f92480c;

    public SimpleThreadSafeToggle(boolean z, @NotNull String str) {
        this.f92478a = str;
        this.f92479b = z;
        this.f92480c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f92479b;
    }

    @NotNull
    protected final String getTag() {
        return this.f92478a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(@NotNull ToggleObserver toggleObserver, boolean z) {
        this.f92480c.add(toggleObserver);
        if (z) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(@NotNull ToggleObserver toggleObserver) {
        this.f92480c.remove(toggleObserver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void updateState(boolean z) {
        if (z != getActualState()) {
            this.f92479b = z;
            for (ToggleObserver toggleObserver : this.f92480c) {
                toggleObserver.onStateChanged(z);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str);
    }
}
