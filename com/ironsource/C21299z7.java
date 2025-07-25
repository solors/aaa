package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.z7 */
/* loaded from: classes6.dex */
public final class C21299z7 implements InterfaceC21129vd {
    @Nullable

    /* renamed from: a */
    private final Boolean f54728a;
    @Nullable

    /* renamed from: b */
    private final Integer f54729b;
    @Nullable

    /* renamed from: c */
    private final EnumC19963g8 f54730c;

    public C21299z7(@Nullable Boolean bool, @Nullable Integer num, @Nullable EnumC19963g8 enumC19963g8) {
        this.f54728a = bool;
        this.f54729b = num;
        this.f54730c = enumC19963g8;
    }

    @Override // com.ironsource.InterfaceC21129vd
    @NotNull
    /* renamed from: a */
    public Object mo53860a() {
        Exception exc;
        Object obj;
        Boolean bool = this.f54728a;
        if (bool == null) {
            Result.C38506a c38506a = Result.f101870c;
            exc = new Exception("enabled flag is not provided or invalid");
        } else {
            if (!bool.booleanValue()) {
                Result.C38506a c38506a2 = Result.f101870c;
                obj = Boolean.FALSE;
            } else {
                Integer num = this.f54729b;
                if (num != null && num.intValue() > 0) {
                    if (this.f54730c == null) {
                        Result.C38506a c38506a3 = Result.f101870c;
                        exc = new Exception("unit flag is not provided or invalid");
                    } else {
                        Result.C38506a c38506a4 = Result.f101870c;
                        obj = Boolean.TRUE;
                    }
                } else {
                    Result.C38506a c38506a5 = Result.f101870c;
                    exc = new Exception("limit flag is not provided or invalid");
                }
            }
            return Result.m14549b(obj);
        }
        obj = C38508r.m14540a(exc);
        return Result.m14549b(obj);
    }
}
