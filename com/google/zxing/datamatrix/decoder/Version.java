package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes5.dex */
public final class Version {

    /* renamed from: h */
    private static final Version[] f44415h = m65962a();

    /* renamed from: a */
    private final int f44416a;

    /* renamed from: b */
    private final int f44417b;

    /* renamed from: c */
    private final int f44418c;

    /* renamed from: d */
    private final int f44419d;

    /* renamed from: e */
    private final int f44420e;

    /* renamed from: f */
    private final ECBlocks f44421f;

    /* renamed from: g */
    private final int f44422g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ECB {

        /* renamed from: a */
        private final int f44423a;

        /* renamed from: b */
        private final int f44424b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public int m65960a() {
            return this.f44423a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m65959b() {
            return this.f44424b;
        }

        private ECB(int i, int i2) {
            this.f44423a = i;
            this.f44424b = i2;
        }
    }

    private Version(int i, int i2, int i3, int i4, int i5, ECBlocks eCBlocks) {
        ECB[] m65958a;
        this.f44416a = i;
        this.f44417b = i2;
        this.f44418c = i3;
        this.f44419d = i4;
        this.f44420e = i5;
        this.f44421f = eCBlocks;
        int m65957b = eCBlocks.m65957b();
        int i6 = 0;
        for (ECB ecb : eCBlocks.m65958a()) {
            i6 += ecb.m65960a() * (ecb.m65959b() + m65957b);
        }
        this.f44422g = i6;
    }

    /* renamed from: a */
    private static Version[] m65962a() {
        return new Version[]{new Version(1, 10, 10, 8, 8, new ECBlocks(5, new ECB(1, 3))), new Version(2, 12, 12, 10, 10, new ECBlocks(7, new ECB(1, 5))), new Version(3, 14, 14, 12, 12, new ECBlocks(10, new ECB(1, 8))), new Version(4, 16, 16, 14, 14, new ECBlocks(12, new ECB(1, 12))), new Version(5, 18, 18, 16, 16, new ECBlocks(14, new ECB(1, 18))), new Version(6, 20, 20, 18, 18, new ECBlocks(18, new ECB(1, 22))), new Version(7, 22, 22, 20, 20, new ECBlocks(20, new ECB(1, 30))), new Version(8, 24, 24, 22, 22, new ECBlocks(24, new ECB(1, 36))), new Version(9, 26, 26, 24, 24, new ECBlocks(28, new ECB(1, 44))), new Version(10, 32, 32, 14, 14, new ECBlocks(36, new ECB(1, 62))), new Version(11, 36, 36, 16, 16, new ECBlocks(42, new ECB(1, 86))), new Version(12, 40, 40, 18, 18, new ECBlocks(48, new ECB(1, 114))), new Version(13, 44, 44, 20, 20, new ECBlocks(56, new ECB(1, 144))), new Version(14, 48, 48, 22, 22, new ECBlocks(68, new ECB(1, 174))), new Version(15, 52, 52, 24, 24, new ECBlocks(42, new ECB(2, 102))), new Version(16, 64, 64, 14, 14, new ECBlocks(56, new ECB(2, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT))), new Version(17, 72, 72, 16, 16, new ECBlocks(36, new ECB(4, 92))), new Version(18, 80, 80, 18, 18, new ECBlocks(48, new ECB(4, 114))), new Version(19, 88, 88, 20, 20, new ECBlocks(56, new ECB(4, 144))), new Version(20, 96, 96, 22, 22, new ECBlocks(68, new ECB(4, 174))), new Version(21, 104, 104, 24, 24, new ECBlocks(56, new ECB(6, 136))), new Version(22, 120, 120, 18, 18, new ECBlocks(68, new ECB(6, 175))), new Version(23, 132, 132, 20, 20, new ECBlocks(62, new ECB(8, 163))), new Version(24, 144, 144, 22, 22, new ECBlocks(62, new ECB(8, 156), new ECB(2, 155))), new Version(25, 8, 18, 6, 16, new ECBlocks(7, new ECB(1, 5))), new Version(26, 8, 32, 6, 14, new ECBlocks(11, new ECB(1, 10))), new Version(27, 12, 26, 10, 24, new ECBlocks(14, new ECB(1, 16))), new Version(28, 12, 36, 10, 16, new ECBlocks(18, new ECB(1, 22))), new Version(29, 16, 36, 14, 16, new ECBlocks(24, new ECB(1, 32))), new Version(30, 16, 48, 14, 22, new ECBlocks(28, new ECB(1, 49)))};
    }

    public static Version getVersionForDimensions(int i, int i2) throws FormatException {
        Version[] versionArr;
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (Version version : f44415h) {
                if (version.f44417b == i && version.f44418c == i2) {
                    return version;
                }
            }
            throw FormatException.getFormatInstance();
        }
        throw FormatException.getFormatInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public ECBlocks m65961b() {
        return this.f44421f;
    }

    public int getDataRegionSizeColumns() {
        return this.f44420e;
    }

    public int getDataRegionSizeRows() {
        return this.f44419d;
    }

    public int getSymbolSizeColumns() {
        return this.f44418c;
    }

    public int getSymbolSizeRows() {
        return this.f44417b;
    }

    public int getTotalCodewords() {
        return this.f44422g;
    }

    public int getVersionNumber() {
        return this.f44416a;
    }

    public String toString() {
        return String.valueOf(this.f44416a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ECBlocks {

        /* renamed from: a */
        private final int f44425a;

        /* renamed from: b */
        private final ECB[] f44426b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public ECB[] m65958a() {
            return this.f44426b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public int m65957b() {
            return this.f44425a;
        }

        private ECBlocks(int i, ECB ecb) {
            this.f44425a = i;
            this.f44426b = new ECB[]{ecb};
        }

        private ECBlocks(int i, ECB ecb, ECB ecb2) {
            this.f44425a = i;
            this.f44426b = new ECB[]{ecb, ecb2};
        }
    }
}
