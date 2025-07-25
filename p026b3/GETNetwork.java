package p026b3;

import com.ironsource.C21114v8;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import p026b3.HSRequest;
import p038c3.HSRootApiException;
import p038c3.NetworkException;
import p752k3.C37383m;

/* renamed from: b3.b */
/* loaded from: classes5.dex */
public class GETNetwork extends HSBaseNetwork {
    public GETNetwork(HTTPTransport hTTPTransport, String str) {
        super(hTTPTransport, str);
    }

    /* renamed from: d */
    private String m103971d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                arrayList.add(entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw HSRootApiException.m103683a(e, NetworkException.UNSUPPORTED_ENCODING_EXCEPTION);
            }
        }
        return C37383m.m18230j(C21114v8.C21123i.f54135c, arrayList);
    }

    @Override // p026b3.HSBaseNetwork
    /* renamed from: b */
    HSRequest mo103953b(HSRequestData hSRequestData) {
        return new HSRequest(HSRequest.EnumC3347a.GET, m103970c() + "?" + m103971d(hSRequestData.f1573b), hSRequestData.f1572a, "", 5000);
    }
}
