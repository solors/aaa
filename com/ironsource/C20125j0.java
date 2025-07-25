package com.ironsource;

import android.app.Activity;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.j0 */
/* loaded from: classes6.dex */
public class C20125j0 {

    /* renamed from: a */
    private final C21205x1 f50658a;

    public C20125j0(C21205x1 c21205x1) {
        this.f50658a = c21205x1;
    }

    /* renamed from: a */
    public void m57925a() {
        this.f50658a.m54205a(EnumC21057u1.SESSION_CAPPED, null);
    }

    /* renamed from: b */
    public void m57917b(String str) {
        m57921a(str, (String) null);
    }

    /* renamed from: c */
    public void m57915c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f50658a.m54205a(EnumC21057u1.AD_DISMISS_SCREEN, hashMap);
    }

    /* renamed from: d */
    public void m57914d(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_ENDED, hashMap);
    }

    /* renamed from: e */
    public void m57913e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_INFO_CHANGED, hashMap);
    }

    /* renamed from: f */
    public void m57912f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f50658a.m54205a(EnumC21057u1.AD_LEFT_APPLICATION, hashMap);
    }

    /* renamed from: g */
    public void m57911g(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_OPENED, hashMap);
    }

    /* renamed from: h */
    public void m57910h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f50658a.m54205a(EnumC21057u1.AD_PRESENT_SCREEN, hashMap);
    }

    /* renamed from: i */
    public void m57909i(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_STARTED, hashMap);
    }

    /* renamed from: j */
    public void m57908j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        this.f50658a.m54205a(EnumC21057u1.AD_VIEW_BOUND, hashMap);
    }

    /* renamed from: k */
    public void m57907k(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_VISIBLE, hashMap);
    }

    /* renamed from: l */
    public void m57906l(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.SHOW_AD_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public void m57924a(Activity activity, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (activity != null) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, IronSourceConstants.EVENTS_INIT_CONTEXT_FLOW);
        }
        this.f50658a.m54205a(EnumC21057u1.SHOW_AD, hashMap);
    }

    /* renamed from: b */
    public void m57916b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        this.f50658a.m54205a(EnumC21057u1.PLACEMENT_CAPPED, hashMap);
    }

    /* renamed from: a */
    public void m57923a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_CLICKED, hashMap);
    }

    /* renamed from: a */
    public void m57922a(String str, int i, String str2, String str3) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str3);
        }
        this.f50658a.m54205a(EnumC21057u1.SHOW_AD_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m57921a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        }
        this.f50658a.m54205a(EnumC21057u1.AD_CLOSED, hashMap);
    }

    /* renamed from: a */
    public void m57920a(String str, String str2, int i, long j, String str3, long j2, Map<String, Object> map, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("placement", str);
        }
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, str2);
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(i));
        hashMap.put(IronSourceConstants.EVENTS_TRANS_ID, str3);
        if (j2 != 0) {
            hashMap.put("duration", Long.valueOf(j2));
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, str4);
        }
        this.f50658a.m54204a(EnumC21057u1.AD_REWARDED, hashMap, j);
    }

    /* renamed from: a */
    public void m57919a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isMultipleAdUnits", 1);
        hashMap.put("placement", str);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("reason", str2);
        }
        hashMap.put(IronSourceConstants.EVENTS_EXT1, z ? "true" : "false");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        this.f50658a.m54205a(EnumC21057u1.CHECK_PLACEMENT_CAPPED, hashMap);
    }

    /* renamed from: a */
    public void m57918a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("status", z ? "true" : "false");
        this.f50658a.m54205a(EnumC21057u1.SHOW_AD_CHANCE, hashMap);
    }
}
