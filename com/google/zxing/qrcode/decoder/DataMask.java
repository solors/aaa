package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes5.dex */
enum DataMask {
    DATA_MASK_000 { // from class: com.google.zxing.qrcode.decoder.DataMask.1
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if (((i + i2) & 1) == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_001 { // from class: com.google.zxing.qrcode.decoder.DataMask.2
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if ((i & 1) == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_010 { // from class: com.google.zxing.qrcode.decoder.DataMask.3
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if (i2 % 3 == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_011 { // from class: com.google.zxing.qrcode.decoder.DataMask.4
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if ((i + i2) % 3 == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_100 { // from class: com.google.zxing.qrcode.decoder.DataMask.5
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if ((((i / 2) + (i2 / 3)) & 1) == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_101 { // from class: com.google.zxing.qrcode.decoder.DataMask.6
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if ((i * i2) % 6 == 0) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_110 { // from class: com.google.zxing.qrcode.decoder.DataMask.7
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if ((i * i2) % 6 < 3) {
                return true;
            }
            return false;
        }
    },
    DATA_MASK_111 { // from class: com.google.zxing.qrcode.decoder.DataMask.8
        @Override // com.google.zxing.qrcode.decoder.DataMask
        /* renamed from: b */
        boolean mo65561b(int i, int i2) {
            if (((i + i2 + ((i * i2) % 3)) & 1) == 0) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: b */
    abstract boolean mo65561b(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m65562c(BitMatrix bitMatrix, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo65561b(i2, i3)) {
                    bitMatrix.flip(i3, i2);
                }
            }
        }
    }
}
