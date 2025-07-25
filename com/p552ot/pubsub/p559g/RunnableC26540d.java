package com.p552ot.pubsub.p559g;

import android.text.TextUtils;
import com.p552ot.pubsub.p564j.C26566d;
import com.p552ot.pubsub.util.C26576a;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26590l;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.g.d */
/* loaded from: classes7.dex */
public class RunnableC26540d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map f69485a;

    /* renamed from: b */
    final /* synthetic */ String f69486b;

    /* renamed from: c */
    final /* synthetic */ String f69487c;

    /* renamed from: d */
    final /* synthetic */ String f69488d;

    /* renamed from: e */
    final /* synthetic */ boolean f69489e;

    /* renamed from: f */
    final /* synthetic */ C26538c f69490f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26540d(C26538c c26538c, Map map, String str, String str2, String str3, boolean z) {
        this.f69490f = c26538c;
        this.f69485a = map;
        this.f69486b = str;
        this.f69487c = str2;
        this.f69488d = str3;
        this.f69489e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f69485a != null) {
                String m41038i = C26590l.m41038i();
                if (this.f69485a.get("region") == null) {
                    this.f69485a.put("region", m41038i);
                }
                if (this.f69485a.get(C26576a.f69711e) == null && !TextUtils.isEmpty(m41038i) && C26576a.f69714h.contains(m41038i.toUpperCase())) {
                    this.f69485a.put(C26576a.f69711e, C26576a.f69712f);
                }
            }
            this.f69490f.m41271b(this.f69486b, this.f69487c, this.f69488d, this.f69485a, this.f69489e);
            C26566d.m41154a().m41149a(false);
        } catch (Exception e) {
            C26586j.m41073b("MessageManager", "EventManager.addTrackMessage exception: ", e);
        }
    }
}
