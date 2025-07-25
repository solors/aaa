package com.learnings.usertag.debug;

import com.facebook.AccessToken;
import p028b5.UserTagAdData;
import p1068z4.UserTagProcessorManager;
import p682g5.LifeCycleManager;
import p682g5.SpManager;

/* renamed from: com.learnings.usertag.debug.j */
/* loaded from: classes6.dex */
public class UserTagDebugManager {

    /* renamed from: a */
    private final String f55014a;

    /* renamed from: b */
    private final String f55015b;

    /* compiled from: UserTagDebugManager.java */
    /* renamed from: com.learnings.usertag.debug.j$b */
    /* loaded from: classes6.dex */
    private static class C21518b {

        /* renamed from: a */
        private static final UserTagDebugManager f55016a = new UserTagDebugManager();
    }

    /* renamed from: a */
    public static UserTagDebugManager m53572a() {
        return C21518b.f55016a;
    }

    /* renamed from: b */
    public long m53571b() {
        try {
            return SpManager.m24298a().m24297b(LifeCycleManager.m24309f().m24308g()).m24283e("sp_key_debug_install_time", 0L);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: c */
    public String m53570c() {
        try {
            return SpManager.m24298a().m24297b(LifeCycleManager.m24309f().m24308g()).m24282f("sp_key_debug_user_id", "");
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public void m53569d(double d) {
        UserTagAdData userTagAdData = new UserTagAdData();
        userTagAdData.m103909k(d);
        userTagAdData.m103910j("USD");
        userTagAdData.m103913g("max");
        userTagAdData.m103912h("admob");
        userTagAdData.m103914f("interstitial");
        userTagAdData.m103911i("debug_placement");
        UserTagProcessorManager.m705m().mo716b(userTagAdData);
    }

    /* renamed from: e */
    public void m53568e(double d, boolean z) {
        UserTagAdData userTagAdData = new UserTagAdData();
        userTagAdData.m103909k(d);
        userTagAdData.m103910j("USD");
        userTagAdData.m103913g("max");
        if (z) {
            userTagAdData.m103912h(AccessToken.DEFAULT_GRAPH_DOMAIN);
        } else {
            userTagAdData.m103912h("admob");
        }
        userTagAdData.m103914f("interstitial");
        userTagAdData.m103911i("debug_placement");
        UserTagProcessorManager.m705m().mo717a(userTagAdData);
    }

    /* renamed from: f */
    public void m53567f(long j) {
        SpManager.m24298a().m24297b(LifeCycleManager.m24309f().m24308g()).m24279i("sp_key_debug_install_time", j);
    }

    /* renamed from: g */
    public void m53566g(String str) {
        SpManager.m24298a().m24297b(LifeCycleManager.m24309f().m24308g()).m24278j("sp_key_debug_user_id", str);
    }

    private UserTagDebugManager() {
        this.f55014a = "sp_key_debug_install_time";
        this.f55015b = "sp_key_debug_user_id";
    }
}
