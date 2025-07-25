package com.smaato.sdk.core.util.appbackground;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class AppBackgroundDetector {
    private boolean foreground;
    @NonNull
    private final ArrayList<Listener> listeners = new ArrayList<>();

    /* loaded from: classes7.dex */
    public interface Listener {
        void onAppEnteredInBackground();

        void onAppEnteredInForeground();
    }

    /* renamed from: com.smaato.sdk.core.util.appbackground.AppBackgroundDetector$a */
    /* loaded from: classes7.dex */
    class C27300a implements ProcessLifecycleOwner.Listener {

        /* renamed from: a */
        final /* synthetic */ Logger f71936a;

        C27300a(Logger logger) {
            this.f71936a = logger;
        }

        @Override // com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner.Listener
        public void onFirstActivityStarted() {
            this.f71936a.info(LogDomain.CORE, "app entered foreground", new Object[0]);
            AppBackgroundDetector.this.foreground = true;
            AppBackgroundDetector appBackgroundDetector = AppBackgroundDetector.this;
            appBackgroundDetector.notifyListeners(appBackgroundDetector.foreground);
        }

        @Override // com.smaato.sdk.core.lifecycle.ProcessLifecycleOwner.Listener
        public void onLastActivityStopped() {
            this.f71936a.info(LogDomain.CORE, "app entered background", new Object[0]);
            AppBackgroundDetector.this.foreground = false;
            AppBackgroundDetector appBackgroundDetector = AppBackgroundDetector.this;
            appBackgroundDetector.notifyListeners(appBackgroundDetector.foreground);
        }
    }

    public AppBackgroundDetector(@NonNull Logger logger) {
        Objects.requireNonNull(logger, "logger must not be null for AppBackgroundDetector::new");
        ProcessLifecycleOwner.get().setListener(new C27300a(logger));
    }

    private void notifyListener(@NonNull Listener listener, boolean z) {
        if (z) {
            listener.onAppEnteredInForeground();
        } else {
            listener.onAppEnteredInBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners(boolean z) {
        Iterator it = new ArrayList(this.listeners).iterator();
        while (it.hasNext()) {
            notifyListener((Listener) it.next(), z);
        }
    }

    public synchronized void addListener(@NonNull Listener listener, boolean z) {
        Objects.requireNonNull(listener, "listener can not be null");
        if (!this.listeners.contains(listener)) {
            this.listeners.add(listener);
            if (z) {
                notifyListener(listener, this.foreground);
            }
        }
    }

    public synchronized void deleteListener(@Nullable Listener listener) {
        this.listeners.remove(listener);
    }

    public synchronized boolean isAppInBackground() {
        return !this.foreground;
    }
}
