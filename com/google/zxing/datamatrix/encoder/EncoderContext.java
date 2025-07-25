package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
final class EncoderContext {

    /* renamed from: a */
    private final String f44436a;

    /* renamed from: b */
    private SymbolShapeHint f44437b;

    /* renamed from: c */
    private Dimension f44438c;

    /* renamed from: d */
    private Dimension f44439d;

    /* renamed from: e */
    private final StringBuilder f44440e;

    /* renamed from: f */
    int f44441f;

    /* renamed from: g */
    private int f44442g;

    /* renamed from: h */
    private SymbolInfo f44443h;

    /* renamed from: i */
    private int f44444i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c);
        }
        this.f44436a = sb2.toString();
        this.f44437b = SymbolShapeHint.FORCE_NONE;
        this.f44440e = new StringBuilder(str.length());
        this.f44442g = -1;
    }

    /* renamed from: a */
    private int m65930a() {
        return this.f44436a.length() - this.f44444i;
    }

    public int getCodewordCount() {
        return this.f44440e.length();
    }

    public StringBuilder getCodewords() {
        return this.f44440e;
    }

    public char getCurrent() {
        return this.f44436a.charAt(this.f44441f);
    }

    public char getCurrentChar() {
        return this.f44436a.charAt(this.f44441f);
    }

    public String getMessage() {
        return this.f44436a;
    }

    public int getNewEncoding() {
        return this.f44442g;
    }

    public int getRemainingCharacters() {
        return m65930a() - this.f44441f;
    }

    public SymbolInfo getSymbolInfo() {
        return this.f44443h;
    }

    public boolean hasMoreCharacters() {
        if (this.f44441f < m65930a()) {
            return true;
        }
        return false;
    }

    public void resetEncoderSignal() {
        this.f44442g = -1;
    }

    public void resetSymbolInfo() {
        this.f44443h = null;
    }

    public void setSizeConstraints(Dimension dimension, Dimension dimension2) {
        this.f44438c = dimension;
        this.f44439d = dimension2;
    }

    public void setSkipAtEnd(int i) {
        this.f44444i = i;
    }

    public void setSymbolShape(SymbolShapeHint symbolShapeHint) {
        this.f44437b = symbolShapeHint;
    }

    public void signalEncoderChange(int i) {
        this.f44442g = i;
    }

    public void updateSymbolInfo() {
        updateSymbolInfo(getCodewordCount());
    }

    public void writeCodeword(char c) {
        this.f44440e.append(c);
    }

    public void writeCodewords(String str) {
        this.f44440e.append(str);
    }

    public void updateSymbolInfo(int i) {
        SymbolInfo symbolInfo = this.f44443h;
        if (symbolInfo == null || i > symbolInfo.getDataCapacity()) {
            this.f44443h = SymbolInfo.lookup(i, this.f44437b, this.f44438c, this.f44439d, true);
        }
    }
}
