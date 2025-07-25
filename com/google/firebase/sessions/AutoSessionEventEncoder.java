package com.google.firebase.sessions;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import net.pubnative.lite.sdk.models.AdExperience;

/* loaded from: classes4.dex */
public final class AutoSessionEventEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoSessionEventEncoder();

    /* loaded from: classes4.dex */
    private static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* renamed from: a */
        static final AndroidApplicationInfoEncoder f43648a = new AndroidApplicationInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43649b = FieldDescriptor.m66863of("packageName");

        /* renamed from: c */
        private static final FieldDescriptor f43650c = FieldDescriptor.m66863of("versionName");

        /* renamed from: d */
        private static final FieldDescriptor f43651d = FieldDescriptor.m66863of("appBuildVersion");

        /* renamed from: e */
        private static final FieldDescriptor f43652e = FieldDescriptor.m66863of("deviceManufacturer");

        /* renamed from: f */
        private static final FieldDescriptor f43653f = FieldDescriptor.m66863of("currentProcessDetails");

        /* renamed from: g */
        private static final FieldDescriptor f43654g = FieldDescriptor.m66863of("appProcessDetails");

        private AndroidApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(AndroidApplicationInfo androidApplicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43649b, androidApplicationInfo.getPackageName());
            objectEncoderContext.add(f43650c, androidApplicationInfo.getVersionName());
            objectEncoderContext.add(f43651d, androidApplicationInfo.getAppBuildVersion());
            objectEncoderContext.add(f43652e, androidApplicationInfo.getDeviceManufacturer());
            objectEncoderContext.add(f43653f, androidApplicationInfo.getCurrentProcessDetails());
            objectEncoderContext.add(f43654g, androidApplicationInfo.getAppProcessDetails());
        }
    }

    /* loaded from: classes4.dex */
    private static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* renamed from: a */
        static final ApplicationInfoEncoder f43655a = new ApplicationInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43656b = FieldDescriptor.m66863of("appId");

        /* renamed from: c */
        private static final FieldDescriptor f43657c = FieldDescriptor.m66863of(C21114v8.C21123i.f54153l);

        /* renamed from: d */
        private static final FieldDescriptor f43658d = FieldDescriptor.m66863of("sessionSdkVersion");

        /* renamed from: e */
        private static final FieldDescriptor f43659e = FieldDescriptor.m66863of("osVersion");

        /* renamed from: f */
        private static final FieldDescriptor f43660f = FieldDescriptor.m66863of("logEnvironment");

        /* renamed from: g */
        private static final FieldDescriptor f43661g = FieldDescriptor.m66863of("androidAppInfo");

        private ApplicationInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ApplicationInfo applicationInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43656b, applicationInfo.getAppId());
            objectEncoderContext.add(f43657c, applicationInfo.getDeviceModel());
            objectEncoderContext.add(f43658d, applicationInfo.getSessionSdkVersion());
            objectEncoderContext.add(f43659e, applicationInfo.getOsVersion());
            objectEncoderContext.add(f43660f, applicationInfo.getLogEnvironment());
            objectEncoderContext.add(f43661g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* loaded from: classes4.dex */
    private static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* renamed from: a */
        static final DataCollectionStatusEncoder f43662a = new DataCollectionStatusEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43663b = FieldDescriptor.m66863of(AdExperience.PERFORMANCE);

        /* renamed from: c */
        private static final FieldDescriptor f43664c = FieldDescriptor.m66863of("crashlytics");

        /* renamed from: d */
        private static final FieldDescriptor f43665d = FieldDescriptor.m66863of("sessionSamplingRate");

        private DataCollectionStatusEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(DataCollectionStatus dataCollectionStatus, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43663b, dataCollectionStatus.getPerformance());
            objectEncoderContext.add(f43664c, dataCollectionStatus.getCrashlytics());
            objectEncoderContext.add(f43665d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* loaded from: classes4.dex */
    private static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* renamed from: a */
        static final ProcessDetailsEncoder f43666a = new ProcessDetailsEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43667b = FieldDescriptor.m66863of("processName");

        /* renamed from: c */
        private static final FieldDescriptor f43668c = FieldDescriptor.m66863of(KeyConstants.RequestBody.KEY_PID);

        /* renamed from: d */
        private static final FieldDescriptor f43669d = FieldDescriptor.m66863of("importance");

        /* renamed from: e */
        private static final FieldDescriptor f43670e = FieldDescriptor.m66863of("defaultProcess");

        private ProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43667b, processDetails.getProcessName());
            objectEncoderContext.add(f43668c, processDetails.getPid());
            objectEncoderContext.add(f43669d, processDetails.getImportance());
            objectEncoderContext.add(f43670e, processDetails.isDefaultProcess());
        }
    }

    /* loaded from: classes4.dex */
    private static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* renamed from: a */
        static final SessionEventEncoder f43671a = new SessionEventEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43672b = FieldDescriptor.m66863of("eventType");

        /* renamed from: c */
        private static final FieldDescriptor f43673c = FieldDescriptor.m66863of("sessionData");

        /* renamed from: d */
        private static final FieldDescriptor f43674d = FieldDescriptor.m66863of("applicationInfo");

        private SessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(SessionEvent sessionEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43672b, sessionEvent.getEventType());
            objectEncoderContext.add(f43673c, sessionEvent.getSessionData());
            objectEncoderContext.add(f43674d, sessionEvent.getApplicationInfo());
        }
    }

    /* loaded from: classes4.dex */
    private static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* renamed from: a */
        static final SessionInfoEncoder f43675a = new SessionInfoEncoder();

        /* renamed from: b */
        private static final FieldDescriptor f43676b = FieldDescriptor.m66863of(JsonStorageKeyNames.SESSION_ID_KEY);

        /* renamed from: c */
        private static final FieldDescriptor f43677c = FieldDescriptor.m66863of("firstSessionId");

        /* renamed from: d */
        private static final FieldDescriptor f43678d = FieldDescriptor.m66863of("sessionIndex");

        /* renamed from: e */
        private static final FieldDescriptor f43679e = FieldDescriptor.m66863of("eventTimestampUs");

        /* renamed from: f */
        private static final FieldDescriptor f43680f = FieldDescriptor.m66863of("dataCollectionStatus");

        /* renamed from: g */
        private static final FieldDescriptor f43681g = FieldDescriptor.m66863of("firebaseInstallationId");

        /* renamed from: h */
        private static final FieldDescriptor f43682h = FieldDescriptor.m66863of("firebaseAuthenticationToken");

        private SessionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public void encode(SessionInfo sessionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f43676b, sessionInfo.getSessionId());
            objectEncoderContext.add(f43677c, sessionInfo.getFirstSessionId());
            objectEncoderContext.add(f43678d, sessionInfo.getSessionIndex());
            objectEncoderContext.add(f43679e, sessionInfo.getEventTimestampUs());
            objectEncoderContext.add(f43680f, sessionInfo.getDataCollectionStatus());
            objectEncoderContext.add(f43681g, sessionInfo.getFirebaseInstallationId());
            objectEncoderContext.add(f43682h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    private AutoSessionEventEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(SessionEvent.class, SessionEventEncoder.f43671a);
        encoderConfig.registerEncoder(SessionInfo.class, SessionInfoEncoder.f43675a);
        encoderConfig.registerEncoder(DataCollectionStatus.class, DataCollectionStatusEncoder.f43662a);
        encoderConfig.registerEncoder(ApplicationInfo.class, ApplicationInfoEncoder.f43655a);
        encoderConfig.registerEncoder(AndroidApplicationInfo.class, AndroidApplicationInfoEncoder.f43648a);
        encoderConfig.registerEncoder(ProcessDetails.class, ProcessDetailsEncoder.f43666a);
    }
}
