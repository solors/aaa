package sg.bigo.ads.p883ad.interstitial;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.ad.interstitial.f */
/* loaded from: classes10.dex */
public final class C43205f {

    /* renamed from: a */
    public final int f113078a;

    /* renamed from: b */
    public final int f113079b;

    /* renamed from: c */
    public final String f113080c;

    /* renamed from: d */
    public final boolean f113081d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum a uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: sg.bigo.ads.ad.interstitial.f$a */
    /* loaded from: classes10.dex */
    public static final class EnumC43206a {

        /* renamed from: a */
        public static final EnumC43206a f113082a;

        /* renamed from: b */
        public static final EnumC43206a f113083b;

        /* renamed from: c */
        public static final EnumC43206a f113084c;

        /* renamed from: d */
        public static final EnumC43206a f113085d;

        /* renamed from: e */
        public static final EnumC43206a f113086e;

        /* renamed from: f */
        public static final EnumC43206a f113087f;

        /* renamed from: g */
        public static final EnumC43206a f113088g;

        /* renamed from: h */
        public static final EnumC43206a f113089h;

        /* renamed from: i */
        public static final EnumC43206a f113090i;

        /* renamed from: j */
        public static final EnumC43206a f113091j;

        /* renamed from: k */
        public static final EnumC43206a f113092k;

        /* renamed from: l */
        public static final EnumC43206a f113093l;

        /* renamed from: m */
        public static final EnumC43206a f113094m;

        /* renamed from: n */
        public static final EnumC43206a f113095n;

        /* renamed from: o */
        public static final EnumC43206a f113096o;

        /* renamed from: p */
        public static final EnumC43206a f113097p;

        /* renamed from: v */
        private static final /* synthetic */ EnumC43206a[] f113098v;

        /* renamed from: q */
        public final int f113099q;

        /* renamed from: r */
        public final int f113100r;

        /* renamed from: s */
        public final int f113101s;

        /* renamed from: t */
        public final int f113102t;

        /* renamed from: u */
        public final int f113103u;

