package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.C4246da;

/* renamed from: com.applovin.impl.adview.k */
/* loaded from: classes2.dex */
public class C4041k extends View {

    /* renamed from: a */
    private final C4246da f4686a;

    /* renamed from: b */
    private boolean f4687b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.adview.k$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4042a {
        /* renamed from: a */
        void mo100832a();

        void onFailure();
    }

    public C4041k(C4246da c4246da, Context context) {
        super(context);
        this.f4686a = c4246da;
        setClickable(false);
        setFocusable(false);
    }

    /* renamed from: a */
    public boolean m100835a() {
        return this.f4687b;
    }

    /* renamed from: b */
    public void m100833b() {
        m100834a(null);
    }

    public String getIdentifier() {
        return this.f4686a.m99845b();
    }

    /* renamed from: a */
    public void m100834a(InterfaceC4042a interfaceC4042a) {
        if (this.f4687b) {
            if (interfaceC4042a != null) {
                interfaceC4042a.mo100832a();
                return;
            }
            return;
        }
        Drawable m99847a = this.f4686a.m99847a();
        if (m99847a == null) {
            if (interfaceC4042a != null) {
                interfaceC4042a.onFailure();
                return;
            }
            return;
        }
        setBackground(m99847a);
        this.f4687b = true;
        if (interfaceC4042a != null) {
            interfaceC4042a.mo100832a();
        }
    }
}
