package com.smaato.sdk.core.openmeasurement;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p574fi.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes7.dex */
public final class DiOMLayer {
    private DiOMLayer() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m39411a(List list, DiRegistry diRegistry) {
        lambda$createRegistry$1(list, diRegistry);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39410b(DiRegistry diRegistry, ViewabilityPlugin viewabilityPlugin) {
        lambda$createRegistry$0(diRegistry, viewabilityPlugin);
    }

    @NonNull
    public static DiRegistry createRegistry(@NonNull Context context) {
        final List<ViewabilityPlugin> loadAndInitPlugins = loadAndInitPlugins(context);
        return DiRegistry.m39638of(new Consumer() { // from class: com.smaato.sdk.core.openmeasurement.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiOMLayer.m39411a(loadAndInitPlugins, (DiRegistry) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$createRegistry$0(DiRegistry diRegistry, ViewabilityPlugin viewabilityPlugin) {
        diRegistry.addFrom(viewabilityPlugin.diRegistry());
    }

    public static /* synthetic */ void lambda$createRegistry$1(List list, final DiRegistry diRegistry) {
        Iterables.forEach(list, new Consumer() { // from class: com.smaato.sdk.core.openmeasurement.b
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiOMLayer.m39410b(DiRegistry.this, (ViewabilityPlugin) obj);
            }
        });
    }

    @NonNull
    private static List<ViewabilityPlugin> loadAndInitPlugins(@NonNull Context context) {
        ServiceLoader<ViewabilityPlugin> load = ServiceLoader.load(ViewabilityPlugin.class, context.getClassLoader());
        ArrayList arrayList = new ArrayList();
        for (ViewabilityPlugin viewabilityPlugin : load) {
            if (!viewabilityPlugin.getName().isEmpty()) {
                viewabilityPlugin.init(context);
                arrayList.add(viewabilityPlugin);
            }
        }
        return arrayList;
    }
}
