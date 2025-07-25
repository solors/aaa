package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sa */
/* loaded from: classes9.dex */
public final class C34880sa implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int utf8BytesLength = StringUtils.getUtf8BytesLength((String) ((Map.Entry) obj).getValue());
        int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) ((Map.Entry) obj2).getValue());
        if (utf8BytesLength < utf8BytesLength2) {
            return -1;
        }
        if (utf8BytesLength == utf8BytesLength2) {
            return 0;
        }
        return 1;
    }
}
