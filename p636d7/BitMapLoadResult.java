package p636d7;

import android.graphics.Bitmap;

/* renamed from: d7.a */
/* loaded from: classes5.dex */
public class BitMapLoadResult {

    /* renamed from: a */
    private final Bitmap f89534a;

    /* renamed from: b */
    private final String f89535b;

    /* renamed from: c */
    private final String f89536c;

    public BitMapLoadResult(Bitmap bitmap) {
        this.f89534a = bitmap;
        this.f89535b = null;
        this.f89536c = null;
    }

    /* renamed from: a */
    public Bitmap m25714a() {
        return this.f89534a;
    }

    /* renamed from: b */
    public String m25713b() {
        return this.f89536c;
    }

    /* renamed from: c */
    public String m25712c() {
        return this.f89535b;
    }

    public BitMapLoadResult(Bitmap bitmap, String str, String str2) {
        this.f89534a = bitmap;
        this.f89535b = str;
        this.f89536c = str2;
    }
}
