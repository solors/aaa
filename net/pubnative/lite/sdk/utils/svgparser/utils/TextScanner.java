package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.util.Locale;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGBase;

/* loaded from: classes10.dex */
public class TextScanner {
    final String input;
    int inputLength;
    int position = 0;
    private final NumberParser numberParser = new NumberParser();

    public TextScanner(String str) {
        String trim = str.trim();
        this.input = trim;
        this.inputLength = trim.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int advanceChar() {
        int i = this.position;
        int i2 = this.inputLength;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.position = i3;
        if (i3 >= i2) {
            return -1;
        }
        return this.input.charAt(i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String ahead() {
        int i = this.position;
        while (!empty() && !isWhitespace(this.input.charAt(this.position))) {
            this.position++;
        }
        String substring = this.input.substring(i, this.position);
        this.position = i;
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Boolean checkedNextFlag(Object obj) {
        if (obj == null) {
            return null;
        }
        skipCommaWhitespace();
        return nextFlag();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float checkedNextFloat(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }

    public boolean consume(char c) {
        int i = this.position;
        boolean z = i < this.inputLength && this.input.charAt(i) == c;
        if (z) {
            this.position++;
        }
        return z;
    }

    public boolean empty() {
        if (this.position == this.inputLength) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasLetter() {
        int i = this.position;
        if (i == this.inputLength) {
            return false;
        }
        char charAt = this.input.charAt(i);
        if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEOL(int i) {
        if (i != 10 && i != 13) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isWhitespace(int i) {
        if (i != 32 && i != 10 && i != 13 && i != 9) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer nextChar() {
        int i = this.position;
        if (i == this.inputLength) {
            return null;
        }
        String str = this.input;
        this.position = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    Boolean nextFlag() {
        int i = this.position;
        if (i == this.inputLength) {
            return null;
        }
        char charAt = this.input.charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        boolean z = true;
        this.position++;
        if (charAt != '1') {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public float nextFloat() {
        float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
        if (!Float.isNaN(parseNumber)) {
            this.position = this.numberParser.getEndPos();
        }
        return parseNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String nextFunction() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        int charAt = this.input.charAt(i);
        while (true) {
            if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                break;
            }
            charAt = advanceChar();
        }
        int i2 = this.position;
        while (isWhitespace(charAt)) {
            charAt = advanceChar();
        }
        if (charAt == 40) {
            this.position++;
            return this.input.substring(i, i2);
        }
        this.position = i;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Integer nextInteger(boolean z) {
        IntegerParser parseInt = IntegerParser.parseInt(this.input, this.position, this.inputLength, z);
        if (parseInt == null) {
            return null;
        }
        this.position = parseInt.getEndPos();
        return Integer.valueOf(parseInt.value());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGBase.Length nextLength() {
        float nextFloat = nextFloat();
        if (Float.isNaN(nextFloat)) {
            return null;
        }
        SVGBase.Unit nextUnit = nextUnit();
        if (nextUnit == null) {
            return new SVGBase.Length(nextFloat, SVGBase.Unit.px);
        }
        return new SVGBase.Length(nextFloat, nextUnit);
    }

    public String nextQuotedString() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        char charAt = this.input.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int advanceChar = advanceChar();
        while (advanceChar != -1 && advanceChar != charAt) {
            advanceChar = advanceChar();
        }
        if (advanceChar == -1) {
            this.position = i;
            return null;
        }
        int i2 = this.position + 1;
        this.position = i2;
        return this.input.substring(i + 1, i2 - 1);
    }

    public String nextToken() {
        return nextToken(' ', false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String nextTokenWithWhitespace(char c) {
        return nextToken(c, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SVGBase.Unit nextUnit() {
        if (empty()) {
            return null;
        }
        if (this.input.charAt(this.position) == '%') {
            this.position++;
            return SVGBase.Unit.percent;
        }
        int i = this.position;
        if (i > this.inputLength - 2) {
            return null;
        }
        try {
            SVGBase.Unit valueOf = SVGBase.Unit.valueOf(this.input.substring(i, i + 2).toLowerCase(Locale.US));
            this.position += 2;
            return valueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String nextWord() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        char charAt = this.input.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            int advanceChar = advanceChar();
            while (true) {
                if ((advanceChar < 65 || advanceChar > 90) && (advanceChar < 97 || advanceChar > 122)) {
                    break;
                }
                advanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }
        this.position = i;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float possibleNextFloat() {
        skipCommaWhitespace();
        float parseNumber = this.numberParser.parseNumber(this.input, this.position, this.inputLength);
        if (!Float.isNaN(parseNumber)) {
            this.position = this.numberParser.getEndPos();
        }
        return parseNumber;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String restOfText() {
        if (empty()) {
            return null;
        }
        int i = this.position;
        this.position = this.inputLength;
        return this.input.substring(i);
    }

    public boolean skipCommaWhitespace() {
        skipWhitespace();
        int i = this.position;
        if (i == this.inputLength || this.input.charAt(i) != ',') {
            return false;
        }
        this.position++;
        skipWhitespace();
        return true;
    }

    public void skipWhitespace() {
        while (true) {
            int i = this.position;
            if (i < this.inputLength && isWhitespace(this.input.charAt(i))) {
                this.position++;
            } else {
                return;
            }
        }
    }

    public String nextToken(char c) {
        return nextToken(c, false);
    }

    public boolean consume(String str) {
        int length = str.length();
        int i = this.position;
        boolean z = i <= this.inputLength - length && this.input.substring(i, i + length).equals(str);
        if (z) {
            this.position += length;
        }
        return z;
    }

    String nextToken(char c, boolean z) {
        if (empty()) {
            return null;
        }
        char charAt = this.input.charAt(this.position);
        if ((z || !isWhitespace(charAt)) && charAt != c) {
            int i = this.position;
            int advanceChar = advanceChar();
            while (advanceChar != -1 && advanceChar != c && (z || !isWhitespace(advanceChar))) {
                advanceChar = advanceChar();
            }
            return this.input.substring(i, this.position);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float checkedNextFloat(Boolean bool) {
        if (bool == null) {
            return Float.NaN;
        }
        skipCommaWhitespace();
        return nextFloat();
    }
}
