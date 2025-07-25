package com.fyber.inneractive.sdk.metrics;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.metrics.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14599a {

    /* renamed from: a */
    public final String f27653a;

    public AbstractC14599a(String str) {
        this.f27653a = str;
    }

    /* renamed from: a */
    public static boolean m77773a(int i, int i2, JSONArray jSONArray, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(i);
        int i3 = 0;
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            long optLong = jSONArray.optLong(i4, 0L);
            if (optLong > currentTimeMillis) {
                i3++;
                copyOnWriteArrayList.add(Long.valueOf(optLong));
            }
        }
        if (i3 < i2) {
            return false;
        }
        return true;
    }
}
