package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.eu */
/* loaded from: classes6.dex */
public class C19854eu {

    /* renamed from: b */
    private int f49962b = 4;

    /* renamed from: c */
    private int f49963c = 4;

    /* renamed from: a */
    private HashMap<String, Boolean> f49961a = new C19855a();

    /* renamed from: com.ironsource.eu$a */
    /* loaded from: classes6.dex */
    class C19855a extends HashMap<String, Boolean> {
        C19855a() {
            boolean z;
            if (C19854eu.this.f49962b == 0) {
                z = true;
            } else {
                z = false;
            }
            put(C20096if.f50580k, Boolean.valueOf(z));
            put(C20096if.f50581l, Boolean.valueOf(C19854eu.this.f49963c == 0));
            Boolean bool = Boolean.FALSE;
            put(C20096if.f50582m, bool);
            put(C20096if.f50583n, bool);
        }
    }

    /* renamed from: a */
    public JSONObject m58744a() {
        return new JSONObject(this.f49961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m58742a(String str, int i, boolean z) {
        if (this.f49961a.containsKey(str)) {
            this.f49961a.put(str, Boolean.valueOf(i == 0));
        }
        this.f49961a.put(C20096if.f50582m, Boolean.valueOf(z));
        this.f49961a.put(C20096if.f50583n, Boolean.valueOf((this.f49961a.get(C20096if.f50581l).booleanValue() || this.f49961a.get(C20096if.f50580k).booleanValue()) && this.f49961a.get(C20096if.f50582m).booleanValue()));
    }
}
