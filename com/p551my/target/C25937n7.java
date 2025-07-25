package com.p551my.target;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p551my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.n7 */
/* loaded from: classes7.dex */
public class C25937n7 extends AbstractC26021q1 {
    /* renamed from: a */
    public final void m43379a(Map map, NetworkInfo networkInfo) {
        String typeName;
        if (networkInfo.getType() == 0) {
            if (networkInfo.getSubtypeName() != null) {
                typeName = networkInfo.getSubtypeName();
            }
            typeName = "";
        } else {
            if (networkInfo.getTypeName() != null) {
                typeName = networkInfo.getTypeName();
            }
            typeName = "";
        }
        map.put("connection_type", typeName);
    }

    /* renamed from: a */
    public synchronized Map m43380a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap;
        hashMap = new HashMap();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            hashMap.put("connection", activeNetworkInfo.getTypeName());
            m43379a(hashMap, activeNetworkInfo);
        }
        return hashMap;
    }
}
