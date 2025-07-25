package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.z9 */
/* loaded from: classes6.dex */
public final class C21301z9 implements InterfaceC21129vd {
    @Nullable

    /* renamed from: a */
    private final Boolean f54732a;

    public C21301z9(@Nullable Boolean bool) {
        this.f54732a = bool;
    }

    @Override // com.ironsource.InterfaceC21129vd
    @NotNull
    /* renamed from: a */
    public Object mo53860a() {
        Boolean bool = this.f54732a;
        if (bool == null) {
            Result.C38506a c38506a = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(new Exception("enabled flag is not provided or invalid")));
        }
        return Result.m14549b(bool);
    }
}
