package sg.bigo.ads.core.adview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.AbstractC43512a;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43818c;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.adview.C44112d;

/* renamed from: sg.bigo.ads.core.adview.b */
/* loaded from: classes10.dex */
public final class C44109b extends AbstractC44111c {
    public C44109b(@NonNull AbstractC43512a<?> abstractC43512a) {
        super(abstractC43512a);
    }

    /* renamed from: a */
    public final void m3947a(InterfaceC43550c interfaceC43550c, final String str) {
        String str2;
        final String str3;
        final String str4;
        final String str5;
        final String str6;
        if (interfaceC43550c == null) {
            return;
        }
        this.f115770a.removeAllViews();
        InterfaceC43550c.InterfaceC43555e mo4405B = interfaceC43550c.mo4405B();
        AdImageView adImageView = new AdImageView(this.f115770a.getContext());
        adImageView.setIconTag(true);
        String str7 = "";
        if (mo4405B == null) {
            str2 = "";
        } else {
            str2 = mo4405B.mo4214a();
        }
        if (mo4405B == null) {
            str3 = "";
        } else {
            str3 = mo4405B.mo4213b();
        }
        if (mo4405B == null) {
            str4 = "";
        } else {
            str4 = mo4405B.mo4211d();
        }
        if (mo4405B == null) {
            str5 = "";
        } else {
            str5 = mo4405B.mo4210e();
        }
        if (mo4405B == null) {
            str6 = "";
        } else {
            str6 = mo4405B.mo4208g();
        }
        if (mo4405B != null) {
            str7 = mo4405B.mo4207h();
        }
        final String str8 = str7;
        adImageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str9;
                AbstractC43512a<?> abstractC43512a = C44109b.this.f115770a;
                String str10 = str3;
                String str11 = str;
                String str12 = str4;
                String str13 = str5;
                String str14 = str6;
                String str15 = str8;
                if (!TextUtils.isEmpty(str10) || !TextUtils.isEmpty(str12) || !TextUtils.isEmpty(str13) || !TextUtils.isEmpty(str11) || !TextUtils.isEmpty(str14) || !TextUtils.isEmpty(str15)) {
                    C44112d.C44113a c44113a = new C44112d.C44113a(abstractC43512a);
                    c44113a.f115774b = str10;
                    c44113a.f115775c = str11;
                    c44113a.f115776d = str12;
                    c44113a.f115777e = str13;
                    c44113a.f115778f = str14;
                    c44113a.f115779g = str15;
                    C44112d c44112d = new C44112d(c44113a, (byte) 0);
                    Activity m4933a = C43818c.m4933a(c44112d.f115772a.f115773a);
                    if (m4933a == null) {
                        str9 = "Cannot find Activity from container view";
                    } else if (C44112d.f115771b) {
                        str9 = "Feedback dialog is showing. Cannot show again.";
                    } else {
                        C44112d.DialogC44114b dialogC44114b = new C44112d.DialogC44114b(m4933a);
                        if (!C43836q.m4837a((CharSequence) c44112d.f115772a.f115774b) || !C43836q.m4837a((CharSequence) c44112d.f115772a.f115775c) || !C43836q.m4837a((CharSequence) c44112d.f115772a.f115776d) || !C43836q.m4837a((CharSequence) c44112d.f115772a.f115777e) || !C43836q.m4837a((CharSequence) c44112d.f115772a.f115778f) || !C43836q.m4837a((CharSequence) c44112d.f115772a.f115779g)) {
                            dialogC44114b.show();
                            C44112d.f115771b = true;
                            return;
                        }
                        return;
                    }
                    C43782a.m5007b("Feedback", str9);
                }
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            adImageView.m4786a(str2, interfaceC43550c.mo4359al());
            adImageView.setLayoutParams(new FrameLayout.LayoutParams(C43822e.m4906a(this.f115770a.getContext(), 16), C43822e.m4906a(this.f115770a.getContext(), 16), 17));
            adImageView.setTag("ad_options_real_view");
            mo3940a(adImageView);
            return;
        }
        this.f115770a.setVisibility(8);
    }
}
