package com.p551my.target;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;

/* renamed from: com.my.target.k */
/* loaded from: classes7.dex */
public class DialogC25852k extends Dialog {

    /* renamed from: a */
    public final InterfaceC25853a f67071a;

    /* renamed from: com.my.target.k$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25853a {
        /* renamed from: a */
        void mo42472a(DialogC25852k dialogC25852k, FrameLayout frameLayout);

        /* renamed from: b */
        void mo42461b(boolean z);

        /* renamed from: q */
        void mo42448q();
    }

    public DialogC25852k(InterfaceC25853a interfaceC25853a, Context context) {
        super(context);
        this.f67071a = interfaceC25853a;
    }

    /* renamed from: a */
    public static DialogC25852k m43670a(InterfaceC25853a interfaceC25853a, Context context) {
        return new DialogC25852k(interfaceC25853a, context);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f67071a.mo42448q();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        setContentView(frameLayout);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        this.f67071a.mo42472a(this, frameLayout);
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f67071a.mo42461b(z);
        super.onWindowFocusChanged(z);
    }
}
