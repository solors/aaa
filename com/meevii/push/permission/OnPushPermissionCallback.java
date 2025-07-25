package com.meevii.push.permission;

/* renamed from: com.meevii.push.permission.d */
/* loaded from: classes5.dex */
public interface OnPushPermissionCallback {
    void onError(Throwable th);

    void onGotoSetting();

    void onResult(int i);
}
