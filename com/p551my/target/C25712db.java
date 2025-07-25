package com.p551my.target;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.db */
/* loaded from: classes7.dex */
public final class C25712db extends View {

    /* renamed from: a */
    public InterfaceC25713a f66750a;

    /* renamed from: b */
    public boolean f66751b;

    /* renamed from: c */
    public boolean f66752c;

    /* renamed from: com.my.target.db$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25713a {
        /* renamed from: a */
        void mo43497a(boolean z);
    }

    public C25712db(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m43994a() {
        boolean z;
        InterfaceC25713a interfaceC25713a = this.f66750a;
        if (interfaceC25713a == null) {
            return;
        }
        if (m43992b()) {
            z = true;
        } else if (this.f66752c) {
            return;
        } else {
            z = false;
        }
        interfaceC25713a.mo43497a(z);
    }

    /* renamed from: b */
    public boolean m43992b() {
        if (this.f66751b && this.f66752c) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m43993a(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m43993a(false);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f66752c = z;
        m43994a();
    }

    public void setStateChangedListener(@Nullable InterfaceC25713a interfaceC25713a) {
        this.f66750a = interfaceC25713a;
    }

    /* renamed from: a */
    public final void m43993a(boolean z) {
        this.f66751b = z;
        this.f66752c = hasWindowFocus();
        m43994a();
    }
}
