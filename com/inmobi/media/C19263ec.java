package com.inmobi.media;

import java.util.concurrent.Executors;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.ec */
/* loaded from: classes6.dex */
public final class C19263ec extends Lambda implements Functions {

    /* renamed from: a */
    public static final C19263ec f48192a = new C19263ec();

    public C19263ec() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        C19277fc c19277fc = C19277fc.f48233a;
        Intrinsics.checkNotNullExpressionValue("fc", "access$getTAG$p(...)");
        return Executors.newCachedThreadPool(new ThreadFactoryC18962I4("fc"));
    }
}
