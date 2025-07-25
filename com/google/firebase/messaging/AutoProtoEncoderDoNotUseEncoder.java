package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.learnings.abcenter.bridge.AbUserTagData;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    /* loaded from: classes4.dex */
    private static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {

        /* renamed from: a */
        static final MessagingClientEventEncoder f43155a = new MessagingClientEventEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43156b = FieldDescriptor.builder("projectNumber").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f43157c = FieldDescriptor.builder("messageId").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        private static final FieldDescriptor f43158d = FieldDescriptor.builder("instanceId").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        private static final FieldDescriptor f43159e = FieldDescriptor.builder("messageType").withProperty(AtProtobuf.builder().tag(4).build()).build();

        /* renamed from: f */
        private static final FieldDescriptor f43160f = FieldDescriptor.builder("sdkPlatform").withProperty(AtProtobuf.builder().tag(5).build()).build();

        /* renamed from: g */
        private static final FieldDescriptor f43161g = FieldDescriptor.builder("packageName").withProperty(AtProtobuf.builder().tag(6).build()).build();

        /* renamed from: h */
        private static final FieldDescriptor f43162h = FieldDescriptor.builder("collapseKey").withProperty(AtProtobuf.builder().tag(7).build()).build();

        /* renamed from: i */
        private static final FieldDescriptor f43163i = FieldDescriptor.builder("priority").withProperty(AtProtobuf.builder().tag(8).build()).build();

        /* renamed from: j */
        private static final FieldDescriptor f43164j = FieldDescriptor.builder("ttl").withProperty(AtProtobuf.builder().tag(9).build()).build();

        /* renamed from: k */
        private static final FieldDescriptor f43165k = FieldDescriptor.builder("topic").withProperty(AtProtobuf.builder().tag(10).build()).build();

        /* renamed from: l */
        private static final FieldDescriptor f43166l = FieldDescriptor.builder("bulkId").withProperty(AtProtobuf.builder().tag(11).build()).build();

        /* renamed from: m */
        private static final FieldDescriptor f43167m = FieldDescriptor.builder("event").withProperty(AtProtobuf.builder().tag(12).build()).build();

        /* renamed from: n */
        private static final FieldDescriptor f43168n = FieldDescriptor.builder("analyticsLabel").withProperty(AtProtobuf.builder().tag(13).build()).build();

        /* renamed from: o */
        private static final FieldDescriptor f43169o = FieldDescriptor.builder(AbUserTagData.AREA_CAMPAIGN_ID).withProperty(AtProtobuf.builder().tag(14).build()).build();

        /* renamed from: p */
        private static final FieldDescriptor f43170p = FieldDescriptor.builder("composerLabel").withProperty(AtProtobuf.builder().tag(15).build()).build();

        private MessagingClientEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43156b, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(f43157c, messagingClientEvent.getMessageId());
            objectEncoderContext.add(f43158d, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(f43159e, messagingClientEvent.getMessageType());
            objectEncoderContext.add(f43160f, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(f43161g, messagingClientEvent.getPackageName());
            objectEncoderContext.add(f43162h, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(f43163i, messagingClientEvent.getPriority());
            objectEncoderContext.add(f43164j, messagingClientEvent.getTtl());
            objectEncoderContext.add(f43165k, messagingClientEvent.getTopic());
            objectEncoderContext.add(f43166l, messagingClientEvent.getBulkId());
            objectEncoderContext.add(f43167m, messagingClientEvent.getEvent());
            objectEncoderContext.add(f43168n, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(f43169o, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(f43170p, messagingClientEvent.getComposerLabel());
        }
    }

    /* loaded from: classes4.dex */
    private static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {

        /* renamed from: a */
        static final MessagingClientEventExtensionEncoder f43171a = new MessagingClientEventExtensionEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43172b = FieldDescriptor.builder("messagingClientEvent").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private MessagingClientEventExtensionEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43172b, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    /* loaded from: classes4.dex */
    private static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        static final ProtoEncoderDoNotUseEncoder f43173a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43174b = FieldDescriptor.m66863of("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43174b, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f43173a);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.f43171a);
        encoderConfig.registerEncoder(MessagingClientEvent.class, MessagingClientEventEncoder.f43155a);
    }
}
