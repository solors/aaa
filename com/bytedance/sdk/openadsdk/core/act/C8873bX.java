package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;

/* renamed from: com.bytedance.sdk.openadsdk.core.act.bX */
/* loaded from: classes3.dex */
public class C8873bX implements InterfaceC8872IL {
    /* renamed from: bg */
    public static void m84525bg(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.intent.setPackage(str);
        customTabsIntent.launchUrl(context, uri);
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.InterfaceC8872IL
    /* renamed from: bg */
    public void mo84511bg(CustomTabsClient customTabsClient) {
        throw null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.InterfaceC8872IL
    /* renamed from: bg */
    public void mo84512bg() {
        throw null;
    }
}
