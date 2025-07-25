package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.sf */
/* loaded from: classes6.dex */
public class C20968sf {

    /* renamed from: a */
    private HashMap<String, Object> f53475a = new HashMap<>();

    /* renamed from: a */
    public C20968sf m54959a(String str, Object obj) {
        if (obj != null) {
            this.f53475a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    /* renamed from: a */
    public HashMap<String, Object> m54960a() {
        return this.f53475a;
    }
}
