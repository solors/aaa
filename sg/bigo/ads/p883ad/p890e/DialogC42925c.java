package sg.bigo.ads.p883ad.p890e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43810a;

/* renamed from: sg.bigo.ads.ad.e.c */
/* loaded from: classes10.dex */
final class DialogC42925c extends Dialog {

    /* renamed from: a */
    private InterfaceC42929a f112396a;

    /* renamed from: sg.bigo.ads.ad.e.c$a */
    /* loaded from: classes10.dex */
    interface InterfaceC42929a {
        /* renamed from: a */
        void mo6328a();

        /* renamed from: b */
        void mo6327b();

        /* renamed from: c */
        void mo6326c();

        /* renamed from: d */
        void mo6325d();
    }

    public DialogC42925c(@NonNull Context context) {
        super(context, C42750R.C42756style.BigoAd_Dialog_Fullscreen);
        setCanceledOnTouchOutside(true);
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View m4954a = C43810a.m4954a(getContext(), C42750R.C42754layout.bigo_ad_dialog_reward_retain, null, false);
        setContentView(m4954a);
        m4954a.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC42925c.this.dismiss();
            }
        });
        m4954a.findViewById(C42750R.C42753id.btn_resume).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (DialogC42925c.this.f112396a != null) {
                    DialogC42925c.this.f112396a.mo6325d();
                }
                DialogC42925c.this.dismiss();
            }
        });
        m4954a.findViewById(C42750R.C42753id.btn_skip).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.e.c.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (DialogC42925c.this.f112396a != null) {
                    DialogC42925c.this.f112396a.mo6326c();
                }
                DialogC42925c.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        InterfaceC42929a interfaceC42929a = this.f112396a;
        if (interfaceC42929a != null) {
            interfaceC42929a.mo6328a();
        }
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        InterfaceC42929a interfaceC42929a = this.f112396a;
        if (interfaceC42929a != null) {
            interfaceC42929a.mo6327b();
            this.f112396a = null;
        }
    }

    /* renamed from: a */
    public final void m6357a(InterfaceC42929a interfaceC42929a) {
        this.f112396a = interfaceC42929a;
        getWindow().setFlags(8, 8);
        super.show();
        getWindow().getDecorView().setSystemUiVisibility(5894);
        getWindow().clearFlags(8);
    }
}
