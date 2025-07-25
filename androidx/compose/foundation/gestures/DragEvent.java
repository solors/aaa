package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Draggable.kt */
@Metadata
/* loaded from: classes.dex */
abstract class DragEvent {

    /* compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        @NotNull
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    /* compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final float delta;
        private final long pointerPosition;

        public /* synthetic */ DragDelta(float f, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j);
        }

        public final float getDelta() {
            return this.delta;
        }

        /* renamed from: getPointerPosition-F1C5BW0  reason: not valid java name */
        public final long m106149getPointerPositionF1C5BW0() {
            return this.pointerPosition;
        }

        private DragDelta(float f, long j) {
            super(null);
            this.delta = f;
            this.pointerPosition = j;
        }
    }

    /* compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: getStartPoint-F1C5BW0  reason: not valid java name */
        public final long m106150getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j) {
            super(null);
            this.startPoint = j;
        }
    }

    /* compiled from: Draggable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final float velocity;

        public DragStopped(float f) {
            super(null);
            this.velocity = f;
        }

        public final float getVelocity() {
            return this.velocity;
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
