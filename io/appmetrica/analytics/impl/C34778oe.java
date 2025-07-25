package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.oe */
/* loaded from: classes9.dex */
public final class C34778oe extends AbstractC34453cd implements InterfaceC33779An {

    /* renamed from: d */
    public static final long f95114d = 0;

    /* renamed from: e */
    public static final int f95115e = -1;

    /* renamed from: f */
    public static final String f95116f = "";

    /* renamed from: g */
    public static final String f95117g = "";

    /* renamed from: h */
    public static final C34832qe f95118h = new C34832qe("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i */
    public static final C34832qe f95119i = new C34832qe("PROFILE_ID", null);

    /* renamed from: j */
    public static final C34832qe f95120j = new C34832qe("APP_ENVIRONMENT", null);

    /* renamed from: k */
    public static final C34832qe f95121k = new C34832qe("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l */
    public static final C34832qe f95122l = new C34832qe("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m */
    public static final C34832qe f95123m = new C34832qe("APPLICATION_FEATURES", null);

    /* renamed from: n */
    public static final C34832qe f95124n = new C34832qe("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o */
    public static final C34832qe f95125o = new C34832qe("VITAL_DATA", null);

    /* renamed from: p */
    public static final C34832qe f95126p = new C34832qe("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q */
    public static final String f95127q = "SESSION_";

    public C34778oe(InterfaceC33891Fa interfaceC33891Fa) {
        super(interfaceC33891Fa);
    }

    /* renamed from: a */
    public final C34778oe m21204a(C34467d0 c34467d0) {
        synchronized (this) {
            m21145b(f95120j.f95224b, c34467d0.f94134a);
            m21146b(f95121k.f95224b, c34467d0.f94135b);
        }
        return this;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34805pe
    @NonNull
    /* renamed from: c */
    public final Set<String> mo21018c() {
        return this.f95179a.mo21214a();
    }

    /* renamed from: d */
    public final C34467d0 m21201d() {
        C34467d0 c34467d0;
        synchronized (this) {
            c34467d0 = new C34467d0(this.f95179a.getString(f95120j.f95224b, JsonUtils.EMPTY_JSON), this.f95179a.getLong(f95121k.f95224b, 0L));
        }
        return c34467d0;
    }

    /* renamed from: e */
    public final String m21200e() {
        return this.f95179a.getString(f95123m.f95224b, "");
    }

    @NonNull
    /* renamed from: f */
    public final List<String> m21198f() {
        String str = f95124n.f95224b;
        List emptyList = Collections.emptyList();
        String[] strArr = emptyList == null ? null : (String[]) emptyList.toArray(new String[emptyList.size()]);
        String string = this.f95179a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: g */
    public final int m21197g() {
        return this.f95179a.getInt(f95122l.f95224b, -1);
    }

    /* renamed from: h */
    public final long m21196h() {
        return this.f95179a.getLong(f95118h.f95224b, 0L);
    }

    /* renamed from: i */
    public final C34778oe m21193i(String str) {
        return (C34778oe) m21145b(f95123m.f95224b, str);
    }

    /* renamed from: j */
    public final C34778oe m21191j(@Nullable String str) {
        return (C34778oe) m21145b(f95119i.f95224b, str);
    }

    /* renamed from: e */
    public final C34778oe m21199e(String str, String str2) {
        return (C34778oe) m21145b(new C34832qe(f95127q, str).f95224b, str2);
    }

    /* renamed from: h */
    public final String m21195h(String str) {
        return this.f95179a.getString(new C34832qe(f95127q, str).f95224b, "");
    }

    @Nullable
    /* renamed from: i */
    public final String m21194i() {
        return this.f95179a.getString(f95119i.f95224b, null);
    }

    @NonNull
    /* renamed from: j */
    public final Map<Integer, String> m21192j() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f95179a.getString(f95126p.f95224b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public final C34778oe m21205a(long j) {
        return (C34778oe) m21146b(f95118h.f95224b, j);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34453cd
    @NonNull
    /* renamed from: f */
    public final String mo21010f(@NonNull String str) {
        return new C34832qe(str, null).f95224b;
    }

    /* renamed from: a */
    public final C34778oe m21206a(int i) {
        return (C34778oe) m21147b(f95122l.f95224b, i);
    }

    /* renamed from: a */
    public final C34778oe m21203a(List<String> list) {
        return (C34778oe) m21152a(f95124n.f95224b, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    @Nullable
    /* renamed from: a */
    public final String mo21029a() {
        return this.f95179a.getString(f95125o.f95224b, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    /* renamed from: a */
    public final void mo21024a(@NonNull String str) {
        m21145b(f95125o.f95224b, str);
    }

    /* renamed from: a */
    public final void m21202a(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        m21145b(f95126p.f95224b, jSONObject.toString());
    }
}
