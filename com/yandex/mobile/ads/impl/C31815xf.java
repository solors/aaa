package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yandex.mobile.ads.impl.xf */
/* loaded from: classes8.dex */
public final class C31815xf extends AbstractC30731kj {

    /* renamed from: e */
    private final AssetManager f87665e;
    @Nullable

    /* renamed from: f */
    private Uri f87666f;
    @Nullable

    /* renamed from: g */
    private InputStream f87667g;

    /* renamed from: h */
    private long f87668h;

    /* renamed from: i */
    private boolean f87669i;

    /* renamed from: com.yandex.mobile.ads.impl.xf$a */
    /* loaded from: classes8.dex */
    public static final class C31816a extends C30748ku {
        public C31816a(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C31815xf(Context context) {
        super(false);
        this.f87665e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws C31816a {
        int i;
        try {
            Uri uri = c30976nu.f83111a;
            this.f87666f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            m32537b(c30976nu);
            InputStream open = this.f87665e.open(path, 1);
            this.f87667g = open;
            if (open.skip(c30976nu.f83116f) >= c30976nu.f83116f) {
                long j = c30976nu.f83117g;
                if (j != -1) {
                    this.f87668h = j;
                } else {
                    long available = this.f87667g.available();
                    this.f87668h = available;
                    if (available == 2147483647L) {
                        this.f87668h = -1L;
                    }
                }
                this.f87669i = true;
                m32535c(c30976nu);
                return this.f87668h;
            }
            throw new C31816a(null, 2008);
        } catch (C31816a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new C31816a(e2, i);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws C31816a {
        this.f87666f = null;
        try {
            try {
                InputStream inputStream = this.f87667g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C31816a(e, 2000);
            }
        } finally {
            this.f87667g = null;
            if (this.f87669i) {
                this.f87669i = false;
                m32534e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f87666f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws C31816a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f87668h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C31816a(e, 2000);
            }
        }
        InputStream inputStream = this.f87667g;
        int i3 = y32.f88010a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f87668h;
        if (j2 != -1) {
            this.f87668h = j2 - read;
        }
        m32536c(read);
        return read;
    }
}
