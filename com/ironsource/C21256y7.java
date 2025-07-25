package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.y7 */
/* loaded from: classes6.dex */
public final class C21256y7 implements InterfaceC21075ud {
    @Nullable

    /* renamed from: a */
    private final Boolean f54563a;
    @Nullable

    /* renamed from: b */
    private final Integer f54564b;
    @Nullable

    /* renamed from: c */
    private final EnumC19963g8 f54565c;

    public C21256y7(@Nullable Boolean bool, @Nullable Integer num, @Nullable EnumC19963g8 enumC19963g8) {
        this.f54563a = bool;
        this.f54564b = num;
        this.f54565c = enumC19963g8;
    }

    @Override // com.ironsource.InterfaceC21075ud
    @NotNull
    /* renamed from: a */
    public Object mo54025a() {
        C21258y9 c21258y9;
        Throwable m14546e = Result.m14546e(new C21301z9(this.f54563a).mo53860a());
        if (m14546e != null) {
            return Result.m14549b(C38508r.m14540a(m14546e));
        }
        Boolean bool = this.f54563a;
        if (bool != null) {
            bool.booleanValue();
            c21258y9 = new C21258y9(this.f54563a.booleanValue());
        } else {
            c21258y9 = null;
        }
        return Result.m14549b(c21258y9);
    }

    @Override // com.ironsource.InterfaceC21075ud
    @NotNull
    /* renamed from: b */
    public Object mo54023b() {
        C20650pn c20650pn;
        Integer num;
        EnumC19963g8 enumC19963g8 = EnumC19963g8.Second;
        Throwable m14546e = Result.m14546e(m54024a(enumC19963g8));
        if (m14546e != null) {
            return Result.m14549b(C38508r.m14540a(m14546e));
        }
        if (Intrinsics.m17075f(this.f54563a, Boolean.TRUE) && (num = this.f54564b) != null) {
            num.intValue();
            c20650pn = new C20650pn(enumC19963g8.m58449a(this.f54564b), null, 2, null);
        } else {
            c20650pn = null;
        }
        return Result.m14549b(c20650pn);
    }

    @Override // com.ironsource.InterfaceC21075ud
    @NotNull
    /* renamed from: c */
    public Object mo54022c() {
        C21332zr c21332zr;
        Integer num;
        Throwable m14546e = Result.m14546e(m54024a(this.f54565c));
        if (m14546e != null) {
            return Result.m14549b(C38508r.m14540a(m14546e));
        }
        if (Intrinsics.m17075f(this.f54563a, Boolean.TRUE) && (num = this.f54564b) != null) {
            int intValue = num.intValue();
            EnumC19963g8 enumC19963g8 = this.f54565c;
            if (enumC19963g8 != null) {
                c21332zr = new C21332zr(intValue, enumC19963g8);
                return Result.m14549b(c21332zr);
            }
        }
        c21332zr = null;
        return Result.m14549b(c21332zr);
    }

    @Nullable
    /* renamed from: d */
    public final Boolean m54021d() {
        return this.f54563a;
    }

    @Nullable
    /* renamed from: e */
    public final Integer m54020e() {
        return this.f54564b;
    }

    @Nullable
    /* renamed from: f */
    public final EnumC19963g8 m54019f() {
        return this.f54565c;
    }

    public /* synthetic */ C21256y7(Boolean bool, Integer num, EnumC19963g8 enumC19963g8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : enumC19963g8);
    }

    /* renamed from: a */
    private final Object m54024a(EnumC19963g8 enumC19963g8) {
        return new C21299z7(this.f54563a, this.f54564b, enumC19963g8).mo53860a();
    }
}
