package com.smaato.sdk.core;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.diinjection.InjectOrNull;
import com.smaato.sdk.core.util.diinjection.Named;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class AndroidsInjector {

    /* loaded from: classes7.dex */
    public interface InjectionAllowed {
    }

    private AndroidsInjector() {
    }

    @NonNull
    private static Set<Field> findFields(@NonNull Class<?> cls, @NonNull Class<? extends Annotation> cls2) {
        Field[] declaredFields;
        HashSet hashSet = new HashSet();
        String canonicalName = cls.getCanonicalName();
        while (canonicalName != null && canonicalName.startsWith("com.smaato")) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.isAnnotationPresent(cls2)) {
                    hashSet.add(field);
                }
            }
            cls = cls.getSuperclass();
            canonicalName = cls.getCanonicalName();
        }
        return hashSet;
    }

    public static void inject(@NonNull View view) {
        Objects.requireNonNull(view, "Parameter view cannot be null for AndroidsInjector::inject");
        injectFieldValues(view);
    }

    private static void injectFieldValues(@NonNull Object obj) {
        injectFieldValues(obj, findFields(obj.getClass(), Inject.class), false);
        injectFieldValues(obj, findFields(obj.getClass(), InjectOrNull.class), true);
    }

    public static void injectStatic(@NonNull Class cls) {
        Objects.requireNonNull(cls, "Parameter clazz cannot be null for AndroidsInjector::inject");
        injectStaticFieldValues(cls);
    }

    private static void injectStaticFieldValues(@NonNull Class cls) {
        injectFieldValues(cls, findFields(cls, Inject.class), false);
        injectFieldValues(cls, findFields(cls, InjectOrNull.class), true);
    }

    public static void inject(@NonNull Activity activity) {
        Objects.requireNonNull(activity, "Parameter activity cannot be null for AndroidsInjector::inject");
        injectFieldValues(activity);
    }

    private static void injectFieldValues(@NonNull Object obj, @NonNull Set<Field> set, boolean z) {
        for (Field field : set) {
            String value = field.isAnnotationPresent(Named.class) ? ((Named) field.getAnnotation(Named.class)).value() : null;
            field.setAccessible(true);
            try {
                Field[] declaredFields = SmaatoSdk.class.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Field field2 = declaredFields[i];
                        if (field2.getType() == SmaatoInstance.class) {
                            field2.setAccessible(true);
                            SmaatoInstance smaatoInstance = (SmaatoInstance) field2.get(null);
                            if (z) {
                                field.set(obj, smaatoInstance.m39744p().getOrNull(value, field.getType()));
                            } else {
                                field.set(obj, smaatoInstance.m39744p().get(value, field.getType()));
                            }
                        } else {
                            i++;
                        }
                    }
                }
            } catch (Exception e) {
                Log.e("Injector", "Unknown injector error", e);
            }
        }
    }

    public static void inject(@NonNull Fragment fragment) {
        Objects.requireNonNull(fragment, "Parameter fragment cannot be null for AndroidsInjector::inject");
        injectFieldValues(fragment);
    }

    public static void inject(@NonNull InjectionAllowed injectionAllowed) {
        Objects.requireNonNull(injectionAllowed, "Parameter injectionAllowed cannot be null for AndroidsInjector::inject");
        injectFieldValues(injectionAllowed);
    }
}
