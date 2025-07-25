package com.bytedance.sdk.component.adexpress.p243bg.p244IL;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.p258IL.C7612bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7743Uw;
import com.bytedance.sdk.component.utils.C7768zx;
import com.ironsource.C20517nb;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.adexpress.bg.IL.bX */
/* loaded from: classes3.dex */
public abstract class AbstractC7305bX {
    /* renamed from: IL */
    public List<C7318bg.C7320bg> m89219IL(C7318bg c7318bg, C7318bg c7318bg2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (c7318bg2 != null && !c7318bg2.ldr().isEmpty()) {
            if (c7318bg.ldr().isEmpty()) {
                arrayList.addAll(c7318bg2.ldr());
            } else {
                for (C7318bg.C7320bg c7320bg : c7318bg.ldr()) {
                    if (!c7318bg2.ldr().contains(c7320bg) && c7320bg != null && c7320bg.m89128bg() != null && c7320bg.m89131IL() != null) {
                        arrayList2.add(c7320bg);
                    }
                }
                for (C7318bg.C7320bg c7320bg2 : c7318bg2.ldr()) {
                    if (!c7318bg.ldr().contains(c7320bg2)) {
                        arrayList.add(c7320bg2);
                    }
                }
            }
        } else {
            arrayList2.addAll(c7318bg.ldr());
        }
        if (m89206bg(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: bX */
    public void m89215bX(List<C7318bg.C7320bg> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C7318bg.C7320bg c7320bg : list) {
            File file = new File(mo89170bg(), C7768zx.m87788bg(c7320bg.m89128bg()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: bg */
    public abstract File mo89170bg();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public boolean m89205bg(Map<String, C7318bg> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        for (String str : map.keySet()) {
            C7318bg c7318bg = map.get(str);
            if (c7318bg != null && !m89207bg(c7318bg.ldr())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m89207bg(java.util.List<com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7320bg> r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L5b
            int r1 = r6.size()
            if (r1 <= 0) goto L5b
            java.io.File r1 = r5.mo89170bg()
            if (r1 != 0) goto L10
            goto L5b
        L10:
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r6.next()
            com.bytedance.sdk.component.adexpress.bg.bX.bg$bg r1 = (com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7320bg) r1
            java.lang.String r2 = r1.m89128bg()
            java.lang.String r2 = com.bytedance.sdk.component.utils.C7768zx.m87788bg(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L2f
            return r0
        L2f:
            java.io.File r3 = new java.io.File
            java.io.File r4 = r5.mo89170bg()
            r3.<init>(r4, r2)
            java.lang.String r2 = com.bytedance.sdk.component.utils.C7768zx.m87789bg(r3)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L58
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L58
            java.lang.String r3 = r1.m89131IL()
            if (r3 == 0) goto L58
            java.lang.String r1 = r1.m89131IL()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L14
        L58:
            return r0
        L59:
            r6 = 1
            return r6
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p243bg.p244IL.AbstractC7305bX.m89207bg(java.util.List):boolean");
    }

    /* renamed from: bX */
    public static boolean m89216bX(C7318bg c7318bg, C7318bg c7318bg2) {
        if (c7318bg != null) {
            try {
                if (!TextUtils.isEmpty(c7318bg.m89147bX())) {
                    if (c7318bg2 == null) {
                        return false;
                    }
                    if (m89208bg(c7318bg.m89147bX(), c7318bg2.m89147bX())) {
                        return true;
                    }
                    Map<String, C7318bg> m89145bg = c7318bg.m89145bg();
                    Map<String, C7318bg> m89145bg2 = c7318bg2.m89145bg();
                    if (m89145bg.isEmpty()) {
                        return !m89145bg2.isEmpty();
                    } else if (m89145bg2.isEmpty()) {
                        return false;
                    } else {
                        return m89204bg(m89145bg, m89145bg2);
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m89213bg(com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7319IL r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L42
            java.io.File r1 = r4.mo89170bg()
            if (r1 != 0) goto La
            goto L42
        La:
            java.util.List r5 = r5.m89138IL()
            if (r5 == 0) goto L40
            int r1 = r5.size()
            if (r1 <= 0) goto L40
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.io.File r2 = new java.io.File
            java.io.File r3 = r4.mo89170bg()
            java.lang.Object r1 = r1.first
            java.lang.String r1 = (java.lang.String) r1
            r2.<init>(r3, r1)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L3f
            boolean r1 = r2.isFile()
            if (r1 != 0) goto L1a
        L3f:
            return r0
        L40:
            r5 = 1
            return r5
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p243bg.p244IL.AbstractC7305bX.m89213bg(com.bytedance.sdk.component.adexpress.bg.bX.bg$IL):boolean");
    }

    /* renamed from: IL */
    public void m89217IL(List<C7318bg.C7320bg> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C7318bg.C7320bg c7320bg : list) {
            File file = new File(mo89170bg(), C7768zx.m87788bg(c7320bg.m89128bg()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: bg */
    public List<C7318bg.C7320bg> m89212bg(C7318bg c7318bg, C7318bg c7318bg2) {
        Map<String, C7318bg> m89145bg = c7318bg.m89145bg();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (m89145bg.size() == 0) {
            if (c7318bg2 != null && c7318bg2.m89145bg().size() != 0) {
                Map<String, C7318bg> m89145bg2 = c7318bg2.m89145bg();
                for (String str : m89145bg2.keySet()) {
                    C7318bg c7318bg3 = m89145bg2.get(str);
                    if (c7318bg3 != null) {
                        arrayList.addAll(c7318bg3.ldr());
                    }
                }
            }
        } else if (c7318bg2 != null && c7318bg2.m89145bg().size() != 0) {
            Map<String, C7318bg> m89145bg3 = c7318bg2.m89145bg();
            for (String str2 : m89145bg.keySet()) {
                C7318bg c7318bg4 = m89145bg.get(str2);
                C7318bg c7318bg5 = m89145bg3.get(str2);
                if (c7318bg5 == null && c7318bg4 != null) {
                    arrayList2.addAll(c7318bg4.ldr());
                } else if (c7318bg4 == null && c7318bg5 != null) {
                    arrayList.addAll(c7318bg5.ldr());
                } else if (c7318bg4 != null) {
                    for (C7318bg.C7320bg c7320bg : c7318bg4.ldr()) {
                        if (c7320bg != null && !c7318bg5.ldr().contains(c7320bg) && c7320bg.m89131IL() != null && c7320bg.m89128bg() != null) {
                            arrayList2.add(c7320bg);
                        }
                    }
                    for (C7318bg.C7320bg c7320bg2 : c7318bg5.ldr()) {
                        if (c7320bg2 != null && !c7318bg4.ldr().contains(c7320bg2)) {
                            arrayList.add(c7320bg2);
                        }
                    }
                }
            }
        } else if (m89145bg.size() != 0) {
            for (String str3 : m89145bg.keySet()) {
                C7318bg c7318bg6 = m89145bg.get(str3);
                if (c7318bg6 != null) {
                    arrayList2.addAll(c7318bg6.ldr());
                }
            }
        }
        if (m89206bg(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: IL */
    public static void m89218IL(File file, C7318bg c7318bg, String str) {
        if (c7318bg == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (c7318bg.ldr() != null) {
            for (C7318bg.C7320bg c7320bg : c7318bg.ldr()) {
                try {
                    new File(file, C7768zx.m87788bg(c7320bg.m89128bg())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m89206bg(java.util.List<com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7320bg> r8, java.util.List<com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7320bg> r9) {
        /*
            r7 = this;
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r8.next()
            com.bytedance.sdk.component.adexpress.bg.bX.bg$bg r0 = (com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg.C7320bg) r0
            java.lang.String r1 = r0.m89128bg()
            java.lang.String r2 = com.bytedance.sdk.component.utils.C7768zx.m87788bg(r1)
            java.io.File r3 = new java.io.File
            java.io.File r4 = r7.mo89170bg()
            r3.<init>(r4, r2)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r6 = ".tmp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            boolean r5 = r3.exists()
            if (r5 == 0) goto L40
            r3.delete()     // Catch: java.lang.Throwable -> L40
        L40:
            boolean r3 = r4.exists()
            if (r3 == 0) goto L49
            r4.delete()     // Catch: java.lang.Throwable -> L49
        L49:
            com.bytedance.sdk.component.adexpress.bg.bg.bg r3 = com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg.m89118bg()
            com.bytedance.sdk.component.adexpress.bg.bg.bX r3 = r3.m89119bX()
            com.bytedance.sdk.component.iR.IL.bg r3 = r3.ldr()
            r3.m88402IL(r1)
            java.io.File r1 = r7.mo89170bg()
            java.lang.String r1 = r1.getAbsolutePath()
            r3.m88388bg(r1, r2)
            com.bytedance.sdk.component.iR.IL r1 = r3.m88391bg()
            r9.add(r0)
            if (r1 == 0) goto L82
            boolean r0 = r1.ldr()
            if (r0 == 0) goto L82
            java.io.File r0 = r1.m88407zx()
            if (r0 == 0) goto L82
            java.io.File r0 = r1.m88407zx()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4
        L82:
            r7.m89215bX(r9)
            r8 = 0
            return r8
        L87:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p243bg.p244IL.AbstractC7305bX.m89206bg(java.util.List, java.util.List):boolean");
    }

    /* renamed from: bg */
    public boolean m89209bg(String str) {
        String m87788bg = C7768zx.m87788bg(str);
        File absoluteFile = mo89170bg().getAbsoluteFile();
        File file = new File(absoluteFile, m87788bg + ".zip");
        C7612bg ldr = C7324bg.m89118bg().m89119bX().ldr();
        ldr.m88402IL(str);
        ldr.m88388bg(file.getParent(), file.getName());
        C7608IL m88391bg = ldr.m88391bg();
        if (m88391bg.ldr() && m88391bg.m88407zx() != null && m88391bg.m88407zx().exists()) {
            File m88407zx = m88391bg.m88407zx();
            try {
                C7743Uw.m87861bg(m88407zx.getAbsolutePath(), file.getParent());
                if (m88407zx.exists()) {
                    m88407zx.delete();
                    return true;
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: bg */
    public void m89214bg(int i) {
        if (C7324bg.m89118bg().eqN() != null) {
            C7324bg.m89118bg().eqN().mo85779bg(i);
        }
    }

    /* renamed from: bg */
    public static void m89210bg(File file, C7318bg c7318bg, String str) {
        FileOutputStream fileOutputStream;
        if (c7318bg == null) {
            return;
        }
        String m89148WR = c7318bg.m89148WR();
        if (TextUtils.isEmpty(m89148WR)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file3);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(m89148WR.getBytes(C20517nb.f52167N));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                C7741PX.m87871bg("PlayComponentEngineCacheManager", "version save error3", th);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th3) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: bg */
    private static boolean m89204bg(Map<String, C7318bg> map, Map<String, C7318bg> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            C7318bg c7318bg = map.get(str);
            if (c7318bg == null) {
                return true;
            }
            C7318bg c7318bg2 = map2.get(str);
            if (c7318bg2 == null) {
                return false;
            }
            if (m89208bg(c7318bg.m89147bX(), c7318bg2.m89147bX())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
        return false;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m89208bg(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p243bg.p244IL.AbstractC7305bX.m89208bg(java.lang.String, java.lang.String):boolean");
    }

    @Deprecated
    /* renamed from: bg */
    public static boolean m89211bg(C7318bg c7318bg, String str) {
        if (c7318bg != null) {
            try {
                if (TextUtils.isEmpty(c7318bg.m89147bX())) {
                    return true;
                }
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                return m89208bg(c7318bg.m89147bX(), str);
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }
}
