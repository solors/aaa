package net.pubnative.lite.sdk.utils.string;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes10.dex */
public class OctalUnescaper extends CharSequenceTranslator {
    private boolean isOctalDigit(char c) {
        if (c >= '0' && c <= '7') {
            return true;
        }
        return false;
    }

    private boolean isZeroToThree(char c) {
        if (c >= '0' && c <= '3') {
            return true;
        }
        return false;
    }

    @Override // net.pubnative.lite.sdk.utils.string.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb2 = new StringBuilder();
        if (charSequence.charAt(i) == '\\' && length > 0) {
            int i2 = i + 1;
            if (isOctalDigit(charSequence.charAt(i2))) {
                int i3 = i + 2;
                int i4 = i + 3;
                sb2.append(charSequence.charAt(i2));
                if (length > 1 && isOctalDigit(charSequence.charAt(i3))) {
                    sb2.append(charSequence.charAt(i3));
                    if (length > 2 && isZeroToThree(charSequence.charAt(i2)) && isOctalDigit(charSequence.charAt(i4))) {
                        sb2.append(charSequence.charAt(i4));
                    }
                }
                writer.write(Integer.parseInt(sb2.toString(), 8));
                return sb2.length() + 1;
            }
            return 0;
        }
        return 0;
    }
}
