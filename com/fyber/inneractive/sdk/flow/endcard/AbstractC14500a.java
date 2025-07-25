package com.fyber.inneractive.sdk.flow.endcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.flow.endcard.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14500a implements InterfaceC14510k {

    /* renamed from: a */
    public final String f27451a = IAlog.m76531a(this);

    /* renamed from: b */
    public final AbstractC14501b f27452b;

    public AbstractC14500a(AbstractC14501b abstractC14501b) {
        this.f27452b = abstractC14501b;
    }

    /* renamed from: a */
    public static ViewGroup m77864a(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(view.getContext()).inflate(C14169R.C14173layout.ia_endcard_container, (ViewGroup) null);
        viewGroup.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC14510k
    public void destroy() {
        mo77843a();
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.InterfaceC14510k
    /* renamed from: a */
    public void mo77843a() {
        AbstractC15471s.m76465a(mo77838b());
    }
}
