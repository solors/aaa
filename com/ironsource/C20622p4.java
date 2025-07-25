package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.p4 */
/* loaded from: classes6.dex */
public final class C20622p4 implements InterfaceC20673q4 {
    @NotNull

    /* renamed from: a */
    private final C19921fh f52379a;
    @NotNull

    /* renamed from: b */
    private final C20348d f52380b;
    @Nullable

    /* renamed from: c */
    private final C21110v4 f52381c;

    public C20622p4(@NotNull C19921fh instanceInfo, @NotNull C20348d auctionDataUtils, @Nullable C21110v4 c21110v4) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f52379a = instanceInfo;
        this.f52380b = auctionDataUtils;
        this.f52381c = c21110v4;
    }

    @Override // com.ironsource.InterfaceC20673q4
    /* renamed from: a */
    public void mo55690a(@NotNull String methodName) {
        List<String> m17166m;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C21110v4 c21110v4 = this.f52381c;
        if (c21110v4 == null || (m17166m = c21110v4.m54512b()) == null) {
            m17166m = C37563v.m17166m();
        }
        m55867a(m17166m, methodName);
    }

    @Override // com.ironsource.InterfaceC20673q4
    /* renamed from: b */
    public void mo55689b(@NotNull String methodName) {
        List<String> m17166m;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C21110v4 c21110v4 = this.f52381c;
        if (c21110v4 == null || (m17166m = c21110v4.m54510c()) == null) {
            m17166m = C37563v.m17166m();
        }
        m55867a(m17166m, methodName);
    }

    @Override // com.ironsource.InterfaceC20673q4
    /* renamed from: c */
    public void mo55688c(@NotNull String methodName) {
        List<String> m17166m;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C21110v4 c21110v4 = this.f52381c;
        if (c21110v4 == null || (m17166m = c21110v4.m54514a()) == null) {
            m17166m = C37563v.m17166m();
        }
        m55867a(m17166m, methodName);
    }

    /* renamed from: a */
    private final void m55867a(List<String> list, String str) {
        for (String str2 : list) {
            this.f52380b.m57013a(str, this.f52379a.m58559e(), C20348d.m57010b().m57014a(str2, this.f52379a.m58559e(), this.f52379a.m58558f(), this.f52379a.m58560d(), "", "", "", ""));
        }
    }
}
