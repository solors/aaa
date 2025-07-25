package com.chartboost.sdk.impl;

import android.net.Uri;
import com.amazon.device.ads.DtbConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;

/* renamed from: com.chartboost.sdk.impl.f0 */
/* loaded from: classes3.dex */
public abstract class AbstractC9841f0 {
    /* renamed from: a */
    public static final String m81719a(String url) {
        boolean m16624M;
        String m17521z0;
        boolean m16624M2;
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() > 0) {
            m16624M = StringsJVM.m16624M(url, DtbConstants.HTTPS, false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(url, "http://", false, 2, null);
                if (!m16624M2) {
                    url = DtbConstants.HTTPS + url;
                }
            }
            Uri parse = Uri.parse(url);
            if (parse == null) {
                return "";
            }
            List<String> pathSegments = parse.getPathSegments();
            Intrinsics.m17074g(pathSegments);
            m17521z0 = _Collections.m17521z0(pathSegments, "_", null, null, 0, null, null, 62, null);
            return m17521z0;
        }
        return "";
    }

    /* renamed from: a */
    public static final EnumC9830e7 m81720a(int i) {
        Object obj;
        Iterator<E> it = EnumC9830e7.m81735b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((EnumC9830e7) obj).m81734c() == i) {
                break;
            }
        }
        EnumC9830e7 enumC9830e7 = (EnumC9830e7) obj;
        return enumC9830e7 == null ? EnumC9830e7.f21948c : enumC9830e7;
    }
}
