package net.pubnative.lite.sdk.utils.string;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes10.dex */
public abstract class CodePointTranslator extends CharSequenceTranslator {
    @Override // net.pubnative.lite.sdk.utils.string.CharSequenceTranslator
    public final int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        return translate(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
    }

    public abstract boolean translate(int i, Writer writer) throws IOException;
}
