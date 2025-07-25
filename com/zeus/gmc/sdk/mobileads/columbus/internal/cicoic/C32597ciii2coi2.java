package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32445c22o22co22i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.ciii2coi2 */
/* loaded from: classes8.dex */
public class C32597ciii2coi2 {
    private static final String cioccoiococ = "LocalVideoAdHolder";
    private final long c2oc2i;
    private C32445c22o22co22i coi222o222;
    private final String coo2iico;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.ciii2coi2$coi222o222 */
    /* loaded from: classes8.dex */
    public static class C32598coi222o222 {
        static C32597ciii2coi2 coo2iico = new C32597ciii2coi2(null);

        private C32598coi222o222() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.ciii2coi2$coo2iico */
    /* loaded from: classes8.dex */
    public class C32599coo2iico extends AbstractRunnableC32566c2oc2o {
        final /* synthetic */ String c2oc2i;
        final /* synthetic */ long cioccoiococ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32599coo2iico(String str, String str2, String str3, long j) {
            super(str, str2);
            this.c2oc2i = str3;
            this.cioccoiococ = j;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() throws Exception {
            File file = new File(this.c2oc2i);
            if (file.exists() && file.isDirectory()) {
                if (C32597ciii2coi2.this.coo2iico(this.c2oc2i) < this.cioccoiococ) {
                    return;
                }
                MLog.m25892d(C32597ciii2coi2.cioccoiococ, "need delete cache files, start delete.");
                ArrayList<C32595cicic> arrayList = new ArrayList();
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    return;
                }
                int length = listFiles.length;
                long j = 0;
                int i = 0;
                long j2 = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    String name = file2.getName();
                    String absolutePath = file2.getAbsolutePath();
                    long coo2iico = C32597ciii2coi2.this.coi222o222.coo2iico(absolutePath, j);
                    if (coo2iico != j) {
                        long length2 = file2.length();
                        j2 += length2;
                        C32595cicic c32595cicic = new C32595cicic();
                        c32595cicic.coo2iico(coo2iico);
                        c32595cicic.coi222o222(length2);
                        c32595cicic.coo2iico(name);
                        c32595cicic.coi222o222(absolutePath);
                        arrayList.add(c32595cicic);
                    }
                    i++;
                    j = 0;
                }
                long j3 = j2 - (this.cioccoiococ / 2);
                C32597ciii2coi2.this.coo2iico(arrayList);
                for (C32595cicic c32595cicic2 : arrayList) {
                    File file3 = new File(c32595cicic2.c2oc2i());
                    if (file3.exists()) {
                        MLog.m25892d(C32597ciii2coi2.cioccoiococ, "delete cache file, path = " + file3.getAbsolutePath());
                        long length3 = file3.length();
                        if (file3.delete()) {
                            j3 -= length3;
                            C32597ciii2coi2.this.coi222o222.coi222o222(c32595cicic2.c2oc2i());
                        }
                        if (j3 < 0) {
                            break;
                        }
                    }
                }
                MLog.m25892d(C32597ciii2coi2.cioccoiococ, "delete cache files end");
                return;
            }
            MLog.m25887i(C32597ciii2coi2.cioccoiococ, "cache dir file don't exits or not directory. return");
        }
    }

    /* synthetic */ C32597ciii2coi2(C32599coo2iico c32599coo2iico) {
        this();
    }

    public long coi222o222() {
        return 209715200L;
    }

    private C32597ciii2coi2() {
        this.coo2iico = "video_ad_cache";
        this.coi222o222 = new C32445c22o22co22i("video_ad_cache");
        this.c2oc2i = 209715200L;
    }

    public void coi222o222(@NonNull String str, long j) {
        this.coi222o222.coi222o222(str, j);
    }

    public static C32597ciii2coi2 coo2iico() {
        return C32598coi222o222.coo2iico;
    }

    public boolean coo2iico(String str, long j) {
        C32465cioc2.c2oc2i.execute(new C32599coo2iico(cioccoiococ, "check delete video cache files", str, j));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long coo2iico(String str) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                long j = 0;
                for (File file2 : listFiles) {
                    if (file2.exists() && !file2.isDirectory()) {
                        j += file2.length();
                    }
                }
                return j;
            }
            return -1L;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<C32595cicic> coo2iico(List<C32595cicic> list) {
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            boolean z = true;
            for (int i3 = i2; i3 < list.size(); i3++) {
                C32595cicic c32595cicic = list.get(i);
                C32595cicic c32595cicic2 = list.get(i3);
                if (c32595cicic.coi222o222() > c32595cicic2.coi222o222()) {
                    list.set(i, c32595cicic2);
                    list.set(i3, c32595cicic);
                    z = false;
                }
            }
            if (z) {
                break;
            }
            i = i2;
        }
        return list;
    }
}
