package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.rendering.internal.AbstractC37044r;
import io.bidmachine.rendering.internal.InterfaceC36947a;
import io.bidmachine.rendering.internal.event.InterfaceC37027a;
import io.bidmachine.rendering.internal.repository.InterfaceC37047a;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.VisibilityChanger;

/* renamed from: io.bidmachine.rendering.internal.adform.a */
/* loaded from: classes9.dex */
public abstract class AbstractView$OnClickListenerC36948a extends AbstractC37044r implements InterfaceC36947a, View.OnClickListener, VisibilityChanger {

    /* renamed from: c */
    private final Context f97607c;

    /* renamed from: d */
    private final InterfaceC37047a f97608d;

    /* renamed from: e */
    private final AdElementParams f97609e;

    /* renamed from: f */
    private final InterfaceC36951c f97610f;

    /* renamed from: g */
    private volatile boolean f97611g;

    /* renamed from: h */
    private volatile boolean f97612h;

    public AbstractView$OnClickListenerC36948a(Context context, InterfaceC37047a interfaceC37047a, AdElementParams adElementParams, InterfaceC36951c interfaceC36951c, InterfaceC37027a interfaceC37027a) {
        super(interfaceC37027a);
        this.f97607c = context;
        this.f97608d = interfaceC37047a;
        this.f97609e = adElementParams;
        this.f97610f = interfaceC36951c;
    }

    @Override // io.bidmachine.rendering.internal.AbstractC37044r, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: a */
    public void mo19159a() {
        super.mo19159a();
        mo19419v();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: c */
    public abstract /* synthetic */ void mo19428c();

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo19426d() {
        super.mo19426d();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo19425e() {
        super.mo19425e();
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: i */
    public AdElementParams mo19464i() {
        return this.f97609e;
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: k */
    public abstract /* synthetic */ View mo19422k();

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void lockVisibility(boolean z) {
        setVisibility(z);
        this.f97612h = true;
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: n */
    public void mo19449n() {
        mo19420u();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        mo19420u();
    }

    @Override // io.bidmachine.rendering.internal.AbstractC37044r
    /* renamed from: q */
    public String mo19149q() {
        return this.f97609e.getName();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public InterfaceC36951c m19463r() {
        return this.f97610f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public Context m19462s() {
        return this.f97607c;
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void setVisibility(boolean z) {
        this.f97611g = z;
        if (!this.f97612h) {
            if (z) {
                UiUtils.safeShowView(mo19422k());
            } else {
                UiUtils.safeHideView(mo19422k());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public InterfaceC37047a m19461t() {
        return this.f97608d;
    }

    public String toString() {
        return "type - " + this.f97609e.getAdElementType() + ", name - " + this.f97609e.getName();
    }

    /* renamed from: u */
    public void mo19420u() {
        m19150p().mo19197i();
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void unlockVisibility() {
        this.f97612h = false;
        setVisibility(this.f97611g);
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo19436a(ViewGroup viewGroup) {
        super.mo19436a(viewGroup);
    }

    /* renamed from: v */
    protected void mo19419v() {
    }
}
