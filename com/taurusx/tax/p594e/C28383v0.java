package com.taurusx.tax.p594e;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.taurusx.tax.p578b.p581e.C28219a;
import com.taurusx.tax.p578b.p581e.C28237j;

/* renamed from: com.taurusx.tax.e.v0 */
/* loaded from: classes7.dex */
public class C28383v0 extends GestureDetector {

    /* renamed from: a */
    public final View f73655a;

    /* renamed from: b */
    public C28219a f73656b;

    /* renamed from: c */
    public C28237j f73657c;

    /* renamed from: d */
    public C28319a f73658d;

    /* renamed from: e */
    public InterfaceC28384a f73659e;

    /* renamed from: com.taurusx.tax.e.v0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC28384a {
    }

    public C28383v0(Context context, View view) {
        this(context, view, new C28319a(view));
    }

    /* renamed from: a */
    public void m38208a(InterfaceC28384a interfaceC28384a) {
        this.f73659e = interfaceC28384a;
    }

    public C28383v0(Context context, View view, C28319a c28319a) {
        super(context, c28319a);
        this.f73656b = new C28219a();
        this.f73657c = new C28237j();
        this.f73658d = c28319a;
        this.f73655a = view;
        setIsLongpressEnabled(false);
    }
}
