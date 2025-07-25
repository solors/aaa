package com.meevii.push.permission;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p755k6.C37395f;
import p755k6.C37396g;
import p755k6.C37397h;

/* renamed from: com.meevii.push.permission.a */
/* loaded from: classes5.dex */
public abstract class DefaultPushPermissionCustomUI implements IPushPermissionCustomUI {
    @Override // com.meevii.push.permission.IPushPermissionCustomUI
    public int getCancelViewId() {
        return C37396g.tv_cancel;
    }

    @Override // com.meevii.push.permission.IPushPermissionCustomUI
    public int getConfirmViewId() {
        return C37396g.tv_confirm;
    }

    @Override // com.meevii.push.permission.IPushPermissionCustomUI
    public int getLayoutId() {
        return C37397h.push_default_permission_dialog;
    }

    @Override // com.meevii.push.permission.IPushPermissionCustomUI
    public void init(Activity activity, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) activity.getResources().getDimension(C37395f.dp_260), -2);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
        initView((TextView) view.findViewById(C37396g.tv_title), (TextView) view.findViewById(C37396g.tv_content), (TextView) view.findViewById(getCancelViewId()), (TextView) view.findViewById(getConfirmViewId()));
    }

    public abstract void initView(TextView textView, TextView textView2, TextView textView3, TextView textView4);
}
