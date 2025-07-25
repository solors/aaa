package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.pt */
/* loaded from: classes6.dex */
public class C20659pt {

    /* renamed from: a */
    private final C21205x1 f52470a;

    public C20659pt(C21205x1 c21205x1) {
        this.f52470a = c21205x1;
    }

    /* renamed from: a */
    public void m55723a() {
        this.f52470a.m54205a(EnumC21057u1.COLLECT_TOKEN, new HashMap());
    }

    /* renamed from: b */
    public void m55717b(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f52470a.m54205a(EnumC21057u1.INSTANCE_COLLECT_TOKEN_TIMED_OUT, hashMap);
    }

    /* renamed from: a */
    public void m55722a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.f52470a.m54205a(EnumC21057u1.COLLECT_TOKENS_COMPLETED, hashMap);
    }

    /* renamed from: a */
    public void m55721a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f52470a.m54205a(EnumC21057u1.COLLECT_TOKENS_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m55720a(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f52470a.m54205a(EnumC21057u1.INSTANCE_COLLECT_TOKEN, hashMap);
    }

    /* renamed from: a */
    public void m55719a(Map<String, Object> map, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f52470a.m54205a(EnumC21057u1.INSTANCE_COLLECT_TOKEN_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public void m55718a(Map<String, Object> map, long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f52470a.m54205a(EnumC21057u1.INSTANCE_COLLECT_TOKEN_FAILED, hashMap);
    }
}
