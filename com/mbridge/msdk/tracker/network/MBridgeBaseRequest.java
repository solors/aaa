package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.SameTools;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.tracker.network.i */
/* loaded from: classes6.dex */
public abstract class MBridgeBaseRequest<T> extends AbstractC22930u<T> {

    /* renamed from: a */
    protected static final String f59754a = "i";

    /* renamed from: b */
    private final long f59755b;

    /* renamed from: c */
    private Map<String, String> f59756c;

    /* renamed from: d */
    private Map<String, String> f59757d;

    /* renamed from: e */
    private InterfaceC22941z f59758e;

    /* renamed from: f */
    private boolean f59759f;

    public MBridgeBaseRequest(int i, String str, int i2, String str2, long j) {
        super(i, str, i2, str2);
        this.f59759f = false;
        if (j > 0) {
            this.f59755b = j;
        } else {
            this.f59755b = 60000L;
        }
    }

    /* renamed from: a */
    public final void m49509a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f59756c == null) {
            this.f59756c = new HashMap();
        }
        try {
            this.f59756c.putAll(map);
        } catch (Exception e) {
            String str = f59754a;
            SameLogTool.m51824b(str, "addParams error: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: b */
    public final InterfaceC22941z mo49318b() {
        if (this.f59758e == null) {
            this.f59758e = new C22905e(30000, this.f59755b, 3);
        }
        return this.f59758e;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: c */
    public final Map<String, String> mo49317c() {
        if (this.f59757d == null) {
            this.f59757d = new HashMap();
        }
        this.f59757d.put("Charset", "UTF-8");
        return this.f59757d;
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: d */
    public final boolean mo49316d() {
        if (this.f59759f && SameTools.m52238a(m49408f(), m49403k())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m49510a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f59757d == null) {
            this.f59757d = new HashMap();
        }
        try {
            this.f59757d.put(str, str2);
        } catch (Exception e) {
            String str3 = f59754a;
            SameLogTool.m51824b(str3, "addHeader error: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.tracker.network.AbstractC22930u
    /* renamed from: a */
    protected final Map<String, String> mo49325a() {
        if (this.f59756c == null) {
            this.f59756c = new HashMap();
        }
        return this.f59756c;
    }

    /* renamed from: a */
    public final void m49508a(boolean z) {
        this.f59759f = z;
    }
}
