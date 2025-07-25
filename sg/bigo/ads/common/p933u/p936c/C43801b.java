package sg.bigo.ads.common.p933u.p936c;

import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.u.c.b */
/* loaded from: classes10.dex */
public final class C43801b {

    /* renamed from: a */
    public long f114629a;

    /* renamed from: b */
    public long f114630b = -1;

    /* renamed from: c */
    private long f114631c;

    private C43801b() {
    }

    @Nullable
    /* renamed from: a */
    public static C43801b m4965a(String str) {
        C43801b c43801b = null;
        if (C43836q.m4837a((CharSequence) str)) {
            return null;
        }
        int indexOf = str.indexOf(" ");
        int indexOf2 = str.indexOf("-");
        int indexOf3 = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (indexOf >= 0 && indexOf3 >= 0 && indexOf < indexOf3) {
            c43801b = new C43801b();
            if (indexOf2 > indexOf && indexOf2 < indexOf3) {
                try {
                    c43801b.f114629a = Long.parseLong(str.substring(indexOf + 1, indexOf2));
                    c43801b.f114631c = Long.parseLong(str.substring(indexOf2 + 1, indexOf3));
                } catch (Exception unused) {
                }
            }
            String substring = str.substring(indexOf3 + 1);
            if (!ProxyConfig.MATCH_ALL_SCHEMES.equals(substring)) {
                c43801b.f114630b = Long.parseLong(substring);
            }
        }
        return c43801b;
    }
}
