package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a */
    private static final Map f9724a = new HashMap();

    /* renamed from: b */
    private static final Map f9725b = new HashMap();

    /* renamed from: c */
    private static final ArrayList f9726c = new ArrayList();

    /* renamed from: d */
    private static final Handler f9727d = new HandlerC5333a(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public interface Receiver {
        void onReceive(Intent intent, @Nullable Map<String, Object> map);
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$a */
    /* loaded from: classes2.dex */
    class HandlerC5333a extends Handler {
        HandlerC5333a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.m95562b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$b */
    /* loaded from: classes2.dex */
    public static class C5334b {

        /* renamed from: a */
        final Intent f9728a;

        /* renamed from: b */
        final Map f9729b;

        /* renamed from: c */
        final List f9730c;

        C5334b(Intent intent, Map map, List list) {
            this.f9728a = intent;
            this.f9729b = map;
            this.f9730c = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$c */
    /* loaded from: classes2.dex */
    public static class C5335c {

        /* renamed from: a */
        final IntentFilter f9731a;

        /* renamed from: b */
        final Receiver f9732b;

        /* renamed from: c */
        boolean f9733c;

        /* renamed from: d */
        boolean f9734d;

        C5335c(IntentFilter intentFilter, Receiver receiver) {
            this.f9731a = intentFilter;
            this.f9732b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m95562b() {
        int size;
        C5334b[] c5334bArr;
        while (true) {
            synchronized (f9724a) {
                ArrayList arrayList = f9726c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                c5334bArr = new C5334b[size];
                arrayList.toArray(c5334bArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                C5334b c5334b = c5334bArr[i];
                if (c5334b != null) {
                    for (C5335c c5335c : c5334b.f9730c) {
                        if (c5335c != null && !c5335c.f9734d) {
                            c5335c.f9732b.onReceive(c5334b.f9728a, c5334b.f9729b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f9724a;
        synchronized (map) {
            C5335c c5335c = new C5335c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(c5335c);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                Map map2 = f9725b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(c5335c);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (f9724a) {
            List m95563a = m95563a(intent);
            if (m95563a == null) {
                return false;
            }
            f9726c.add(new C5334b(intent, map, m95563a));
            Handler handler = f9727d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<C5335c> m95563a = m95563a(intent);
        if (m95563a == null) {
            return;
        }
        for (C5335c c5335c : m95563a) {
            if (!c5335c.f9734d) {
                c5335c.f9732b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            m95562b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f9724a;
        synchronized (map) {
            List<C5335c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (C5335c c5335c : list) {
                c5335c.f9734d = true;
                Iterator<String> actionsIterator = c5335c.f9731a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    List list2 = (List) f9725b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((C5335c) it.next()).f9732b == receiver) {
                                c5335c.f9734d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f9725b.remove(next);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static List m95563a(Intent intent) {
        synchronized (f9724a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<C5335c> list = (List) f9725b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList<C5335c> arrayList = null;
            for (C5335c c5335c : list) {
                if (!c5335c.f9733c && c5335c.f9731a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c5335c);
                    c5335c.f9733c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            for (C5335c c5335c2 : arrayList) {
                c5335c2.f9733c = false;
            }
            return arrayList;
        }
    }
}
