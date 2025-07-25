package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ComponentDiscovery<T> {

    /* renamed from: a */
    private final T f42092a;

    /* renamed from: b */
    private final RegistrarNameRetriever<T> f42093b;

    /* loaded from: classes4.dex */
    public static class MetadataRegistrarNameRetriever implements RegistrarNameRetriever<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f42094a;

        /* renamed from: a */
        private Bundle m67359a(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f42094a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f42094a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        private MetadataRegistrarNameRetriever(Class<? extends Service> cls) {
            this.f42094a = cls;
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public List<String> retrieve(Context context) {
            Bundle m67359a = m67359a(context);
            if (m67359a == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m67359a.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m67359a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public interface RegistrarNameRetriever<T> {
        List<String> retrieve(T t);
    }

    @VisibleForTesting
    ComponentDiscovery(T t, RegistrarNameRetriever<T> registrarNameRetriever) {
        this.f42092a = t;
        this.f42093b = registrarNameRetriever;
    }

    /* renamed from: a */
    public static /* synthetic */ ComponentRegistrar m67362a(String str) {
        return m67361b(str);
    }

    @Nullable
    /* renamed from: b */
    public static ComponentRegistrar m67361b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    public static ComponentDiscovery<Context> forContext(Context context, Class<? extends Service> cls) {
        return new ComponentDiscovery<>(context, new MetadataRegistrarNameRetriever(cls));
    }

    @Deprecated
    public List<ComponentRegistrar> discover() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f42093b.retrieve(this.f42092a)) {
            try {
                ComponentRegistrar m67361b = m67361b(str);
                if (m67361b != null) {
                    arrayList.add(m67361b);
                }
            } catch (InvalidRegistrarException e) {
                Log.w("ComponentDiscovery", "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public List<Provider<ComponentRegistrar>> discoverLazy() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f42093b.retrieve(this.f42092a)) {
            arrayList.add(new Provider() { // from class: com.google.firebase.components.f
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    return ComponentDiscovery.m67362a(str);
                }
            });
        }
        return arrayList;
    }
}
