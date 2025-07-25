package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Zs */
/* loaded from: assets/audience_network.dex */
public class C13029Zs extends C113257j {
    public static String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final C113227g A02;
    public final AtomicReference<InterfaceC113217f> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<InterfaceC108920S> A05;

    public C13029Zs(Activity activity, InterfaceC113277l interfaceC113277l, InterfaceC108920S interfaceC108920S) {
        super(activity.getApplicationContext(), interfaceC113277l);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new C113227g();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC108920S);
        this.A00 = new WeakReference<>(activity);
    }

    public C13029Zs(Context context, InterfaceC113277l interfaceC113277l, InterfaceC108920S interfaceC108920S) {
        super(context.getApplicationContext(), interfaceC113277l);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new C113227g();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC108920S);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A00 = new WeakReference<>(A00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof C13029Zs) && ((C13029Zs) context).A0D() != null) {
                return ((C13029Zs) context).A0D();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final Activity A0D() {
        return this.A00.get();
    }

    public InterfaceC108920S A0E() {
        InterfaceC108920S funnel = this.A05.get();
        if (funnel == null) {
            return new C13208co();
        }
        return funnel;
    }

    public final InterfaceC113217f A0F() {
        return this.A03.get();
    }

    public final C113227g A0G() {
        return this.A02;
    }

    public final Object A0H() {
        return this.A04.get();
    }

    public final void A0I(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0J(InterfaceC108920S interfaceC108920S) {
        this.A05.set(interfaceC108920S);
    }

    public final void A0K(C13029Zs c13029Zs) {
        c13029Zs.A01.putAll(this.A01);
        this.A01 = c13029Zs.A01;
    }

    public final void A0L(C13029Zs c13029Zs) {
        A0J(c13029Zs.A0E());
        A0C(c13029Zs.A0B());
        A0M(c13029Zs.A0F());
    }

    public final void A0M(InterfaceC113217f interfaceC113217f) {
        this.A03.set(interfaceC113217f);
    }

    public final void A0N(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0O(Object obj) {
        this.A04.set(obj);
    }

    public final void A0P(Throwable th) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (hasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
