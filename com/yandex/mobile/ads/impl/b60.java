package com.yandex.mobile.ads.impl;

import com.ironsource.C20217kq;
import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

/* loaded from: classes8.dex */
public final class b60 {
    @NotNull

    /* renamed from: a */
    private final d60 f77126a;
    @NotNull

    /* renamed from: b */
    private final C30349g f77127b;

    public /* synthetic */ b60(int i) {
        this(new d60(), new C30349g());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x0027, B:15:0x003c, B:16:0x004d, B:19:0x0052, B:22:0x006c, B:24:0x0086, B:31:0x00a1, B:27:0x009a, B:11:0x0035), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x0027, B:15:0x003c, B:16:0x004d, B:19:0x0052, B:22:0x006c, B:24:0x0086, B:31:0x00a1, B:27:0x009a, B:11:0x0035), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.a60 m35637a(@org.jetbrains.annotations.Nullable java.lang.String r15) {
        /*
            r14 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La8
            if (r15 != 0) goto L6
            return r0
        L6:
            r1.<init>(r15)     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.lr$a r15 = com.yandex.mobile.ads.impl.EnumC30803lr.f81893c     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "ad_type"
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = "getString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> La8
            r15.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.String r15 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r15)     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.lr[] r15 = com.yandex.mobile.ads.impl.EnumC30803lr.values()     // Catch: java.lang.Throwable -> La8
            int r3 = r15.length     // Catch: java.lang.Throwable -> La8
            r4 = 0
            r5 = r4
        L25:
            if (r5 >= r3) goto L38
            r6 = r15[r5]     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = r6.m32212a()     // Catch: java.lang.Throwable -> La8
            boolean r7 = kotlin.jvm.internal.Intrinsics.m17075f(r7, r2)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L35
            r7 = r6
            goto L39
        L35:
            int r5 = r5 + 1
            goto L25
        L38:
            r7 = r0
        L39:
            if (r7 != 0) goto L3c
            return r0
        L3c:
            java.lang.String r15 = "start_time"
            long r8 = r1.getLong(r15)     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.d60 r15 = r14.f77126a     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "false_click"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> La8
            r15.getClass()     // Catch: java.lang.Throwable -> La8
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            if (r2 != 0) goto L52
            goto L6b
        L52:
            r15.<init>(r2)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            java.lang.String r2 = "url"
            java.lang.String r2 = r15.getString(r2)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            java.lang.String r3 = "interval"
            long r5 = r15.getLong(r3)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            com.monetization.ads.base.tracker.interaction.model.FalseClick r15 = new com.monetization.ads.base.tracker.interaction.model.FalseClick     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            kotlin.jvm.internal.Intrinsics.m17074g(r2)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            r15.<init>(r2, r5)     // Catch: org.json.JSONException -> L6b java.lang.Throwable -> La8
            r11 = r15
            goto L6c
        L6b:
            r11 = r0
        L6c:
            java.util.HashMap r12 = m35636a(r1)     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.g r15 = r14.f77127b     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "ab_experiments"
            java.lang.String r2 = r1.optString(r2)     // Catch: java.lang.Throwable -> La8
            r15.getClass()     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.f r13 = com.yandex.mobile.ads.impl.C30349g.m34038a(r2)     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.o0$a[] r15 = com.yandex.mobile.ads.impl.C31006o0.EnumC31007a.values()     // Catch: java.lang.Throwable -> La8
            int r2 = r15.length     // Catch: java.lang.Throwable -> La8
        L84:
            if (r4 >= r2) goto L9d
            r3 = r15[r4]     // Catch: java.lang.Throwable -> La8
            java.lang.String r5 = r3.m31201a()     // Catch: java.lang.Throwable -> La8
            java.lang.String r6 = "type"
            java.lang.String r6 = r1.getString(r6)     // Catch: java.lang.Throwable -> La8
            boolean r5 = kotlin.jvm.internal.Intrinsics.m17075f(r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r5 == 0) goto L9a
            r10 = r3
            goto L9e
        L9a:
            int r4 = r4 + 1
            goto L84
        L9d:
            r10 = r0
        L9e:
            if (r10 != 0) goto La1
            return r0
        La1:
            com.yandex.mobile.ads.impl.a60 r15 = new com.yandex.mobile.ads.impl.a60     // Catch: java.lang.Throwable -> La8
            r6 = r15
            r6.<init>(r7, r8, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La8
            r0 = r15
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.b60.m35637a(java.lang.String):com.yandex.mobile.ads.impl.a60");
    }

    public b60(@NotNull d60 falseClickFormatter, @NotNull C30349g abExperimentDataConverter) {
        Intrinsics.checkNotNullParameter(falseClickFormatter, "falseClickFormatter");
        Intrinsics.checkNotNullParameter(abExperimentDataConverter, "abExperimentDataConverter");
        this.f77126a = falseClickFormatter;
        this.f77127b = abExperimentDataConverter;
    }

    /* renamed from: a */
    private static HashMap m35636a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Result.C38506a c38506a = Result.f101870c;
            JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
            Iterator<String> keys = jSONObject2.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.m17074g(next);
                hashMap.put(next, jSONObject2.get(next));
            }
            Result.m14549b(Unit.f99208a);
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            Result.m14549b(C38508r.m14540a(th));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public final String m35638a(@Nullable a60 a60Var) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", a60Var.m35961c().m32212a());
        jSONObject.put("start_time", a60Var.m35958f());
        jSONObject.put("type", a60Var.m35962b().m31201a());
        d60 d60Var = this.f77126a;
        FalseClick m35960d = a60Var.m35960d();
        d60Var.getClass();
        String str2 = null;
        if (m35960d != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", m35960d.m44529c());
            jSONObject2.put("url", m35960d.m44528d());
            str = jSONObject2.toString();
        } else {
            str = null;
        }
        jSONObject.put("false_click", str);
        jSONObject.put("report_data", new JSONObject(a60Var.m35959e()));
        C30349g c30349g = this.f77127b;
        C30280f m35963a = a60Var.m35963a();
        c30349g.getClass();
        if (m35963a != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C20217kq.f50860d, m35963a.m34406a());
            jSONObject3.put("test_ids", m35963a.m34405b());
            str2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", str2);
        return jSONObject.toString();
    }
}
