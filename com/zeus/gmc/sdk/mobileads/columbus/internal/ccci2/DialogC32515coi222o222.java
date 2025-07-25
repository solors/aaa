package com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32284cicc2iiccc;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coi222o222 */
/* loaded from: classes8.dex */
public class DialogC32515coi222o222 extends Dialog {
    private InterfaceC32517cioccoiococ c2oc2i;
    private InterfaceC32516c2oc2i cioccoiococ;
    private int coi222o222;
    private Context coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coi222o222$c2oc2i */
    /* loaded from: classes8.dex */
    public interface InterfaceC32516c2oc2i {
        void coo2iico();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coi222o222$cioccoiococ */
    /* loaded from: classes8.dex */
    public interface InterfaceC32517cioccoiococ {
        void coo2iico();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coi222o222$coi222o222 */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC32518coi222o222 implements View.OnClickListener {
        private View$OnClickListenerC32518coi222o222() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == C32065R.C32068id.btn_player_close_confirm) {
                if (DialogC32515coi222o222.this.c2oc2i != null) {
                    DialogC32515coi222o222.this.c2oc2i.coo2iico();
                }
            } else if (view.getId() == C32065R.C32068id.btn_player_close_cancel) {
                DialogC32515coi222o222.this.dismiss();
                if (DialogC32515coi222o222.this.cioccoiococ != null) {
                    DialogC32515coi222o222.this.cioccoiococ.coo2iico();
                }
            }
        }
    }

    public DialogC32515coi222o222(@NonNull Context context, int i) {
        super(context, C32065R.C32071style.columbus_player_reward_dialog);
        this.coo2iico = context;
        this.coi222o222 = i;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        coo2iico();
    }

    public DialogC32515coi222o222 coo2iico(InterfaceC32517cioccoiococ interfaceC32517cioccoiococ) {
        this.c2oc2i = interfaceC32517cioccoiococ;
        return this;
    }

    public DialogC32515coi222o222 coo2iico(InterfaceC32516c2oc2i interfaceC32516c2oc2i) {
        this.cioccoiococ = interfaceC32516c2oc2i;
        return this;
    }

    public void coo2iico() {
        View inflate = LayoutInflater.from(this.coo2iico).inflate(C32065R.C32069layout.columbus_player_reward_style_close_dialog, (ViewGroup) null);
        setContentView(inflate);
        Button button = (Button) inflate.findViewById(C32065R.C32068id.btn_player_close_confirm);
        Button button2 = (Button) inflate.findViewById(C32065R.C32068id.btn_player_close_cancel);
        try {
            if (this.coi222o222 != 0) {
                ((GradientDrawable) button2.getBackground()).setColor(this.coi222o222);
                if (coo2iico(this.coi222o222)) {
                    button2.setTextColor(ViewCompat.MEASURED_STATE_MASK);
                } else {
                    button2.setTextColor(-1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        button.setOnClickListener(new View$OnClickListenerC32518coi222o222());
        button2.setOnClickListener(new View$OnClickListenerC32518coi222o222());
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int ccoc2oic = C32284cicc2iiccc.ccoc2oic(this.coo2iico);
        if (C32284cicc2iiccc.ciii2coi2(this.coo2iico) > ccoc2oic) {
            attributes.width = (int) (ccoc2oic * 0.92d);
        } else {
            attributes.width = (int) (ccoc2oic * 0.5d);
        }
        window.setAttributes(attributes);
    }

    private boolean coo2iico(@ColorInt int i) {
        return ColorUtils.calculateLuminance(i) >= 0.5d;
    }
}
