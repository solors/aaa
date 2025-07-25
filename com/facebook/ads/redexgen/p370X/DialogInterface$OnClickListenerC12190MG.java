package com.facebook.ads.redexgen.p370X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.MG */
/* loaded from: assets/audience_network.dex */
public class DialogInterface$OnClickListenerC12190MG implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C12769Vd A01;

    public DialogInterface$OnClickListenerC12190MG(C12769Vd c12769Vd, EditText editText) {
        this.A01 = c12769Vd;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C12770Ve(this, dialogInterface));
    }
}
