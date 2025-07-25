package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Result {

    /* renamed from: a */
    private final String f44176a;

    /* renamed from: b */
    private final byte[] f44177b;

    /* renamed from: c */
    private final int f44178c;

    /* renamed from: d */
    private ResultPoint[] f44179d;

    /* renamed from: e */
    private final BarcodeFormat f44180e;

    /* renamed from: f */
    private Map<ResultMetadataType, Object> f44181f;

    /* renamed from: g */
    private final long f44182g;

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, resultPointArr, barcodeFormat, System.currentTimeMillis());
    }

    public void addResultPoints(ResultPoint[] resultPointArr) {
        ResultPoint[] resultPointArr2 = this.f44179d;
        if (resultPointArr2 == null) {
            this.f44179d = resultPointArr;
        } else if (resultPointArr != null && resultPointArr.length > 0) {
            ResultPoint[] resultPointArr3 = new ResultPoint[resultPointArr2.length + resultPointArr.length];
            System.arraycopy(resultPointArr2, 0, resultPointArr3, 0, resultPointArr2.length);
            System.arraycopy(resultPointArr, 0, resultPointArr3, resultPointArr2.length, resultPointArr.length);
            this.f44179d = resultPointArr3;
        }
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.f44180e;
    }

    public int getNumBits() {
        return this.f44178c;
    }

    public byte[] getRawBytes() {
        return this.f44177b;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.f44181f;
    }

    public ResultPoint[] getResultPoints() {
        return this.f44179d;
    }

    public String getText() {
        return this.f44176a;
    }

    public long getTimestamp() {
        return this.f44182g;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f44181f;
            if (map2 == null) {
                this.f44181f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f44181f == null) {
            this.f44181f = new EnumMap(ResultMetadataType.class);
        }
        this.f44181f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f44176a;
    }

    public Result(String str, byte[] bArr, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, resultPointArr, barcodeFormat, j);
    }

    public Result(String str, byte[] bArr, int i, ResultPoint[] resultPointArr, BarcodeFormat barcodeFormat, long j) {
        this.f44176a = str;
        this.f44177b = bArr;
        this.f44178c = i;
        this.f44179d = resultPointArr;
        this.f44180e = barcodeFormat;
        this.f44181f = null;
        this.f44182g = j;
    }
}
