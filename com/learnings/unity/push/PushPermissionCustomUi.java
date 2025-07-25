package com.learnings.unity.push;

import android.text.TextUtils;
import android.widget.TextView;
import com.meevii.push.permission.DefaultPushPermissionCustomUI;
import p844q6.DataManager;

/* loaded from: classes6.dex */
public class PushPermissionCustomUi extends DefaultPushPermissionCustomUI {
    private static final String KEY_PUSH_PERMISSION_CUSTOM_UI_CANCEL = "key_push_permission_custom_ui_cancel";
    private static final String KEY_PUSH_PERMISSION_CUSTOM_UI_CONFIRM = "key_push_permission_custom_ui_confirm";
    private static final String KEY_PUSH_PERMISSION_CUSTOM_UI_CONTENT = "key_push_permission_custom_ui_content";
    private static final String KEY_PUSH_PERMISSION_CUSTOM_UI_TITLE = "key_push_permission_custom_ui_title";
    private String mCancel;
    private String mConfirm;
    private String mContent;
    private String mTitle;

    public static void setData(String str, String str2, String str3, String str4) {
        DataManager.m12928g().m12911x(KEY_PUSH_PERMISSION_CUSTOM_UI_TITLE, str);
        DataManager.m12928g().m12911x(KEY_PUSH_PERMISSION_CUSTOM_UI_CONTENT, str2);
        DataManager.m12928g().m12911x(KEY_PUSH_PERMISSION_CUSTOM_UI_CANCEL, str3);
        DataManager.m12928g().m12911x(KEY_PUSH_PERMISSION_CUSTOM_UI_CONFIRM, str4);
    }

    @Override // com.meevii.push.permission.DefaultPushPermissionCustomUI
    public void initView(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.mTitle = DataManager.m12928g().m12923l(KEY_PUSH_PERMISSION_CUSTOM_UI_TITLE, "");
        this.mContent = DataManager.m12928g().m12923l(KEY_PUSH_PERMISSION_CUSTOM_UI_CONTENT, "");
        this.mCancel = DataManager.m12928g().m12923l(KEY_PUSH_PERMISSION_CUSTOM_UI_CANCEL, "");
        this.mConfirm = DataManager.m12928g().m12923l(KEY_PUSH_PERMISSION_CUSTOM_UI_CONFIRM, "");
        if (!TextUtils.isEmpty(this.mTitle)) {
            textView.setText(this.mTitle);
        }
        if (!TextUtils.isEmpty(this.mContent)) {
            textView2.setText(this.mContent);
        }
        if (!TextUtils.isEmpty(this.mCancel)) {
            textView3.setText(this.mCancel);
        }
        if (!TextUtils.isEmpty(this.mConfirm)) {
            textView4.setText(this.mConfirm);
        }
    }
}
