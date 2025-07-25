package com.google.firebase.remoteconfig.interop.rollouts;

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
        static final RolloutAssignmentEncoder f43602a = new RolloutAssignmentEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43603b = FieldDescriptor.m66863of(ConfigContainer.ROLLOUT_METADATA_ID);

        /* renamed from: c */
        private static final FieldDescriptor f43604c = FieldDescriptor.m66863of("variantId");

        /* renamed from: d */
        private static final FieldDescriptor f43605d = FieldDescriptor.m66863of("parameterKey");

        /* renamed from: e */
        private static final FieldDescriptor f43606e = FieldDescriptor.m66863of("parameterValue");

        /* renamed from: f */
        private static final FieldDescriptor f43607f = FieldDescriptor.m66863of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private RolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43603b, rolloutAssignment.getRolloutId());
            objectEncoderContext.add(f43604c, rolloutAssignment.getVariantId());
            objectEncoderContext.add(f43605d, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(f43606e, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(f43607f, rolloutAssignment.getTemplateVersion());
        }
    }

    private AutoRolloutAssignmentEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        RolloutAssignmentEncoder rolloutAssignmentEncoder = RolloutAssignmentEncoder.f43602a;
        encoderConfig.registerEncoder(RolloutAssignment.class, rolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, rolloutAssignmentEncoder);
    }
}
