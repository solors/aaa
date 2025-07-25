package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class EmailDoCoMoResultParser extends AbstractDoCoMoResultParser {

    /* renamed from: e */
    private static final Pattern f44265e = Pattern.compile("[a-zA-Z0-9@.!#$%&'*+\\-/=?^_`{|}~]+");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static boolean m66068o(String str) {
        if (str != null && f44265e.matcher(str).matches() && str.indexOf(64) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] m66078m;
        String m66061c = ResultParser.m66061c(result);
        if (m66061c.startsWith("MATMSG:") && (m66078m = AbstractDoCoMoResultParser.m66078m("TO:", m66061c, true)) != null) {
            for (String str : m66078m) {
                if (!m66068o(str)) {
                    return null;
                }
            }
            return new EmailAddressParsedResult(m66078m, null, null, AbstractDoCoMoResultParser.m66077n("SUB:", m66061c, false), AbstractDoCoMoResultParser.m66077n("BODY:", m66061c, false));
        }
        return null;
    }
}
