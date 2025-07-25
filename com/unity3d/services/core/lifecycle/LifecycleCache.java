package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.unity3d.scar.adapter.common.C28805l;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
/* loaded from: classes7.dex */
public class LifecycleCache implements Application.ActivityLifecycleCallbacks, LifecycleEventObserver {
    private boolean _newLifecycle;
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;
    private boolean _appActive = true;
    private boolean _lifecycleAppActive = true;
    private int _numStarted = 0;
    private final Set<IAppActiveListener> _appActiveListeners = new HashSet();
    private final Set<IAppEventListener> _appStateListeners = new HashSet();

    /* renamed from: com.unity3d.services.core.lifecycle.LifecycleCache$2 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C290352 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$Event = iArr;
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCache(ConfigurationReader configurationReader) {
        this._newLifecycle = false;
        this._newLifecycle = configurationReader.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        startProcessLifecycleObserving();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerLifecycleObserver() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
    }

    private void startProcessLifecycleObserving() {
        C28805l.m37569a(new Runnable() { // from class: com.unity3d.services.core.lifecycle.LifecycleCache.1
            @Override // java.lang.Runnable
            public void run() {
                LifecycleCache.this.registerLifecycleObserver();
            }
        });
    }

    public synchronized void addActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.add(iAppActiveListener);
    }

    public synchronized void addStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.add(iAppEventListener);
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        if (this._newLifecycle) {
            return this._lifecycleAppActive;
        }
        return this._appActive;
    }

    public synchronized void notifyActiveListeners() {
        for (IAppActiveListener iAppActiveListener : this._appActiveListeners) {
            iAppActiveListener.onAppStateChanged(this._appActive);
        }
    }

    public synchronized void notifyStateListeners(LifecycleEvent lifecycleEvent) {
        for (IAppEventListener iAppEventListener : this._appStateListeners) {
            iAppEventListener.onLifecycleEvent(lifecycleEvent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.PAUSED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.RESUMED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
        if (this._numStarted == 0) {
            this._appActive = true;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
        this._numStarted++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
        int i = this._numStarted - 1;
        this._numStarted = i;
        if (i <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        int i = C290352.$SwitchMap$androidx$lifecycle$Lifecycle$Event[event.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this._lifecycleAppActive = true;
                if (this._newLifecycle) {
                    notifyActiveListeners();
                    return;
                }
                return;
            }
            return;
        }
        this._lifecycleAppActive = false;
        if (this._newLifecycle) {
            notifyActiveListeners();
        }
    }

    public synchronized void removeActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.remove(iAppActiveListener);
    }

    public synchronized void removeStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.remove(iAppEventListener);
    }
}
