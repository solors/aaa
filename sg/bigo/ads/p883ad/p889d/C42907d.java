package sg.bigo.ads.p883ad.p889d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.AbstractC43831n;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.p883ad.p889d.AbstractC42911f;

/* renamed from: sg.bigo.ads.ad.d.d */
/* loaded from: classes10.dex */
public final class C42907d {

    /* renamed from: a */
    public TextView f112365a;

    /* renamed from: b */
    public TextView f112366b;

    /* renamed from: c */
    public ViewGroup f112367c;

    /* renamed from: d */
    public AbstractC42911f.InterfaceC42916a f112368d;

    /* renamed from: e */
    public AbstractC43831n f112369e;

    /* renamed from: f */
    boolean f112370f;

    /* renamed from: a */
    public final void m6380a() {
        AbstractC43831n abstractC43831n = this.f112369e;
        if (abstractC43831n != null) {
            abstractC43831n.m4862b();
            this.f112370f = false;
        }
    }

    /* renamed from: a */
    public final void m6379a(ViewGroup viewGroup, int i, AbstractC42911f.InterfaceC42916a interfaceC42916a) {
        if (viewGroup == null) {
            return;
        }
        this.f112370f = false;
        this.f112368d = interfaceC42916a;
        this.f112367c = (ViewGroup) viewGroup.findViewById(C42750R.C42753id.inter_popup_close_btn);
        this.f112365a = (TextView) viewGroup.findViewById(C42750R.C42753id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(C42750R.C42753id.second_text);
        this.f112366b = textView;
        ViewGroup viewGroup2 = this.f112367c;
        if (viewGroup2 == null || this.f112365a == null || textView == null) {
            AbstractC42911f.InterfaceC42916a interfaceC42916a2 = this.f112368d;
            if (interfaceC42916a2 != null) {
                interfaceC42916a2.mo6362c_();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC42911f.InterfaceC42916a interfaceC42916a3 = C42907d.this.f112368d;
                if (interfaceC42916a3 != null) {
                    interfaceC42916a3.mo6362c_();
                }
            }
        });
        this.f112367c.setClickable(false);
        this.f112365a.setTextColor(1728053247);
        this.f112366b.setVisibility(0);
        AbstractC43831n abstractC43831n = new AbstractC43831n(i * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4864a() {
                C42907d c42907d = C42907d.this;
                c42907d.f112370f = true;
                c42907d.f112367c.setAlpha(1.0f);
                C42907d.this.f112367c.setClickable(true);
                C42907d.this.f112366b.setVisibility(8);
                C42907d.this.f112365a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.AbstractC43831n
            /* renamed from: a */
            public final void mo4863a(long j) {
                C42907d.this.f112366b.setText(C43836q.m4830a("%ds", Integer.valueOf(Math.round(((float) j) / 1000.0f))));
            }
        };
        this.f112369e = abstractC43831n;
        abstractC43831n.m4861c();
    }
}
