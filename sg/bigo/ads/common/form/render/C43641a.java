package sg.bigo.ads.common.form.render;

import sg.bigo.ads.C42750R;

/* renamed from: sg.bigo.ads.common.form.render.a */
/* loaded from: classes10.dex */
public final class C43641a {

    /* renamed from: a */
    public static boolean f114239a;

    /* renamed from: a */
    public static int m5276a() {
        return f114239a ? -12957095 : -2234903;
    }

    /* renamed from: b */
    public static int m5274b() {
        if (f114239a) {
            return -2431246;
        }
        return -14275021;
    }

    /* renamed from: a */
    public static int m5275a(int i) {
        switch (i) {
            case 1:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_content_dark : C42750R.C42754layout.bigo_ad_form_content;
            case 2:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_fill_question_dark : C42750R.C42754layout.bigo_ad_form_fill_question;
            case 3:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_layout_dark : C42750R.C42754layout.bigo_ad_form_layout;
            case 4:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_notice_privacy_dark : C42750R.C42754layout.bigo_ad_form_notice_privacy;
            case 5:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_question_dark : C42750R.C42754layout.bigo_ad_form_question;
            case 6:
                return f114239a ? C42750R.C42754layout.bigo_ad_form_select_question_dark : C42750R.C42754layout.bigo_ad_form_select_question;
            case 7:
                return f114239a ? C42750R.C42754layout.bigo_ad_success_submit_dark : C42750R.C42754layout.bigo_ad_success_submit;
            default:
                return -1;
        }
    }
}
