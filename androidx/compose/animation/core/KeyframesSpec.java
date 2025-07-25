package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.MapsJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* compiled from: AnimationSpec.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    @NotNull
    private final KeyframesSpecConfig<T> config;

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class KeyframesSpecConfig<T> {
        public static final int $stable = 8;
        private int delayMillis;
        private int durationMillis = 300;
        @NotNull
        private final Map<Integer, KeyframeEntity<T>> keyframes = new LinkedHashMap();

        @NotNull
        /* renamed from: at */
        public final KeyframeEntity<T> m105462at(T t, int i) {
            KeyframeEntity<T> keyframeEntity = new KeyframeEntity<>(t, null, 2, null);
            this.keyframes.put(Integer.valueOf(i), keyframeEntity);
            return keyframeEntity;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) obj;
                if (this.delayMillis == keyframesSpecConfig.delayMillis && this.durationMillis == keyframesSpecConfig.durationMillis && Intrinsics.m17075f(this.keyframes, keyframesSpecConfig.keyframes)) {
                    return true;
                }
            }
            return false;
        }

        public final int getDelayMillis() {
            return this.delayMillis;
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        @NotNull
        public final Map<Integer, KeyframeEntity<T>> getKeyframes$animation_core_release() {
            return this.keyframes;
        }

        public int hashCode() {
            return (((this.durationMillis * 31) + this.delayMillis) * 31) + this.keyframes.hashCode();
        }

        public final void setDelayMillis(int i) {
            this.delayMillis = i;
        }

        public final void setDurationMillis(int i) {
            this.durationMillis = i;
        }

        public final void with(@NotNull KeyframeEntity<T> keyframeEntity, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(keyframeEntity, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }
    }

    public KeyframesSpec(@NotNull KeyframesSpecConfig<T> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof KeyframesSpec) && Intrinsics.m17075f(this.config, ((KeyframesSpec) obj).config)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final KeyframesSpecConfig<T> getConfig() {
        return this.config;
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class KeyframeEntity<T> {
        public static final int $stable = 8;
        @NotNull
        private Easing easing;
        private final T value;

        public KeyframeEntity(T t, @NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.value = t;
            this.easing = easing;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) obj;
                if (Intrinsics.m17075f(keyframeEntity.value, this.value) && Intrinsics.m17075f(keyframeEntity.easing, this.easing)) {
                    return true;
                }
            }
            return false;
        }

        @NotNull
        public final Easing getEasing$animation_core_release() {
            return this.easing;
        }

        public final T getValue$animation_core_release() {
            return this.value;
        }

        public int hashCode() {
            int i;
            T t = this.value;
            if (t != null) {
                i = t.hashCode();
            } else {
                i = 0;
            }
            return (i * 31) + this.easing.hashCode();
        }

        public final void setEasing$animation_core_release(@NotNull Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "<set-?>");
            this.easing = easing;
        }

        @NotNull
        public final <V extends AnimationVectors> Tuples<V, Easing> toPair$animation_core_release(@NotNull Function1<? super T, ? extends V> convertToVector) {
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            return C38513v.m14532a(convertToVector.invoke((T) this.value), this.easing);
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVectors> VectorizedKeyframesSpec<V> vectorize(@NotNull VectorConverters<T, V> converter) {
        int m17292f;
        Intrinsics.checkNotNullParameter(converter, "converter");
        Map<Integer, KeyframeEntity<T>> keyframes$animation_core_release = this.config.getKeyframes$animation_core_release();
        m17292f = MapsJVM.m17292f(keyframes$animation_core_release.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m17292f);
        Iterator<T> it = keyframes$animation_core_release.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec<>(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }
}
