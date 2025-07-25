package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2;

import android.content.Context;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciiioc2ioc.C32643coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.TimeUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cic2.coi222o222 */
/* loaded from: classes8.dex */
public class C32482coi222o222 {
    private static volatile C32482coi222o222 cco22;
    private Context c2oc2o;
    private final File cioccoiococ;
    private final String coo2iico = "XmlPool";
    private final String coi222o222 = "xml_cache";
    private final long c2oc2i = TimeUtils.ONE_HOUR_IN_MS / 2;

    private C32482coi222o222(Context context) {
        Context applicationContext = AndroidUtils.getApplicationContext(context);
        this.c2oc2o = applicationContext;
        File file = new File(applicationContext.getCacheDir().getAbsolutePath(), "xml_cache");
        this.cioccoiococ = file;
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
        if (currentTimeMillis <= coo2iico || currentTimeMillis - coo2iico >= this.c2oc2i) {
            return false;
        }
        return true;
    }

    public static C32482coi222o222 coo2iico(Context context) {
        if (cco22 == null) {
            synchronized (C32482coi222o222.class) {
                if (cco22 == null) {
                    cco22 = new C32482coi222o222(context);
                }
            }
        }
        return cco22;
    }

    public String coo2iico() {
        File file;
        File[] listFiles = this.cioccoiococ.listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            file = null;
        } else {
            file = null;
            for (File file2 : Arrays.asList(listFiles)) {
                if (!coi222o222(file2)) {
                    file2.delete();
                } else if (coo2iico(file2) > 0) {
                    file = file2;
                }
            }
        }
        if (file != null) {
            String coi222o222 = C32643coo2iico.coi222o222(file);
            file.delete();
            return coi222o222;
        }
        return null;
    }

    public void coo2iico(InputStream inputStream) {
        try {
            File file = new File(this.cioccoiococ, String.valueOf(System.currentTimeMillis()));
            if (file.exists()) {
                file.delete();
            }
            if (file.createNewFile()) {
                C32643coo2iico.coo2iico(inputStream, file);
            }
        } catch (Exception e) {
            MLog.m25888e("XmlPool", "cache xml file had Exception: ", e);
        }
    }

    private long coo2iico(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return Long.parseLong(file.getName());
        } catch (Exception e) {
            MLog.m25888e("XmlPool", "getXmlFileTime had Exception: ", e);
            return 0L;
        }
    }
}
