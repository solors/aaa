package com.bytedance.sdk.component;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.bytedance.sdk.component.IL */
/* loaded from: classes3.dex */
public class C7170IL {

    /* renamed from: PX */
    private static ArrayMap<File, C7170IL> f15459PX;

    /* renamed from: Ta */
    private static InterfaceC7176bg f15460Ta;
    @GuardedBy("TTPropHelper.class")

    /* renamed from: VB */
    private static ArrayMap<String, File> f15461VB;

    /* renamed from: bg */
    private static boolean f15462bg;

    /* renamed from: IL */
    private final Object f15463IL;
    @GuardedBy("mWriteLock")

    /* renamed from: Kg */
    private long f15464Kg;

    /* renamed from: WR */
    private final File f15465WR;

    /* renamed from: bX */
    private final Object f15466bX;

    /* renamed from: eo */
    private final File f15467eo;
    @GuardedBy("mLoadLock")
    private Properties eqN;
    @GuardedBy("this")

    /* renamed from: iR */
    private long f15468iR;
    @GuardedBy("mLoadLock")
    private int ldr;

    /* renamed from: zx */
    private volatile boolean f15469zx;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.component.IL$IL */
    /* loaded from: classes3.dex */
    public static class C7174IL {

        /* renamed from: IL */
        final Properties f15475IL;

        /* renamed from: bX */
        final CountDownLatch f15476bX;

        /* renamed from: bg */
        final long f15477bg;
        @GuardedBy("mWritingToDiskLock")
        volatile boolean eqN;

        /* renamed from: zx */
        boolean f15478zx;

        /* renamed from: bg */
        void m89716bg(boolean z, boolean z2) {
            this.f15478zx = z;
            this.eqN = z2;
            this.f15476bX.countDown();
        }

        private C7174IL(long j, Properties properties) {
            this.f15476bX = new CountDownLatch(1);
            this.eqN = false;
            this.f15478zx = false;
            this.f15477bg = j;
            this.f15475IL = properties;
        }
    }

    /* renamed from: com.bytedance.sdk.component.IL$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7176bg {
        ExecutorService getExecutorService();
    }

    private C7170IL(File file) {
        Object obj = new Object();
        this.f15463IL = obj;
        this.f15466bX = new Object();
        this.eqN = new Properties();
        this.f15469zx = false;
        this.ldr = 0;
        this.f15465WR = file;
        this.f15467eo = m89725bg(file);
        synchronized (obj) {
            this.f15469zx = false;
        }
        InterfaceC7176bg interfaceC7176bg = f15460Ta;
        if (interfaceC7176bg != null && interfaceC7176bg.getExecutorService() != null) {
            f15460Ta.getExecutorService().execute(new Runnable() { // from class: com.bytedance.sdk.component.IL.2
                @Override // java.lang.Runnable
                public void run() {
                    C7170IL.this.m89732bg();
                }
            });
        } else {
            new Thread("TTPropHelper") { // from class: com.bytedance.sdk.component.IL.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    C7170IL.this.m89732bg();
                }
            }.start();
        }
    }

    /* renamed from: WR */
    static /* synthetic */ int m89735WR(C7170IL c7170il) {
        int i = c7170il.ldr;
        c7170il.ldr = i - 1;
        return i;
    }

    static /* synthetic */ long ldr(C7170IL c7170il) {
        long j = c7170il.f15468iR;
        c7170il.f15468iR = 1 + j;
        return j;
    }

    /* renamed from: zx */
    static /* synthetic */ int m89717zx(C7170IL c7170il) {
        int i = c7170il.ldr;
        c7170il.ldr = i + 1;
        return i;
    }

