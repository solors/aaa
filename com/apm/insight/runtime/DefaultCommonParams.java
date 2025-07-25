package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.apm.insight.NpthBus;
import com.apm.insight.nativecrash.NativeFileParser;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.h */
/* loaded from: classes2.dex */
public final class DefaultCommonParams {

    /* renamed from: a */
    private String f4058a = null;

    /* renamed from: b */
    private int f4059b = -1;

    /* renamed from: a */
    public static NativeFileParser m101404a(Context context) {
        return new NativeFileParser(context, new ICommonParams() { // from class: com.apm.insight.runtime.h.1
            @Override // com.apm.insight.ICommonParams
            public final Map<String, Object> getCommonParams() {
                return new HashMap();
            }

            @Override // com.apm.insight.ICommonParams
            public final String getDeviceId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public final long getUserId() {
                return 0L;
            }
        });
    }

    /* renamed from: b */
    public final boolean m101402b() {
        if (this.f4058a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m101403a(String str) {
        this.f4058a = str;
        RuntimeContext.m101330a().m101327a(str);
    }

    /* renamed from: a */
    public final String m101405a() {
        if (!TextUtils.isEmpty(this.f4058a) && !"0".equals(this.f4058a)) {
            return this.f4058a;
        }
        String m101534d = NpthBus.m102029a().m101534d();
        this.f4058a = m101534d;
        if (!TextUtils.isEmpty(m101534d) && !"0".equals(this.f4058a)) {
            return this.f4058a;
        }
        String m101325b = RuntimeContext.m101330a().m101325b();
        this.f4058a = m101325b;
        return m101325b;
    }
}
