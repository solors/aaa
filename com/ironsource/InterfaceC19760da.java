package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.da */
/* loaded from: classes6.dex */
public interface InterfaceC19760da {

    @Metadata
    /* renamed from: com.ironsource.da$a */
    /* loaded from: classes6.dex */
    public static final class C19761a {
        @NotNull

        /* renamed from: a */
        private final Map<String, Object> f49740a;

        public C19761a(@NotNull String providerName) {
            Map<String, Object> m17279o;
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            m17279o = C37559r0.m17279o(C38513v.m14532a(IronSourceConstants.EVENTS_PROVIDER, providerName), C38513v.m14532a(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
            this.f49740a = m17279o;
        }

        @NotNull
        /* renamed from: a */
        public final Map<String, Object> m58956a() {
            Map<String, Object> m17285D;
            m17285D = C37559r0.m17285D(this.f49740a);
            return m17285D;
        }

        /* renamed from: a */
        public final void m58955a(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f49740a.put(key, value);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.da$b */
    /* loaded from: classes6.dex */
    public static final class C19762b implements InterfaceC19760da {
        @NotNull

        /* renamed from: a */
        private final InterfaceC19970ge f49741a;
        @NotNull

        /* renamed from: b */
        private final C19761a f49742b;

        public C19762b(@NotNull InterfaceC19970ge eventManager, @NotNull C19761a eventBaseData) {
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
            this.f49741a = eventManager;
            this.f49742b = eventBaseData;
        }

        @Override // com.ironsource.InterfaceC19760da
        /* renamed from: a */
        public void mo58954a(int i, @Nullable EnumC20720qq enumC20720qq) {
            Map m17269y;
            Map<String, Object> m58956a = this.f49742b.m58956a();
            m58956a.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(enumC20720qq));
            m17269y = C37559r0.m17269y(m58956a);
            this.f49741a.mo57283a(new C20200kb(i, new JSONObject(m17269y)));
        }

        @Override // com.ironsource.InterfaceC19760da
        /* renamed from: a */
        public void mo58953a(int i, @NotNull String instanceId) {
            Map m17269y;
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Map<String, Object> m58956a = this.f49742b.m58956a();
            m58956a.put("spId", instanceId);
            m17269y = C37559r0.m17269y(m58956a);
            this.f49741a.mo57283a(new C20200kb(i, new JSONObject(m17269y)));
        }
    }

    /* renamed from: a */
    void mo58954a(int i, @Nullable EnumC20720qq enumC20720qq);

    /* renamed from: a */
    void mo58953a(int i, @NotNull String str);
}