    private void eqN() {
        while (!this.f15469zx) {
            try {
                this.f15463IL.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: IL */
    public SharedPreferences$EditorC7175bX m89740IL() {
        return new SharedPreferences$EditorC7175bX();
    }

    /* renamed from: com.bytedance.sdk.component.IL$bX */
    /* loaded from: classes3.dex */
    public class SharedPreferences$EditorC7175bX implements SharedPreferences.Editor {

        /* renamed from: IL */
        private final Object f15479IL = new Object();
        @GuardedBy("mEditorLock")

        /* renamed from: bX */
        private final Map<String, Object> f15480bX = new HashMap();
        @GuardedBy("mEditorLock")
        private boolean eqN = false;

        public SharedPreferences$EditorC7175bX() {
        }

        /* renamed from: IL */
        private C7174IL m89715IL() {
            Properties properties;
            long j;
            Object obj;
            boolean z;
            synchronized (C7170IL.this.f15463IL) {
                if (C7170IL.this.ldr > 0) {
                    Properties properties2 = new Properties();
                    properties2.putAll(C7170IL.this.eqN);
                    C7170IL.this.eqN = properties2;
                }
                properties = C7170IL.this.eqN;
                C7170IL.m89717zx(C7170IL.this);
                synchronized (this.f15479IL) {
                    boolean z2 = false;
                    if (this.eqN) {
                        if (!properties.isEmpty()) {
                            properties.clear();
                            z = true;
                        } else {
                            z = false;
                        }
                        this.eqN = false;
                        z2 = z;
                    }
                    for (Map.Entry<String, Object> entry : this.f15480bX.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value != this && value != null) {
                            if (!properties.containsKey(key) || (obj = properties.get(key)) == null || !obj.equals(String.valueOf(value))) {
                                properties.put(key, String.valueOf(value));
                                z2 = true;
                            }
                        }
                        if (properties.containsKey(key)) {
                            properties.remove(key);
                            z2 = true;
                        }
                    }
                    this.f15480bX.clear();
                    if (z2) {
                        C7170IL.ldr(C7170IL.this);
                    }
                    j = C7170IL.this.f15468iR;
                }
            }
            return new C7174IL(j, properties);
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            C7170IL.this.m89730bg(m89715IL(), false);
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putStringSet(String str, Set<String> set) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            long j;
            if (C7170IL.f15462bg) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            C7174IL m89715IL = m89715IL();
            C7170IL.this.m89730bg(m89715IL, true);
            try {
                m89715IL.f15476bX.await();
                if (C7170IL.f15462bg) {
                    Log.d("TTPropHelper", C7170IL.this.f15465WR.getName() + ":" + m89715IL.f15477bg + " committed after " + (System.currentTimeMillis() - j) + " ms");
                }
                return m89715IL.eqN;
            } catch (InterruptedException unused) {
                if (C7170IL.f15462bg) {
                    Log.d("TTPropHelper", C7170IL.this.f15465WR.getName() + ":" + m89715IL.f15477bg + " committed after " + (System.currentTimeMillis() - j) + " ms");
                    return false;
                }
                return false;
            } catch (Throwable th) {
                if (C7170IL.f15462bg) {
                    Log.d("TTPropHelper", C7170IL.this.f15465WR.getName() + ":" + m89715IL.f15477bg + " committed after " + (System.currentTimeMillis() - j) + " ms");
                }
                throw th;
            }
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putInt(String str, int i) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putLong(String str, long j) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, Long.valueOf(j));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putFloat(String str, float f) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putString(String str, String str2) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX putBoolean(String str, boolean z) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX remove(String str) {
            synchronized (this.f15479IL) {
                this.f15480bX.put(str, this);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        /* renamed from: bg */
        public SharedPreferences$EditorC7175bX clear() {
            synchronized (this.f15479IL) {
                this.eqN = true;
            }
            return this;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:56:0x00ee
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.GuardedBy("mWriteLock")
    /* renamed from: IL */
    public void m89739IL(com.bytedance.sdk.component.C7170IL.C7174IL r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.C7170IL.m89739IL(com.bytedance.sdk.component.IL$IL, boolean):void");
    }

    /* renamed from: bg */
    public static void m89729bg(@NotNull InterfaceC7176bg interfaceC7176bg) {
        f15460Ta = interfaceC7176bg;
    }

    @RequiresApi(api = 19)
    /* renamed from: bg */
    public static C7170IL m89731bg(@NotNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_prop";
        }
        synchronized (C7170IL.class) {
            if (f15461VB == null) {
                f15461VB = new ArrayMap<>();
            }
            File file = f15461VB.get(str);
            if (file == null) {
                file = new File(context.getFilesDir(), str);
                f15461VB.put(str, file);
            }
            if (f15459PX == null) {
                f15459PX = new ArrayMap<>();
            }
            C7170IL c7170il = f15459PX.get(file);
            if (c7170il == null) {
                C7170IL c7170il2 = new C7170IL(file);
                f15459PX.put(file, c7170il2);
                return c7170il2;
            }
            return c7170il;
        }
    }

    /* renamed from: bg */
    static File m89725bg(File file) {
        return new File(file.getPath() + ".bak");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ad -> B:69:0x00b6). Please submit an issue!!! */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m89732bg() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.C7170IL.m89732bg():void");
    }

    /* renamed from: bg */
    public String m89720bg(String str, String str2) {
        String property;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        synchronized (this.f15463IL) {
            eqN();
            property = this.eqN.getProperty(str, str2);
        }
        return property;
    }

    /* renamed from: bg */
    public int m89722bg(String str, int i) {
        int parseInt;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        synchronized (this.f15463IL) {
            try {
                try {
                    eqN();
                    parseInt = Integer.parseInt(this.eqN.getProperty(str, String.valueOf(i)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseInt;
    }

    /* renamed from: bg */
    public long m89721bg(String str, long j) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        synchronized (this.f15463IL) {
            try {
                try {
                    eqN();
                    parseLong = Long.parseLong(this.eqN.getProperty(str, String.valueOf(j)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseLong;
    }

    /* renamed from: bg */
    public float m89723bg(String str, float f) {
        float parseFloat;
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        synchronized (this.f15463IL) {
            try {
                try {
                    eqN();
                    parseFloat = Float.parseFloat(this.eqN.getProperty(str, String.valueOf(f)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseFloat;
    }

    /* renamed from: bg */
    public boolean m89719bg(String str, boolean z) {
        boolean parseBoolean;
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        synchronized (this.f15463IL) {
            try {
                try {
                    eqN();
                    parseBoolean = Boolean.parseBoolean(this.eqN.getProperty(str, String.valueOf(z)));
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseBoolean;
    }

    /* renamed from: bg */
    public boolean m89724bg(String str) {
        boolean containsKey;
        synchronized (this.f15463IL) {
            try {
                try {
                    eqN();
                    containsKey = this.eqN.containsKey(str);
                } catch (NumberFormatException e) {
                    Log.e("TTPropHelper", e.getMessage());
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return containsKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m89730bg(final C7174IL c7174il, final boolean z) {
        boolean z2;
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.IL.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C7170IL.this.f15466bX) {
                    try {
                        C7170IL.this.m89739IL(c7174il, z);
                    } catch (OutOfMemoryError unused) {
                    }
                }
                synchronized (C7170IL.this.f15463IL) {
                    C7170IL.m89735WR(C7170IL.this);
                }
            }
        };
        if (z) {
            synchronized (this.f15463IL) {
                z2 = this.ldr == 1;
            }
            if (z2) {
                runnable.run();
                return;
            }
        }
        C7567bX.m88519bg(runnable, true ^ z);
    }
}
