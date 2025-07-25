package com.zeus.gmc.sdk.mobileads.columbus.internal.coiic;

import com.zeus.gmc.sdk.mobileads.columbus.internal.c2oc2o.C32488c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.c2oc2o */
/* loaded from: classes8.dex */
public class AsyncTaskC32716c2oc2o extends AbstractAsyncTaskC32722coo2iico {
    public AsyncTaskC32716c2oc2o(AbstractAsyncTaskC32719coi222o222.InterfaceC32720coi222o222 interfaceC32720coi222o222, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC32720coi222o222, hashSet, jSONObject, j);
    }

    private void coi222o222(String str) {
        C32488c2oc2i c2oc2i = C32488c2oc2i.c2oc2i();
        if (c2oc2i != null) {
            for (C32707coiic c32707coiic : c2oc2i.coi222o222()) {
                if (this.c2oc2i.contains(c32707coiic.coi222o222())) {
                    c32707coiic.c2oc2i().coo2iico(str, this.c2oc2o);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: coo2iico */
    public String doInBackground(Object... objArr) {
        return this.cioccoiococ.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.coiic.AbstractAsyncTaskC32719coi222o222, android.os.AsyncTask
    /* renamed from: coo2iico */
    public void onPostExecute(String str) {
        coi222o222(str);
        super.onPostExecute(str);
    }
}
