package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.d */
/* loaded from: classes6.dex */
public final class C19236d extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC19155X f48154a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC19442r9 f48155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19236d(InterfaceC19155X interfaceC19155X, InterfaceC19442r9 interfaceC19442r9) {
        super(0);
        this.f48154a = interfaceC19155X;
        this.f48155b = interfaceC19442r9;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        try {
            Object mo59568a = this.f48154a.mo59568a();
            InterfaceC19442r9 interfaceC19442r9 = this.f48155b;
            if (interfaceC19442r9 != null) {
                interfaceC19442r9.mo59916a(mo59568a);
            }
        } catch (Exception e) {
            InterfaceC19442r9 interfaceC19442r92 = this.f48155b;
            if (interfaceC19442r92 != null) {
                interfaceC19442r92.onError(e);
            }
        }
        return Unit.f99208a;
    }
}
