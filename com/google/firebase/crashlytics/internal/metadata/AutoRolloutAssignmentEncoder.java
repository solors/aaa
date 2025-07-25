package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    /* loaded from: classes4.dex */
    private static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {

        /* renamed from: a */
        static final RolloutAssignmentEncoder f42433a = new RolloutAssignmentEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f42434b = FieldDescriptor.m66863of(ConfigContainer.ROLLOUT_METADATA_ID);

        /* renamed from: c */
        private static final FieldDescriptor f42435c = FieldDescriptor.m66863of("parameterKey");

        /* renamed from: d */
        private static final FieldDescriptor f42436d = FieldDescriptor.m66863of("parameterValue");

        /* renamed from: e */
        private static final FieldDescriptor f42437e = FieldDescriptor.m66863of("variantId");

        /* renamed from: f */
        private static final FieldDescriptor f42438f = FieldDescriptor.m66863of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f42434b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f42435c, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f42436d, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f42437e, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f42438f, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f42433a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
