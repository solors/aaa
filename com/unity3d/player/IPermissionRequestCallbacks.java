package com.unity3d.player;

/* loaded from: classes7.dex */
public interface IPermissionRequestCallbacks {
    void onPermissionDenied(String str);

    void onPermissionDeniedAndDontAskAgain(String str);

    void onPermissionGranted(String str);
}
