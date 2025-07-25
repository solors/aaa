package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.D3 */
/* loaded from: classes6.dex */
public final class C18891D3 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18891D3 f47169a = new C18891D3();

    public C18891D3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        int i = AbstractC18933G3.f47258a;
        return new ScheduledThreadPoolExecutor(5, new ThreadFactoryC18962I4("ExecutorProvider.high"));
    }
}
