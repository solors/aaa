package sg.bigo.ads.common.p933u.p934a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.u.a.b */
/* loaded from: classes10.dex */
public final class C43788b {

    /* renamed from: a */
    final Map<String, String> f114577a = new ConcurrentHashMap();

    /* renamed from: a */
    public final boolean m5002a(@Nullable URL url, @Nullable URL url2) {
        String str;
        if (url == null) {
            str = "originURL is null.";
        } else if (url2 == null) {
            str = "newURL is null.";
        } else {
            String protocol = url.getProtocol();
            if (TextUtils.isEmpty(protocol)) {
                str = "originURL protocol is empty.";
            } else if (!protocol.equalsIgnoreCase(url2.getProtocol())) {
                str = "protocol is not equal.";
            } else {
                String host = url.getHost();
                String host2 = url2.getHost();
                if (!host.equalsIgnoreCase("www.".concat(String.valueOf(host2))) && !host2.equalsIgnoreCase("www.".concat(host))) {
                    return false;
                }
                C43782a.m5009a(0, "HostCache", "cache host, originHost=" + host + ", newHost=" + host2);
                this.f114577a.put(host, host2);
                return true;
            }
        }
        C43782a.m5009a(0, "HostCache", str);
        return false;
    }
}
