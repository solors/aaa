package sg.bigo.ads.common.p933u.p936c;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import sg.bigo.ads.common.utils.C43825h;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.u.c.a */
/* loaded from: classes10.dex */
public final class C43800a implements InterfaceC43802c<InputStream> {

    /* renamed from: a */
    public final int f114624a;

    /* renamed from: b */
    public final InputStream f114625b;
    @NonNull

    /* renamed from: c */
    public final C43825h<List<String>> f114626c;

    /* renamed from: d */
    private final int f114627d;

    /* renamed from: e */
    private final Closeable f114628e;

    public C43800a(int i, int i2, @Nullable InputStream inputStream, @NonNull C43825h<List<String>> c43825h, @Nullable Closeable closeable) {
        this.f114627d = i;
        this.f114624a = i2;
        this.f114625b = inputStream;
        this.f114626c = c43825h;
        this.f114628e = closeable;
    }

    /* renamed from: a */
    public final long m4967a() {
        String m4966a = m4966a("Content-Length");
        if (C43836q.m4827b((CharSequence) m4966a)) {
            try {
                return Long.parseLong(m4966a);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @Nullable
    /* renamed from: a */
    public final String m4966a(String str) {
        List<String> m4884a;
        if (!TextUtils.isEmpty(str) && (m4884a = this.f114626c.m4884a(str)) != null && !m4884a.isEmpty()) {
            for (String str2 : m4884a) {
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        }
        return "";
    }
}
