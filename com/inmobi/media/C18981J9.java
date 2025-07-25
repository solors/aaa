package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.J9 */
/* loaded from: classes6.dex */
public final class C18981J9 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18981J9 f47385a = new C18981J9();

    public C18981J9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
        Context m61068d = C18954Ha.m61068d();
        Intrinsics.m17074g(m61068d);
        C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "default");
        Intrinsics.checkNotNullParameter("enableImraidLogs", "key");
        return Boolean.valueOf(m59823a.f48820a.getBoolean("enableImraidLogs", false));
    }
}
