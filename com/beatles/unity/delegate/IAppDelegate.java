package com.beatles.unity.delegate;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/* loaded from: classes3.dex */
public interface IAppDelegate {
    void onAttachBaseContext(Context context);

    void onConfigurationChanged(Application application, Configuration configuration);

    void onCreate(Application application);

    void onLowMemory(Application application);

    void onTerminate(Application application);

    void onTrimMemory(Application application, int i);
}
