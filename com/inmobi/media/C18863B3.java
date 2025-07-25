package com.inmobi.media;

import java.util.concurrent.Executors;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;

/* renamed from: com.inmobi.media.B3 */
/* loaded from: classes6.dex */
public final class C18863B3 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18863B3 f47109a = new C18863B3();

    public C18863B3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        InterfaceC38501j interfaceC38501j = AbstractC18877C3.f47129a;
        Intrinsics.checkNotNullExpressionValue("C3", "access$getTAG$p(...)");
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18962I4("C3"));
    }
}
