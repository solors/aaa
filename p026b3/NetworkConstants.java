package p026b3;

import java.util.HashMap;
import java.util.Map;
import p648e3.InterfaceC32918a;

/* renamed from: b3.l */
/* loaded from: classes5.dex */
public class NetworkConstants {
    /* renamed from: a */
    public static Map<String, String> m103954a(InterfaceC32918a interfaceC32918a, String str) {
        HashMap hashMap = new HashMap();
        String mo2786b = interfaceC32918a.mo2786b(str + ":");
        hashMap.put("Authorization", "Basic " + mo2786b);
        hashMap.put("Accept", "application/vnd+hsapi-v2+json");
        return hashMap;
    }
}
