package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6412eqN;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.C6438zx;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL.C6378bX;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p233Kg.C7255ldr;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX */
/* loaded from: classes3.dex */
public class C6401bX extends AbstractC6410bg {

    /* renamed from: IL */
    private final LinkedHashMap<String, File> f13345IL = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: Kg */
    private volatile float f13346Kg;

    /* renamed from: VB */
    private final Handler f13347VB;

    /* renamed from: WR */
    private final C6408IL f13348WR;

    /* renamed from: bX */
    private final ReentrantReadWriteLock f13349bX;

    /* renamed from: bg */
    public final File f13350bg;

    /* renamed from: eo */
    private final Runnable f13351eo;
    private final ReentrantReadWriteLock.ReadLock eqN;

    /* renamed from: iR */
    private volatile long f13352iR;
    private final Set<InterfaceC6409bg> ldr;

    /* renamed from: zx */
    private final ReentrantReadWriteLock.WriteLock f13353zx;

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX$IL */
    /* loaded from: classes3.dex */
    public static final class C6408IL {

        /* renamed from: bg */
        private final Map<String, Integer> f13362bg;

        private C6408IL() {
            this.f13362bg = new HashMap();
        }

        /* renamed from: IL */
        synchronized void m92035IL(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f13362bg.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f13362bg.remove(str);
                    return;
                }
                this.f13362bg.put(str, Integer.valueOf(num.intValue() - 1));
            }
        }

        /* renamed from: bX */
        synchronized boolean m92034bX(String str) {
            if (!TextUtils.isEmpty(str)) {
                return this.f13362bg.containsKey(str);
            }
            return false;
        }

        /* renamed from: bg */
        synchronized void m92033bg(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f13362bg.get(str);
                if (num == null) {
                    this.f13362bg.put(str, 1);
                    return;
                }
                this.f13362bg.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC6409bg {
        /* renamed from: bg */
        void mo91951bg(String str);

        /* renamed from: bg */
        void mo91950bg(Set<String> set);
    }

    public C6401bX(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f13349bX = reentrantReadWriteLock;
        this.eqN = reentrantReadWriteLock.readLock();
        this.f13353zx = reentrantReadWriteLock.writeLock();
        this.ldr = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f13352iR = 104857600L;
        this.f13346Kg = 0.5f;
        this.f13348WR = new C6408IL();
        this.f13351eo = new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.1
            {
                C6401bX.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7255ldr.m89462IL(new AbstractRunnableC7227Kg("cleanupCmd", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.1.1
                    {
                        RunnableC64021.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C6401bX c6401bX = C6401bX.this;
                        c6401bX.m92045IL(c6401bX.f13352iR);
                    }
                });
            }
        };
        this.f13347VB = new Handler(Looper.getMainLooper());
        if (file != null && file.exists() && file.isDirectory() && file.canRead() && file.canWrite()) {
            this.f13350bg = file;
            C7255ldr.m89462IL(new AbstractRunnableC7227Kg("DiskLruCache", 5) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.2
                {
                    C6401bX.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C6401bX.this.m92046IL();
                }
            });
            return;
        }
        if (file == null) {
            str = " dir null";
        } else {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        }
        throw new IOException("dir error!  ".concat(String.valueOf(str)));
    }

    /* renamed from: bX */
    private void m92043bX() {
        this.f13347VB.removeCallbacks(this.f13351eo);
        this.f13347VB.postDelayed(this.f13351eo, 10000L);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.AbstractC6410bg
    public File eqN(String str) {
        if (this.eqN.tryLock()) {
            File file = this.f13345IL.get(str);
            this.eqN.unlock();
            return file;
        }
        return null;
    }

    /* renamed from: IL */
    public void m92046IL() {
        this.f13353zx.lock();
        try {
            File[] listFiles = this.f13350bg.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.3
                    {
                        C6401bX.this = this;
                    }

                    @Override // java.util.Comparator
                    /* renamed from: bg */
                    public int compare(File file2, File file3) {
                        int i = ((((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue()) > 0L ? 1 : ((((Long) hashMap.get(file2)).longValue() - ((Long) hashMap.get(file3)).longValue()) == 0L ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        if (i > 0) {
                            return 1;
                        }
                        return 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f13345IL.put(m92037bg(file2), file2);
                }
            }
            this.f13353zx.unlock();
            m92043bX();
        } catch (Throwable th) {
            this.f13353zx.unlock();
            throw th;
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.AbstractC6410bg
    /* renamed from: bX */
    public File mo92031bX(String str) {
        this.eqN.lock();
        File file = this.f13345IL.get(str);
        this.eqN.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f13350bg, str);
        this.f13353zx.lock();
        this.f13345IL.put(str, file2);
        this.f13353zx.unlock();
        for (InterfaceC6409bg interfaceC6409bg : this.ldr) {
            interfaceC6409bg.mo91951bg(str);
        }
        m92043bX();
        return file2;
    }

    /* renamed from: bg */
    public void m92040bg(InterfaceC6409bg interfaceC6409bg) {
        if (interfaceC6409bg != null) {
            this.ldr.add(interfaceC6409bg);
        }
    }

    /* renamed from: bg */
    public void m92041bg(long j) {
        this.f13352iR = j;
        m92043bX();
    }

    /* renamed from: bg */
    public void m92042bg() {
        C6412eqN.m92026bX().eqN();
        Context m91955bg = C6438zx.m91955bg();
        if (m91955bg != null) {
            C6378bX.m92085bg(m91955bg).m92086bg(0);
        }
        this.f13347VB.removeCallbacks(this.f13351eo);
        C7255ldr.m89462IL(new AbstractRunnableC7227Kg("clear", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.4
            {
                C6401bX.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6401bX.this.m92045IL(0L);
            }
        });
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.AbstractC6410bg
    /* renamed from: bg */
    public void mo92030bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13348WR.m92033bg(str);
    }

    /* renamed from: bg */
    private String m92037bg(File file) {
        return file.getName();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p142bg.AbstractC6410bg
    /* renamed from: IL */
    public void mo92032IL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13348WR.m92035IL(str);
    }

    /* renamed from: IL */
    public void m92045IL(long j) {
        HashSet hashSet;
        long j2;
        final HashSet hashSet2 = new HashSet();
        this.f13353zx.lock();
        try {
            j2 = 0;
            for (Map.Entry<String, File> entry : this.f13345IL.entrySet()) {
                j2 += entry.getValue().length();
            }
        } catch (Throwable unused) {
            hashSet = null;
        }
        if (j2 <= j) {
            this.f13353zx.unlock();
            return;
        }
        long j3 = ((float) j) * this.f13346Kg;
        hashSet = new HashSet();
        try {
            for (Map.Entry<String, File> entry2 : this.f13345IL.entrySet()) {
                File value = entry2.getValue();
                if (value != null && value.exists()) {
                    if (!this.f13348WR.m92034bX(m92037bg(value))) {
                        long length = value.length();
                        File file = new File(value.getAbsolutePath() + "-tmp");
                        if (value.renameTo(file)) {
                            hashSet2.add(file);
                            j2 -= length;
                            hashSet.add(entry2.getKey());
                        }
                    }
                } else {
                    hashSet.add(entry2.getKey());
                }
                if (j2 <= j3) {
                    break;
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.f13345IL.remove((String) it.next());
            }
        } catch (Throwable unused2) {
        }
        this.f13353zx.unlock();
        for (InterfaceC6409bg interfaceC6409bg : this.ldr) {
            interfaceC6409bg.mo91950bg(hashSet);
        }
        C7255ldr.m89462IL(new AbstractRunnableC7227Kg("trimSize", 1) { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.bg.bX.5
            {
                C6401bX.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    try {
                        ((File) it2.next()).delete();
                    } catch (Throwable unused3) {
                    }
                }
            }
        });
    }
}
