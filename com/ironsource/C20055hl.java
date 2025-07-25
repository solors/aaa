package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.hl */
/* loaded from: classes6.dex */
public class C20055hl {

    /* renamed from: a */
    private String f50483a;

    public C20055hl(String str) {
        this.f50483a = str;
    }

    /* renamed from: a */
    private C21314zf m58095a() throws Exception {
        C21314zf c21314zf = new C21314zf(this.f50483a, "metadata.json");
        if (!c21314zf.exists()) {
            m58094a(c21314zf);
        }
        return c21314zf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized JSONObject m58089b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(m58095a()));
    }

    /* renamed from: a */
    private void m58094a(C21314zf c21314zf) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c21314zf.getPath());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized boolean m58088b(String str, JSONObject jSONObject) throws Exception {
        JSONObject m58089b;
        m58089b = m58089b();
        JSONObject optJSONObject = m58089b.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            m58089b.putOpt(str, jSONObject);
        }
        return m58090a(m58089b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m58093a(String str) throws Exception {
        JSONObject m58089b = m58089b();
        if (m58089b.has(str)) {
            m58089b.remove(str);
            return m58090a(m58089b);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m58092a(String str, JSONObject jSONObject) throws Exception {
        JSONObject m58089b;
        m58089b = m58089b();
        m58089b.put(str, jSONObject);
        return m58090a(m58089b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m58091a(ArrayList<C21314zf> arrayList) throws Exception {
        Iterator<C21314zf> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!m58093a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m58090a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), m58095a().getPath()) != 0;
    }
}
