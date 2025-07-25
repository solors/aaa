package sg.bigo.ads.common;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.o */
/* loaded from: classes10.dex */
public final class C43736o {

    /* renamed from: a */
    public static String f114463a = "";

    /* renamed from: a */
    public static String m5092a() {
        if (!C43727d.m5104b() || C43836q.m4837a((CharSequence) f114463a)) {
            if (C43836q.m4837a((CharSequence) f114463a)) {
                Context context = C43617a.f114190a;
                f114463a = context.getFilesDir() + File.separator + "sg_bigo_ad";
            }
            File file = new File(f114463a);
            if (!file.exists()) {
                file.mkdirs();
            }
            return f114463a;
        }
        return f114463a;
    }

    /* renamed from: b */
    public static String m5090b() {
        return m5083h() + File.separator + "files";
    }

    /* renamed from: c */
    public static String m5088c() {
        return m5083h() + File.separator + "thumb";
    }

    /* renamed from: d */
    public static String m5087d() {
        return m5092a() + File.separator + "image";
    }

    /* renamed from: e */
    public static String m5086e() {
        return m5092a() + File.separator + "icon";
    }

    /* renamed from: f */
    public static String m5085f() {
        return m5092a() + File.separator + "omsdk";
    }

    /* renamed from: g */
    public static String m5084g() {
        return m5092a() + File.separator + "bannerjs";
    }

    /* renamed from: h */
    private static String m5083h() {
        return m5092a() + File.separator + "video";
    }

    /* renamed from: a */
    public static boolean m5091a(String str) {
        return str != null && str.equals(m5090b());
    }

    @Nullable
    /* renamed from: b */
    public static String m5089b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return AdPayload.FILE_SCHEME + m5088c() + File.separator + str;
    }
}
