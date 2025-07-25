package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.coo2iico */
/* loaded from: classes8.dex */
public class C32260coo2iico {
    private static final String c2oc2i = "VastTagPool";
    private static final long c2oc2o = TimeUtils.ONE_HOUR_IN_MS / 2;
    private static volatile C32260coo2iico cco22 = null;
    private static final String cioccoiococ = "xml_cache";
    private Context coi222o222;
    private final File coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32261coo2iico {
        long coi222o222;
        public String coo2iico;
    }

    private C32260coo2iico(Context context) {
        Context applicationContext = AndroidUtils.getApplicationContext(context);
        this.coi222o222 = applicationContext;
        File file = new File(applicationContext.getCacheDir().getAbsolutePath(), cioccoiococ);
        this.coo2iico = file;
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private boolean coi222o222(File file) {
        if (file == null) {
            return false;
        }
        long coo2iico = coo2iico(file);
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("currentTimeStamp - fileTimeStamp");
        sb2.append(currentTimeMillis);
        sb2.append("-");
        sb2.append(coo2iico);
        sb2.append("=");
        long j = currentTimeMillis - coo2iico;
        sb2.append(j);
        MLog.m25892d(c2oc2i, sb2.toString());
        if (currentTimeMillis <= coo2iico || j >= c2oc2o) {
            return false;
        }
        return true;
    }

    public static C32260coo2iico coo2iico(Context context) {
        if (cco22 == null) {
            synchronized (C32260coo2iico.class) {
                if (cco22 == null) {
                    cco22 = new C32260coo2iico(context);
                }
            }
        }
        return cco22;
    }

    public C32261coo2iico coo2iico() {
        File file;
        File[] listFiles = this.coo2iico.listFiles();
        MLog.m25892d(c2oc2i, "xmlFileSize->" + listFiles.length);
        String str = null;
        long j = 0;
        if (listFiles.length > 0) {
            MLog.m25892d(c2oc2i, "xmlFiles != null && length > 0");
            file = null;
            for (File file2 : listFiles) {
                if (!coi222o222(file2)) {
                    MLog.m25892d(c2oc2i, "xmFile is invalid");
                    file2.delete();
                } else {
                    long coo2iico = coo2iico(file2);
                    if (coo2iico > j) {
                        file = file2;
                        j = coo2iico;
                    }
                }
            }
        } else {
            file = null;
        }
        if (file != null) {
            str = C32643coo2iico.coi222o222(file);
            file.delete();
        }
        C32261coo2iico c32261coo2iico = new C32261coo2iico();
        c32261coo2iico.coo2iico = str;
        c32261coo2iico.coi222o222 = j;
        return c32261coo2iico;
    }

    public void coo2iico(InputStream inputStream) {
        try {
            File file = new File(this.coo2iico, String.valueOf(System.currentTimeMillis()));
            if (file.exists()) {
                file.delete();
            }
            if (file.createNewFile()) {
                C32643coo2iico.coo2iico(inputStream, file);
            }
        } catch (Exception e) {
            MLog.m25888e(c2oc2i, "cache xml file exception: ", e);
        }
    }

    private long coo2iico(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return Long.parseLong(file.getName());
        } catch (Exception e) {
            MLog.m25888e(c2oc2i, "parse Long exception: ", e);
            return 0L;
        }
    }
}
