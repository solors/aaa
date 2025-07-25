package com.meevii.soniclib;

import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.beatles.unity.delegate.unity.DelegateActivity;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes5.dex */
public class MainActivity extends DelegateActivity {
    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (UnitySplashSDK.getInstance().isShowing) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (UnitySplashSDK.getInstance().isShowing) {
            return false;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (UnitySplashSDK.getInstance().isShowing) {
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (UnitySplashSDK.getInstance().isShowing) {
            return false;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beatles.unity.delegate.unity.DelegateActivity, com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("shortcut");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            Log.d("UnityBridge", "Sending shortcut to Unity: " + stringExtra);
            UnityPlayer.UnitySendMessage("ShortcutAction", "OnShortcutReceived", stringExtra);
        }
    }

    @Override // com.unity3d.player.UnityPlayerActivity, android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (UnitySplashSDK.getInstance().isShowing) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
