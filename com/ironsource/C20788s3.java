package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.s3 */
/* loaded from: classes6.dex */
public final class C20788s3 {
    @NotNull

    /* renamed from: a */
    private final C21270yk f52853a;

    /* renamed from: b */
    private final boolean f52854b;
    @NotNull

    /* renamed from: c */
    private final C21164w3 f52855c;
    @NotNull

    /* renamed from: d */
    private final C19749d4 f52856d;
    @NotNull

    /* renamed from: e */
    private final C20672q3 f52857e;

    public C20788s3(@NotNull JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(C21059u3.f53747a);
        this.f52853a = new C21270yk(optJSONObject == null ? new JSONObject() : optJSONObject);
        this.f52854b = applicationConfigurations.optBoolean(C21059u3.f53753g, false);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject(C21059u3.f53754h);
        this.f52855c = new C21164w3(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject("settings");
        this.f52856d = new C19749d4(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject(C21059u3.f53752f);
        this.f52857e = new C20672q3(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    @NotNull
    /* renamed from: a */
    public final C20672q3 m55394a() {
        return this.f52857e;
    }

    @NotNull
    /* renamed from: b */
    public final C21164w3 m55393b() {
        return this.f52855c;
    }

    @NotNull
    /* renamed from: c */
    public final C19749d4 m55392c() {
        return this.f52856d;
    }

    /* renamed from: d */
    public final boolean m55391d() {
        return this.f52854b;
    }

    @NotNull
    /* renamed from: e */
    public final C21270yk m55390e() {
        return this.f52853a;
    }
}
