package com.mbridge.msdk.dycreator.binding;

/* renamed from: com.mbridge.msdk.dycreator.binding.c */
/* loaded from: classes6.dex */
public final class ViewDataFactory {

    /* renamed from: a */
    private static volatile ViewDataFactory f55894a;

    private ViewDataFactory() {
    }

    /* renamed from: a */
    public static ViewDataFactory m52975a() {
        if (f55894a == null) {
            synchronized (ViewDataFactory.class) {
                if (f55894a == null) {
                    f55894a = new ViewDataFactory();
                }
            }
        }
        return f55894a;
    }
}
