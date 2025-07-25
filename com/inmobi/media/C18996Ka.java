package com.inmobi.media;

import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.Ka */
/* loaded from: classes6.dex */
public final class C18996Ka extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18996Ka f47405a = new C18996Ka();

    public C18996Ka() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        C19024Ma.f47518a.getClass();
        C19508w5 c19508w5 = C19024Ma.f47527j;
        int i = 0;
        if (c19508w5 != null) {
            Intrinsics.checkNotNullParameter("cnt", "key");
            i = c19508w5.f48820a.getInt("cnt", 0);
        }
        return Integer.valueOf(i);
    }
}
