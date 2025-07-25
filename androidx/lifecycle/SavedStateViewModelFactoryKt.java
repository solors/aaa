package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    @NotNull
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;
    @NotNull
    private static final List<Class<?>> VIEWMODEL_SIGNATURE;

    static {
        List<Class<?>> m17163p;
        List<Class<?>> m17175e;
        m17163p = C37563v.m17163p(Application.class, SavedStateHandle.class);
        ANDROID_VIEWMODEL_SIGNATURE = m17163p;
        m17175e = CollectionsJVM.m17175e(SavedStateHandle.class);
        VIEWMODEL_SIGNATURE = m17175e;
    }

    @Nullable
    public static final <T> Constructor<T> findMatchingConstructor(@NotNull Class<T> modelClass, @NotNull List<? extends Class<?>> signature) {
        List m17348D0;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            m17348D0 = _Arrays.m17348D0(parameterTypes);
            if (Intrinsics.m17075f(signature, m17348D0)) {
                Intrinsics.m17073h(constructor2, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor2;
            } else if (signature.size() == m17348D0.size() && m17348D0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(@NotNull Class<T> modelClass, @NotNull Constructor<T> constructor, @NotNull Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }
}
