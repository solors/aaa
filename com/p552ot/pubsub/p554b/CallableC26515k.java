package com.p552ot.pubsub.p554b;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ot.pubsub.b.k */
/* loaded from: classes7.dex */
public class CallableC26515k implements Callable<C26516l> {

    /* renamed from: a */
    final /* synthetic */ String f69355a;

    /* renamed from: b */
    final /* synthetic */ C26511h f69356b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC26515k(C26511h c26511h, String str) {
        this.f69356b = c26511h;
        this.f69355a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.p552ot.pubsub.p554b.C26516l call() throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.String r0 = "getConfig  cursor.close"
            java.lang.String r1 = "ConfigDbManager"
            java.lang.String r5 = "app_id=?"
            r10 = 0
            com.ot.pubsub.b.h r2 = r11.f69356b     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            com.ot.pubsub.b.g r2 = com.p552ot.pubsub.p554b.C26511h.m41407a(r2)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            android.database.sqlite.SQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r3 = "events_cloud"
            r4 = 0
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r7 = r11.f69355a     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            java.lang.String r3 = "app_id"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r4 = "cloud_data"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r5 = "data_hash"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r6 = "timestamp"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            boolean r7 = r2.moveToNext()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            if (r7 == 0) goto L7a
            com.ot.pubsub.b.l r7 = new com.ot.pubsub.b.l     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.<init>()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.f69357a = r3     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r3 = r2.getString(r4)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            if (r4 != 0) goto L5d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r4.<init>(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.f69361e = r4     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
        L5d:
            org.json.JSONObject r3 = r7.f69361e     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            int r3 = com.p552ot.pubsub.p554b.C26511h.m41397a(r3)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            long r3 = (long) r3     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.f69358b = r3     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            java.lang.String r3 = r2.getString(r5)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.f69360d = r3     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            long r3 = r2.getLong(r6)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r7.f69359c = r3     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L95
            r2.close()     // Catch: java.lang.Exception -> L76
            goto L79
        L76:
            com.p552ot.pubsub.util.C26586j.m41080a(r1, r0)
        L79:
            return r7
        L7a:
            r2.close()     // Catch: java.lang.Exception -> L91
            goto L94
        L7e:
            r3 = move-exception
            goto L84
        L80:
            r3 = move-exception
            goto L97
        L82:
            r3 = move-exception
            r2 = r10
        L84:
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L95
            com.p552ot.pubsub.util.C26586j.m41080a(r1, r3)     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L94
            r2.close()     // Catch: java.lang.Exception -> L91
            goto L94
        L91:
            com.p552ot.pubsub.util.C26586j.m41080a(r1, r0)
        L94:
            return r10
        L95:
            r3 = move-exception
            r10 = r2
        L97:
            if (r10 == 0) goto La0
            r10.close()     // Catch: java.lang.Exception -> L9d
            goto La0
        L9d:
            com.p552ot.pubsub.util.C26586j.m41080a(r1, r0)
        La0:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.p554b.CallableC26515k.call():com.ot.pubsub.b.l");
    }
}
