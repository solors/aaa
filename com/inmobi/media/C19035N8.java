package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.N8 */
/* loaded from: classes6.dex */
public final class C19035N8 extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C19048O8 f47568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19035N8(C19048O8 c19048o8) {
        super(1);
        this.f47568a = c19048o8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C18952H8 it = (C18952H8) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        InterfaceC18850A4 interfaceC18850A4 = this.f47568a.f47595b;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61259a("NovatiqDataHandler", "Novatiq hyper id synced");
        }
        return Unit.f99208a;
    }
}
