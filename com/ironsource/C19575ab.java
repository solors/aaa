package com.ironsource;

import com.ironsource.InterfaceC19813ee;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.ab */
/* loaded from: classes6.dex */
public final class C19575ab implements InterfaceC19813ee, InterfaceC19813ee.InterfaceC19814a {
    @NotNull

    /* renamed from: a */
    private JSONObject f49029a = new JSONObject();

    /* renamed from: c */
    private final JSONObject m59455c() {
        JSONObject optJSONObject = this.f49029a.optJSONObject(C19628bb.f49265a);
        if (optJSONObject == null) {
            return new JSONObject();
        }
        return optJSONObject;
    }

    @Override // com.ironsource.InterfaceC19694cb
    /* renamed from: a */
    public int mo59171a() {
        Integer m16640m;
        String optString = m59455c().optString(C19763db.f49744b);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        m16640m = StringNumberConversions.m16640m(optString);
        if (m16640m != null) {
            return m16640m.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC19694cb
    /* renamed from: b */
    public boolean mo59170b() {
        String optString = m59455c().optString(C19763db.f49743a);
        Intrinsics.checkNotNullExpressionValue(optString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = optString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return Intrinsics.m17075f(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC19813ee
    @NotNull
    public JSONObject config() {
        return this.f49029a;
    }

    @Override // com.ironsource.InterfaceC19813ee.InterfaceC19814a
    /* renamed from: a */
    public void mo58812a(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f49029a;
        }
        this.f49029a = jSONObject;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("setEpConfig: " + this.f49029a);
    }
}
