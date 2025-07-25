package com.google.zxing.qrcode.detector;

/* loaded from: classes5.dex */
public final class FinderPatternInfo {

    /* renamed from: a */
    private final FinderPattern f44736a;

    /* renamed from: b */
    private final FinderPattern f44737b;

    /* renamed from: c */
    private final FinderPattern f44738c;

    public FinderPatternInfo(FinderPattern[] finderPatternArr) {
        this.f44736a = finderPatternArr[0];
        this.f44737b = finderPatternArr[1];
        this.f44738c = finderPatternArr[2];
    }

    public FinderPattern getBottomLeft() {
        return this.f44736a;
    }

    public FinderPattern getTopLeft() {
        return this.f44737b;
    }

    public FinderPattern getTopRight() {
        return this.f44738c;
    }
}
