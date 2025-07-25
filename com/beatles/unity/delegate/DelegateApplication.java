package com.beatles.unity.delegate;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.ano.gshell.AnoApplication;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public class DelegateApplication extends AnoApplication {
    private IAppDelegate[] mDelegates;

    @Override // com.ano.gshell.AnoApplication, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        onAttachBaseContext(context);
        String string = context.getString(C6350R.C6356string.app_delegate_mark);
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            bundle.getBoolean("com.beatles.unity.MULTIDEX", false);
            Set<String> keySet = bundle.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            int i = 0;
            for (String str : keySet) {
                try {
                    if (string.equals(bundle.get(str))) {
                        try {
                            arrayList.add((IAppDelegate) Class.forName(str).newInstance());
                            i++;
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        } catch (IllegalAccessException e2) {
                            e2.printStackTrace();
                        } catch (InstantiationException e3) {
                            e3.printStackTrace();
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            IAppDelegate[] iAppDelegateArr = (IAppDelegate[]) arrayList.toArray(new IAppDelegate[i]);
            this.mDelegates = iAppDelegateArr;
            for (IAppDelegate iAppDelegate : iAppDelegateArr) {
                try {
                    iAppDelegate.onAttachBaseContext(this);
                } catch (AbstractMethodError e4) {
                    e4.printStackTrace();
                    Log.e("Error", iAppDelegate.getClass().getName());
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            this.mDelegates = new IAppDelegate[0];
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (IAppDelegate iAppDelegate : this.mDelegates) {
            iAppDelegate.onConfigurationChanged(this, configuration);
        }
    }

    @Override // com.ano.gshell.AnoApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        for (IAppDelegate iAppDelegate : this.mDelegates) {
            iAppDelegate.onCreate(this);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        for (IAppDelegate iAppDelegate : this.mDelegates) {
            iAppDelegate.onLowMemory(this);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        for (IAppDelegate iAppDelegate : this.mDelegates) {
            iAppDelegate.onTerminate(this);
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        for (IAppDelegate iAppDelegate : this.mDelegates) {
            iAppDelegate.onTrimMemory(this, i);
        }
    }

    protected void onAttachBaseContext(Context context) {
    }
}
