package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg;

import android.util.Log;
import com.bytedance.sdk.component.p275zx.InterfaceC7784bX;
import com.bytedance.sdk.component.p275zx.p277bX.p279bX.C7795IL;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg.C7812bg;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.IL */
/* loaded from: classes3.dex */
public class C7809IL implements InterfaceC7784bX {

    /* renamed from: IL */
    private C7812bg f17035IL;

    /* renamed from: bg */
    private long f17036bg;

    public C7809IL(File file, long j, ExecutorService executorService) {
        this.f17036bg = j;
        try {
            this.f17035IL = C7812bg.m87659bg(file, 20210302, 1, j, executorService);
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.toString());
        }
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bX */
    public boolean mo87586IL(String str) {
        boolean z = false;
        try {
            try {
                C7812bg.C7816bX m87657bg = this.f17035IL.m87657bg(str);
                if (m87657bg != null) {
                    z = true;
                }
                C7795IL.m87725bg(m87657bg);
                return z;
            } catch (IOException e) {
                Log.w("LruCountDiskCache", e.getMessage());
                C7795IL.m87725bg(null);
                return false;
            }
        } catch (Throwable th) {
            C7795IL.m87725bg(null);
            throw th;
        }
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: IL  reason: avoid collision after fix types in other method */
    public byte[] mo87585bg(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        C7812bg c7812bg = this.f17035IL;
        InputStream inputStream2 = null;
        if (c7812bg == null || str == null) {
            return null;
        }
        try {
            C7812bg.C7816bX m87657bg = c7812bg.m87657bg(str);
            if (m87657bg == null) {
                C7795IL.m87725bg(null);
                C7795IL.m87725bg(null);
                return null;
            }
            inputStream = m87657bg.m87637bg(0);
            if (inputStream != null) {
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                } catch (IOException e) {
                    e = e;
                    byteArrayOutputStream = null;
                    Log.w("LruCountDiskCache", e.toString());
                    C7795IL.m87725bg(inputStream);
                    C7795IL.m87725bg(byteArrayOutputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    C7795IL.m87725bg(inputStream2);
                    C7795IL.m87725bg(byteArrayOutputStream);
                    throw th;
                }
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        C7795IL.m87725bg(inputStream2);
                        C7795IL.m87725bg(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    Log.w("LruCountDiskCache", e.toString());
                    C7795IL.m87725bg(inputStream);
                    C7795IL.m87725bg(byteArrayOutputStream);
                    return null;
                }
            } else {
                byteArrayOutputStream = null;
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C7795IL.m87725bg(inputStream);
            C7795IL.m87725bg(byteArrayOutputStream);
            return byteArray;
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            C7795IL.m87725bg(inputStream2);
            C7795IL.m87725bg(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7784bX
    /* renamed from: bg */
    public InputStream mo87678bg(String str) {
        C7812bg c7812bg = this.f17035IL;
        if (c7812bg == null) {
            return null;
        }
        try {
            C7812bg.C7816bX m87657bg = c7812bg.m87657bg(str);
            if (m87657bg != null) {
                return m87657bg.m87637bg(0);
            }
        } catch (IOException e) {
            Log.w("LruCountDiskCache", e.getMessage());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public boolean mo87584bg(String str, byte[] bArr) {
        Closeable closeable;
        C7812bg c7812bg = this.f17035IL;
        if (c7812bg == null || bArr == null || str == null) {
            return false;
        }
        C7812bg.C7817bg c7817bg = null;
        Closeable closeable2 = null;
        try {
            try {
                C7812bg.C7817bg m87670IL = c7812bg.m87670IL(str);
                try {
                    if (m87670IL == null) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for edit null");
                        C7795IL.m87725bg(null);
                        return false;
                    }
                    OutputStream m87633bg = m87670IL.m87633bg(0);
                    if (m87633bg == C7812bg.f17042bX) {
                        Log.w("LruCountDiskCache", "save " + str + " failed for null OutputStream");
                        C7795IL.m87725bg(m87633bg);
                        return false;
                    }
                    m87633bg.write(bArr);
                    m87670IL.m87634bg();
                    this.f17035IL.m87665bg();
                    C7795IL.m87725bg(m87633bg);
                    return true;
                } catch (IOException e) {
                    e = e;
                    closeable = null;
                    c7817bg = m87670IL;
                    try {
                        Log.w("LruCountDiskCache", e.toString());
                        if (c7817bg != null) {
                            try {
                                c7817bg.m87636IL();
                            } catch (IOException unused) {
                            }
                        }
                        C7795IL.m87725bg(closeable);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeable2 = closeable;
                        C7795IL.m87725bg(closeable2);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                closeable = null;
            }
        } catch (Throwable th2) {
            th = th2;
            C7795IL.m87725bg(closeable2);
            throw th;
        }
    }
}
