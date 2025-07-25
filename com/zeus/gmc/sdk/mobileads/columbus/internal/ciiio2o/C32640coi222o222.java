package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o;

import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32448c2oc2o;
import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.coi222o222 */
/* loaded from: classes8.dex */
public class C32640coi222o222 {
    private int coi222o222;
    private String coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    public class C32641coo2iico implements Comparator<File> {
        C32641coo2iico() {
        }

        @Override // java.util.Comparator
        /* renamed from: coo2iico */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public C32640coi222o222(String str, int i) {
        this.coo2iico = str;
        if (str != null && !str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            this.coo2iico += RemoteSettings.FORWARD_SLASH_STRING;
        }
        this.coi222o222 = Math.min(100, Math.max(0, i));
    }

    public static String c2oc2i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (str.hashCode() & 4294967295L) + "";
    }

    private String c2oc2o(String str) {
        if (!TextUtils.isEmpty(str)) {
            String cioccoiococ = cioccoiococ(str);
            if (!TextUtils.isEmpty(cioccoiococ)) {
                return cioccoiococ + ".tmp";
            }
            return null;
        }
        return null;
    }

    private String cioccoiococ(String str) {
        if (str == null) {
            return null;
        }
        String c2oc2i = c2oc2i(str);
        if (TextUtils.isEmpty(c2oc2i)) {
            return null;
        }
        return this.coo2iico + c2oc2i;
    }

    public File cco22(String str) {
        if (!TextUtils.isEmpty(str)) {
            String c2oc2o = c2oc2o(str);
            if (!TextUtils.isEmpty(c2oc2o)) {
                return new File(c2oc2o);
            }
            return null;
        }
        return null;
    }

    public synchronized String coi222o222(String str) {
        String cioccoiococ = cioccoiococ(str);
        if (!TextUtils.isEmpty(cioccoiococ)) {
            File file = new File(cioccoiococ);
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                return cioccoiococ;
            }
        }
        return null;
    }

    public synchronized void coo2iico(String str, File file) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (file.exists()) {
            coo2iico();
            String cioccoiococ = cioccoiococ(str);
            if (cioccoiococ != null && cioccoiococ.length() > 0) {
                File file2 = new File(cioccoiococ);
                if (file2.exists()) {
                    file2.delete();
                }
                file.renameTo(file2);
                file2.setLastModified(System.currentTimeMillis());
                c2oc2i();
            }
        }
    }

    private void c2oc2i() {
        File[] listFiles = new File(this.coo2iico).listFiles();
        if (listFiles == null || listFiles.length <= this.coi222o222) {
            return;
        }
        coo2iico(listFiles);
    }

    public int coi222o222() {
        File[] listFiles = new File(this.coo2iico).listFiles();
        if (listFiles == null) {
            return 0;
        }
        return this.coi222o222 - listFiles.length;
    }

    public synchronized void coo2iico(String str, byte[] bArr) {
        try {
            coo2iico();
            String cioccoiococ = cioccoiococ(str);
            if (cioccoiococ != null && bArr.length > 0) {
                new C32448c2oc2o(cioccoiococ).coo2iico(bArr);
                new File(cioccoiococ).setLastModified(System.currentTimeMillis());
                c2oc2i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void coo2iico() {
        try {
            File file = new File(this.coo2iico);
            if (!file.exists()) {
                file.mkdirs();
            } else if (!file.isDirectory()) {
                file.delete();
                file.mkdirs();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean coo2iico(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String cioccoiococ = cioccoiococ(str);
        String c2oc2o = c2oc2o(str);
        if (TextUtils.isEmpty(c2oc2o) || TextUtils.isEmpty(cioccoiococ)) {
            return false;
        }
        File file = new File(c2oc2o);
        if (file.exists()) {
            file.renameTo(new File(cioccoiococ));
            return true;
        }
        return false;
    }

    private void coo2iico(File[] fileArr) {
        if (fileArr == null || fileArr.length <= 0) {
            return;
        }
        Arrays.sort(fileArr, new C32641coo2iico());
        int length = fileArr.length / 4;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            if (file != null && file.exists()) {
                new C32448c2oc2o(file.getAbsolutePath()).coo2iico();
            }
        }
    }
}
