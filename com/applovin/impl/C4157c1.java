package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.applovin.impl.c1 */
/* loaded from: classes2.dex */
public final class C4157c1 extends AbstractC3982a2 {

    /* renamed from: e */
    private final AssetManager f5169e;

    /* renamed from: f */
    private Uri f5170f;

    /* renamed from: g */
    private InputStream f5171g;

    /* renamed from: h */
    private long f5172h;

    /* renamed from: i */
    private boolean f5173i;

    /* renamed from: com.applovin.impl.c1$a */
    /* loaded from: classes2.dex */
    public static final class C4158a extends C4567i5 {
        public C4158a(Throwable th, int i) {
            super(th, i);
        }
    }

    public C4157c1(Context context) {
        super(false);
        this.f5169e = context.getAssets();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        try {
            Uri uri = c4698k5.f7366a;
            this.f5170f = uri;
            String str = (String) AbstractC4100b1.m100583a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            m101076b(c4698k5);
            InputStream open = this.f5169e.open(str, 1);
            this.f5171g = open;
            if (open.skip(c4698k5.f7372g) >= c4698k5.f7372g) {
                long j = c4698k5.f7373h;
                if (j != -1) {
                    this.f5172h = j;
                } else {
                    long available = this.f5171g.available();
                    this.f5172h = available;
                    if (available == 2147483647L) {
                        this.f5172h = -1L;
                    }
                }
                this.f5173i = true;
                m101075c(c4698k5);
                return this.f5172h;
            }
            throw new C4158a(null, 2008);
        } catch (C4158a e) {
            throw e;
        } catch (IOException e2) {
            throw new C4158a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f5170f;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f5170f = null;
        try {
            try {
                InputStream inputStream = this.f5171g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C4158a(e, 2000);
            }
        } finally {
            this.f5171g = null;
            if (this.f5173i) {
                this.f5173i = false;
                m101073g();
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f5172h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C4158a(e, 2000);
            }
        }
        int read = ((InputStream) AbstractC5863xp.m93017a((Object) this.f5171g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f5172h;
        if (j2 != -1) {
            this.f5172h = j2 - read;
        }
        m101074d(read);
        return read;
    }
}
