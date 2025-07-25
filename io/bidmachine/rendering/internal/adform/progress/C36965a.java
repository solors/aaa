package io.bidmachine.rendering.internal.adform.progress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a;
import io.bidmachine.rendering.internal.adform.InterfaceC36951c;
import io.bidmachine.rendering.internal.event.InterfaceC37027a;
import io.bidmachine.rendering.internal.repository.InterfaceC37047a;
import io.bidmachine.rendering.internal.view.C37067c;
import io.bidmachine.rendering.model.AdElementParams;

/* renamed from: io.bidmachine.rendering.internal.adform.progress.a */
/* loaded from: classes9.dex */
public class C36965a extends AbstractView$OnClickListenerC36948a {

    /* renamed from: i */
    private final C37067c f97632i;

    public C36965a(Context context, InterfaceC37047a interfaceC37047a, AdElementParams adElementParams, InterfaceC36951c interfaceC36951c, InterfaceC37027a interfaceC37027a) {
        super(context, interfaceC37047a, adElementParams, interfaceC36951c, interfaceC37027a);
        this.f97632i = new C37067c(context);
    }

    @Override // io.bidmachine.rendering.internal.AbstractC37044r, io.bidmachine.rendering.internal.InterfaceC37040n
    /* renamed from: a */
    public void mo19099a(long j, long j2, float f) {
        this.f97632i.mo19099a(j, j2, f);
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: c */
    public void mo19428c() {
        m19463r().mo19237b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo19426d() {
        super.mo19426d();
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo19425e() {
        super.mo19425e();
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: k */
    public View mo19422k() {
        return this.f97632i;
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo19436a(ViewGroup viewGroup) {
        super.mo19436a(viewGroup);
    }
}
