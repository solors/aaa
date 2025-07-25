package com.facebook.appevents.p371ml;

import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MTensor.kt */
@Metadata
/* renamed from: com.facebook.appevents.ml.MTensor */
/* loaded from: classes2.dex */
public final class MTensor {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private int capacity;
    @NotNull
    private float[] data;
    @NotNull
    private int[] shape;

    /* compiled from: MTensor.kt */
    @Metadata
    /* renamed from: com.facebook.appevents.ml.MTensor$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getCapacity(int[] iArr) {
            boolean z;
            int m17327Y;
            int i = 1;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = iArr[0];
                m17327Y = _Arrays.m17327Y(iArr);
                if (1 <= m17327Y) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == m17327Y) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    public MTensor(@NotNull int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        this.capacity = capacity;
        this.data = new float[capacity];
    }

    @NotNull
    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i) {
        return this.shape[i];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(@NotNull int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        int capacity = Companion.getCapacity(shape);
        float[] fArr = new float[capacity];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, capacity));
        this.data = fArr;
        this.capacity = capacity;
    }
}
