package com.zeus.gmc.sdk.mobileads.columbus.internal.cccccioi;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32445c22o22co22i;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cccccioi.coi222o222 */
/* loaded from: classes8.dex */
public class C32511coi222o222 extends ContentObserver {
    private static final String c2oc2i = "com.zeus.gmc.sdk.mobileads.msa.odi.provider";
    public static final Uri c2oc2o = Uri.parse("content://com.zeus.gmc.sdk.mobileads.msa.odi.provider/score");
    private static final String cioccoiococ = "score";
    private Context coi222o222;
    private C32445c22o22co22i coo2iico;

    public C32511coi222o222(Context context, C32445c22o22co22i c32445c22o22co22i) {
        super(new Handler(Looper.getMainLooper()));
        this.coi222o222 = context;
        this.coo2iico = c32445c22o22co22i;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        Cursor query = this.coi222o222.getContentResolver().query(Uri.parse(c2oc2o.toString()), null, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex(C32512coo2iico.cioccoiococ));
                    if (!TextUtils.isEmpty(string) || this.coo2iico != null) {
                        this.coo2iico.coi222o222(C32512coo2iico.cioccoiococ, string);
                    }
                    C32512coo2iico.coo2iico(C32512coo2iico.c2oc2o, "", C32512coo2iico.ciii2coi2);
                }
            } catch (Exception e) {
                C32512coo2iico.coo2iico(C32512coo2iico.cco22, e.getMessage(), C32512coo2iico.ciii2coi2);
            } finally {
                query.close();
            }
        }
    }
}
