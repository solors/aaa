package com.google.zxing.client.result;

import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class URIParsedResult extends ParsedResult {

    /* renamed from: d */
    private static final Pattern f44304d = Pattern.compile(":/*([^/@]+)@[^/]+");

    /* renamed from: b */
    private final String f44305b;

    /* renamed from: c */
    private final String f44306c;

    public URIParsedResult(String str, String str2) {
        super(ParsedResultType.URI);
        this.f44305b = m66049b(str);
        this.f44306c = str2;
    }

    /* renamed from: a */
    private static boolean m66050a(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return ResultParser.m66059e(str, i2, indexOf - i2);
    }

    /* renamed from: b */
    private static String m66049b(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        if (indexOf < 0 || m66050a(trim, indexOf)) {
            return "http://".concat(trim);
        }
        return trim;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f44306c, sb2);
        ParsedResult.maybeAppend(this.f44305b, sb2);
        return sb2.toString();
    }

    public String getTitle() {
        return this.f44306c;
    }

    public String getURI() {
        return this.f44305b;
    }

    public boolean isPossiblyMaliciousURI() {
        return f44304d.matcher(this.f44305b).find();
    }
}
