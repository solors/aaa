package com.inmobi.media;

import android.content.Context;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.l9 */
/* loaded from: classes6.dex */
public final class C19358l9 {

    /* renamed from: b */
    public static volatile Picasso f48479b;

    /* renamed from: a */
    public static final C19358l9 f48478a = new C19358l9();

    /* renamed from: c */
    public static final Object f48480c = new Object();

    /* renamed from: d */
    public static final ArrayList f48481d = new ArrayList();

    /* renamed from: e */
    public static final C19344k9 f48482e = new C19344k9();

    /* renamed from: d */
    public static final /* synthetic */ String m60054d() {
        return "l9";
    }

    /* renamed from: a */
    public static final WeakReference m60059a(C19358l9 c19358l9, Context context) {
        c19358l9.getClass();
        int size = f48481d.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = f48481d;
            Context context2 = (Context) ((WeakReference) arrayList.get(i)).get();
            if (context2 != null && Intrinsics.m17075f(context2, context)) {
                return (WeakReference) arrayList.get(i);
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: a */
    public final Picasso m60060a(@NotNull Context context) {
        WeakReference weakReference;
        Picasso picasso;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f48480c) {
            int size = f48481d.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    weakReference = null;
                    break;
                }
                ArrayList arrayList = f48481d;
                Context context2 = (Context) ((WeakReference) arrayList.get(i)).get();
                if (context2 != null && Intrinsics.m17075f(context2, context)) {
                    weakReference = (WeakReference) arrayList.get(i);
                    break;
                }
                i++;
            }
            if (weakReference == null) {
                f48481d.add(new WeakReference(context));
            }
            picasso = f48479b;
            if (picasso == null) {
                picasso = new Picasso.Builder(context).build();
                f48479b = picasso;
                C18954Ha.m61082a(context, f48482e);
            }
        }
        Intrinsics.checkNotNullExpressionValue(picasso, "synchronized(...)");
        return picasso;
    }

    @Nullable
    /* renamed from: a */
    public final Object m60057a(@NotNull InvocationHandler connectionCallbackHandler) {
        Intrinsics.checkNotNullParameter(connectionCallbackHandler, "connectionCallbackHandler");
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, connectionCallbackHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
