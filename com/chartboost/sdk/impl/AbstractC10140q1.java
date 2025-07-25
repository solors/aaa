package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.q1 */
/* loaded from: classes3.dex */
public abstract class AbstractC10140q1 {
    /* renamed from: a */
    public static boolean m80774a(AtomicReference atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new C10127p9(jSONObject));
            return true;
        } catch (Exception e) {
            C9763c7.m81920b("updateConfig: " + e, null);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m80775a(Context context) {
        try {
            if (context != null) {
                int checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                boolean z = context.checkSelfPermission("android.permission.INTERNET") != 0;
                boolean z2 = checkSelfPermission != 0;
                if (z) {
                    throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
                }
                if (z2) {
                    throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                }
                return true;
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
