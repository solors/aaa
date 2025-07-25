package com.beatles.unity.delegate.unity;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes3.dex */
public interface IActivityDelegate {
    void onActivityResult(DelegateActivity delegateActivity, int i, int i2, Intent intent);

    void onCreate(DelegateActivity delegateActivity, Bundle bundle);

    void onDestroy(DelegateActivity delegateActivity);

    void onNewIntent(DelegateActivity delegateActivity, Intent intent);

    void onPause(DelegateActivity delegateActivity);

    void onRequestPermissionsResult(DelegateActivity delegateActivity, int i, String[] strArr, int[] iArr);

    void onRestart(DelegateActivity delegateActivity);

    void onResume(DelegateActivity delegateActivity);

    void onStart(DelegateActivity delegateActivity);

    void onStop(DelegateActivity delegateActivity);

    void willOnCreate(DelegateActivity delegateActivity, Bundle bundle);

    void willOnDestroy(DelegateActivity delegateActivity);
}
