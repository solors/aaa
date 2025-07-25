package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ironsource.vt */
/* loaded from: classes6.dex */
public class C21151vt {
    /* renamed from: a */
    public static void m54391a(Context context, String str) throws Exception {
        m54390a(context, str, null);
    }

    /* renamed from: a */
    public static void m54390a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("url is null");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }
}
