package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p552ot.pubsub.p559g.C26549l;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class VINResultParser extends ResultParser {

    /* renamed from: e */
    private static final Pattern f44328e = Pattern.compile("[IOQ]");

    /* renamed from: f */
    private static final Pattern f44329f = Pattern.compile("[A-Z0-9]{17}");

    /* renamed from: m */
    private static char m66034m(int i) {
        if (i < 10) {
            return (char) (i + 48);
        }
        if (i == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    private static boolean m66033n(CharSequence charSequence) {
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            int i3 = i + 1;
            i2 += m66029r(i3) * m66030q(charSequence.charAt(i));
            i = i3;
        }
        if (charSequence.charAt(8) != m66034m(i2 % 11)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private static String m66032o(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt != '9') {
            if (charAt != 'S') {
                if (charAt != 'Z') {
                    switch (charAt) {
                        case '1':
                        case '4':
                        case '5':
                            return "US";
                        case '2':
                            return "CA";
                        case '3':
                            if (charAt2 >= 'A' && charAt2 <= 'W') {
                                return "MX";
                            }
                            return null;
                        default:
                            switch (charAt) {
                                case 'J':
                                    if (charAt2 >= 'A' && charAt2 <= 'T') {
                                        return "JP";
                                    }
                                    return null;
                                case 'K':
                                    if (charAt2 >= 'L' && charAt2 <= 'R') {
                                        return "KO";
                                    }
                                    return null;
                                case 'L':
                                    return C26549l.f69547a;
                                case 'M':
                                    if (charAt2 >= 'A' && charAt2 <= 'E') {
                                        return "IN";
                                    }
                                    return null;
                                default:
                                    switch (charAt) {
                                        case 'V':
                                            if (charAt2 >= 'F' && charAt2 <= 'R') {
                                                return "FR";
                                            }
                                            if (charAt2 >= 'S' && charAt2 <= 'W') {
                                                return "ES";
                                            }
                                            return null;
                                        case 'W':
                                            return "DE";
                                        case 'X':
                                            if (charAt2 != '0') {
                                                if (charAt2 >= '3' && charAt2 <= '9') {
                                                    return C26549l.f69548b;
                                                }
                                                return null;
                                            }
                                            return C26549l.f69548b;
                                        default:
                                            return null;
                                    }
                            }
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'R') {
                    return "IT";
                } else {
                    return null;
                }
            } else if (charAt2 >= 'A' && charAt2 <= 'M') {
                return "UK";
            } else {
                if (charAt2 >= 'N' && charAt2 <= 'T') {
                    return "DE";
                }
                return null;
            }
        } else if (charAt2 < 'A' || charAt2 > 'E') {
            if (charAt2 >= '3' && charAt2 <= '9') {
                return "BR";
            }
            return null;
        } else {
            return "BR";
        }
    }

    /* renamed from: p */
    private static int m66031p(char c) {
        if (c >= 'E' && c <= 'H') {
            return (c - 'E') + 1984;
        }
        if (c >= 'J' && c <= 'N') {
            return (c - 'J') + 1988;
        }
        if (c == 'P') {
            return 1993;
        }
        if (c >= 'R' && c <= 'T') {
            return (c - 'R') + 1994;
        }
        if (c >= 'V' && c <= 'Y') {
            return (c - 'V') + 1997;
        }
        if (c >= '1' && c <= '9') {
            return (c - '1') + 2001;
        }
        if (c >= 'A' && c <= 'D') {
            return (c - 'A') + IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: q */
    private static int m66030q(char c) {
        if (c >= 'A' && c <= 'I') {
            return (c - 'A') + 1;
        }
        if (c >= 'J' && c <= 'R') {
            return (c - 'J') + 1;
        }
        if (c >= 'S' && c <= 'Z') {
            return (c - 'S') + 2;
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: r */
    private static int m66029r(int i) {
        if (i > 0 && i <= 7) {
            return 9 - i;
        }
        if (i == 8) {
            return 10;
        }
        if (i == 9) {
            return 0;
        }
        if (i >= 10 && i <= 17) {
            return 19 - i;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.zxing.client.result.ResultParser
    public VINParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.CODE_39) {
            return null;
        }
        String trim = f44328e.matcher(result.getText()).replaceAll("").trim();
        if (f44329f.matcher(trim).matches()) {
            try {
                if (m66033n(trim)) {
                    String substring = trim.substring(0, 3);
                    return new VINParsedResult(trim, substring, trim.substring(3, 9), trim.substring(9, 17), m66032o(substring), trim.substring(3, 8), m66031p(trim.charAt(9)), trim.charAt(10), trim.substring(11));
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }
}
