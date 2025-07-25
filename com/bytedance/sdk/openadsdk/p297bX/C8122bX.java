package com.bytedance.sdk.openadsdk.p297bX;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.InterfaceC8530Ja;
import com.bytedance.sdk.openadsdk.p297bX.DialogC8108PX;
import com.bytedance.sdk.openadsdk.p297bX.DialogC8134eqN;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.bX */
/* loaded from: classes3.dex */
public class C8122bX implements InterfaceC8530Ja {

    /* renamed from: IL */
    private final Context f17787IL;

    /* renamed from: bX */
    private DialogC8134eqN f17788bX;

    /* renamed from: bg */
    public DialogC8108PX f17789bg;
    private boolean eqN;

    /* renamed from: zx */
    private InterfaceC8530Ja.InterfaceC8531bg f17790zx;

    public C8122bX(Context context, String str, List<FilterWord> list, String str2, String str3) {
        if (!(context instanceof Activity)) {
            C7741PX.m87880IL("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f17787IL = context;
        m86976bg(str, list, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqN() {
        Context context = this.f17787IL;
        if ((context instanceof Activity) && (!((Activity) context).isFinishing()) && !this.f17789bg.isShowing()) {
            this.f17789bg.show();
        }
    }

    /* renamed from: bg */
    private void m86976bg(String str, List<FilterWord> list, String str2, String str3) {
        this.f17788bX = new DialogC8134eqN(this.f17787IL, str, list, str3);
        DialogC8108PX dialogC8108PX = new DialogC8108PX(this.f17787IL, this.f17788bX.getDislikeManager());
        this.f17789bg = dialogC8108PX;
        dialogC8108PX.m86991bg(str, str2);
        this.f17789bg.m86992bg(str3);
        this.f17789bg.m86994bg(new DialogC8108PX.InterfaceC8114bg() { // from class: com.bytedance.sdk.openadsdk.bX.bX.1
            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8108PX.InterfaceC8114bg
            /* renamed from: IL */
            public void mo86840IL() {
                C8122bX.this.mo85842bg();
            }

            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8108PX.InterfaceC8114bg
            /* renamed from: bX */
            public void mo86839bX() {
                C8122bX.this.mo85842bg();
            }

            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8108PX.InterfaceC8114bg
            /* renamed from: bg */
            public void mo86838bg() {
            }

            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8108PX.InterfaceC8114bg
            /* renamed from: bg */
            public void mo86837bg(int i, FilterWord filterWord, String str4) {
                C8122bX.this.f17788bX.onSuggestionSubmit(str4);
                C8122bX.this.mo85842bg();
            }
        });
        this.f17788bX.m86944bg(new DialogC8134eqN.InterfaceC8137bg() { // from class: com.bytedance.sdk.openadsdk.bX.bX.2
            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8134eqN.InterfaceC8137bg
            /* renamed from: IL */
            public void mo86941IL() {
                C7741PX.m87873bg("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (C8122bX.this.f17790zx != null) {
                        C8122bX.this.f17790zx.mo85840bg();
                    }
                } catch (Throwable th) {
                    C7741PX.m87871bg("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8134eqN.InterfaceC8137bg
            /* renamed from: bg */
            public void mo86940bg() {
                C8122bX.this.m86975bg(true);
                if (C8122bX.this.f17788bX != null && C8122bX.this.f17788bX.isShowing()) {
                    C8122bX.this.f17788bX.hide();
                }
                C8122bX.this.eqN();
            }

            @Override // com.bytedance.sdk.openadsdk.p297bX.DialogC8134eqN.InterfaceC8137bg
            /* renamed from: bg */
            public void mo86939bg(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && C8122bX.this.f17790zx != null) {
                        C8122bX.this.f17790zx.mo85839bg(i, filterWord.getName());
                    }
                    C7741PX.m87873bg("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + filterWord.getName());
                } catch (Throwable th) {
                    C7741PX.m87871bg("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8530Ja
    /* renamed from: IL */
    public void mo85843IL() {
        DialogC8134eqN dialogC8134eqN = this.f17788bX;
        if (dialogC8134eqN != null) {
            dialogC8134eqN.destroy();
        }
    }

    /* renamed from: bX */
    public boolean m86980bX() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8530Ja
    /* renamed from: bg */
    public void mo85842bg() {
        Context context = this.f17787IL;
        if (!((context instanceof Activity) && !((Activity) context).isFinishing()) || this.f17788bX.isShowing()) {
            return;
        }
        this.f17788bX.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8530Ja
    /* renamed from: bg */
    public void mo85841bg(InterfaceC8530Ja.InterfaceC8531bg interfaceC8531bg) {
        this.f17790zx = interfaceC8531bg;
    }

    /* renamed from: bg */
    public void m86977bg(String str) {
        DialogC8134eqN dialogC8134eqN = this.f17788bX;
        if (dialogC8134eqN != null) {
            dialogC8134eqN.m86942bg(str);
        }
    }

    /* renamed from: bg */
    public void m86975bg(boolean z) {
        this.eqN = z;
    }
}
