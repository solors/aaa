package com.smaato.sdk.core.init;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.framework.BaseModuleInterface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class BaseModuleValidationUtils {
    private BaseModuleValidationUtils() {
    }

    @NonNull
    public static <T extends BaseModuleInterface> List<T> getValidModuleInterfaces(@NonNull String str, @NonNull Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (t.version().equals(str)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
