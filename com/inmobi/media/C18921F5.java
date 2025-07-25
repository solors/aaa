package com.inmobi.media;

import java.util.Timer;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.F5 */
/* loaded from: classes6.dex */
public final class C18921F5 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18921F5 f47232a = new C18921F5();

    public C18921F5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new Timer("IM-PageStateTracker");
    }
}
