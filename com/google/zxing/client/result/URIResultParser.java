package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class URIResultParser extends ResultParser {

    /* renamed from: e */
    private static final Pattern f44307e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+-.]+:");

    /* renamed from: f */
    private static final Pattern f44308f = Pattern.compile("([a-zA-Z0-9\\-]+\\.){1,6}[a-zA-Z]{2,}(:\\d{1,5})?(/|\\?|$)");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static boolean m66048m(String str) {
        if (str.contains(" ")) {
            return false;
        }
        Matcher matcher = f44307e.matcher(str);
        if (matcher.find() && matcher.start() == 0) {
            return true;
        }
        Matcher matcher2 = f44308f.matcher(str);
        if (!matcher2.find() || matcher2.start() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public URIParsedResult parse(Result result) {
        String m66061c = ResultParser.m66061c(result);
        if (!m66061c.startsWith("URL:") && !m66061c.startsWith("URI:")) {
            String trim = m66061c.trim();
            if (m66048m(trim)) {
                return new URIParsedResult(trim, null);
            }
            return null;
        }
        return new URIParsedResult(m66061c.substring(4).trim(), null);
    }
}
