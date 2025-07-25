package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.sr */
/* loaded from: classes6.dex */
public final class C20983sr implements InterfaceC19778dl<AbstractC20483mr, C20993t> {
    @Override // com.ironsource.InterfaceC19778dl
    @NotNull
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C20993t mo53929a(@NotNull AbstractC20483mr input) {
        EnumC21177we enumC21177we;
        String m57766g;
        String m57764i;
        String m57765h;
        Intrinsics.checkNotNullParameter(input, "input");
        EnumC21045tr mo55438b = input.mo55438b();
        C20177k0 m56247a = input.m56247a();
        String str = (m56247a == null || (m57765h = m56247a.m57765h()) == null) ? "0" : m57765h;
        C20177k0 m56247a2 = input.m56247a();
        String str2 = (m56247a2 == null || (m57764i = m56247a2.m57764i()) == null) ? "0" : m57764i;
        C20177k0 m56247a3 = input.m56247a();
        String str3 = (m56247a3 == null || (m57766g = m56247a3.m57766g()) == null) ? "0" : m57766g;
        C20177k0 m56247a4 = input.m56247a();
        if (m56247a4 == null || (enumC21177we = m56247a4.m57768e()) == null) {
            enumC21177we = EnumC21177we.UnknownProvider;
        }
        EnumC21177we enumC21177we2 = enumC21177we;
        C20177k0 m56247a5 = input.m56247a();
        return new C20993t(mo55438b, str, str2, str3, enumC21177we2, (m56247a5 == null || (r9 = m56247a5.m57770c()) == null) ? "0" : "0");
    }
}
