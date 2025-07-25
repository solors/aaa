package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15109b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15110c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15123p;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CachedContentIndex;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i */
/* loaded from: classes4.dex */
public final class C15080i {

    /* renamed from: c */
    public final C15110c f29668c;

    /* renamed from: f */
    public boolean f29671f;

    /* renamed from: g */
    public C15123p f29672g;

    /* renamed from: d */
    public final Cipher f29669d = null;

    /* renamed from: e */
    public final SecretKeySpec f29670e = null;

    /* renamed from: a */
    public final HashMap f29666a = new HashMap();

    /* renamed from: b */
    public final SparseArray f29667b = new SparseArray();

    public C15080i(File file) {
        this.f29668c = new C15110c(new File(file, CachedContentIndex.FILE_NAME));
    }

    /* renamed from: a */
    public final void m77257a() {
        LinkedList linkedList = new LinkedList();
        for (C15079h c15079h : this.f29666a.values()) {
            if (c15079h.f29664c.isEmpty()) {
                linkedList.add(c15079h.f29663b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            C15079h c15079h2 = (C15079h) this.f29666a.remove((String) it.next());
            if (c15079h2 != null) {
                if (c15079h2.f29664c.isEmpty()) {
                    this.f29667b.remove(c15079h2.f29662a);
                    this.f29671f = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m77255b() {
        DataOutputStream dataOutputStream;
        IOException e;
        Throwable th;
        int i;
        if (!this.f29671f) {
            return;
        }
        DataOutputStream dataOutputStream2 = null;
        try {
            C15109b m77223b = this.f29668c.m77223b();
            C15123p c15123p = this.f29672g;
            if (c15123p == null) {
                this.f29672g = new C15123p(m77223b);
            } else {
                c15123p.m77176a(m77223b);
            }
            dataOutputStream = new DataOutputStream(this.f29672g);
        } catch (IOException e2) {
            dataOutputStream = dataOutputStream2;
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            dataOutputStream = dataOutputStream2;
            th = th3;
            AbstractC15133z.m77160a(dataOutputStream);
            throw th;
        }
        try {
            dataOutputStream.writeInt(1);
            if (this.f29669d != null) {
                i = 1;
            } else {
                i = 0;
            }
            dataOutputStream.writeInt(i);
            if (this.f29669d != null) {
                byte[] bArr = new byte[16];
                new Random().nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    this.f29669d.init(1, this.f29670e, new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f29672g, this.f29669d));
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new IllegalStateException(e);
                }
            } else {
                dataOutputStream2 = dataOutputStream;
            }
            dataOutputStream2.writeInt(this.f29666a.size());
            int i2 = 0;
            for (C15079h c15079h : this.f29666a.values()) {
                dataOutputStream2.writeInt(c15079h.f29662a);
                dataOutputStream2.writeUTF(c15079h.f29663b);
                dataOutputStream2.writeLong(c15079h.f29665d);
                int hashCode = c15079h.f29663b.hashCode();
                long j = c15079h.f29665d;
                i2 += ((hashCode + (c15079h.f29662a * 31)) * 31) + ((int) (j ^ (j >>> 32)));
            }
            dataOutputStream2.writeInt(i2);
            C15110c c15110c = this.f29668c;
            c15110c.getClass();
            dataOutputStream2.close();
            c15110c.f29773b.delete();
            int i3 = AbstractC15133z.f29832a;
            this.f29671f = false;
        } catch (IOException e5) {
            e = e5;
            try {
                throw new C15072a(e);
            } catch (Throwable th4) {
                DataOutputStream dataOutputStream3 = dataOutputStream;
                th = th4;
                dataOutputStream2 = dataOutputStream3;
                Throwable th32 = th;
                dataOutputStream = dataOutputStream2;
                th = th32;
                AbstractC15133z.m77160a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            AbstractC15133z.m77160a(dataOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final C15079h m77256a(String str, long j) {
        SparseArray sparseArray = this.f29667b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        C15079h c15079h = new C15079h(keyAt, str, j);
        this.f29666a.put(str, c15079h);
        this.f29667b.put(keyAt, str);
        this.f29671f = true;
        return c15079h;
    }
}
