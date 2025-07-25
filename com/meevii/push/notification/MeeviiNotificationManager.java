package com.meevii.push.notification;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.provider.HmsContentProvider;
import java.util.HashMap;
import java.util.Map;
import p1010v6.LocalPushData;
import p636d7.PushLogUtil;
import p636d7.PushShowFailUtil;

/* renamed from: com.meevii.push.notification.c */
/* loaded from: classes5.dex */
public class MeeviiNotificationManager {

    /* renamed from: a */
    private final Map<String, IDisplayPush> f61590a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeeviiNotificationManager.java */
    /* renamed from: com.meevii.push.notification.c$b */
    /* loaded from: classes5.dex */
    public static class C23329b {

        /* renamed from: a */
        private static final MeeviiNotificationManager f61591a = new MeeviiNotificationManager();
    }

    /* renamed from: b */
    public static MeeviiNotificationManager m47899b() {
        return C23329b.f61591a;
    }

    /* renamed from: a */
    public void m47900a(String str, IDisplayPush iDisplayPush) {
        this.f61590a.put(str, iDisplayPush);
    }

    /* renamed from: c */
    public boolean m47898c(Context context, String str, IDisplayPushData iDisplayPushData) {
        try {
            IDisplayPush iDisplayPush = this.f61590a.get(str);
            if (iDisplayPush == null) {
                PushLogUtil.m25698a("local push show fail, because displayPush is null");
                PushShowFailUtil.m25693a(null, 1003);
                return false;
            } else if (HmsContentProvider.appIsForeground() && !iDisplayPush.isForegroundShow(iDisplayPushData)) {
                if (TextUtils.equals(str, CustomTabsCallback.ONLINE_EXTRAS_KEY)) {
                    PushShowFailUtil.m25692b(((NotificationBean) iDisplayPushData).m47976l(), 1006);
                } else if (TextUtils.equals(str, "local")) {
                    PushShowFailUtil.m25693a(((LocalPushData) iDisplayPushData).m2670f(), 1006);
                }
                PushLogUtil.m25698a("local push show fail, because app is foreground and foreground notification interface return false");
                return false;
            } else {
                return iDisplayPush.show(context, iDisplayPushData);
            }
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return false;
        }
    }

    private MeeviiNotificationManager() {
        this.f61590a = new HashMap();
    }
}
