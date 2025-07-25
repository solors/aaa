package io.bidmachine.rendering.internal.adform.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.rendering.internal.AbstractC37034i;
import io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a;
import io.bidmachine.rendering.internal.adform.InterfaceC36951c;
import io.bidmachine.rendering.internal.event.InterfaceC37027a;
import io.bidmachine.rendering.internal.repository.InterfaceC37047a;
import io.bidmachine.rendering.internal.repository.InterfaceC37054c;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Error;

/* renamed from: io.bidmachine.rendering.internal.adform.image.a */
/* loaded from: classes9.dex */
public class C36962a extends AbstractView$OnClickListenerC36948a {

    /* renamed from: i */
    final ImageView f97630i;

    public C36962a(Context context, InterfaceC37047a interfaceC37047a, AdElementParams adElementParams, InterfaceC36951c interfaceC36951c, InterfaceC37027a interfaceC37027a) {
        super(context, interfaceC37047a, adElementParams, interfaceC36951c, interfaceC37027a);
        ImageView imageView = new ImageView(context);
        this.f97630i = imageView;
        Bitmap m19170b = AbstractC37034i.m19170b(adElementParams.getPlaceholder());
        if (m19170b != null) {
            imageView.setImageBitmap(m19170b);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo19436a(ViewGroup viewGroup) {
        super.mo19436a(viewGroup);
    }

    @Override // io.bidmachine.rendering.internal.adform.AbstractView$OnClickListenerC36948a, io.bidmachine.rendering.internal.InterfaceC36947a
    /* renamed from: c */
    public void mo19428c() {
        m19463r().mo19237b(this);
        String source = mo19464i().getSource();
        if (TextUtils.isEmpty(source)) {
            return;
        }
        m19461t().mo19143b(m19462s(), source, new C36964b());
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
        return this.f97630i;
    }

    /* renamed from: io.bidmachine.rendering.internal.adform.image.a$b */
    /* loaded from: classes9.dex */
    private class C36964b implements InterfaceC37054c {
        private C36964b() {
        }

        @Override // io.bidmachine.rendering.internal.repository.InterfaceC37054c
        /* renamed from: a */
        public void onSuccess(Bitmap bitmap) {
            C36962a.this.f97630i.setImageBitmap(bitmap);
        }

        @Override // io.bidmachine.rendering.internal.repository.InterfaceC37054c
        public void onError(Error error) {
        }
    }
}
