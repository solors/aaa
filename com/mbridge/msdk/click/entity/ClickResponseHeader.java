package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* renamed from: com.mbridge.msdk.click.entity.a */
/* loaded from: classes6.dex */
public final class ClickResponseHeader {

    /* renamed from: a */
    public String f55369a;

    /* renamed from: b */
    public String f55370b;

    /* renamed from: c */
    public String f55371c;

    /* renamed from: d */
    public String f55372d;

    /* renamed from: e */
    public int f55373e;

    /* renamed from: f */
    public int f55374f;

    /* renamed from: g */
    public String f55375g;

    /* renamed from: h */
    public String f55376h;

    /* renamed from: a */
    public final String m53159a() {
        return "statusCode=" + this.f55374f + ", location=" + this.f55369a + ", contentType=" + this.f55370b + ", contentLength=" + this.f55373e + ", contentEncoding=" + this.f55371c + ", referer=" + this.f55372d;
    }

    @NonNull
    public final String toString() {
        return "ClickResponseHeader{location='" + this.f55369a + "', contentType='" + this.f55370b + "', contentEncoding='" + this.f55371c + "', referer='" + this.f55372d + "', contentLength=" + this.f55373e + ", statusCode=" + this.f55374f + ", url='" + this.f55375g + "', exception='" + this.f55376h + "'}";
    }
}
