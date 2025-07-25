package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.c2oc2o */
/* loaded from: classes8.dex */
public class C32590c2oc2o {
    private static final String c2oc2o = "GMCDownloadManager";
    private static ConcurrentHashMap<String, Integer> cco22 = new ConcurrentHashMap<>();
    private static final int cii2c2 = 1;
    private String c2oc2i;
    private String cioccoiococ;
    private C32589c2oc2i coi222o222;
    private Context coo2iico;

    public C32590c2oc2o(Context context, String str) {
        if (context != null) {
            this.coo2iico = context.getApplicationContext();
        }
        this.c2oc2i = str;
    }

    public void coo2iico(String str) {
        this.cioccoiococ = str;
    }

    public void coo2iico(InterfaceC32600cioccoiococ interfaceC32600cioccoiococ) {
        if (interfaceC32600cioccoiococ == null) {
            return;
        }
        if (this.coo2iico != null && !TextUtils.isEmpty(this.c2oc2i)) {
            String coo2iico = C32603coo2iico.coo2iico(this.coo2iico);
            if (TextUtils.isEmpty(coo2iico)) {
                MLog.m25889e(c2oc2o, "get download rootDir exception: ");
                interfaceC32600cioccoiococ.coo2iico("", C32601coi222o222.cco22);
                return;
            }
            this.coi222o222 = new C32589c2oc2i(coo2iico, this.c2oc2i, this.cioccoiococ);
            if (coo2iico()) {
                MLog.m25887i(c2oc2o, "downloaded, fileUrl = " + this.coi222o222.coi222o222());
                interfaceC32600cioccoiococ.coo2iico(this.coi222o222.coi222o222(), this.coi222o222.cioccoiococ(), new File(this.coi222o222.cioccoiococ()).length());
                return;
            }
            MLog.m25887i(c2oc2o, "file don't found，start download. url = " + this.coi222o222.coi222o222());
            synchronized (cco22) {
                if (cco22.get(this.coi222o222.coi222o222()) != null) {
                    MLog.m25887i(c2oc2o, "is downloading, return. url = " + this.coi222o222.coi222o222());
                    return;
                }
                cco22.put(this.coi222o222.coi222o222(), 1);
                new C32591cco22(this.coo2iico, this.coi222o222, interfaceC32600cioccoiococ).start();
                return;
            }
        }
        interfaceC32600cioccoiococ.coo2iico("", C32601coi222o222.cco22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean coo2iico(C32589c2oc2i c32589c2oc2i) {
        if (c32589c2oc2i == null) {
            return false;
        }
        synchronized (cco22) {
            cco22.remove(c32589c2oc2i.coi222o222());
        }
        return true;
    }

    private boolean coo2iico() {
        return new File(this.coi222o222.cioccoiococ()).exists();
    }
}
