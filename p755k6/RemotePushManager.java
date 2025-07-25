package p755k6;

import android.content.Intent;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.debug.PushDebugActivity;
import com.meevii.push.notification.MeeviiNotificationManager;
import java.util.HashSet;
import java.util.Set;
import p008a7.RequestRemote;
import p030b7.PushWork;
import p1039x6.DefaultDisplayNotification;
import p1070z6.ADMRemotePushRegisterProcessor;
import p1070z6.FCMRemotePushRegisterProcessor;
import p1070z6.IRemotePushRegisterProcessor;
import p636d7.PushLogUtil;
import p636d7.PushShowFailUtil;
import p636d7.PushUtil;
import p636d7.ThreadBus;
import p772l6.PushEvent;
import p844q6.DataManager;
import p844q6.RequestData;

/* renamed from: k6.l */
/* loaded from: classes4.dex */
public class RemotePushManager {

    /* renamed from: b */
    private static final Set<String> f98700b = new HashSet();

    /* renamed from: a */
    private IRemotePushRegisterProcessor f98701a;

    /* compiled from: RemotePushManager.java */
    /* renamed from: k6.l$a */
    /* loaded from: classes4.dex */
    public static class C37401a {

        /* renamed from: a */
        private static final RemotePushManager f98702a = new RemotePushManager();
    }

    /* renamed from: d */
    public static RemotePushManager m18148d() {
        return C37401a.f98702a;
    }

    /* renamed from: e */
    private IRemotePushRegisterProcessor m18147e() {
        IRemotePushRegisterProcessor iRemotePushRegisterProcessor = this.f98701a;
        if (iRemotePushRegisterProcessor != null) {
            return iRemotePushRegisterProcessor;
        }
        if (TextUtils.equals(PushConfigManager.m18207a().m18205c(), "Amazon")) {
            this.f98701a = new ADMRemotePushRegisterProcessor();
        } else {
            this.f98701a = new FCMRemotePushRegisterProcessor();
        }
        return this.f98701a;
    }

    /* renamed from: g */
    public static /* synthetic */ void m18145g(NotificationBean notificationBean) {
        MeeviiNotificationManager.m47899b().m47898c(PushConfigManager.m18207a().m18206b(), CustomTabsCallback.ONLINE_EXTRAS_KEY, notificationBean);
    }

    /* renamed from: h */
    public static /* synthetic */ void m18144h(RequestData requestData) {
        new RequestRemote(PushConfigManager.m18207a().m18203e()).m105839a(requestData);
    }

    /* renamed from: i */
    private void m18143i(final Intent intent) {
        ThreadBus.m25680a(new Runnable() { // from class: k6.k
            {
                RemotePushManager.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RemotePushManager.this.m18146f(intent);
            }
        });
    }

    /* renamed from: j */
    public void m18142j(Intent intent) {
        if (intent == null) {
            try {
                PushLogUtil.m25697b("RemotePushManager: onRemoteIntentReceived intent is null");
            } catch (Throwable th) {
                PushLogUtil.m25696c(th);
                return;
            }
        }
        String m25688c = PushUtil.m25688c(intent);
        if (!PushSdk.m18190l()) {
            PushLogUtil.m25697b("RemotePushManager: onRemoteIntentReceived  push sdk not init");
            PushShowFailUtil.m25692b(m25688c, 1003);
        } else if (TextUtils.isEmpty(m25688c)) {
            PushShowFailUtil.m25692b(m25688c, 1005);
        } else {
            long m25687d = PushUtil.m25687d(intent);
            if (PushLogUtil.m25694e()) {
                PushLogUtil.m25698a("RemotePushManager: onRemoteIntentReceived hmsTtlTs :" + m25687d);
            }
            if (m25687d != -1 && System.currentTimeMillis() > m25687d) {
                PushShowFailUtil.m25692b(m25688c, 1010);
                return;
            }
            Set<String> set = f98700b;
            if (set.contains(m25688c)) {
                PushShowFailUtil.m25692b(m25688c, 1011);
                return;
            }
            if (!"test_code".equalsIgnoreCase(m25688c)) {
                set.add(m25688c);
            }
            intent.putExtra("hms_source", "push");
            PushEvent.m15660n(m25688c, CustomTabsCallback.ONLINE_EXTRAS_KEY, PushUtil.m25689b(intent));
            if (PushUtil.m25684g(intent)) {
                m18143i(intent);
                PushLogUtil.m25698a("RemotePushManager: onRemoteIntentReceived, command type, skip");
            } else if (!DataManager.m12928g().m12920o()) {
                PushLogUtil.m25698a("RemotePushManager: onRemoteIntentReceived, not enable, skip");
                PushShowFailUtil.m25692b(m25688c, 1002);
            } else if (!PushUtil.m25690a(PushConfigManager.m18207a().m18206b(), DefaultDisplayNotification.DEFAULT_CHANNEL_ID)) {
                PushLogUtil.m25698a("RemotePushManager: onRemoteIntentReceived , no permissions, skip");
                PushShowFailUtil.m25692b(m25688c, 1001);
            } else {
                final NotificationBean notificationBean = new NotificationBean(intent);
                PushWork.m103897b(new Runnable() { // from class: k6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        RemotePushManager.m18145g(notificationBean);
                    }
                });
            }
        }
    }

    /* renamed from: k */
    public void m18141k(RequestData requestData) {
        PushLogUtil.m25698a("register start");
        if (requestData == null) {
            PushLogUtil.m25698a("register fail request data is null");
        } else if (!DataManager.m12928g().m12920o()) {
            PushLogUtil.m25698a("register fail, push is disable");
        } else if (TextUtils.isEmpty(requestData.m12904f())) {
            PushLogUtil.m25698a("register fail, luid is empty");
        } else {
            m18147e().mo677a(requestData);
        }
    }

    /* renamed from: l */
    public void m18140l() {
        m18147e().unregister();
    }

    /* renamed from: m */
    public void m18139m(final RequestData requestData, String str) {
        if (TextUtils.isEmpty(str)) {
            PushLogUtil.m25697b("updateToken failed, token is empty");
        } else if (requestData == null) {
            PushLogUtil.m25697b("updateToken failed, requestData is null");
        } else {
            PushDebugActivity.setToken(str);
            requestData.m12886x(str);
            PushWork.m103897b(new Runnable() { // from class: k6.i
                @Override // java.lang.Runnable
                public final void run() {
                    RemotePushManager.m18144h(requestData);
                }
            });
            PushLogUtil.m25698a("request remote success, token:" + str);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m18146f(Intent intent) {
    }
}
