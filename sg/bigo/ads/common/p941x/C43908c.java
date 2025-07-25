package sg.bigo.ads.common.p941x;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.common.x.c */
/* loaded from: classes10.dex */
public final class C43908c {

    /* renamed from: sg.bigo.ads.common.x.c$a */
    /* loaded from: classes10.dex */
    public static final class C43909a {

        /* renamed from: a */
        private static C43909a f114980a;

        /* renamed from: b */
        private final C43910a f114981b = new C43910a();

        /* renamed from: sg.bigo.ads.common.x.c$a$a */
        /* loaded from: classes10.dex */
        static class C43910a {
            C43910a() {
            }

            /* renamed from: a */
            public static void m4596a(@NonNull SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        private C43909a() {
        }

        /* renamed from: a */
        public static C43909a m4597a() {
            if (f114980a == null) {
                f114980a = new C43909a();
            }
            return f114980a;
        }
    }
}
