package sg.bigo.ads.common.form.render.p913a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Map;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.common.form.C43634a;
import sg.bigo.ads.common.form.render.C43641a;
import sg.bigo.ads.common.form.render.p913a.AbstractC43642a;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.C43881b;

/* renamed from: sg.bigo.ads.common.form.render.a.d */
/* loaded from: classes10.dex */
public final class C43648d extends AbstractC43642a {
    public C43648d(InterfaceC43518e.C43521c c43521c, Map<String, Object> map, Context context, AbstractC43642a.InterfaceC43643a interfaceC43643a) {
        super(c43521c, map, context, interfaceC43643a);
    }

    @Override // sg.bigo.ads.common.form.render.p913a.AbstractC43642a
    /* renamed from: a */
    public final void mo5266a(int i) {
        int m5276a = C43641a.m5276a();
        int m5274b = C43641a.m5274b();
        boolean z = false;
        if (i != 2 && i == 3) {
            m5276a = -45718;
            z = true;
            m5274b = -45718;
        }
        m5272a(m5276a, m5274b, z);
    }

    @Override // sg.bigo.ads.common.form.render.p913a.AbstractC43642a
    /* renamed from: b */
    public final View mo5265b() {
        boolean z;
        int i;
        View m4954a = C43810a.m4954a(this.f114247h, C43641a.m5275a(6), null, false);
        this.f114248i = m4954a;
        if (m4954a == null) {
            return null;
        }
        AbstractC43642a.m5271a((TextView) m4954a.findViewById(C42750R.C42753id.edit_title), this.f114243d);
        mo5266a(1);
        final RadioGroup radioGroup = (RadioGroup) this.f114248i.findViewById(C42750R.C42753id.edit_content);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                    radioGroup.requestFocus();
                    RadioButton radioButton = (RadioButton) radioGroup2.findViewById(i2);
                    C43648d.this.mo5266a(2);
                    if (radioButton != null) {
                        radioButton.setTextColor(-16736769);
                        C43648d.this.f114242c = radioButton.getText().toString();
                        C43648d c43648d = C43648d.this;
                        AbstractC43642a.InterfaceC43643a interfaceC43643a = c43648d.f114249j;
                        if (interfaceC43643a != null) {
                            interfaceC43643a.mo5268a(c43648d.f114244e, c43648d.f114242c);
                        }
                    }
                }
            });
            if (this.f114246g.length != 0) {
                String m5286a = C43634a.m5286a(this.f114244e, this.f114241b);
                CompoundButton compoundButton = null;
                int i2 = 0;
                while (true) {
                    String[] strArr = this.f114246g;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    String str = strArr[i2];
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CompoundButton c43881b = new C43881b(this.f114247h);
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    if (!z) {
                        marginLayoutParams.topMargin = C43822e.m4906a(this.f114247h, 8);
                    }
                    c43881b.setLayoutParams(marginLayoutParams);
                    c43881b.setPadding(C43822e.m4906a(this.f114247h, 12), C43822e.m4906a(this.f114247h, 10), C43822e.m4906a(this.f114247h, 12), C43822e.m4906a(this.f114247h, 11));
                    c43881b.setTextSize(13.0f);
                    AbstractC43642a.m5271a(c43881b, str);
                    c43881b.setButtonDrawable((Drawable) null);
                    Context context = this.f114247h;
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    if (C43641a.f114239a) {
                        i = -15524570;
                    } else {
                        i = -657158;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setColor(i);
                    gradientDrawable.setCornerRadius(C43822e.m4906a(context, 4));
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setColor(i);
                    gradientDrawable2.setCornerRadius(C43822e.m4906a(context, 4));
                    gradientDrawable2.setStroke(1, -16736769);
                    stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                    stateListDrawable.addState(new int[]{16842912}, gradientDrawable2);
                    c43881b.setBackground(stateListDrawable);
                    c43881b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sg.bigo.ads.common.form.render.a.d.2
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton2, boolean z2) {
                            int m5274b;
                            if (z2) {
                                m5274b = -16736769;
                            } else {
                                m5274b = C43641a.m5274b();
                            }
                            compoundButton2.setTextColor(m5274b);
                        }
                    });
                    c43881b.setTextColor(C43641a.m5274b());
                    if (!C43836q.m4837a((CharSequence) m5286a) && m5286a.equalsIgnoreCase(this.f114246g[i2])) {
                        AbstractC43642a.InterfaceC43643a interfaceC43643a = this.f114249j;
                        if (interfaceC43643a != null) {
                            interfaceC43643a.mo5268a(this.f114240a.f114035d, m5286a);
                        }
                        this.f114242c = m5286a;
                        compoundButton = c43881b;
                    }
                    C43841u.m4801a(c43881b, radioGroup, null, -1);
                    i2++;
                }
                if (compoundButton != null) {
                    compoundButton.setChecked(true);
                }
            }
        }
        return this.f114248i;
    }
}
