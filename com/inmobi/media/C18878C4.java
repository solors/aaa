package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.C4 */
/* loaded from: classes6.dex */
public final class C18878C4 extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ List f47130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18878C4(ArrayList arrayList) {
        super(1);
        this.f47130a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C19147W4 it = (C19147W4) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47130a.add(new C19200a5(it));
        return Unit.f99208a;
    }
}
