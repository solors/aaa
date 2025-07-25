package com.mbridge.msdk.foundation.same.report.p452d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.same.report.d.e */
/* loaded from: classes6.dex */
public final class ParameterWrapper {

    /* renamed from: a */
    private Map<String, String> f56786a = new HashMap();

    /* renamed from: a */
    public final void m52024a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    this.f56786a.put(str, (String) obj);
                }
            } else {
                Map<String, String> map = this.f56786a;
                map.put(str, obj + "");
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final Object m52022b(String str) {
        return this.f56786a.get(str);
    }

    /* renamed from: c */
    public final void m52021c(String str) {
        if (this.f56786a != null && !TextUtils.isEmpty(str)) {
            this.f56786a.remove(str);
        }
    }

    /* renamed from: a */
    public final boolean m52025a(String str) {
        return this.f56786a.containsKey(str);
    }

    /* renamed from: a */
    public final Map<String, String> m52027a() {
        return this.f56786a;
    }

    /* renamed from: a */
    public final void m52026a(ParameterWrapper parameterWrapper) {
        Map<String, String> map;
        Map<String, String> map2;
        if (parameterWrapper == null || (map = parameterWrapper.f56786a) == null || (map2 = this.f56786a) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* renamed from: a */
    public final void m52023a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f56786a.putAll(map);
    }
}
