package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public final class EventBus {

    /* renamed from: b */
    private static volatile EventBus f55914b;

    /* renamed from: n */
    private boolean f55926n;

    /* renamed from: a */
    static ExecutorService f55913a = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* renamed from: c */
    private static final Map<Class<?>, List<Class<?>>> f55915c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f55916d = new HashMap();

    /* renamed from: e */
    private final Map<Object, List<Class<?>>> f55917e = new HashMap();

    /* renamed from: f */
    private final Map<Class<?>, Object> f55918f = new ConcurrentHashMap();

    /* renamed from: g */
    private final ThreadLocal<List<Object>> f55919g = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: h */
    private final ThreadLocal<BooleanWrapper> f55920h = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: i */
    private String f55921i = "onEvent";

    /* renamed from: j */
    private final HandlerPoster f55922j = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: k */
    private final BackgroundPoster f55923k = new BackgroundPoster(this);

    /* renamed from: l */
    private final AsyncPoster f55924l = new AsyncPoster(this);

    /* renamed from: m */
    private final SubscriberMethodFinder f55925m = new SubscriberMethodFinder();

    /* renamed from: o */
    private boolean f55927o = true;

    /* renamed from: p */
    private Map<String, Object> f55928p = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218863 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55931a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f55931a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55931a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55931a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55931a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class BooleanWrapper {

        /* renamed from: a */
        boolean f55932a;

        BooleanWrapper() {
        }
    }

    /* loaded from: classes6.dex */
    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    /* renamed from: a */
    private void m52968a(Object obj, String str, boolean z) {
        for (SubscriberMethod subscriberMethod : this.f55925m.m52956a(obj.getClass(), str)) {
            m52970a(obj, subscriberMethod, z);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.m52958a();
        f55915c.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f55914b == null) {
            synchronized (EventBus.class) {
                if (f55914b == null) {
                    f55914b = new EventBus();
                }
            }
        }
        return f55914b;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.m52957a(cls);
    }

    public final void configureLogSubscriberExceptions(boolean z) {
        if (!this.f55926n) {
            this.f55927o = z;
            return;
        }
        throw new EventBusException("This method must be called before any registration");
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f55918f) {
            obj = this.f55918f.get(cls);
        }
        return obj;
    }

    public final void post(Object obj) {
        boolean z;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        List<Object> list = this.f55919g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f55920h.get();
        if (!booleanWrapper.f55932a) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z = true;
            } else {
                z = false;
            }
            booleanWrapper.f55932a = true;
            while (!list.isEmpty()) {
                try {
                    Object remove = list.remove(0);
                    if (remove != null) {
                        try {
                            Class<?> cls = remove.getClass();
                            List<Class<?>> m52971a = m52971a(cls);
                            int size = m52971a.size();
                            boolean z2 = false;
                            for (int i = 0; i < size; i++) {
                                Class<?> cls2 = m52971a.get(i);
                                synchronized (this) {
                                    copyOnWriteArrayList = this.f55916d.get(cls2);
                                }
                                if (copyOnWriteArrayList != null) {
                                    Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        m52972a(it.next(), remove, z);
                                    }
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                Log.d(TAG, "No subscripers registered for event " + cls);
                                if (cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                                    post(new NoSubscriberEvent(this, remove));
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    booleanWrapper.f55932a = false;
                }
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f55918f) {
            this.f55918f.put(obj.getClass(), obj);
        }
    }

    public final void register(Object obj) {
        m52968a(obj, this.f55921i, false);
    }

    public final void registerSticky(Object obj) {
        m52968a(obj, this.f55921i, true);
    }

    public final void release() {
        if (f55914b != null) {
            f55914b = null;
            f55913a = null;
            Map<Class<?>, List<Class<?>>> map = f55915c;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f55916d;
            if (map2 != null && map2.size() > 0) {
                this.f55916d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f55917e;
            if (map3 != null && map3.size() > 0) {
                this.f55917e.clear();
            }
            Map<Class<?>, Object> map4 = this.f55918f;
            if (map4 != null && map4.size() > 0) {
                this.f55918f.clear();
            }
            Map<String, Object> map5 = this.f55928p;
            if (map5 != null && map5.size() > 0) {
                this.f55928p.clear();
            }
        }
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object remove;
        synchronized (this.f55918f) {
            remove = this.f55918f.remove(cls);
        }
        return remove;
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length != 0) {
            List<Class<?>> list = this.f55917e.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    m52969a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f55917e.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } else {
            throw new IllegalArgumentException("Provide at least one event class");
        }
    }

    public final void register(String str, Object obj) {
        Map<String, Object> map = this.f55928p;
        if (map != null && map.containsKey(str)) {
            unregister(this.f55928p.get(str));
        }
        this.f55928p.put(str, obj);
        m52968a(obj, this.f55921i, false);
    }

    public final void registerSticky(Object obj, String str) {
        m52968a(obj, str, true);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        m52967a(obj, this.f55921i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m52967a(obj, str, true, cls, clsArr);
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f55918f) {
            Class<?> cls = obj.getClass();
            if (obj.equals(this.f55918f.get(cls))) {
                this.f55918f.remove(cls);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private synchronized void m52967a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod subscriberMethod : this.f55925m.m52956a(obj.getClass(), str)) {
            if (cls == subscriberMethod.f55945c) {
                m52970a(obj, subscriberMethod, z);
            } else if (clsArr != null) {
                int length = clsArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (clsArr[i] == subscriberMethod.f55945c) {
                        m52970a(obj, subscriberMethod, z);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void register(Object obj, String str) {
        m52968a(obj, str, false);
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        m52967a(obj, this.f55921i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m52967a(obj, str, false, cls, clsArr);
    }

    public final synchronized void unregister(Object obj) {
        List<Class<?>> list = this.f55917e.get(obj);
        if (list != null) {
            for (Class<?> cls : list) {
                m52969a(obj, cls);
            }
            this.f55917e.remove(obj);
        } else {
            String str = TAG;
            Log.w(str, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* renamed from: a */
    private void m52970a(Object obj, SubscriberMethod subscriberMethod, boolean z) {
        Object obj2;
        this.f55926n = true;
        Class<?> cls = subscriberMethod.f55945c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f55916d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f55916d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f55943a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> list = this.f55917e.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.f55917e.put(obj, list);
        }
        list.add(cls);
        if (z) {
            synchronized (this.f55918f) {
                obj2 = this.f55918f.get(cls);
            }
            if (obj2 != null) {
                m52972a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public final synchronized void unregister(String str) {
        Map<String, Object> map = this.f55928p;
        if (map != null && map.containsKey(str)) {
            Object remove = this.f55928p.remove(str);
            List<Class<?>> list = this.f55917e.get(remove);
            if (list != null) {
                for (Class<?> cls : list) {
                    m52969a(remove, cls);
                }
                this.f55917e.remove(remove);
            } else {
                String str2 = TAG;
                Log.w(str2, "Subscriber to unregister was not registered before: " + remove.getClass());
            }
        }
    }

    /* renamed from: a */
    private void m52969a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f55916d.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                if (copyOnWriteArrayList.get(i).f55949a == obj) {
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    private void m52972a(Subscription subscription, Object obj, boolean z) {
        int i = C218863.f55931a[subscription.f55950b.f55944b.ordinal()];
        if (i == 1) {
            m52973a(subscription, obj);
        } else if (i == 2) {
            if (z) {
                m52973a(subscription, obj);
            } else {
                this.f55922j.m52965a(subscription, obj);
            }
        } else if (i == 3) {
            if (z) {
                this.f55923k.enqueue(subscription, obj);
            } else {
                m52973a(subscription, obj);
            }
        } else if (i == 4) {
            this.f55924l.enqueue(subscription, obj);
        } else {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f55950b.f55944b);
        }
    }

    /* renamed from: a */
    private List<Class<?>> m52971a(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f55915c;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m52966a(list, cls2.getInterfaces());
                }
                f55915c.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: a */
    private static void m52966a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m52966a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m52974a(PendingPost pendingPost) {
        Object obj = pendingPost.f55938a;
        Subscription subscription = pendingPost.f55939b;
        PendingPost.m52964a(pendingPost);
        m52973a(subscription, obj);
    }

    /* renamed from: a */
    private void m52973a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f55950b.f55943a.invoke(subscription.f55949a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                String str = TAG;
                Log.e(str, "SubscriberExceptionEvent subscriber " + subscription.f55949a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                String str2 = TAG;
                Log.e(str2, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f55927o) {
                String str3 = TAG;
                Log.e(str3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f55949a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f55949a));
        }
    }
}
