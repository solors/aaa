package com.bytedance.sdk.openadsdk.p297bX;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.eqN */
/* loaded from: classes3.dex */
public class DialogC8134eqN extends TTDislikeDialogAbstract {
    private InterfaceC8137bg eqN;

    /* renamed from: zx */
    private String f17816zx;

    /* renamed from: com.bytedance.sdk.openadsdk.bX.eqN$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8137bg {
        /* renamed from: IL */
        void mo86941IL();

        /* renamed from: bg */
        void mo86940bg();

        /* renamed from: bg */
        void mo86939bg(int i, FilterWord filterWord);
    }

    public DialogC8134eqN(Context context, String str, List<FilterWord> list, String str2) {
        super(context, C7730Fy.ldr(context, "tt_dislikeDialog"), str2);
        this.f17244bg = str;
        this.f17242IL = list;
    }

    /* renamed from: IL */
    private void m86946IL() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.bX.eqN.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (DialogC8134eqN.this.eqN != null) {
                    InterfaceC8137bg unused = DialogC8134eqN.this.eqN;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.bX.eqN.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (DialogC8134eqN.this.eqN != null) {
                    DialogC8134eqN.this.eqN.mo86941IL();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(ZQc.m82538bX(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new C8116WR(getContext(), this.f17243bX, this.f17242IL);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            m86945bg();
            m86946IL();
            setMaterialMeta(this.f17244bg, this.f17242IL);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    /* renamed from: bg */
    public void m86944bg(InterfaceC8137bg interfaceC8137bg) {
        this.eqN = interfaceC8137bg;
    }

    /* renamed from: bg */
    public void m86942bg(String str) {
        this.f17816zx = str;
    }

    @Override // com.bytedance.sdk.openadsdk.p297bX.C8126eo.InterfaceC8130IL
    /* renamed from: bg */
    public void mo86844bg(int i) {
        FilterWord m86971IL;
        if (C8126eo.f17797bX == i) {
            dismiss();
        } else if (C8126eo.f17799zx == i) {
            InterfaceC8137bg interfaceC8137bg = this.eqN;
            if (interfaceC8137bg != null) {
                interfaceC8137bg.mo86940bg();
            }
        } else if (C8126eo.f17796IL != i || (m86971IL = this.f17243bX.m86971IL()) == null || C8126eo.f17798bg.equals(m86971IL)) {
        } else {
            InterfaceC8137bg interfaceC8137bg2 = this.eqN;
            if (interfaceC8137bg2 != null) {
                try {
                    interfaceC8137bg2.mo86939bg(0, m86971IL);
                } catch (Throwable unused) {
                }
            }
            dismiss();
        }
    }

    /* renamed from: bg */
    private void m86945bg() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
