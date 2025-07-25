package com.beatles.localdialog;

import android.content.Intent;
import android.os.Bundle;
import com.beatles.unity.delegate.unity.DelegateActivity;
import com.beatles.unity.delegate.unity.IActivityDelegate;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public class DialogActivityDelegate implements IActivityDelegate {
    private boolean isPause;

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onPause(DelegateActivity delegateActivity) {
        this.isPause = true;
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onResume(DelegateActivity delegateActivity) {
        if (this.isPause && DialogHelper.isShowDialog()) {
            UnityPlayer.currentActivity.onWindowFocusChanged(true);
        }
        this.isPause = false;
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onDestroy(DelegateActivity delegateActivity) {
    }

    @Override // com.beatles.unity.delegate.unity.IActivityDelegate
    public void onRestart(DelegateActivity delegateActivity) {
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
    public void onCreate(DelegateActivity delegateActivity, Bundle bundle) {
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
