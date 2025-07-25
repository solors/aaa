package com.applovin.impl;

import android.content.IntentFilter;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.ll */
/* loaded from: classes2.dex */
public class C4783ll {

    /* renamed from: a */
    private final Set f7774a = new HashSet(32);

    /* renamed from: b */
    private final Object f7775b = new Object();

    /* renamed from: a */
    public boolean m97666a(String str) {
        synchronized (this.f7775b) {
            for (C4962ml c4962ml : this.f7774a) {
                if (str.equals(c4962ml.m97087b())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public void m97664b(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        C4962ml m97665a;
        if (!StringUtils.isValidString(str)) {
            return;
        }
        synchronized (this.f7775b) {
            m97665a = m97665a(str, appLovinCommunicatorSubscriber);
        }
        if (m97665a != null) {
            m97665a.m97088a(false);
            AppLovinBroadcastManager.unregisterReceiver(m97665a);
        }
    }

    /* renamed from: a */
    private C4962ml m97665a(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        for (C4962ml c4962ml : this.f7774a) {
            if (str.equals(c4962ml.m97087b()) && appLovinCommunicatorSubscriber.equals(c4962ml.m97089a())) {
                return c4962ml;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m97667a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (appLovinCommunicatorSubscriber != null && StringUtils.isValidString(str)) {
            synchronized (this.f7775b) {
                C4962ml m97665a = m97665a(str, appLovinCommunicatorSubscriber);
                if (m97665a != null) {
                    C5434n.m94898h("AppLovinCommunicator", "Attempting to re-subscribe subscriber (" + appLovinCommunicatorSubscriber + ") to topic (" + str + ")");
                    if (!m97665a.m97086c()) {
                        m97665a.m97088a(true);
                        AppLovinBroadcastManager.registerReceiver(m97665a, new IntentFilter(str));
                    }
                    return true;
                }
                C4962ml c4962ml = new C4962ml(str, appLovinCommunicatorSubscriber);
                this.f7774a.add(c4962ml);
                AppLovinBroadcastManager.registerReceiver(c4962ml, new IntentFilter(str));
                return true;
            }
        }
        C5434n.m94898h("AppLovinCommunicator", "Unable to subscribe - invalid subscriber (" + appLovinCommunicatorSubscriber + ") or topic (" + str + ")");
        return false;
    }
}
