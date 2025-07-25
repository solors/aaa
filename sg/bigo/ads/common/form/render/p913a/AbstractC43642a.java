package sg.bigo.ads.common.form.render.p913a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.common.form.C43634a;
import sg.bigo.ads.common.form.render.C43641a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.form.render.a.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43642a {
    @NonNull

    /* renamed from: a */
    protected InterfaceC43518e.C43521c f114240a;
    @Nullable

    /* renamed from: b */
    protected Map<String, Object> f114241b;

    /* renamed from: c */
    protected String f114242c;

    /* renamed from: d */
    protected String f114243d;

    /* renamed from: e */
    protected String f114244e;

    /* renamed from: f */
    protected int f114245f;

    /* renamed from: g */
    protected String[] f114246g;

    /* renamed from: h */
    protected Context f114247h;

    /* renamed from: i */
    protected View f114248i;

    /* renamed from: j */
    protected InterfaceC43643a f114249j;

    /* renamed from: sg.bigo.ads.common.form.render.a.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43643a {
        /* renamed from: a */
        void mo5268a(String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC43642a(@NonNull InterfaceC43518e.C43521c c43521c, @Nullable Map<String, Object> map, @NonNull Context context, InterfaceC43643a interfaceC43643a) {
        this.f114247h = context;
        this.f114240a = c43521c;
        this.f114241b = map;
        this.f114243d = c43521c.f114032a;
        this.f114244e = c43521c.f114035d;
        this.f114245f = c43521c.f114033b;
        this.f114246g = c43521c.f114034c;
        this.f114249j = interfaceC43643a;
    }

    /* renamed from: a */
    public void mo5266a(int i) {
        int m5276a = C43641a.m5276a();
        int m5274b = C43641a.m5274b();
        boolean z = false;
        if (i != 2) {
            if (i == 3) {
                m5276a = -45718;
                z = true;
            }
            m5272a(m5276a, m5274b, z);
        }
        m5276a = -16736769;
        m5274b = m5276a;
        m5272a(m5276a, m5274b, z);
    }

    /* renamed from: b */
    public abstract View mo5265b();

    /* renamed from: c */
    public final View m5270c() {
        return this.f114248i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m5272a(int i, int i2, boolean z) {
        View view = this.f114248i;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(C42750R.C42753id.edit_content);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(C43822e.m4906a(this.f114247h, 1), i);
            gradientDrawable.setCornerRadius(C43822e.m4906a(this.f114247h, 8));
            findViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.f114248i.findViewById(C42750R.C42753id.edit_warning);
        if (textView != null) {
            textView.setText(C43634a.m5287a(this.f114247h, C42750R.C42755string.form_warning));
            textView.setVisibility(z ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f114248i.findViewById(C42750R.C42753id.edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5271a(TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    /* renamed from: a */
    public final boolean m5273a() {
        boolean m4837a = C43836q.m4837a((CharSequence) this.f114242c);
        if (this.f114240a.f114033b == 3) {
            m4837a = !C43836q.m4820g(this.f114242c);
        }
        mo5266a(m4837a ? 3 : 1);
        return m4837a;
    }
}
