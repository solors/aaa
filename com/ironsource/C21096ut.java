package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.ut */
/* loaded from: classes6.dex */
public class C21096ut {

    /* renamed from: a */
    private final C21205x1 f53820a;

    public C21096ut(C21205x1 c21205x1) {
        this.f53820a = c21205x1;
    }

    /* renamed from: a */
    private String m54582a(long j, long j2, long j3) {
        return "interval: " + j + ", remainingTime: " + j2 + ", timePassed: " + j3;
    }

    /* renamed from: b */
    public void m54576b() {
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    /* renamed from: c */
    public void m54572c() {
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_SHOW, null);
    }

    /* renamed from: d */
    public void m54570d() {
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    /* renamed from: e */
    public void m54568e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, hashMap);
    }

    /* renamed from: f */
    public void m54567f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    /* renamed from: g */
    public void m54566g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    /* renamed from: h */
    public void m54565h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    /* renamed from: i */
    public void m54564i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: j */
    public void m54563j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    /* renamed from: k */
    public void m54562k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    /* renamed from: l */
    public void m54561l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    /* renamed from: m */
    public void m54560m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    /* renamed from: n */
    public void m54559n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    /* renamed from: o */
    public void m54558o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    /* renamed from: p */
    public void m54557p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    /* renamed from: q */
    public void m54556q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    /* renamed from: r */
    public void m54555r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    /* renamed from: s */
    public void m54554s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    /* renamed from: t */
    public void m54553t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_WATERFALL_OVERHEAD, hashMap);
    }

    /* renamed from: a */
    public void m54585a() {
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_LOAD, null);
    }

    /* renamed from: b */
    public void m54575b(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    /* renamed from: c */
    public void m54571c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BN_RELOAD_EXCEPTION, hashMap);
    }

    /* renamed from: d */
    public void m54569d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, hashMap);
    }

    /* renamed from: a */
    public void m54584a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    /* renamed from: b */
    public void m54574b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_IMPRESSION_TIMEOUT, hashMap);
    }

    /* renamed from: a */
    public void m54583a(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    /* renamed from: b */
    public void m54573b(String str, long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, m54582a(j, j2, j3));
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_RESUMED, hashMap);
    }

    /* renamed from: a */
    public void m54581a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m54580a(Long l, long j, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", l);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "config:" + j + ", newLoad:" + (z ? 1 : 0));
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    /* renamed from: a */
    public void m54579a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    /* renamed from: a */
    public void m54578a(String str, long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, m54582a(j, j2, j3));
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BANNER_REFRESH_PAUSED, hashMap);
    }

    /* renamed from: a */
    public void m54577a(Map<String, Object> map, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f53820a.m54205a(EnumC21057u1.TROUBLESHOOT_BIDDING_DATA_MISSING, hashMap);
    }
}
