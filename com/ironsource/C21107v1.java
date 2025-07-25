package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.v1 */
/* loaded from: classes6.dex */
public final class C21107v1 extends AbstractC20682qb {
    @NotNull

    /* renamed from: a */
    private final C20179k1 f53840a;
    @NotNull

    /* renamed from: b */
    private final C19610b1 f53841b;

    public C21107v1(@NotNull C20179k1 adTools, @NotNull C19610b1 adProperties) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f53840a = adTools;
        this.f53841b = adProperties;
    }

    @Override // com.ironsource.InterfaceC21162w1
    @NotNull
    /* renamed from: a */
    public Map<String, Object> mo53886a(@Nullable EnumC21057u1 enumC21057u1) {
        Map<String, Object> m55656a = m55656a(this.f53841b);
        m55656a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        m55656a.put("sessionDepth", Integer.valueOf(this.f53840a.m57747g()));
        return m55656a;
    }
}
