package com.bytedance.sdk.openadsdk.core.settings;

import android.os.SystemClock;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.C9554eo;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.Lq */
/* loaded from: classes3.dex */
public abstract class AbstractC8995Lq implements InterfaceC9036zx {

    /* renamed from: eo */
    private InterfaceC8998bg f20081eo;

    /* renamed from: iR */
    private final String f20082iR;

    /* renamed from: bX */
    private final ConcurrentHashMap<String, Object> f20080bX = new ConcurrentHashMap<>();
    private final Object eqN = new Object();

    /* renamed from: zx */
    private final Object f20083zx = new Object();
    private final CountDownLatch ldr = new CountDownLatch(1);

    /* renamed from: Kg */
    private Properties f20078Kg = new Properties();

    /* renamed from: WR */
    private volatile boolean f20079WR = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.Lq$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC8998bg {
        /* renamed from: IL */
        void mo82670IL();

        /* renamed from: bg */
        void mo82669bg();
    }

    public AbstractC8995Lq(String str, InterfaceC8998bg interfaceC8998bg) {
        this.f20082iR = str;
        this.f20081eo = interfaceC8998bg;
        C9519VJ.m82577bg(new AbstractRunnableC7227Kg("SetL_".concat(String.valueOf(str))) { // from class: com.bytedance.sdk.openadsdk.core.settings.Lq.1
            @Override // java.lang.Runnable
            public void run() {
                AbstractC8995Lq.this.m83844bg(false);
            }
        });
    }

    private File ldr() {
        return new File(C8838VzQ.m84740bg().getFilesDir(), this.f20082iR);
    }

