package com.smaato.sdk.richmedia.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.widget.OrientationChangeWatcher;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public final class OrientationChangeWatcher {
    @NonNull
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    @NonNull
    private final OrientationBroadcastReceiver orientationBroadcastReceiver;

    /* loaded from: classes7.dex */
    public interface Listener {
        void onOrientationChange();
    }

    public OrientationChangeWatcher(@NonNull OrientationBroadcastReceiver orientationBroadcastReceiver) {
        this.orientationBroadcastReceiver = (OrientationBroadcastReceiver) Objects.requireNonNull(orientationBroadcastReceiver);
        orientationBroadcastReceiver.getOrientationChangeSender().addListener(new ChangeNotifier.Listener() { // from class: com.smaato.sdk.richmedia.widget.i
            @Override // com.smaato.sdk.core.util.notifier.ChangeNotifier.Listener
            public final void onNextValue(Object obj) {
                OrientationChangeWatcher.m39005a(OrientationChangeWatcher.this, (Whatever) obj);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m39005a(OrientationChangeWatcher orientationChangeWatcher, Whatever whatever) {
        orientationChangeWatcher.lambda$new$0(whatever);
    }

    public /* synthetic */ void lambda$new$0(Whatever whatever) {
        notifyListeners();
    }

    private synchronized void notifyListeners() {
        Iterables.forEach(new HashSet(this.listeners), new Consumer() { // from class: com.smaato.sdk.richmedia.widget.h
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((OrientationChangeWatcher.Listener) obj).onOrientationChange();
            }
        });
    }

    public synchronized void addListener(@NonNull Listener listener) {
        Objects.requireNonNull(listener);
        this.listeners.add(listener);
        if (!this.listeners.isEmpty() && !this.orientationBroadcastReceiver.isRegistered()) {
            this.orientationBroadcastReceiver.register();
        }
    }

    public synchronized void removeListener(@Nullable Listener listener) {
        this.listeners.remove(listener);
        if (this.listeners.isEmpty() && this.orientationBroadcastReceiver.isRegistered()) {
            this.orientationBroadcastReceiver.unregister();
        }
    }
}
