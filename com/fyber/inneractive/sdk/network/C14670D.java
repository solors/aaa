package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.cache.C14274k;
import com.fyber.inneractive.sdk.cache.InterfaceC14264a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.network.D */
/* loaded from: classes4.dex */
public final class C14670D {

    /* renamed from: a */
    public final Context f27793a;

    /* renamed from: b */
    public final InterfaceC14264a f27794b;

    /* renamed from: c */
    public SharedPreferences f27795c;

    public C14670D(Context context, InterfaceC14264a interfaceC14264a) {
        this.f27793a = context;
        this.f27794b = interfaceC14264a;
    }

    /* renamed from: a */
    public final C14274k m77733a() {
        try {
            if (!this.f27794b.mo77936d()) {
                new C14669C();
                return new C14274k();
            }
            Object mo77939a = this.f27794b.mo77939a(m77732a(this.f27794b.mo77937c()));
            if (this.f27795c == null) {
                this.f27795c = this.f27793a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new C14274k(mo77939a, this.f27795c.getString(this.f27794b.mo77938b(), null));
        } catch (Exception unused) {
            if (this.f27795c == null) {
                this.f27795c = this.f27793a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            this.f27795c.edit().remove(this.f27794b.mo77938b()).apply();
            return new C14274k();
        }
    }

    /* renamed from: a */
    public final String m77732a(String str) {
        FileInputStream fileInputStream;
        IAlog.m76529a("reading local file: %s", str);
        FileInputStream fileInputStream2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        try {
            fileInputStream = this.f27793a.openFileInput(str);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String str3 = new String(bArr, "UTF-8");
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    IAlog.m76524f("Failed closing local file: %s", e2.getMessage());
                }
                str2 = str3;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e3) {
                        IAlog.m76524f("Failed closing local file: %s", e3.getMessage());
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            if (!(e instanceof FileNotFoundException)) {
                IAlog.m76529a("Failed reading local file: %s", e.getMessage());
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e5) {
                        IAlog.m76524f("Failed closing local file: %s", e5.getMessage());
                    }
                }
                IAlog.m76529a("local file %s read successfully", str);
                return str2;
            }
            throw new FileNotFoundException();
        }
        IAlog.m76529a("local file %s read successfully", str);
        return str2;
    }
}
