package com.smaato.sdk.core.init;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.framework.BaseModuleInterface;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p574fi.NullableFunction;
import java.util.List;

/* loaded from: classes7.dex */
public final class BaseDiRegistryUtils {
    private BaseDiRegistryUtils() {
    }

    @NonNull
    public static List<DiRegistry> getDiOfModules(@NonNull List<? extends BaseModuleInterface> list) {
        return Lists.mapLazy(list, new NullableFunction() { // from class: m7.a
            @Override // com.smaato.sdk.core.util.p574fi.NullableFunction
            public final Object apply(Object obj) {
                return ((BaseModuleInterface) obj).moduleDiRegistry();
            }
        });
    }
}
