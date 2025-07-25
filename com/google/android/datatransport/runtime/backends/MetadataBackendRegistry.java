package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class MetadataBackendRegistry implements BackendRegistry {

    /* renamed from: a */
    private final BackendFactoryProvider f31092a;

    /* renamed from: b */
    private final CreationContextFactory f31093b;

    /* renamed from: c */
    private final Map<String, TransportBackend> f31094c;

    /* loaded from: classes4.dex */
    static class BackendFactoryProvider {

        /* renamed from: a */
        private final Context f31095a;

        /* renamed from: b */
        private Map<String, String> f31096b = null;

        BackendFactoryProvider(Context context) {
            this.f31095a = context;
        }

        /* renamed from: a */
        private Map<String, String> m76303a(Context context) {
            Bundle m76300d = m76300d(context);
            if (m76300d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m76300d.keySet()) {
                Object obj = m76300d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m76301c() {
            if (this.f31096b == null) {
                this.f31096b = m76303a(this.f31095a);
            }
            return this.f31096b;
        }

        /* renamed from: d */
        private static Bundle m76300d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        @Nullable
        /* renamed from: b */
        BackendFactory m76302b(String str) {
            String str2 = m76301c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str2).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        this(new BackendFactoryProvider(context), creationContextFactory);
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    @Nullable
    public synchronized TransportBackend get(String str) {
        if (this.f31094c.containsKey(str)) {
            return this.f31094c.get(str);
        }
        BackendFactory m76302b = this.f31092a.m76302b(str);
        if (m76302b == null) {
            return null;
        }
        TransportBackend create = m76302b.create(this.f31093b.m76304a(str));
        this.f31094c.put(str, create);
        return create;
    }

    MetadataBackendRegistry(BackendFactoryProvider backendFactoryProvider, CreationContextFactory creationContextFactory) {
        this.f31094c = new HashMap();
        this.f31092a = backendFactoryProvider;
        this.f31093b = creationContextFactory;
    }
}
