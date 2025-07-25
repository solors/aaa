package p866rc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: rc.i */
/* loaded from: classes9.dex */
public abstract class PipelinePhaseRelation {

    /* compiled from: PipelinePhaseRelation.kt */
    @Metadata
    /* renamed from: rc.i$a */
    /* loaded from: classes9.dex */
    public static final class C39472a extends PipelinePhaseRelation {
        @NotNull

        /* renamed from: a */
        private final C39471h f103784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39472a(@NotNull C39471h relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f103784a = relativeTo;
        }

        @NotNull
        /* renamed from: a */
        public final C39471h m12541a() {
            return this.f103784a;
        }
    }

    /* compiled from: PipelinePhaseRelation.kt */
    @Metadata
    /* renamed from: rc.i$b */
    /* loaded from: classes9.dex */
    public static final class C39473b extends PipelinePhaseRelation {
        @NotNull

        /* renamed from: a */
        private final C39471h f103785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39473b(@NotNull C39471h relativeTo) {
            super(null);
            Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
            this.f103785a = relativeTo;
        }
    }

    /* compiled from: PipelinePhaseRelation.kt */
    @Metadata
    /* renamed from: rc.i$c */
    /* loaded from: classes9.dex */
    public static final class C39474c extends PipelinePhaseRelation {
        @NotNull

        /* renamed from: a */
        public static final C39474c f103786a = new C39474c();

        private C39474c() {
            super(null);
        }
    }

    private PipelinePhaseRelation() {
    }

    public /* synthetic */ PipelinePhaseRelation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
