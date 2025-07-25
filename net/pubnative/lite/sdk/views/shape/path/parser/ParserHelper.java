package net.pubnative.lite.sdk.views.shape.path.parser;

/* loaded from: classes10.dex */
class ParserHelper {
    private static final double[] pow10 = new double[128];
    private char current;

    /* renamed from: n */
    private final int f102158n;
    public int pos = 0;

    /* renamed from: s */
    private final CharSequence f102159s;

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i < dArr.length) {
                dArr[i] = Math.pow(10.0d, i);
                i++;
            } else {
                return;
            }
        }
    }

    public ParserHelper(CharSequence charSequence) {
        this.f102159s = charSequence;
        this.f102158n = charSequence.length();
        this.current = charSequence.charAt(this.pos);
    }

    private static float buildFloat(int i, int i2) {
        double d;
        if (i2 >= -125 && i != 0) {
            if (i2 >= 128) {
                if (i > 0) {
                    return Float.POSITIVE_INFINITY;
                }
                return Float.NEGATIVE_INFINITY;
            } else if (i2 == 0) {
                return i;
            } else {
                if (i >= 67108864) {
                    i++;
                }
                double d2 = i;
                double[] dArr = pow10;
                if (i2 > 0) {
                    d = d2 * dArr[i2];
                } else {
                    d = d2 / dArr[-i2];
                }
                return (float) d;
            }
        }
        return 0.0f;
    }

    private char read() {
        int i = this.pos;
        int i2 = this.f102158n;
        if (i < i2) {
            this.pos = i + 1;
        }
        int i3 = this.pos;
        if (i3 == i2) {
            return (char) 0;
        }
        return this.f102159s.charAt(i3);
    }

    private void reportUnexpectedCharacterError(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    public void advance() {
        this.current = read();
    }

    public float nextFloat() {
        skipWhitespace();
        float parseFloat = parseFloat();
        skipNumberSeparator();
        return parseFloat;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[LOOP:0: B:13:0x0028->B:17:0x0034, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1 A[LOOP:3: B:63:0x00c1->B:64:0x00c7, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    float parseFloat() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.views.shape.path.parser.ParserHelper.parseFloat():float");
    }

    void skipNumberSeparator() {
        while (true) {
            int i = this.pos;
            if (i < this.f102158n) {
                char charAt = this.f102159s.charAt(i);
                if (charAt != '\t' && charAt != '\n' && charAt != ' ' && charAt != ',') {
                    return;
                }
                advance();
            } else {
                return;
            }
        }
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.pos;
            if (i < this.f102158n && Character.isWhitespace(this.f102159s.charAt(i))) {
                advance();
            } else {
                return;
            }
        }
    }
}
