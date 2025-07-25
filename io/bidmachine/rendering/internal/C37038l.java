package io.bidmachine.rendering.internal;

import io.bidmachine.rendering.internal.event.InterfaceC37027a;
import io.bidmachine.rendering.model.MethodParams;

/* renamed from: io.bidmachine.rendering.internal.l */
/* loaded from: classes9.dex */
public class C37038l extends AbstractC37044r {

    /* renamed from: c */
    private final MethodParams f97746c;

    public C37038l(MethodParams methodParams, InterfaceC37027a interfaceC37027a) {
        super(interfaceC37027a);
        this.f97746c = methodParams;
    }

    @Override // io.bidmachine.rendering.internal.AbstractC37044r
    /* renamed from: q */
    public String mo19149q() {
        return this.f97746c.getName();
    }

    /* renamed from: r */
    public MethodParams m19160r() {
        return this.f97746c;
    }
}