        static {
            int i = C42750R.C42755string.bigo_ad_ic_blank;
            int i2 = C42750R.C42752drawable.bigo_ad_ic_star;
            int i3 = C42750R.C42755string.bigo_ad_comment_num_text;
            EnumC43206a enumC43206a = new EnumC43206a("STAR", 0, 0, i, i2, i3, 0);
            f113082a = enumC43206a;
            int i4 = C42750R.C42755string.bigo_ad_download_num_text;
            EnumC43206a enumC43206a2 = new EnumC43206a("DOWNLOAD_NUM", 1, 0, i, 0, i4, 0);
            f113083b = enumC43206a2;
            int i5 = C42750R.C42752drawable.bigo_ad_ic_everyone;
            int i6 = C42750R.C42755string.bigo_ad_ic_everyone;
            EnumC43206a enumC43206a3 = new EnumC43206a("Everyone", 2, 0, 0, i5, i6, C42750R.C42752drawable.bigo_ad_ic_everyone_ic_info);
            f113084c = enumC43206a3;
            int i7 = C42750R.C42752drawable.bigo_ad_ic_web;
            int i8 = C42750R.C42755string.bigo_ad_ic_web;
            EnumC43206a enumC43206a4 = new EnumC43206a("WEB", 3, 1, 0, i7, i8, 0);
            f113085d = enumC43206a4;
            int i9 = C42750R.C42752drawable.bigo_ad_ic_recommend;
            int i10 = C42750R.C42755string.bigo_ad_ic_recommended;
            EnumC43206a enumC43206a5 = new EnumC43206a("RECOMMENDED", 4, 1, 0, i9, i10, 0);
            f113086e = enumC43206a5;
            EnumC43206a enumC43206a6 = new EnumC43206a("REVIEWS", 5, 3, 0, C42750R.C42752drawable.bigo_ad_ic_star2, i3, 0);
            f113087f = enumC43206a6;
            int i11 = C42750R.C42752drawable.bigo_ad_ic_phone;
            int i12 = C42750R.C42755string.bigo_ad_ic_application;
            EnumC43206a enumC43206a7 = new EnumC43206a("APPLICATION", 6, 2, 0, i11, i12, 0);
            f113088g = enumC43206a7;
            EnumC43206a enumC43206a8 = new EnumC43206a("DOWNLOAD", 7, 2, 0, C42750R.C42752drawable.bigo_ad_ic_download_box, i4, 0);
            f113089h = enumC43206a8;
            EnumC43206a enumC43206a9 = new EnumC43206a("STAR_WHITE", 8, 0, i, C42750R.C42752drawable.bigo_ad_ic_star_white, i3, 0);
            f113090i = enumC43206a9;
            EnumC43206a enumC43206a10 = new EnumC43206a("DOWNLOAD_NUM_WHITE", 9, 0, i, 0, i4, 0);
            f113091j = enumC43206a10;
            EnumC43206a enumC43206a11 = new EnumC43206a("Everyone_WHITE", 10, 0, 0, C42750R.C42752drawable.bigo_ad_ic_everyone_white, i6, C42750R.C42752drawable.bigo_ad_ic_info_white);
            f113092k = enumC43206a11;
            EnumC43206a enumC43206a12 = new EnumC43206a("WEB_WHITE", 11, 4, 0, C42750R.C42752drawable.bigo_ad_ic_web_white, i8, 0);
            f113093l = enumC43206a12;
            EnumC43206a enumC43206a13 = new EnumC43206a("RECOMMENDED_WHITE", 12, 4, 0, C42750R.C42752drawable.bigo_ad_ic_recommend_white, i10, 0);
            f113094m = enumC43206a13;
            EnumC43206a enumC43206a14 = new EnumC43206a("REVIEWS_WHITE", 13, 12, 0, C42750R.C42752drawable.bigo_ad_ic_star2_white, i3, 0);
            f113095n = enumC43206a14;
            EnumC43206a enumC43206a15 = new EnumC43206a("APPLICATION_WHITE", 14, 8, 0, C42750R.C42752drawable.bigo_ad_ic_phone_white, i12, 0);
            f113096o = enumC43206a15;
            EnumC43206a enumC43206a16 = new EnumC43206a("DOWNLOAD_WHITE", 15, 8, 0, C42750R.C42752drawable.bigo_ad_ic_download_box_white, i4, 0);
            f113097p = enumC43206a16;
            f113098v = new EnumC43206a[]{enumC43206a, enumC43206a2, enumC43206a3, enumC43206a4, enumC43206a5, enumC43206a6, enumC43206a7, enumC43206a8, enumC43206a9, enumC43206a10, enumC43206a11, enumC43206a12, enumC43206a13, enumC43206a14, enumC43206a15, enumC43206a16};
        }

        private EnumC43206a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f113099q = i2;
            this.f113100r = i3;
            this.f113101s = i4;
            this.f113102t = i5;
            this.f113103u = i6;
        }

        /* renamed from: a */
        public static List<EnumC43206a> m5951a(int i) {
            boolean z;
            EnumC43206a[] values = values();
            ArrayList arrayList = new ArrayList();
            for (EnumC43206a enumC43206a : values) {
                int i2 = enumC43206a.f113099q;
                if ((i2 & i) <= 0 && i2 != i) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(enumC43206a);
                }
            }
            return arrayList;
        }

        public static EnumC43206a valueOf(String str) {
            return (EnumC43206a) Enum.valueOf(EnumC43206a.class, str);
        }

        public static EnumC43206a[] values() {
            return (EnumC43206a[]) f113098v.clone();
        }
    }

    public C43205f(int i, int i2, String str) {
        this.f113078a = i;
        this.f113079b = i2;
        this.f113080c = str;
        this.f113081d = !C43836q.m4837a((CharSequence) str);
    }
}
