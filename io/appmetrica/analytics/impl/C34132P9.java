package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.P9 */
/* loaded from: classes9.dex */
public final class C34132P9 {

    /* renamed from: a */
    public final String f93329a;

    /* renamed from: b */
    public final int f93330b;

    /* renamed from: c */
    public final boolean f93331c;

    public C34132P9(JSONObject jSONObject) {
        this.f93329a = jSONObject.getString("name");
        this.f93331c = jSONObject.getBoolean("required");
        this.f93330b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34132P9.class != obj.getClass()) {
            return false;
        }
        C34132P9 c34132p9 = (C34132P9) obj;
        if (this.f93330b != c34132p9.f93330b || this.f93331c != c34132p9.f93331c) {
            return false;
        }
        String str = this.f93329a;
        String str2 = c34132p9.f93329a;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f93329a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + this.f93330b) * 31) + (this.f93331c ? 1 : 0);
    }

    public C34132P9(String str, int i, boolean z) {
        this.f93329a = str;
        this.f93330b = i;
        this.f93331c = z;
    }
}
