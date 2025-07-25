package com.inmobi.media;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.M3 */
/* loaded from: classes6.dex */
public final class C19017M3 {

    /* renamed from: a */
    public static final C19017M3 f47463a = new C19017M3();

    /* renamed from: b */
    public static JSONObject f47464b;

    /* renamed from: c */
    public static JSONObject f47465c;

    /* renamed from: d */
    public static JSONObject f47466d;

    /* renamed from: e */
    public static RootConfig f47467e;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.json.JSONObject m60912c() {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19017M3.m60912c():org.json.JSONObject");
    }

    @VisibleForTesting
    @WorkerThread
    /* renamed from: e */
    public static final byte m60909e() {
        JSONObject m60912c = m60912c();
        if (m60912c == null) {
            return (byte) -1;
        }
        if (!m60912c.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            if (!m60912c.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                return (byte) -1;
            }
            try {
                return m60912c.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
            } catch (JSONException unused) {
                return (byte) -1;
            }
        }
        return (byte) 1;
    }

    @VisibleForTesting
    /* renamed from: h */
    public static final void m60906h() {
        HashMap hashMap = AbstractC19119U2.f47826a;
        Config m60664a = AbstractC19119U2.m60664a(C18954Ha.m61076b(), "root");
        Intrinsics.m17073h(m60664a, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
        f47467e = (RootConfig) m60664a;
    }

    /* renamed from: i */
    public static final void m60905i() {
        f47464b = null;
        f47465c = null;
        f47466d = null;
        f47467e = null;
    }

    /* renamed from: a */
    public final void m60916a(@Nullable JSONObject jSONObject) {
        f47466d = jSONObject;
    }

    @Nullable
    /* renamed from: b */
    public final JSONObject m60914b() {
        return f47466d;
    }

    @Nullable
    /* renamed from: g */
    public final JSONObject m60907g() {
        return f47464b;
    }

    /* renamed from: j */
    public final void m60904j() {
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        f47467e = (RootConfig) AbstractC19423q4.m59930a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m60917a(C19017M3 c19017m3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c19017m3.m60915a(z);
    }

    /* renamed from: b */
    public static final void m60913b(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            f47464b = jSONObject;
        }
    }

    /* renamed from: a */
    public final boolean m60915a(boolean z) {
        if (f47467e == null) {
            m60904j();
        }
        byte m60909e = m60909e();
        RootConfig rootConfig = f47467e;
        return m60909e == 1 || Intrinsics.m17075f(rootConfig != null ? Boolean.valueOf(rootConfig.shouldTransmitRequest()) : null, Boolean.TRUE) || z;
    }

    /* renamed from: a */
    public final boolean m60918a() {
        return m60917a(this, false, 1, null);
    }

    /* renamed from: d */
    public static /* synthetic */ void m60910d() {
    }

    /* renamed from: f */
    public static /* synthetic */ void m60908f() {
    }

    /* renamed from: c */
    public static final void m60911c(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            f47465c = jSONObject;
        }
    }
}
