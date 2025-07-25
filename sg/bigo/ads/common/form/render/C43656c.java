package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.api.p903a.InterfaceC43522f;
import sg.bigo.ads.common.form.C43634a;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.HeightScrollView;
import sg.bigo.ads.common.view.MixtureTextView;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* renamed from: sg.bigo.ads.common.form.render.c */
/* loaded from: classes10.dex */
public final class C43656c {

    /* renamed from: sg.bigo.ads.common.form.render.c$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43664a {
        /* renamed from: a */
        void mo5254a();

        /* renamed from: a */
        void mo5253a(String str);

        /* renamed from: b */
        void mo5252b();

        /* renamed from: b */
        void mo5251b(int i);

        /* renamed from: b */
        void mo5250b(String str);

        /* renamed from: c */
        void mo5249c();

        /* renamed from: c */
        void mo5248c(String str);
    }

    /* renamed from: a */
    private static double m5259a(int i, int i2) {
        if (i2 == 0) {
            return 1.0d;
        }
        double d = i / i2;
        return (d < 0.25d || d > 1.0d) ? d < 0.25d ? 0.25d : 1.0d : d;
    }

    /* renamed from: a */
    public static int m5258a(@NonNull Context context, @NonNull InterfaceC43518e interfaceC43518e) {
        InterfaceC43522f mo5387j = interfaceC43518e.mo5387j();
        if (mo5387j == null) {
            return 0;
        }
        return (int) (context.getResources().getDisplayMetrics().widthPixels * m5259a(mo5387j.mo5381b(), mo5387j.mo5382a()));
    }

    /* renamed from: a */
    public static PrivacyCheckBox m5257a(@NonNull View view, @NonNull InterfaceC43518e interfaceC43518e, @Nullable Map<String, Object> map, final InterfaceC43664a interfaceC43664a) {
        MixtureTextView mixtureTextView = (MixtureTextView) view.findViewById(C42750R.C42753id.inter_form_privacy_desc);
        final PrivacyCheckBox privacyCheckBox = (PrivacyCheckBox) view.findViewById(C42750R.C42753id.inter_form_check_box);
        TextView textView = (TextView) view.findViewById(C42750R.C42753id.privacy_notice);
        if (mixtureTextView == null || privacyCheckBox == null || textView == null) {
            return null;
        }
        textView.setText(C43634a.m5287a(textView.getContext(), C42750R.C42755string.form_privacy_notice));
        privacyCheckBox.m4767a(C43634a.m5285a(map));
        View findViewById = view.findViewById(C42750R.C42753id.check_box_expand);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PrivacyCheckBox privacyCheckBox2 = PrivacyCheckBox.this;
                    privacyCheckBox2.m4767a(!privacyCheckBox2.f114756a);
                }
            });
        }
        InterfaceC43518e.C43520b mo5385l = interfaceC43518e.mo5385l();
        String str = mo5385l != null ? mo5385l.f114030a : "";
        final String str2 = mo5385l != null ? mo5385l.f114031b : "";
        String replace = "  ".concat(String.valueOf(C43810a.m4947b(mixtureTextView.getContext(), C42750R.C42755string.form_privacy_content, C43634a.f114223b))).replace("{company_name}", str);
        final SpannableString spannableString = new SpannableString(replace);
        String[] strArr = {str, "BIGO"};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            spannableString.setSpan(new UnderlineSpan() { // from class: sg.bigo.ads.common.form.render.FormViewHelper$5
                @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                }
            }, replace.lastIndexOf(str3), replace.lastIndexOf(str3) + str3.length(), 33);
        }
        mixtureTextView.setText(spannableString);
        mixtureTextView.setClickListener(new MixtureTextView.InterfaceC43852a() { // from class: sg.bigo.ads.common.form.render.c.5
            @Override // sg.bigo.ads.common.view.MixtureTextView.InterfaceC43852a
            /* renamed from: a */
            public final void mo4771a(UnderlineSpan underlineSpan) {
                if (InterfaceC43664a.this != null && underlineSpan != null) {
                    if ("BIGO".equals(spannableString.subSequence(spannableString.getSpanStart(underlineSpan), spannableString.getSpanEnd(underlineSpan)).toString())) {
                        InterfaceC43664a.this.mo5250b("https://www.adsbigo.com/privacy.html");
                    } else {
                        InterfaceC43664a.this.mo5253a(str2);
                    }
                }
            }
        });
        return privacyCheckBox;
    }

    /* renamed from: a */
    private static void m5256a(@NonNull View view, @NonNull InterfaceC43518e interfaceC43518e, final InterfaceC43664a interfaceC43664a) {
        final InterfaceC43518e.C43519a mo5383n = interfaceC43518e.mo5383n();
        TextView textView = (TextView) view.findViewById(C42750R.C42753id.feedback_title);
        if (textView != null) {
            textView.setText(mo5383n.f114026a);
        }
        TextView textView2 = (TextView) view.findViewById(C42750R.C42753id.feedback_dec);
        if (textView2 != null) {
            textView2.setText(mo5383n.f114027b);
        }
        Button button = (Button) view.findViewById(C42750R.C42753id.feedback_cta);
        if (button != null) {
            button.setText(mo5383n.f114028c);
            button.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.form.render.c.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    InterfaceC43664a interfaceC43664a2 = InterfaceC43664a.this;
                    if (interfaceC43664a2 != null) {
                        interfaceC43664a2.mo5248c(mo5383n.f114029d);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5255a(@NonNull ViewGroup viewGroup, Context context, @NonNull InterfaceC43518e interfaceC43518e, InterfaceC43664a interfaceC43664a, int i) {
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C42750R.C42753id.submit_success_container);
        View m4954a = C43810a.m4954a(context, C43641a.m5275a(7), null, false);
        if (viewGroup2 == null || m4954a == null) {
            return;
        }
        C43841u.m4801a(m4954a, viewGroup2, null, -1);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C42750R.C42753id.inter_icon_layout);
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(4);
        }
        HeightScrollView heightScrollView = (HeightScrollView) viewGroup.findViewById(C42750R.C42753id.inter_form_scroll);
        if (heightScrollView != null) {
            heightScrollView.setVisibility(4);
        }
        m5256a(m4954a, interfaceC43518e, interfaceC43664a);
        if (interfaceC43664a == null || i == 5) {
            return;
        }
        interfaceC43664a.mo5251b(i);
    }
}
