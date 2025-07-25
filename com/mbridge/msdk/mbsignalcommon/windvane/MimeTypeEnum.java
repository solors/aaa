package com.mbridge.msdk.mbsignalcommon.windvane;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.e */
/* loaded from: classes6.dex */
public enum MimeTypeEnum {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML("html", "text/html");
    

    /* renamed from: j */
    private String f57756j;

    /* renamed from: k */
    private String f57757k;

    MimeTypeEnum(String str, String str2) {
        this.f57756j = str;
        this.f57757k = str2;
    }

    /* renamed from: a */
    public final String m51070a() {
        return this.f57756j;
    }

    /* renamed from: b */
    public final String m51069b() {
        return this.f57757k;
    }
}
