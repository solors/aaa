package com.bytedance.sdk.openadsdk.p285IL;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.sdk.openadsdk.IL.IL */
/* loaded from: classes3.dex */
public class C7874IL extends AbstractC7875bg {

    /* renamed from: IL */
    private int f17195IL;

    /* renamed from: bX */
    private int f17196bX;
    private volatile boolean eqN;

    public C7874IL(int i, int i2) {
        this.f17195IL = 15;
        this.f17196bX = 3;
        if (i > 0) {
            this.f17195IL = i;
            this.f17196bX = i2;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    /* renamed from: bX */
    private void m87501bX(List<File> list) {
        long m87499IL = m87499IL(list);
        int size = list.size();
        if (!mo87498bg(m87499IL, size)) {
            for (File file : list) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    m87499IL -= length;
                }
                if (mo87495bg(file, m87499IL, size)) {
                    return;
                }
            }
        }
    }

    private void eqN(List<File> list) {
        long m87499IL;
        int size;
        boolean mo87498bg;
        if (list != null) {
            try {
                if (list.size() == 0 || (mo87498bg = mo87498bg((m87499IL = m87499IL(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !mo87498bg) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            m87499IL -= length;
                        }
                        if (mo87495bg(file2, m87499IL, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.p285IL.AbstractC7875bg
    /* renamed from: bg */
    public boolean mo87498bg(long j, int i) {
        return i <= this.f17195IL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.p285IL.AbstractC7875bg
    /* renamed from: bg */
    public boolean mo87495bg(File file, long j, int i) {
        return i <= this.f17196bX;
    }

    @Override // com.bytedance.sdk.openadsdk.p285IL.AbstractC7875bg
    /* renamed from: bg */
    protected void mo85163bg(List<File> list) {
        if (this.eqN) {
            eqN(list);
            this.eqN = false;
            return;
        }
        m87501bX(list);
    }

    public C7874IL(int i, int i2, boolean z) {
        this.f17195IL = 15;
        this.f17196bX = 3;
        if (i > 0) {
            this.f17195IL = i;
            this.f17196bX = i2;
            this.eqN = z;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
