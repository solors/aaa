package com.mbridge.msdk.p411c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.e */
/* loaded from: classes6.dex */
public final class MBDNSManager {

    /* renamed from: a */
    public int f55259a;

    /* renamed from: b */
    private HashMap<String, MbDNSEntity> f55260b;

    /* compiled from: MBDNSManager.java */
    /* renamed from: com.mbridge.msdk.c.e$a */
    /* loaded from: classes6.dex */
    static class C21784a {

        /* renamed from: a */
        private static final MBDNSManager f55261a = new MBDNSManager();
    }

    /* renamed from: a */
    public static MBDNSManager m53297a() {
        return C21784a.f55261a;
    }

    /* renamed from: b */
    public final void m53295b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f55260b == null) {
                this.f55260b = new HashMap<>();
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                MbDNSEntity mbDNSEntity = new MbDNSEntity();
                mbDNSEntity.m53292a(next);
                mbDNSEntity.m53289b(string);
                this.f55260b.put(next, mbDNSEntity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private MBDNSManager() {
        this.f55259a = 6;
        this.f55260b = new HashMap<>();
    }

    /* renamed from: a */
    public final int m53296a(String str) {
        HashMap<String, MbDNSEntity> hashMap;
        MbDNSEntity mbDNSEntity;
        if (TextUtils.isEmpty(str) || (hashMap = this.f55260b) == null || !hashMap.containsKey(str) || (mbDNSEntity = this.f55260b.get(str)) == null) {
            return 0;
        }
        int i = mbDNSEntity.m53290b() ? 1 : mbDNSEntity.m53293a() >= this.f55259a ? 2 : 0;
        mbDNSEntity.m53291a(false);
        return i;
    }
}
