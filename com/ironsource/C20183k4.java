package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* renamed from: com.ironsource.k4 */
/* loaded from: classes6.dex */
public class C20183k4 {

    /* renamed from: a */
    private final C21205x1 f50789a;

    public C20183k4(C21205x1 c21205x1) {
        this.f50789a = c21205x1;
    }

    /* renamed from: a */
    public void m57741a() {
        this.f50789a.m54205a(EnumC21057u1.AUCTION_REQUEST, null);
    }

    /* renamed from: b */
    public void m57736b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f50789a.m54205a(EnumC21057u1.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    /* renamed from: c */
    public void m57735c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f50789a.m54205a(EnumC21057u1.AUCTION_RESULT_WATERFALL, hashMap);
    }

    /* renamed from: a */
    public void m57740a(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f50789a.m54205a(EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    /* renamed from: a */
    public void m57739a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f50789a.m54205a(EnumC21057u1.AUCTION_FAILED, hashMap);
    }

    /* renamed from: a */
    public void m57738a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f50789a.m54205a(EnumC21057u1.AUCTION_SUCCESS, hashMap);
    }

    /* renamed from: a */
    public void m57737a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        this.f50789a.m54205a(EnumC21057u1.AD_FORMAT_CAPPED, hashMap);
    }
}
