package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes5.dex */
public class SymbolInfo {

    /* renamed from: g */
    static final SymbolInfo[] f44449g;

    /* renamed from: h */
    private static SymbolInfo[] f44450h;

    /* renamed from: a */
    private final boolean f44451a;

    /* renamed from: b */
    private final int f44452b;

    /* renamed from: c */
    private final int f44453c;

    /* renamed from: d */
    private final int f44454d;

    /* renamed from: e */
    private final int f44455e;

    /* renamed from: f */
    private final int f44456f;
    public final int matrixHeight;
    public final int matrixWidth;

    static {
        SymbolInfo[] symbolInfoArr = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 56), new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};
        f44449g = symbolInfoArr;
        f44450h = symbolInfoArr;
    }

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: a */
    private int m65914a() {
        int i = this.f44454d;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: b */
    private int m65913b() {
        int i = this.f44454d;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: c */
    private static SymbolInfo m65912c(int i, SymbolShapeHint symbolShapeHint, boolean z) {
        return lookup(i, symbolShapeHint, null, null, z);
    }

    public static SymbolInfo lookup(int i) {
        return m65912c(i, SymbolShapeHint.FORCE_NONE, true);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
        f44450h = symbolInfoArr;
    }

    public int getCodewordCount() {
        return this.f44452b + this.f44453c;
    }

    public final int getDataCapacity() {
        return this.f44452b;
    }

    public int getDataLengthForInterleavedBlock(int i) {
        return this.f44455e;
    }

    public final int getErrorCodewords() {
        return this.f44453c;
    }

    public final int getErrorLengthForInterleavedBlock(int i) {
        return this.f44456f;
    }

    public int getInterleavedBlockCount() {
        return this.f44452b / this.f44455e;
    }

    public final int getSymbolDataHeight() {
        return m65913b() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return m65914a() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return getSymbolDataHeight() + (m65913b() << 1);
    }

    public final int getSymbolWidth() {
        return getSymbolDataWidth() + (m65914a() << 1);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f44451a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        sb2.append(this.matrixWidth);
        sb2.append('x');
        sb2.append(this.matrixHeight);
        sb2.append(", symbol size ");
        sb2.append(getSymbolWidth());
        sb2.append('x');
        sb2.append(getSymbolHeight());
        sb2.append(", symbol data size ");
        sb2.append(getSymbolDataWidth());
        sb2.append('x');
        sb2.append(getSymbolDataHeight());
        sb2.append(", codewords ");
        sb2.append(this.f44452b);
        sb2.append('+');
        sb2.append(this.f44453c);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f44451a = z;
        this.f44452b = i;
        this.f44453c = i2;
        this.matrixWidth = i3;
        this.matrixHeight = i4;
        this.f44454d = i5;
        this.f44455e = i6;
        this.f44456f = i7;
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint) {
        return m65912c(i, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int i, boolean z, boolean z2) {
        return m65912c(i, z ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, z2);
    }

    public static SymbolInfo lookup(int i, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z) {
        SymbolInfo[] symbolInfoArr;
        for (SymbolInfo symbolInfo : f44450h) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.f44451a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f44451a) && ((dimension == null || (symbolInfo.getSymbolWidth() >= dimension.getWidth() && symbolInfo.getSymbolHeight() >= dimension.getHeight())) && ((dimension2 == null || (symbolInfo.getSymbolWidth() <= dimension2.getWidth() && symbolInfo.getSymbolHeight() <= dimension2.getHeight())) && i <= symbolInfo.f44452b)))) {
                return symbolInfo;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        }
        return null;
    }
}
