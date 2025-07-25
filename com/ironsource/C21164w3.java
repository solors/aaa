package com.ironsource;

import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.w3 */
/* loaded from: classes6.dex */
public final class C21164w3 {

    /* renamed from: a */
    private final boolean f54290a;
    @Nullable

    /* renamed from: b */
    private final HashSet<String> f54291b;
    @NotNull

    /* renamed from: c */
    private final String f54292c;
    @NotNull

    /* renamed from: d */
    private final String f54293d;

    /* renamed from: e */
    private final boolean f54294e;

    /* renamed from: f */
    private final int f54295f;

    /* renamed from: g */
    private final boolean f54296g;

    public C21164w3(@NotNull JSONObject applicationCrashReporterSettings) {
        HashSet<String> hashSet;
        Intrinsics.checkNotNullParameter(applicationCrashReporterSettings, "applicationCrashReporterSettings");
        this.f54290a = applicationCrashReporterSettings.optBoolean("enabled", false);
        List<String> m58121b = C20053hj.m58121b(applicationCrashReporterSettings.optJSONArray(C21252y3.f54547b));
        if (m58121b != null) {
            hashSet = _Collections.m17555X0(m58121b);
        } else {
            hashSet = null;
        }
        this.f54291b = hashSet;
        String optString = applicationCrashReporterSettings.optString(C21252y3.f54548c);
        Intrinsics.checkNotNullExpressionValue(optString, "applicationCrashReporter…(CRASHREPORTER_URL_FIELD)");
        this.f54292c = optString;
        String optString2 = applicationCrashReporterSettings.optString(C21252y3.f54549d);
        Intrinsics.checkNotNullExpressionValue(optString2, "applicationCrashReporter…SHREPORTER_KEYWORD_FIELD)");
        this.f54293d = optString2;
        this.f54294e = applicationCrashReporterSettings.optBoolean(C21252y3.f54550e, false);
        this.f54295f = applicationCrashReporterSettings.optInt("timeout", 5000);
        this.f54296g = applicationCrashReporterSettings.optBoolean(C21252y3.f54552g, false);
    }

    /* renamed from: a */
    public final int m54378a() {
        return this.f54295f;
    }

    @Nullable
    /* renamed from: b */
    public final HashSet<String> m54377b() {
        return this.f54291b;
    }

    @NotNull
    /* renamed from: c */
    public final String m54376c() {
        return this.f54293d;
    }

    @NotNull
    /* renamed from: d */
    public final String m54375d() {
        return this.f54292c;
    }

    /* renamed from: e */
    public final boolean m54374e() {
        return this.f54294e;
    }

    /* renamed from: f */
    public final boolean m54373f() {
        return this.f54290a;
    }

    /* renamed from: g */
    public final boolean m54372g() {
        return this.f54296g;
    }
}
