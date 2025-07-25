package com.meevii.push.permission;

import android.app.Activity;
import android.view.View;

/* renamed from: com.meevii.push.permission.b */
/* loaded from: classes5.dex */
public interface IPushPermissionCustomUI {
    int getCancelViewId();

    int getConfirmViewId();

    int getLayoutId();

    void init(Activity activity, View view);
}
