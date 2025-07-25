package com.smaato.sdk.core.util.notifier;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.smaato.sdk.core.util.notifier.d */
/* loaded from: classes7.dex */
class StandardChangeSender<T> implements ChangeSender<T> {
    @NonNull

    /* renamed from: a */
    final Object f71976a = new Object();
    @NonNull

    /* renamed from: b */
    private final Set<ChangeNotifier.Listener<T>> f71977b = Collections.newSetFromMap(new WeakHashMap());
    @NonNull

    /* renamed from: c */
    private volatile T f71978c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StandardChangeSender(@NonNull T t) {
        this.f71978c = t;
    }

    /* renamed from: a */
    private void m39329a() {
        Iterator it = new HashSet(this.f71977b).iterator();
        while (it.hasNext()) {
            ((ChangeNotifier.Listener) it.next()).onNextValue(this.f71978c);
        }
    }

    @Override // com.smaato.sdk.core.util.notifier.ChangeNotifier
    public void addListener(@NonNull ChangeNotifier.Listener<T> listener) {
        Objects.requireNonNull(listener, "Parameter listener cannot be null for StandardChangeSender::addListener");
        synchronized (this.f71976a) {
            if (!this.f71977b.contains(listener)) {
                this.f71977b.add(listener);
                listener.onNextValue(this.f71978c);
            }
        }
    }

    @Override // com.smaato.sdk.core.util.notifier.ChangeSender
    @NonNull
    public T getValue() {
        T t;
        synchronized (this.f71976a) {
            t = this.f71978c;
        }
        return t;
    }

    @Override // com.smaato.sdk.core.util.notifier.ChangeSender
    public void newValue(@NonNull T t) {
        Objects.requireNonNull(t);
        synchronized (this.f71976a) {
            this.f71978c = t;
            m39329a();
        }
    }

    @Override // com.smaato.sdk.core.util.notifier.ChangeNotifier
    public void removeListener(@Nullable ChangeNotifier.Listener<T> listener) {
        synchronized (this.f71976a) {
            this.f71977b.remove(listener);
        }
    }
}
