package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ne */
/* loaded from: classes9.dex */
public final class C34751ne extends AbstractC34453cd {

    /* renamed from: d */
    public static final C34832qe f95007d = new C34832qe("UUID_RESULT", null);

    /* renamed from: e */
    public static final C34832qe f95008e = new C34832qe("DEVICE_ID_RESULT", null);

    /* renamed from: f */
    public static final C34832qe f95009f = new C34832qe("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g */
    public static final C34832qe f95010g = new C34832qe("AD_URL_GET_RESULT", null);

    /* renamed from: h */
    public static final C34832qe f95011h = new C34832qe("AD_URL_REPORT_RESULT", null);

    /* renamed from: i */
    public static final C34832qe f95012i = new C34832qe("CUSTOM_HOSTS", null);

    /* renamed from: j */
    public static final C34832qe f95013j = new C34832qe("SERVER_TIME_OFFSET", null);

    /* renamed from: k */
    public static final C34832qe f95014k = new C34832qe("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l */
    public static final C34832qe f95015l = new C34832qe("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m */
    public static final C34832qe f95016m = new C34832qe("CLIENT_CLIDS", null);

    /* renamed from: n */
    public static final C34832qe f95017n = new C34832qe("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o */
    public static final C34832qe f95018o = new C34832qe("API_LEVEL", null);

    /* renamed from: p */
    public static final C34832qe f95019p = new C34832qe("NEXT_STARTUP_TIME", null);

    /* renamed from: q */
    public static final C34832qe f95020q = new C34832qe(IronSourceConstants.TYPE_GAID, null);

    /* renamed from: r */
    public static final C34832qe f95021r = new C34832qe("HOAID", null);

    /* renamed from: s */
    public static final C34832qe f95022s = new C34832qe("YANDEX_ADV_ID", null);

    /* renamed from: t */
    public static final C34832qe f95023t = new C34832qe("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u */
    public static final C34832qe f95024u = new C34832qe("SCREEN_INFO", null);

    /* renamed from: v */
    public static final C34832qe f95025v = new C34832qe("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w */
    public static final C34832qe f95026w = new C34832qe("FEATURES", null);

    /* renamed from: x */
    public static final C34832qe f95027x = new C34832qe("APPMETRICA_CLIENT_CONFIG", null);

    public C34751ne(InterfaceC33891Fa interfaceC33891Fa) {
        super(interfaceC33891Fa);
    }

    /* renamed from: a */
    public final boolean m21292a(boolean z) {
        return this.f95179a.getBoolean(f95023t.f95224b, z);
    }

    /* renamed from: b */
    public final long m21291b(long j) {
        return this.f95179a.getLong(f95013j.f95223a, j);
    }

    @NonNull
    /* renamed from: c */
    public final C34751ne m21287c(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95015l.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: d */
    public final IdentifiersResult m21286d() {
        return m21273h(f95010g.f95224b);
    }

    @NonNull
    /* renamed from: e */
    public final IdentifiersResult m21283e() {
        return m21273h(f95011h.f95224b);
    }

    @NonNull
    /* renamed from: f */
    public final C34751ne m21279f(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95020q.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: h */
    public final IdentifiersResult m21275h() {
        return m21273h(f95015l.f95224b);
    }

    @NonNull
    /* renamed from: i */
    public final IdentifiersResult m21272i() {
        return m21273h(f95009f.f95224b);
    }

    @NonNull
    /* renamed from: j */
    public final IdentifiersResult m21269j() {
        return m21273h(f95008e.f95224b);
    }

    @NonNull
    /* renamed from: k */
    public final C34227T9 m21266k() {
        String string = this.f95179a.getString(f95026w.f95224b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C34227T9(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C34227T9(null, IdentifierStatus.UNKNOWN, null);
    }

    @NonNull
    /* renamed from: l */
    public final IdentifiersResult m21264l() {
        return m21273h(f95020q.f95224b);
    }

    @NonNull
    /* renamed from: m */
    public final IdentifiersResult m21263m() {
        return m21273h(f95021r.f95224b);
    }

    @NonNull
    /* renamed from: n */
    public final long m21262n() {
        return this.f95179a.getLong(f95019p.f95224b, 0L);
    }

    @NonNull
    /* renamed from: o */
    public final IdentifiersResult m21261o() {
        return m21273h(f95014k.f95224b);
    }

    @Nullable
    /* renamed from: p */
    public final ScreenInfo m21260p() {
        return AbstractC34451cb.m21874e(this.f95179a.getString(f95024u.f95224b, null));
    }

    @NonNull
    /* renamed from: q */
    public final IdentifiersResult m21259q() {
        return m21273h(f95007d.f95224b);
    }

    @NonNull
    /* renamed from: r */
    public final IdentifiersResult m21258r() {
        return m21273h(f95022s.f95224b);
    }

    /* renamed from: s */
    public final boolean m21257s() {
        return this.f95179a.getBoolean(f95017n.f95224b, false);
    }

    /* renamed from: t */
    public final boolean m21256t() {
        return this.f95179a.getBoolean(f95025v.f95224b, false);
    }

    /* renamed from: u */
    public final C34751ne m21255u() {
        return (C34751ne) m21144b(f95017n.f95224b, true);
    }

    /* renamed from: v */
    public final void m21254v() {
        m21144b(f95025v.f95224b, true);
    }

    /* renamed from: g */
    public final List<String> m21278g() {
        String string = this.f95179a.getString(f95012i.f95224b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC34451cb.m21878b(string);
    }

    /* renamed from: a */
    public final long m21299a(long j) {
        return this.f95179a.getLong(f95018o.f95224b, j);
    }

    @NonNull
    /* renamed from: b */
    public final C34751ne m21290b(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95011h.f95224b, identifiersResult);
    }

    /* renamed from: c */
    public final C34751ne m21288c(long j) {
        return (C34751ne) m21146b(f95018o.f95224b, j);
    }

    @NonNull
    /* renamed from: d */
    public final C34751ne m21284d(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95009f.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: e */
    public final C34751ne m21281e(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95008e.f95224b, identifiersResult);
    }

    @Nullable
    /* renamed from: f */
    public final AppMetricaConfig m21280f() {
        String string = this.f95179a.getString(f95027x.f95224b, null);
        if (string == null) {
            return null;
        }
        return AppMetricaConfig.fromJson(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult m21273h(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            io.appmetrica.analytics.impl.Fa r1 = r5.f95179a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r6 = r1.getString(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L2a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "ID"
            java.lang.String r2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r3)     // Catch: java.lang.Throwable -> L2a
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(r3)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(r1, r4)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L2a
            goto L2b
        L2a:
            r6 = r0
        L2b:
            if (r6 != 0) goto L36
            io.appmetrica.analytics.internal.IdentifiersResult r6 = new io.appmetrica.analytics.internal.IdentifiersResult
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r1 = io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L36:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34751ne.m21273h(java.lang.String):io.appmetrica.analytics.internal.IdentifiersResult");
    }

    @NonNull
    /* renamed from: i */
    public final C34751ne m21271i(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95007d.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: j */
    public final C34751ne m21268j(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95022s.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: g */
    public final C34751ne m21277g(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95021r.f95224b, identifiersResult);
    }

    @NonNull
    /* renamed from: a */
    public final C34751ne m21295a(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95010g.f95224b, identifiersResult);
    }

    /* renamed from: b */
    public final C34751ne m21289b(boolean z) {
        return (C34751ne) m21144b(f95023t.f95224b, z);
    }

    @NonNull
    /* renamed from: d */
    public final C34751ne m21285d(long j) {
        return (C34751ne) m21146b(f95019p.f95224b, j);
    }

    /* renamed from: e */
    public final C34751ne m21282e(long j) {
        return (C34751ne) m21146b(f95013j.f95224b, j);
    }

    @Nullable
    /* renamed from: i */
    public final String m21270i(@Nullable String str) {
        return this.f95179a.getString(f95016m.f95224b, str);
    }

    /* renamed from: j */
    public final C34751ne m21267j(@Nullable String str) {
        return (C34751ne) m21145b(f95016m.f95224b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34453cd
    @NonNull
    /* renamed from: f */
    public final String mo21010f(@NonNull String str) {
        return new C34832qe(str, null).f95224b;
    }

    /* renamed from: a */
    public final C34751ne m21293a(List<String> list) {
        return (C34751ne) m21145b(f95012i.f95224b, AbstractC34679kn.m21470a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    @NonNull
    /* renamed from: h */
    public final C34751ne m21274h(@Nullable IdentifiersResult identifiersResult) {
        return m21294a(f95014k.f95224b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34453cd
    @NonNull
    /* renamed from: k */
    public final C34751ne mo21276g(@NonNull String str) {
        return (C34751ne) m21142d(new C34832qe(str, null).f95224b);
    }

    @NonNull
    /* renamed from: a */
    public final C34751ne m21296a(@NonNull C34227T9 c34227t9) {
        String str = f95026w.f95224b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c34227t9.f93529a).put("STATUS", c34227t9.f93530b.getValue()).putOpt("ERROR_EXPLANATION", c34227t9.f93531c);
        } catch (Throwable unused) {
        }
        return (C34751ne) m21145b(str, jSONObject.toString());
    }

    /* renamed from: a */
    public final void m21297a(@Nullable ScreenInfo screenInfo) {
        m21145b(f95024u.f95224b, AbstractC34451cb.m21884a(screenInfo));
    }

    /* renamed from: a */
    public final void m21298a(@NonNull AppMetricaConfig appMetricaConfig) {
        m21145b(f95027x.f95224b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C34751ne m21294a(java.lang.String r5, io.appmetrica.analytics.internal.IdentifiersResult r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f95711id     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "STATUS"
            io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus r3 = r6.status     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.getValue()     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.errorExplanation     // Catch: java.lang.Throwable -> L22
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2d
            r4.m21145b(r5, r6)
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34751ne.m21294a(java.lang.String, io.appmetrica.analytics.internal.IdentifiersResult):io.appmetrica.analytics.impl.ne");
    }
}