    /* renamed from: zx */
    private void m83843zx() {
        int i;
        if (!this.f20079WR) {
            try {
                SystemClock.elapsedRealtime();
                if (C9519VJ.m82567zx()) {
                    i = 4;
                } else {
                    i = 8;
                }
                this.ldr.await(i, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                C7741PX.m87871bg("SdkSettings.Prop", "awaitLoadedLocked: ", e);
            }
        }
    }

    /* renamed from: bX */
    public void m83855bX() {
        File ldr = ldr();
        if (ldr.exists()) {
            ldr.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void eqN() {
        InterfaceC8998bg interfaceC8998bg = this.f20081eo;
        if (interfaceC8998bg != null) {
            interfaceC8998bg.mo82670IL();
        }
    }

    /* renamed from: IL */
    public boolean m83858IL() {
        return this.f20079WR;
    }

    /* renamed from: bg */
    public String m83847bg(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return str2;
        }
        m83843zx();
        return this.f20078Kg.getProperty(str, str2);
    }

    /* renamed from: bg */
    public int m83850bg(String str, int i) {
        if (str != null && !str.isEmpty()) {
            m83843zx();
            try {
                return Integer.parseInt(this.f20078Kg.getProperty(str, String.valueOf(i)));
            } catch (NumberFormatException e) {
                C7741PX.m87871bg("SdkSettings.Prop", "", e);
            }
        }
        return i;
    }

    /* renamed from: bg */
    public long m83849bg(String str, long j) {
        if (str != null && !str.isEmpty()) {
            m83843zx();
            try {
                return Long.parseLong(this.f20078Kg.getProperty(str, String.valueOf(j)));
            } catch (NumberFormatException e) {
                C7741PX.m87871bg("SdkSettings.Prop", "", e);
            }
        }
        return j;
    }

    /* renamed from: bg */
    public float m83851bg(String str, float f) {
        if (str != null && !str.isEmpty()) {
            m83843zx();
            try {
                return Float.parseFloat(this.f20078Kg.getProperty(str, String.valueOf(f)));
            } catch (NumberFormatException e) {
                C7741PX.m87871bg("SdkSettings.Prop", "", e);
            }
        }
        return f;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.settings.Lq$IL */
    /* loaded from: classes3.dex */
    public class C8997IL implements InterfaceC9036zx.InterfaceC9040bg {

        /* renamed from: IL */
        private final Map<String, Object> f20085IL = new HashMap();

        /* renamed from: bX */
        private final Object f20086bX = new Object();

        public C8997IL() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public void mo83722bg() {
            Object obj;
            Properties properties = new Properties();
            synchronized (this.f20086bX) {
                properties.putAll(AbstractC8995Lq.this.f20078Kg);
                boolean z = false;
                for (Map.Entry<String, Object> entry : this.f20085IL.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != this && value != null) {
                        if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(value)) {
                            properties.put(key, String.valueOf(value));
                            z = true;
                        }
                    }
                    if (properties.containsKey(key)) {
                        properties.remove(key);
                        z = true;
                    }
                }
                this.f20085IL.clear();
                if (z) {
                    AbstractC8995Lq.this.m83845bg(properties);
                    AbstractC8995Lq.this.f20078Kg = properties;
                    AbstractC8995Lq.this.f20080bX.clear();
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83717bg(String str, String str2) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, str2);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83719bg(String str, int i) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83718bg(String str, long j) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83721bg(String str) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, this);
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83720bg(String str, float f) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // com.bytedance.sdk.openadsdk.core.settings.InterfaceC9036zx.InterfaceC9040bg
        /* renamed from: bg */
        public InterfaceC9036zx.InterfaceC9040bg mo83716bg(String str, boolean z) {
            synchronized (this.f20086bX) {
                this.f20085IL.put(str, Boolean.valueOf(z));
            }
            return this;
        }
    }

    /* renamed from: bg */
    public boolean m83846bg(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            m83843zx();
            try {
                return Boolean.parseBoolean(this.f20078Kg.getProperty(str, String.valueOf(z)));
            } catch (Exception e) {
                C7741PX.m87871bg("SdkSettings.Prop", "", e);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8 A[Catch: all -> 0x0108, TryCatch #5 {, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000b, B:11:0x0016, B:17:0x0042, B:18:0x0047, B:60:0x00f4, B:62:0x00f8, B:64:0x00fc, B:65:0x00ff, B:66:0x0106, B:26:0x005b, B:27:0x005e, B:36:0x0071, B:37:0x0074, B:42:0x0082, B:44:0x008c, B:46:0x0096, B:48:0x00ab, B:49:0x00bb, B:51:0x00c1, B:53:0x00d3, B:56:0x00db, B:58:0x00e6, B:59:0x00e9, B:24:0x0052, B:31:0x0063), top: B:79:0x0003 }] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m83844bg(boolean r9) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.AbstractC8995Lq.m83844bg(boolean):void");
    }

    /* renamed from: bg */
    public InterfaceC9036zx.InterfaceC9040bg m83854bg() {
        return new C8997IL();
    }

    /* renamed from: bg */
    public <T> T m83848bg(String str, T t, InterfaceC9036zx.InterfaceC9039IL<T> interfaceC9039IL) {
        T mo83723IL;
        if (str != null && !str.isEmpty()) {
            if (this.f20080bX.containsKey(str)) {
                try {
                    return (T) this.f20080bX.get(str);
                } catch (Exception e) {
                    C7741PX.m87871bg("SdkSettings.Prop", "", e);
                    return t;
                }
            }
            m83843zx();
            String property = this.f20078Kg.getProperty(str, null);
            if (property != null && interfaceC9039IL != null && (mo83723IL = interfaceC9039IL.mo83723IL(property)) != null) {
                this.f20080bX.put(str, mo83723IL);
                return mo83723IL;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m83845bg(Properties properties) {
        synchronized (this.f20083zx) {
            File ldr = ldr();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(ldr);
                    try {
                        properties.store(fileOutputStream2, (String) null);
                        ldr.getAbsolutePath();
                        C9554eo.m82414bg(fileOutputStream2);
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        C7741PX.m87871bg("SdkSettings.Prop", "saveToLocal: ", e);
                        if (fileOutputStream != null) {
                            C9554eo.m82414bg(fileOutputStream);
                        }
                        C9011xxp.ews();
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            C9554eo.m82414bg(fileOutputStream);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        C9011xxp.ews();
    }
}
