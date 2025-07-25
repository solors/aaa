package gatewayprotocol.p687v1;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DiagnosticEventRequestKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.DiagnosticEventRequestKt */
/* loaded from: classes9.dex */
public final class DiagnosticEventRequestKt {
    @NotNull
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    /* compiled from: DiagnosticEventRequestKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        /* compiled from: DiagnosticEventRequestKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestKt$Dsl$BatchProxy */
        /* loaded from: classes9.dex */
        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        /* compiled from: DiagnosticEventRequestKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.DiagnosticEventRequestKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllBatch(DslList dslList, Iterable values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllBatch(values);
        }

        public final /* synthetic */ void addBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addBatch(value);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> batchList = this._builder.getBatchList();
            Intrinsics.checkNotNullExpressionValue(batchList, "_builder.getBatchList()");
            return new DslList(batchList);
        }

        public final /* synthetic */ void plusAssignAllBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticEvent> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllBatch(dslList, values);
        }

        public final /* synthetic */ void plusAssignBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addBatch(dslList, value);
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEvent value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBatch(i, value);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
