package com.android.volley.toolbox;

import androidx.annotation.Nullable;
import com.android.volley.Header;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.volley.toolbox.f */
/* loaded from: classes2.dex */
public final class HttpResponse {

    /* renamed from: a */
    private final int f3532a;

    /* renamed from: b */
    private final List<Header> f3533b;

    /* renamed from: c */
    private final int f3534c;
    @Nullable

    /* renamed from: d */
    private final InputStream f3535d;
    @Nullable

    /* renamed from: e */
    private final byte[] f3536e;

    public HttpResponse(int i, List<Header> list) {
        this(i, list, -1, null);
    }

    @Nullable
    /* renamed from: a */
    public final InputStream m102229a() {
        InputStream inputStream = this.f3535d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f3536e != null) {
            return new ByteArrayInputStream(this.f3536e);
        }
        return null;
    }

    /* renamed from: b */
    public final int m102228b() {
        return this.f3534c;
    }

    /* renamed from: c */
    public final List<Header> m102227c() {
        return Collections.unmodifiableList(this.f3533b);
    }

    /* renamed from: d */
    public final int m102226d() {
        return this.f3532a;
    }

    public HttpResponse(int i, List<Header> list, int i2, InputStream inputStream) {
        this.f3532a = i;
        this.f3533b = list;
        this.f3534c = i2;
        this.f3535d = inputStream;
        this.f3536e = null;
    }
}
