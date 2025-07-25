package com.google.zxing.pdf417;

/* loaded from: classes5.dex */
public final class PDF417ResultMetadata {

    /* renamed from: a */
    private int f44593a;

    /* renamed from: b */
    private String f44594b;

    /* renamed from: c */
    private boolean f44595c;

    /* renamed from: e */
    private String f44597e;

    /* renamed from: f */
    private String f44598f;

    /* renamed from: g */
    private String f44599g;

    /* renamed from: k */
    private int[] f44603k;

    /* renamed from: d */
    private int f44596d = -1;

    /* renamed from: h */
    private long f44600h = -1;

    /* renamed from: i */
    private long f44601i = -1;

    /* renamed from: j */
    private int f44602j = -1;

    public String getAddressee() {
        return this.f44598f;
    }

    public int getChecksum() {
        return this.f44602j;
    }

    public String getFileId() {
        return this.f44594b;
    }

    public String getFileName() {
        return this.f44599g;
    }

    public long getFileSize() {
        return this.f44600h;
    }

    @Deprecated
    public int[] getOptionalData() {
        return this.f44603k;
    }

    public int getSegmentCount() {
        return this.f44596d;
    }

    public int getSegmentIndex() {
        return this.f44593a;
    }

    public String getSender() {
        return this.f44597e;
    }

    public long getTimestamp() {
        return this.f44601i;
    }

    public boolean isLastSegment() {
        return this.f44595c;
    }

    public void setAddressee(String str) {
        this.f44598f = str;
    }

    public void setChecksum(int i) {
        this.f44602j = i;
    }

    public void setFileId(String str) {
        this.f44594b = str;
    }

    public void setFileName(String str) {
        this.f44599g = str;
    }

    public void setFileSize(long j) {
        this.f44600h = j;
    }

    public void setLastSegment(boolean z) {
        this.f44595c = z;
    }

    @Deprecated
    public void setOptionalData(int[] iArr) {
        this.f44603k = iArr;
    }

    public void setSegmentCount(int i) {
        this.f44596d = i;
    }

    public void setSegmentIndex(int i) {
        this.f44593a = i;
    }

    public void setSender(String str) {
        this.f44597e = str;
    }

    public void setTimestamp(long j) {
        this.f44601i = j;
    }
}
