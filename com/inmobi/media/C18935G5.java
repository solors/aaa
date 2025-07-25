package com.inmobi.media;

import java.util.Timer;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.G5 */
/* loaded from: classes6.dex */
public final class C18935G5 extends Lambda implements Functions {

    /* renamed from: a */
    public static final C18935G5 f47264a = new C18935G5();

    public C18935G5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new Timer("IM-PageStateTracker");
    }
}
