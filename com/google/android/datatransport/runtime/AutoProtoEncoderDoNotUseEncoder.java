package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    /* loaded from: classes4.dex */
    private static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {

        /* renamed from: a */
        static final ClientMetricsEncoder f30987a = new ClientMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f30988b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f30989c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d */
        private static final FieldDescriptor f30990d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e */
        private static final FieldDescriptor f30991e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f30988b, clientMetrics.getWindowInternal());
            objectEncoderContext.add(f30989c, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(f30990d, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(f30991e, clientMetrics.getAppNamespace());
        }
    }

    /* loaded from: classes4.dex */
    private static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {

        /* renamed from: a */
        static final GlobalMetricsEncoder f30992a = new GlobalMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f30993b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f30993b, globalMetrics.getStorageMetricsInternal());
        }
    }

    /* loaded from: classes4.dex */
    private static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {

        /* renamed from: a */
        static final LogEventDroppedEncoder f30994a = new LogEventDroppedEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f30995b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f30996c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f30995b, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(f30996c, logEventDropped.getReason());
        }
    }

    /* loaded from: classes4.dex */
    private static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {

        /* renamed from: a */
        static final LogSourceMetricsEncoder f30997a = new LogSourceMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f30998b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f30999c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f30998b, logSourceMetrics.getLogSource());
            objectEncoderContext.add(f30999c, logSourceMetrics.getLogEventDroppedList());
        }
    }

    /* loaded from: classes4.dex */
    private static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {

        /* renamed from: a */
        static final ProtoEncoderDoNotUseEncoder f31000a = new ProtoEncoderDoNotUseEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f31001b = FieldDescriptor.m66863of("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f31001b, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    /* loaded from: classes4.dex */
    private static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {

        /* renamed from: a */
        static final StorageMetricsEncoder f31002a = new StorageMetricsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f31003b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f31004c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f31003b, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(f31004c, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    /* loaded from: classes4.dex */
    private static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {

        /* renamed from: a */
        static final TimeWindowEncoder f31005a = new TimeWindowEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f31006b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c */
        private static final FieldDescriptor f31007c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f31006b, timeWindow.getStartMs());
            objectEncoderContext.add(f31007c, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.f31000a);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.f30987a);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.f31005a);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.f30997a);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.f30994a);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.f30992a);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.f31002a);
    }
}
