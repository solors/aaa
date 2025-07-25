package com.ironsource;

import com.ironsource.C19577ad;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.u4 */
/* loaded from: classes6.dex */
public final class C21060u4 {
    @Nullable

    /* renamed from: a */
    private final C19577ad.EnumC19578a f53756a;
    @NotNull

    /* renamed from: b */
    private final ArrayList<String> f53757b = new ArrayList<>(new C20789s4().m55389a());
    @NotNull

    /* renamed from: c */
    private final C19696cd f53758c = new C19696cd();

    public C21060u4(@Nullable C19577ad.EnumC19578a enumC19578a) {
        this.f53756a = enumC19578a;
    }

    @NotNull
    /* renamed from: a */
    public final JSONObject m54696a() {
        C19577ad.EnumC19578a enumC19578a = this.f53756a;
        JSONObject m59165a = enumC19578a != null ? this.f53758c.m59165a(this.f53757b, enumC19578a) : null;
        if (m59165a == null) {
            m59165a = this.f53758c.m59166a(this.f53757b);
            Intrinsics.checkNotNullExpressionValue(m59165a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return m54695a(m59165a);
    }

    /* renamed from: a */
    private final JSONObject m54695a(JSONObject jSONObject) {
        JSONObject m58947b = C19765dd.m58947b(jSONObject.optJSONObject("md"));
        if (m58947b != null) {
            jSONObject.put("md", m58947b);
        }
        return jSONObject;
    }
}
