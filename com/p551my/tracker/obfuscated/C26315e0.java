package com.p551my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.my.tracker.obfuscated.e0 */
/* loaded from: classes7.dex */
public final class C26315e0 {
    /* renamed from: a */
    public static void m42084a(int i, Map<String, String> map, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        int[] iArr;
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                byteArrayOutputStream.reset();
                for (int i2 : InterfaceC26433t0.f69026x) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C26439u0.m41595a(2, map.get(str), byteArrayOutputStream);
                        }
                    } else {
                        C26439u0.m41595a(1, str, byteArrayOutputStream);
                    }
                }
                if (byteArrayOutputStream.size() > 0) {
                    C26439u0.m41597a(i, byteArrayOutputStream, outputStream);
                }
            }
        }
    }
}
