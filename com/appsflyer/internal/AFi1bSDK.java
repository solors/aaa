package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public abstract class AFi1bSDK extends Observable {
    public final String AFInAppEventParameterName;
    final Runnable AFKeystoreWrapper;
    long AFLogger;

    /* renamed from: e */
    public final String f13070e;
    public final Map<String, Object> valueOf = new HashMap();
    public AFa1uSDK AFInAppEventType = AFa1uSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFi1bSDK$4 */
    /* loaded from: classes2.dex */
    final class C62634 implements Observer {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C62634() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFi1bSDK.this.AFKeystoreWrapper.run();
        }
    }

    /* loaded from: classes2.dex */
    public enum AFa1uSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFi1bSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.AFInAppEventParameterName = str2;
        this.f13070e = str;
    }

    public final void AFInAppEventType() {
        this.valueOf.put("source", this.AFInAppEventParameterName);
        this.valueOf.put("type", this.f13070e);
        this.valueOf.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFLogger));
        this.AFInAppEventType = AFa1uSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void values(Context context);
}
