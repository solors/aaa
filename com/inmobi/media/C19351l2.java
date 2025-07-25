package com.inmobi.media;

import android.os.Message;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.media.C19351l2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import p804nd.InterfaceC38501j;

/* renamed from: com.inmobi.media.l2 */
/* loaded from: classes6.dex */
public final class C19351l2 {
    /* renamed from: a */
    public static void m60085a() {
        if (C19379n2.f48529c.getAndSet(true)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        m60079b();
        m60081a("root", C18954Ha.m61076b(), null);
    }

    /* renamed from: b */
    public static void m60079b() {
        InterfaceC38501j interfaceC38501j;
        List<Config> m17534m0;
        final ArrayList arrayList = new ArrayList();
        interfaceC38501j = C19379n2.f48532f;
        C19407p2 c19407p2 = (C19407p2) interfaceC38501j.getValue();
        c19407p2.getClass();
        m17534m0 = _Collections.m17534m0(AbstractC19518x1.m59594a(c19407p2, null, null, null, null, null, null, 63));
        for (Config config : m17534m0) {
            ConcurrentHashMap concurrentHashMap = C19379n2.f48531e;
            Intrinsics.checkNotNullParameter(config, "<this>");
            HashMap hashMap = AbstractC19119U2.f47826a;
            String accountId$media_release = config.getAccountId$media_release();
            String type = config.getType();
            Intrinsics.checkNotNullParameter(type, "type");
            Config config2 = (Config) concurrentHashMap.put(accountId$media_release + '-' + type, config);
            if (config2 == null || config2.getLastUpdateTimeStamp() != config.getLastUpdateTimeStamp()) {
                Intrinsics.checkNotNullParameter(config, "<this>");
                String accountId$media_release2 = config.getAccountId$media_release();
                String type2 = config.getType();
                Intrinsics.checkNotNullParameter(type2, "type");
                arrayList.add(accountId$media_release2 + '-' + type2);
            }
        }
        ((HandlerC19295h2) C19379n2.f48528b.getValue()).post(new Runnable() { // from class: o3.y4
            @Override // java.lang.Runnable
            public final void run() {
                C19351l2.m60080a(arrayList);
            }
        });
    }

    /* renamed from: a */
    public static final void m60080a(List changedConfigKeys) {
        Intrinsics.checkNotNullParameter(changedConfigKeys, "$changedConfigKeys");
        try {
            Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
            Iterator it = changedConfigKeys.iterator();
            while (it.hasNext()) {
                Config config = (Config) C19379n2.f48531e.get((String) it.next());
                if (config != null) {
                    m60078b(config);
                }
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.commons.core.configs.Config m60081a(java.lang.String r4, java.lang.String r5, com.inmobi.media.InterfaceC19365m2 r6) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = com.inmobi.media.C19379n2.m60008f()
            java.lang.String r2 = "access$getTAG$cp(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.Objects.toString(r6)
            com.inmobi.commons.core.configs.Config r4 = com.inmobi.media.AbstractC19119U2.m60664a(r5, r4)
            if (r5 != 0) goto L1f
            java.lang.String r5 = com.inmobi.media.C19379n2.m60008f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            return r4
        L1f:
            nd.j r5 = com.inmobi.media.C19379n2.m60010d()
            java.lang.Object r5 = r5.getValue()
            com.inmobi.media.h2 r5 = (com.inmobi.media.HandlerC19295h2) r5
            android.os.Message r5 = r5.obtainMessage()
            java.lang.String r1 = "obtainMessage(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r1 = 0
            r5.what = r1
            com.inmobi.media.r2 r1 = new com.inmobi.media.r2
            r1.<init>(r4, r6)
            r5.obj = r1
            nd.j r6 = com.inmobi.media.C19379n2.m60010d()
            java.lang.Object r6 = r6.getValue()
            com.inmobi.media.h2 r6 = (com.inmobi.media.HandlerC19295h2) r6
            r6.sendMessage(r5)
            java.lang.String r5 = com.inmobi.media.C19379n2.m60008f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            java.util.Objects.toString(r4)
            java.lang.String r5 = r4.getAccountId$media_release()
            if (r5 == 0) goto L95
            java.lang.String r6 = r4.getType()
            java.lang.String r1 = com.inmobi.media.C19379n2.m60008f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.concurrent.ConcurrentHashMap r1 = com.inmobi.media.C19379n2.f48531e
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r5 = 45
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            java.lang.Object r5 = r1.get(r5)
            com.inmobi.commons.core.configs.Config r5 = (com.inmobi.commons.core.configs.Config) r5
            if (r5 == 0) goto L95
            java.lang.String r6 = com.inmobi.media.C19379n2.m60008f()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r5.getLastUpdateTimeStamp()
            goto L96
        L95:
            r5 = 0
        L96:
            if (r5 != 0) goto L99
            goto L9a
        L99:
            r4 = r5
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19351l2.m60081a(java.lang.String, java.lang.String, com.inmobi.media.m2):com.inmobi.commons.core.configs.Config");
    }

    /* renamed from: b */
    public static void m60078b(Config config) {
        Map map;
        Map map2;
        Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        map = C19379n2.f48527a;
        ArrayList arrayList = (ArrayList) map.get(config);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) next).get() == null) {
                    it.remove();
                }
            }
        }
        map2 = C19379n2.f48527a;
        ArrayList<WeakReference> arrayList2 = (ArrayList) map2.get(config);
        if (arrayList2 != null) {
            for (WeakReference weakReference : arrayList2) {
                InterfaceC19365m2 interfaceC19365m2 = (InterfaceC19365m2) weakReference.get();
                if (interfaceC19365m2 != null) {
                    Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
                    interfaceC19365m2.getClass().toString();
                    interfaceC19365m2.mo60042a(config);
                }
            }
        }
    }

    /* renamed from: a */
    public static Config m60082a(String accountId, String type) {
        InterfaceC38501j interfaceC38501j;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        ConcurrentHashMap concurrentHashMap = C19379n2.f48531e;
        Intrinsics.checkNotNullParameter(type, "<this>");
        HashMap hashMap = AbstractC19119U2.f47826a;
        Intrinsics.checkNotNullParameter(type, "type");
        Config config = (Config) concurrentHashMap.get(accountId + '-' + type);
        Config config2 = null;
        if (config != null) {
            Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
            config.getLastUpdateTimeStamp();
        } else {
            config = null;
        }
        if (config == null) {
            interfaceC38501j = C19379n2.f48532f;
            C19407p2 c19407p2 = (C19407p2) interfaceC38501j.getValue();
            c19407p2.getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            Config config3 = (Config) c19407p2.m59589b("account_id=? AND config_type=?", new String[]{accountId, type});
            if (config3 != null) {
                Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
                config3.toString();
                if (AbstractC19225c2.m60400a(config3.getAccountId$media_release()) && config3.getType().length() > 0) {
                    Intrinsics.checkNotNullParameter(config3, "<this>");
                    String accountId$media_release = config3.getAccountId$media_release();
                    String type2 = config3.getType();
                    Intrinsics.checkNotNullParameter(type2, "type");
                    concurrentHashMap.put(accountId$media_release + '-' + type2, config3);
                    m60078b(config3);
                }
                config2 = config3;
            }
            Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
            if (config2 != null) {
                config2.getLastUpdateTimeStamp();
            }
            return config2;
        }
        return config;
    }

    /* renamed from: a */
    public static Config m60083a(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter("root", "type");
        Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        Config m60082a = m60082a(accountId, "root");
        return m60082a == null ? AbstractC19119U2.m60664a(accountId, "root") : m60082a;
    }

    /* renamed from: a */
    public static void m60084a(Config config) {
        Intrinsics.checkNotNullExpressionValue(C19379n2.m60008f(), "access$getTAG$cp(...)");
        Message obtainMessage = ((HandlerC19295h2) C19379n2.f48528b.getValue()).obtainMessage();
        Intrinsics.checkNotNullExpressionValue(obtainMessage, "obtainMessage(...)");
        obtainMessage.what = 1;
        obtainMessage.obj = config;
        ((HandlerC19295h2) C19379n2.f48528b.getValue()).sendMessage(obtainMessage);
    }
}
