package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.ironsource.C20123j;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class ContextProvider {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    private static volatile ContextProvider f49913d;

    /* renamed from: a */
    private Activity f49914a;

    /* renamed from: b */
    private Context f49915b;

    /* renamed from: c */
    private ConcurrentHashMap<String, InterfaceC19841a> f49916c = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.environment.ContextProvider$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC19841a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f49913d == null) {
            synchronized (ContextProvider.class) {
                if (f49913d == null) {
                    f49913d = new ContextProvider();
                }
            }
        }
        return f49913d;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f49915b;
        if (context == null && (activity = this.f49914a) != null) {
            return activity.getApplicationContext();
        }
        return context;
    }

    public Activity getCurrentActiveActivity() {
        Activity activity = this.f49914a;
        if (activity != null) {
            return activity;
        }
        return C20123j.f50655a.m57926b();
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (InterfaceC19841a interfaceC19841a : this.f49916c.values()) {
                interfaceC19841a.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f49914a = activity;
            for (InterfaceC19841a interfaceC19841a : this.f49916c.values()) {
                interfaceC19841a.onResume(this.f49914a);
            }
        }
    }

    public void registerLifeCycleListener(InterfaceC19841a interfaceC19841a) {
        this.f49916c.put(interfaceC19841a.getClass().getSimpleName(), interfaceC19841a);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f49914a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f49915b = context;
        }
    }
}
