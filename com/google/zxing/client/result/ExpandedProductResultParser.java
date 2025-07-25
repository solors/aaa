package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class ExpandedProductResultParser extends ResultParser {
    /* renamed from: m */
    private static String m66065m(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb2.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* renamed from: n */
    private static String m66064n(int i, String str) {
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (m66065m(i2, substring) != null) {
                    break;
                }
                sb2.append('(');
            } else {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x020b, code lost:
        if (r1.equals("10") == false) goto L12;
     */
    @Override // com.google.zxing.client.result.ResultParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.client.result.ExpandedProductParsedResult parse(com.google.zxing.Result r24) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ExpandedProductResultParser.parse(com.google.zxing.Result):com.google.zxing.client.result.ExpandedProductParsedResult");
    }
}
