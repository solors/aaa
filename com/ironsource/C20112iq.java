package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.iq */
/* loaded from: classes6.dex */
public final class C20112iq {
    @NotNull

    /* renamed from: a */
    private final String f50630a;
    @Nullable

    /* renamed from: b */
    private final String f50631b;
    @NotNull

    /* renamed from: c */
    private final List<IronSource.AD_UNIT> f50632c;

    public C20112iq(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        this.f50630a = appKey;
        this.f50631b = str;
        this.f50632c = legacyAdFormats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C20112iq m57950a(C20112iq c20112iq, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20112iq.f50630a;
        }
        if ((i & 2) != 0) {
            str2 = c20112iq.f50631b;
        }
        if ((i & 4) != 0) {
            list = c20112iq.f50632c;
        }
        return c20112iq.m57949a(str, str2, list);
    }

    @Nullable
    /* renamed from: b */
    public final String m57947b() {
        return this.f50631b;
    }

    @NotNull
    /* renamed from: c */
    public final List<IronSource.AD_UNIT> m57946c() {
        return this.f50632c;
    }

    @NotNull
    /* renamed from: d */
    public final String m57945d() {
        return this.f50630a;
    }

    @NotNull
    /* renamed from: e */
    public final List<IronSource.AD_UNIT> m57944e() {
        return this.f50632c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20112iq)) {
            return false;
        }
        C20112iq c20112iq = (C20112iq) obj;
        if (Intrinsics.m17075f(this.f50630a, c20112iq.f50630a) && Intrinsics.m17075f(this.f50631b, c20112iq.f50631b) && Intrinsics.m17075f(this.f50632c, c20112iq.f50632c)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m57943f() {
        return this.f50631b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f50630a.hashCode() * 31;
        String str = this.f50631b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f50632c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkInitRequest(appKey=" + this.f50630a + ", userId=" + this.f50631b + ", legacyAdFormats=" + this.f50632c + ')';
    }

    public /* synthetic */ C20112iq(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }

    @NotNull
    /* renamed from: a */
    public final C20112iq m57949a(@NotNull String appKey, @Nullable String str, @NotNull List<IronSource.AD_UNIT> legacyAdFormats) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
        return new C20112iq(appKey, str, legacyAdFormats);
    }

    @NotNull
    /* renamed from: a */
    public final String m57951a() {
        return this.f50630a;
    }

    /* renamed from: a */
    public final void m57948a(@NotNull List<? extends IronSource.AD_UNIT> adFormats) {
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f50632c.clear();
        this.f50632c.addAll(adFormats);
    }
}
