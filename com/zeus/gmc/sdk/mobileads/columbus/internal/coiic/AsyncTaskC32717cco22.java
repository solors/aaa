package com.zeus.gmc.sdk.mobileads.columbus.internal.coiic;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32488c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32604c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.cco22 */
/* loaded from: classes8.dex */
public class AsyncTaskC32717cco22 extends AbstractAsyncTaskC32722coo2iico {
    public AsyncTaskC32717cco22(AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222 interfaceC32720coi222o222, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC32720coi222o222, hashSet, jSONObject, j);
    }

    private void coi222o222(String str) {
        C32488c2oc2i c2oc2i = C32488c2oc2i.c2oc2i();
        if (c2oc2i != null) {
            for (C32707coiic c32707coiic : c2oc2i.coi222o222()) {
                if (this.c2oc2i.contains(c32707coiic.coi222o222())) {
                    c32707coiic.c2oc2i().coi222o222(str, this.c2oc2o);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: coo2iico */
    public String doInBackground(Object... objArr) {
        if (C32604c2oc2i.ciii2coi2(this.cioccoiococ, this.coi222o222.coo2iico())) {
            return null;
        }
        this.coi222o222.coo2iico(this.cioccoiococ);
        return this.cioccoiococ.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222, android.os.AsyncTask
    /* renamed from: coo2iico */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            coi222o222(str);
        }
        super.onPostExecute(str);
    }
}
