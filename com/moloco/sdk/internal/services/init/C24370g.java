package com.moloco.sdk.internal.services.init;

import com.moloco.sdk.C23907i;
import com.moloco.sdk.internal.AbstractC24405t;
import com.moloco.sdk.internal.services.init.AbstractC24364d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p761kc.HttpStatusCode;

/* renamed from: com.moloco.sdk.internal.services.init.g */
/* loaded from: classes7.dex */
public final class C24370g {
    /* renamed from: a */
    public static final boolean m46530a(int i) {
        HttpStatusCode.C37493a c37493a = HttpStatusCode.f99078d;
        if (i != c37493a.m17773U().m17815e0() && i != c37493a.m17783K().m17815e0() && i >= 400 && i < 500) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m46529b(@NotNull AbstractC24405t.C24406a<C23907i, AbstractC24364d> c24406a) {
        Intrinsics.checkNotNullParameter(c24406a, "<this>");
        if (c24406a.m46487a() instanceof AbstractC24364d.C24366b) {
            return m46530a(((AbstractC24364d.C24366b) c24406a.m46487a()).m46532a());
        }
        return true;
    }
}
