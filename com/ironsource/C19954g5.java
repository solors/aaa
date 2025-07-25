package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.g5 */
/* loaded from: classes6.dex */
public final class C19954g5 {
    @NotNull

    /* renamed from: a */
    private final String f50180a;

    /* renamed from: b */
    private final C20348d f50181b;

    public C19954g5(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f50180a = serverData;
        this.f50181b = C20348d.m57010b();
    }

    /* renamed from: a */
    public static /* synthetic */ C19954g5 m58472a(C19954g5 c19954g5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c19954g5.f50180a;
        }
        return c19954g5.m58471a(str);
    }

    /* renamed from: c */
    private final String m58469c() {
        return this.f50180a;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m58470b() {
        Map<String, String> m57009b = this.f50181b.m57009b(this.f50180a);
        Intrinsics.checkNotNullExpressionValue(m57009b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return m57009b;
    }

    @NotNull
    /* renamed from: d */
    public final String m58468d() {
        String m57008c = this.f50181b.m57008c(this.f50180a);
        Intrinsics.checkNotNullExpressionValue(m57008c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return m57008c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19954g5) && Intrinsics.m17075f(this.f50180a, ((C19954g5) obj).f50180a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f50180a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AuctionServerData(serverData=" + this.f50180a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19954g5 m58471a(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C19954g5(serverData);
    }

    @NotNull
    /* renamed from: a */
    public final String m58473a() {
        String m57017a = this.f50181b.m57017a(this.f50180a);
        Intrinsics.checkNotNullExpressionValue(m57017a, "auctionDataUtils.getAdmFromServerData(serverData)");
        return m57017a;
    }
}
