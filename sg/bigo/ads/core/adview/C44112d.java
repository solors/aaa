package sg.bigo.ads.core.adview;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43818c;
import sg.bigo.ads.common.utils.C43839s;
import sg.bigo.ads.core.landing.C44230a;

/* renamed from: sg.bigo.ads.core.adview.d */
/* loaded from: classes10.dex */
public final class C44112d {

    /* renamed from: b */
    static volatile boolean f115771b = false;
    @NonNull

    /* renamed from: a */
    final C44113a f115772a;

    /* renamed from: sg.bigo.ads.core.adview.d$a */
    /* loaded from: classes10.dex */
    public static class C44113a {
        @NonNull

        /* renamed from: a */
        final ViewGroup f115773a;

        /* renamed from: b */
        String f115774b;

        /* renamed from: c */
        String f115775c;

        /* renamed from: d */
        String f115776d;

        /* renamed from: e */
        String f115777e;

        /* renamed from: f */
        String f115778f;

        /* renamed from: g */
        String f115779g;

        public C44113a(@NonNull ViewGroup viewGroup) {
            this.f115773a = viewGroup;
        }
    }

    /* renamed from: sg.bigo.ads.core.adview.d$b */
    /* loaded from: classes10.dex */
    class DialogC44114b extends Dialog {
        public DialogC44114b(Context context) {
            super(context, C42750R.C42756style.Dialog_FullScreen);
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public final void dismiss() {
            super.dismiss();
            C44112d.m3945a();
        }

        @Override // android.app.Dialog
        protected final void onCreate(Bundle bundle) {
            View findViewById;
            super.onCreate(bundle);
            View m4954a = C43810a.m4954a(getContext(), C42750R.C42754layout.bigo_ad_optionview_feedback, null, false);
            setContentView(m4954a);
            C44112d.m3944a(getWindow());
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115774b)) {
                View findViewById2 = findViewById(C42750R.C42753id.btn_why_this_ad);
                findViewById2.setVisibility(0);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C44230a.m3572b(view.getContext(), C44112d.this.f115772a.f115774b);
                        DialogC44114b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115775c)) {
                final View findViewById3 = findViewById(C42750R.C42753id.btn_copy_ru_ad_marker);
                if (findViewById3 != null) {
                    TextView textView = (TextView) findViewById3.findViewById(C42750R.C42753id.bigo_ad_text_copy_ru_ad_marker);
                    if (textView != null) {
                        textView.setText(C43810a.m4952a(getContext(), C42750R.C42755string.bigo_ad_feedback_copy_ad_id, C44112d.this.f115772a.f115775c));
                    }
                    findViewById3.setVisibility(0);
                    findViewById3.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            if (C43818c.m4926g(findViewById3.getContext(), C44112d.this.f115772a.f115775c)) {
                                Toast.makeText(findViewById3.getContext(), C43810a.m4952a(findViewById3.getContext(), C42750R.C42755string.bigo_ad_feedback_copied, new Object[0]), 0).show();
                            }
                            DialogC44114b.this.dismiss();
                        }
                    });
                }
                if (findViewById3 != null && (findViewById = findViewById3.findViewById(C42750R.C42753id.line)) != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115776d)) {
                findViewById(C42750R.C42753id.ll_ad_info).setVisibility(0);
                ((TextView) findViewById(C42750R.C42753id.tv_ad_info)).setText(C44112d.this.f115772a.f115776d);
            }
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115777e)) {
                View findViewById4 = findViewById(C42750R.C42753id.btn_ad_copy_link);
                findViewById4.setVisibility(0);
                final Context context = findViewById4.getContext();
                findViewById4.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (C43818c.m4926g(context, C44112d.this.f115772a.f115777e)) {
                            Context context2 = context;
                            Toast.makeText(context2, C43810a.m4952a(context2, C42750R.C42755string.bigo_ad_feedback_link_copied, new Object[0]), 0).show();
                        }
                        DialogC44114b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115778f)) {
                View findViewById5 = findViewById(C42750R.C42753id.bigo_ad_btn_rec_rule);
                findViewById5.setVisibility(0);
                findViewById5.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C44230a.m3572b(view.getContext(), C44112d.this.f115772a.f115778f);
                        DialogC44114b.this.dismiss();
                    }
                });
            }
            if (!TextUtils.isEmpty(C44112d.this.f115772a.f115779g)) {
                View findViewById6 = findViewById(C42750R.C42753id.bigo_ad_btn_user_privacy);
                findViewById6.setVisibility(0);
                findViewById6.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C44230a.m3572b(view.getContext(), C44112d.this.f115772a.f115779g);
                        DialogC44114b.this.dismiss();
                    }
                });
            }
            m4954a.findViewById(C42750R.C42753id.background).setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.d.b.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogC44114b.this.dismiss();
                }
            });
        }
    }

    private C44112d(@NonNull C44113a c44113a) {
        this.f115772a = c44113a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C44112d(C44113a c44113a, byte b) {
        this(c44113a);
    }

    /* renamed from: a */
    static /* synthetic */ void m3944a(Window window) {
        if (window != null) {
            C43839s.m4814a(window);
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m3945a() {
        f115771b = false;
        return false;
    }
}
