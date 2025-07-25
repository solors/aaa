package com.p552ot.pubsub.p554b;

/* renamed from: com.ot.pubsub.b.j */
/* loaded from: classes7.dex */
class RunnableC26514j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f69353a;

    /* renamed from: b */
    final /* synthetic */ C26511h f69354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26514j(C26511h c26511h, String str) {
        this.f69354b = c26511h;
        this.f69353a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C26510g c26510g;
        try {
            c26510g = this.f69354b.f69347b;
            c26510g.getWritableDatabase().delete(C26510g.f69336b, "app_id=?", new String[]{this.f69353a});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
