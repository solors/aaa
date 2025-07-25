package com.meevii.soniclib;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.beatles.unity.delegate.unity.DelegateActivity;
import com.beatles.unity.delegate.unity.IActivityDelegate;
import com.meevii.soniclib.util.NotchUtils;
import com.meevii.soniclib.util.SettingUtil;

/* loaded from: classes5.dex */
public class ActivityDelegate implements IActivityDelegate {
    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onCreate(DelegateActivity delegateActivity, Bundle bundle) {
        Log.e("ActivityDelegate", "onCreate");
        UnitySplashSDK.getInstance().onCreate(delegateActivity, bundle);
        SettingUtil.onCreate(delegateActivity);
        NotchUtils.initDisCutout(delegateActivity);
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onDestroy(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onPause(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onRestart(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onResume(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onStart(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onStop(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void willOnDestroy(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onNewIntent(DelegateActivity delegateActivity, Intent intent) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void willOnCreate(DelegateActivity delegateActivity, Bundle bundle) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onActivityResult(DelegateActivity delegateActivity, int i, int i2, Intent intent) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onRequestPermissionsResult(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr) {
    }
}
