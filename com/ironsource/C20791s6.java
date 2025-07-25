package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.s6 */
/* loaded from: classes6.dex */
public final class C20791s6 extends C20058ho {
    @NotNull

    /* renamed from: b */
    private final C20179k1 f52859b;
    @NotNull

    /* renamed from: c */
    private final ISBannerSize f52860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20791s6(@NotNull C20179k1 adTools, @NotNull ISBannerSize size, @NotNull String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f52859b = adTools;
        this.f52860c = size;
    }

    @Override // com.ironsource.C20058ho, com.ironsource.InterfaceC21162w1
    @NotNull
    /* renamed from: a */
    public Map<String, Object> mo53886a(@Nullable EnumC21057u1 enumC21057u1) {
        Map<String, Object> m17285D;
        m17285D = C37559r0.m17285D(super.mo53886a(enumC21057u1));
        this.f52859b.m57758a(m17285D, this.f52860c);
        return m17285D;
    }
}
