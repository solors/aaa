package com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32284cicc2iiccc;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coo2iico */
/* loaded from: classes8.dex */
public class DialogC32520coo2iico extends Dialog {
    private InterfaceC32521c2oc2i c2oc2i;
    private int cioccoiococ;
    private InterfaceC32522cioccoiococ coi222o222;
    private Context coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    public interface InterfaceC32521c2oc2i {
        void coo2iico();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coo2iico$cioccoiococ */
    /* loaded from: classes8.dex */
    public interface InterfaceC32522cioccoiococ {
        void coo2iico();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccci2.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public class View$OnClickListenerC32523coi222o222 implements View.OnClickListener {
        private View$OnClickListenerC32523coi222o222() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == C32065R.C32068id.btn_player_close_confirm) {
                if (DialogC32520coo2iico.this.coi222o222 != null) {
                    DialogC32520coo2iico.this.coi222o222.coo2iico();
                }
            } else if (view.getId() == C32065R.C32068id.btn_player_close_cancel) {
                DialogC32520coo2iico.this.dismiss();
                if (DialogC32520coo2iico.this.c2oc2i != null) {
                    DialogC32520coo2iico.this.c2oc2i.coo2iico();
                }
            }
        }
    }

    public DialogC32520coo2iico(@NonNull Context context) {
        super(context, C32065R.C32071style.columbus_player_reward_dialog);
        this.cioccoiococ = -1;
        this.coo2iico = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        coo2iico();
    }

    public DialogC32520coo2iico coo2iico(InterfaceC32522cioccoiococ interfaceC32522cioccoiococ) {
        this.coi222o222 = interfaceC32522cioccoiococ;
        return this;
    }

    public DialogC32520coo2iico coo2iico(InterfaceC32521c2oc2i interfaceC32521c2oc2i) {
        this.c2oc2i = interfaceC32521c2oc2i;
        return this;
    }

    public DialogC32520coo2iico(@NonNull Context context, int i) {
        super(context, C32065R.C32071style.columbus_player_reward_dialog);
        this.coo2iico = context;
        this.cioccoiococ = i;
    }

    public void coo2iico() {
        View inflate = LayoutInflater.from(this.coo2iico).inflate(C32065R.C32069layout.columbus_player_reward_close_dialog, (ViewGroup) null);
        setContentView(inflate);
        TextView textView = (TextView) inflate.findViewById(C32065R.C32068id.tv_title);
        Button button = (Button) inflate.findViewById(C32065R.C32068id.btn_player_close_confirm);
        Button button2 = (Button) inflate.findViewById(C32065R.C32068id.btn_player_close_cancel);
        if (this.cioccoiococ == 1) {
            textView.setText(this.coo2iico.getResources().getString(C32065R.C32070string.columbus_player_speed_title));
            button.setText(this.coo2iico.getResources().getString(C32065R.C32070string.columbus_player_speed_video));
        }
        button.setOnClickListener(new View$OnClickListenerC32523coi222o222());
        button2.setOnClickListener(new View$OnClickListenerC32523coi222o222());
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
}
