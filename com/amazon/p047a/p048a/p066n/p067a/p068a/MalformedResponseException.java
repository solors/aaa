package com.amazon.p047a.p048a.p066n.p067a.p068a;

import com.amazon.p047a.p048a.p055d.KiwiException;

/* renamed from: com.amazon.a.a.n.a.a.g */
/* loaded from: classes2.dex */
public class MalformedResponseException extends KiwiException {

    /* renamed from: a */
    public static final String f2548a = "EMPTY";

    /* renamed from: b */
    public static final String f2549b = "MISSING_FIELD";

    /* renamed from: c */
    private static final long f2550c = 1;

    private MalformedResponseException(String str, String str2) {
        super("MALFORMED_RESPONSE", str, str2);
    }

    /* renamed from: a */
    public static final MalformedResponseException m102983a(String str) {
        return new MalformedResponseException(f2549b, str);
    }

    /* renamed from: d */
    public static final MalformedResponseException m102982d() {
        return new MalformedResponseException(f2548a, null);
    }
}
