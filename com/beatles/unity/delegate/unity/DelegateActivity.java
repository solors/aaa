package com.beatles.unity.delegate.unity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public class DelegateActivity extends UnityPlayerActivity {
    private IActivityDelegate[] mDelegates;

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        String string = context.getString(C6366R.C6372string.activity_delegate_mark);
        onAttachBaseContext(context);
        int i = 0;
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData;
            Set<String> keySet = bundle.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            for (String str : keySet) {
                try {
                    if (string.equals(bundle.get(str))) {
                        try {
                            arrayList.add((IActivityDelegate) Class.forName(str).newInstance());
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
            this.mDelegates = (IActivityDelegate[]) arrayList.toArray(new IActivityDelegate[i]);
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            this.mDelegates = new IActivityDelegate[0];
        }
    }

    public UnityPlayer getPlayer() {
        return this.mUnityPlayer;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onActivityResult(this, i, i2, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.willOnCreate(this, bundle);
        }
        super.onCreate(bundle);
        try {
            Object privateFieldValue = ReflectionUtil.getPrivateFieldValue(UnityPlayer.currentActivity, "mUnityPlayer");
            if (privateFieldValue != null) {
                ReflectionUtil.setFieldValue(privateFieldValue, "m_PersistentUnitySurface", null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        for (IActivityDelegate iActivityDelegate2 : this.mDelegates) {
            iActivityDelegate2.onCreate(this, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onDestroy() {
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.willOnDestroy(this);
        }
        super.onDestroy();
        for (IActivityDelegate iActivityDelegate2 : this.mDelegates) {
            iActivityDelegate2.onDestroy(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onNewIntent(this, intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onPause(this);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onRequestPermissionsResult(this, i, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onRestart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onResume(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onStart(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        for (IActivityDelegate iActivityDelegate : this.mDelegates) {
            iActivityDelegate.onStop(this);
        }
    }

    public void setPlayer(UnityPlayer unityPlayer) {
        this.mUnityPlayer = unityPlayer;
    }

    protected void onAttachBaseContext(Context context) {
    }
}
