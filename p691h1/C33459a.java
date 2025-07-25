package p691h1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.mraid.C10472c;
import com.explorestack.iab.mraid.C10474e;
import com.explorestack.iab.mraid.C10489q;
import com.ironsource.sdk.controller.InterfaceC20844f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: h1.a */
/* loaded from: classes3.dex */
public class C33459a {
    @NonNull

    /* renamed from: a */
    private static final List<InterfaceC33463c> f91306a = new CopyOnWriteArrayList();

    @Nullable
    /* renamed from: a */
    private static InterfaceC33463c m23844a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (InterfaceC33463c interfaceC33463c : f91306a) {
            if (interfaceC33463c.mo23834a(str)) {
                return interfaceC33463c;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public static String m23843b() {
        StringBuilder sb2 = new StringBuilder();
        for (InterfaceC33463c interfaceC33463c : f91306a) {
            sb2.append("<script type='application/javascript'>");
            sb2.append(interfaceC33463c.mo23833b());
            sb2.append("</script>");
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static void m23842c(@Nullable C10474e c10474e, @NonNull String str) {
        Map<String, String> m79468g;
        C10472c.m79529a("JsBridgeHandler", "handleJsCommand - %s", str);
        try {
            InterfaceC33463c m23844a = m23844a(str);
            if (m23844a == null || (m79468g = C10489q.m79468g(str, m23844a.mo23836a())) == null) {
                return;
            }
            String str2 = m79468g.get(InterfaceC20844f.C20847b.f53074g);
            if (str2 == null) {
                C10472c.m79523g("JsBridgeHandler", "handleJsCommand not found", new Object[0]);
            } else {
                m23844a.mo23835a(c10474e, str2, m79468g);
            }
        } catch (Throwable th) {
            C10472c.m79528b("JsBridgeHandler", th);
        }
    }

    /* renamed from: d */
    public static boolean m23841d(@NonNull InterfaceC33463c interfaceC33463c) {
        List<InterfaceC33463c> list = f91306a;
        if (!list.contains(interfaceC33463c) && list.add(interfaceC33463c)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m23840e(@Nullable String str) {
        if (m23844a(str) != null) {
            return true;
        }
        return false;
    }
}
