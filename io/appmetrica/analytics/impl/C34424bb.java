package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bb */
/* loaded from: classes9.dex */
public final class C34424bb extends JSONObject {
    public C34424bb() {
    }

    /* renamed from: a */
    public final Long m21935a(String str) {
        try {
            return Long.valueOf(getLong(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String m21934b(String str) {
        if (has(str)) {
            try {
                return getString(str);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public C34424bb(String str) {
        super(str);
    }
}
