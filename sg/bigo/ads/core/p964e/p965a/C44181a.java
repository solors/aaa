package sg.bigo.ads.core.p964e.p965a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sg.bigo.ads.core.e.a.a */
/* loaded from: classes10.dex */
public final class C44181a {

    /* renamed from: a */
    public final List<C44182a> f115974a = new ArrayList();

    /* renamed from: b */
    public final List<C44182a> f115975b = new ArrayList();

    /* renamed from: sg.bigo.ads.core.e.a.a$a */
    /* loaded from: classes10.dex */
    public static final class C44182a {

        /* renamed from: a */
        public final String f115976a;

        /* renamed from: b */
        public final String f115977b;

        /* renamed from: c */
        public final int f115978c;

        /* renamed from: d */
        public final int f115979d;
        @Nullable

        /* renamed from: e */
        public final String f115980e;

        public C44182a(String str, int i, int i2, @Nullable String str2, String str3) {
            this.f115977b = str;
            this.f115978c = i;
            this.f115979d = i2;
            this.f115980e = str2;
            this.f115976a = str3;
        }

        /* renamed from: a */
        public final boolean m3719a() {
            if (!TextUtils.isEmpty(this.f115977b)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m3718b() {
            if (!"image/jpeg".equalsIgnoreCase(this.f115980e) && !"image/png".equalsIgnoreCase(this.f115980e)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m3717c() {
            return "image/gif".equalsIgnoreCase(this.f115980e);
        }
    }

    @Nullable
    /* renamed from: a */
    public final C44182a m3721a() {
        return m3720a(this.f115974a);
    }

    /* renamed from: a */
    public static C44182a m3720a(List<C44182a> list) {
        if (list != null) {
            for (C44182a c44182a : list) {
                if (c44182a != null) {
                    return c44182a;
                }
            }
            return null;
        }
        return null;
    }
}
