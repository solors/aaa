package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.F3 */
/* loaded from: classes6.dex */
public final class C18919F3 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18919F3 f47231a = new C18919F3();

    public C18919F3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new ScheduledThreadPoolExecutor(AbstractC18933G3.f47258a, new ThreadFactoryC18962I4("ExecutorProvider.normal"));
    }
}
