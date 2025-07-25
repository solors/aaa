package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
class SubscriberMethodFinder {

    /* renamed from: a */
    private static final Map<String, List<SubscriberMethod>> f55947a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f55948b = new ConcurrentHashMap();

    public static void clearSkipMethodNameVerifications() {
        f55948b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<SubscriberMethod> m52956a(Class<?> cls, String str) {
        List<SubscriberMethod> list;
        Method[] declaredMethods;
        ThreadMode threadMode;
        String str2 = cls.getName() + '.' + str;
        Map<String, List<SubscriberMethod>> map = f55947a;
        synchronized (map) {
            list = map.get(str2);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name = cls2.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            for (Method method : cls2.getDeclaredMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(str)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String substring = name2.substring(str.length());
                        if (substring.length() == 0) {
                            threadMode = ThreadMode.PostThread;
                        } else if (substring.equals("MainThread")) {
                            threadMode = ThreadMode.MainThread;
                        } else if (substring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.BackgroundThread;
                        } else if (!substring.equals("Async")) {
                            if (!f55948b.containsKey(cls2)) {
                                throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                            }
                        } else {
                            threadMode = ThreadMode.Async;
                        }
                        Class<?> cls3 = parameterTypes[0];
                        sb2.setLength(0);
                        sb2.append(name2);
                        sb2.append('>');
                        sb2.append(cls3.getName());
                        if (hashSet.add(sb2.toString())) {
                            arrayList.add(new SubscriberMethod(method, threadMode, cls3));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<SubscriberMethod>> map2 = f55947a;
            synchronized (map2) {
                map2.put(str2, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no methods called " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m52958a() {
        f55947a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m52957a(Class<?> cls) {
        if (f55947a.isEmpty()) {
            f55948b.put(cls, cls);
            return;
        }
        throw new IllegalStateException("This method must be called before registering anything");
    }
}
