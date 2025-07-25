package com.amazon.p047a.p048a.p071o.p073b.p074a;

import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.MalformedResponseException;

/* renamed from: com.amazon.a.a.o.b.a.b */
/* loaded from: classes2.dex */
public class SignedTokenParseException extends KiwiException {

    /* renamed from: a */
    private static final long f2749a = 1;

    private SignedTokenParseException(String str, String str2) {
        super("SIGNED_TOKEN_PARSE_FAILURE", str, str2);
    }

    /* renamed from: a */
    public static SignedTokenParseException m102855a(Throwable th) {
        return new SignedTokenParseException("DECODE", th.getMessage());
    }

    /* renamed from: d */
    public static SignedTokenParseException m102854d() {
        return new SignedTokenParseException("INVALID_FORMAT", null);
    }

    /* renamed from: a */
    public static SignedTokenParseException m102857a(String str) {
        return new SignedTokenParseException(MalformedResponseException.f2549b, str);
    }

    /* renamed from: a */
    public static SignedTokenParseException m102856a(String str, String str2) {
        return new SignedTokenParseException("INVALID_FIELD_VALUE", str + ":" + str2);
    }
}
