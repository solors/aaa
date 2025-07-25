package com.google.zxing.common;

import java.util.List;

/* loaded from: classes5.dex */
public final class DecoderResult {

    /* renamed from: a */
    private final byte[] f44352a;

    /* renamed from: b */
    private int f44353b;

    /* renamed from: c */
    private final String f44354c;

    /* renamed from: d */
    private final List<byte[]> f44355d;

    /* renamed from: e */
    private final String f44356e;

    /* renamed from: f */
    private Integer f44357f;

    /* renamed from: g */
    private Integer f44358g;

    /* renamed from: h */
    private Object f44359h;

    /* renamed from: i */
    private final int f44360i;

    /* renamed from: j */
    private final int f44361j;

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> getByteSegments() {
        return this.f44355d;
    }

    public String getECLevel() {
        return this.f44356e;
    }

    public Integer getErasures() {
        return this.f44358g;
    }

    public Integer getErrorsCorrected() {
        return this.f44357f;
    }

    public int getNumBits() {
        return this.f44353b;
    }

    public Object getOther() {
        return this.f44359h;
    }

    public byte[] getRawBytes() {
        return this.f44352a;
    }

    public int getStructuredAppendParity() {
        return this.f44360i;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.f44361j;
    }

    public String getText() {
        return this.f44354c;
    }

    public boolean hasStructuredAppend() {
        if (this.f44360i >= 0 && this.f44361j >= 0) {
            return true;
        }
        return false;
    }

    public void setErasures(Integer num) {
        this.f44358g = num;
    }

    public void setErrorsCorrected(Integer num) {
        this.f44357f = num;
    }

    public void setNumBits(int i) {
        this.f44353b = i;
    }

    public void setOther(Object obj) {
        this.f44359h = obj;
    }

    public DecoderResult(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f44352a = bArr;
        this.f44353b = bArr == null ? 0 : bArr.length * 8;
        this.f44354c = str;
        this.f44355d = list;
        this.f44356e = str2;
        this.f44360i = i2;
        this.f44361j = i;
    }
}
