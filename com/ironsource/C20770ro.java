package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.ro */
/* loaded from: classes6.dex */
public final class C20770ro {
    @NotNull

    /* renamed from: a */
    private final Map<String, C20767rm> f52796a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.ironsource.ro$a */
    /* loaded from: classes6.dex */
    public static final class C20771a extends Lambda implements Function1<String, Tuples<? extends String, ? extends C20767rm>> {

        /* renamed from: a */
        final /* synthetic */ JSONObject f52797a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C20771a(JSONObject jSONObject) {
            super(1);
            this.f52797a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Tuples<String, C20767rm> invoke(String networkName) {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.f52797a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return C38513v.m14532a(networkName, new C20767rm(networkName, jSONObject));
        }
    }

    public C20770ro(@NotNull JSONObject providerSettings) {
        Sequence m16841c;
        Sequence m16804z;
        Map<String, C20767rm> m17268z;
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        m16841c = C37653n.m16841c(keys);
        m16804z = _Sequences.m16804z(m16841c, new C20771a(providerSettings));
        m17268z = C37559r0.m17268z(m16804z);
        this.f52796a = m17268z;
        for (Map.Entry<String, C20767rm> entry : m17268z.entrySet()) {
            entry.getKey();
            C20767rm value = entry.getValue();
            if (m55445b(value)) {
                value.m55464b(m55446a(value));
            }
        }
    }

    /* renamed from: a */
    private final C20767rm m55446a(C20767rm c20767rm) {
        return this.f52796a.get(c20767rm.m55458h());
    }

    /* renamed from: b */
    private final boolean m55445b(C20767rm c20767rm) {
        boolean z;
        if (!c20767rm.m55451o()) {
            return false;
        }
        if (c20767rm.m55454l().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C20767rm> m55447a() {
        return this.f52796a;
    }
}
