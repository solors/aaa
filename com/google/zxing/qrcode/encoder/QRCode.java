package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes5.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;

    /* renamed from: a */
    private Mode f44750a;

    /* renamed from: b */
    private ErrorCorrectionLevel f44751b;

    /* renamed from: c */
    private Version f44752c;

    /* renamed from: d */
    private int f44753d = -1;

    /* renamed from: e */
    private ByteMatrix f44754e;

    public static boolean isValidMaskPattern(int i) {
        if (i >= 0 && i < 8) {
            return true;
        }
        return false;
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.f44751b;
    }

    public int getMaskPattern() {
        return this.f44753d;
    }

    public ByteMatrix getMatrix() {
        return this.f44754e;
    }

    public Mode getMode() {
        return this.f44750a;
    }

    public Version getVersion() {
        return this.f44752c;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.f44751b = errorCorrectionLevel;
    }

    public void setMaskPattern(int i) {
        this.f44753d = i;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.f44754e = byteMatrix;
    }

    public void setMode(Mode mode) {
        this.f44750a = mode;
    }

    public void setVersion(Version version) {
        this.f44752c = version;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f44750a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f44751b);
        sb2.append("\n version: ");
        sb2.append(this.f44752c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f44753d);
        if (this.f44754e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f44754e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
